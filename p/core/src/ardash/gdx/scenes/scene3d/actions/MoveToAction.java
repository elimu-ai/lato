package ardash.gdx.scenes.scene3d.actions;

public class MoveToAction extends TemporalAction {
    private float startX, startY, startZ;
    private float endX, endY, endZ;

    @Override
    protected void begin () {
        if (actor != null){
            startX = actor.getX();
            startY = actor.getY();
            startZ = actor.getZ();
        }
    }

    @Override
    protected void update (float percent) {
        if (actor != null){
            actor.setPosition(startX + (endX - startX) * percent, startY + (endY - startY) * percent,
                    startZ + (endZ - startZ) * percent);
        }
    }


    public void setPosition (float x, float y, float z) {
        endX = x;
        endY = y;
        endZ = z;
    }

    public float getX () {
        return endX;
    }

    public void setX (float x) {
        endX = x;
    }

    public float getY () {
        return endY;
    }

    public void setY (float y) {
        endY = y;
    }

    public float getZ () {
        return endZ;
    }

    public void setZ (float z) {
        endZ = z;
    }
}