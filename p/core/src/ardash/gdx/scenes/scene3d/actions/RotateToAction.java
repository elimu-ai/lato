package ardash.gdx.scenes.scene3d.actions;

/** Sets the actor's rotation from its current value to a specific value.
 * @author Nathan Sweet */
public class RotateToAction extends TemporalAction {
    private float startYaw, startPitch, startRoll;
    private float endYaw, endPitch, endRoll;

    @Override
    protected void begin () {
        if (actor != null){
            startYaw = actor.getYaw();
            startPitch = actor.getPitch();
            startRoll = actor.getRoll();
        }
    }

    @Override
    protected void update (float percent) {
        actor.setRotation(startYaw + (endYaw - startYaw) * percent, startPitch + (endPitch - startPitch) * percent,
                startRoll + (endRoll - startRoll) * percent);
    }

    public void setRotation(float yaw, float pitch, float roll) {
        endYaw = yaw;
        endPitch = pitch;
        endRoll = roll;
    }

    public float getYaw () {
        return endYaw;
    }

    public void setYaw (float yaw) {
        endYaw = yaw;
    }

    public float getPitch () {
        return endPitch;
    }

    public void setPitch (float pitch) {
        endPitch = pitch;
    }

    public float getRoll () {
        return endRoll;
    }

    public void setRoll (float roll) {
        endRoll = roll;
    }
}