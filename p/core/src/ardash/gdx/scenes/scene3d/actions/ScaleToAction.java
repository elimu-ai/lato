package ardash.gdx.scenes.scene3d.actions;

/** Sets the actor's scale from its current value to a specific value.
 * @author Nathan Sweet */
public class ScaleToAction extends TemporalAction {
        private float startX, startY, startZ;
        private float endX, endY, endZ;

        @Override
        protected void begin () {
                startX = actor.getScaleX();
                startY = actor.getScaleY();
                startZ = actor.getScaleZ();
        }

        @Override
        protected void update (float percent) {
                actor.setScale(startX + (endX - startX) * percent, startY + (endY - startY) * percent,
                        startZ + (endZ - startZ) * percent);
        }

        public void setScale (float x, float y, float z) {
                endX = x;
                endY = y;
                endZ = z;
        }

        public void setScale (float scale) {
                endX = scale;
                endY = scale;
                endZ = scale;
        }

        public float getX () {
                return endX;
        }

        public void setX (float x) {
                this.endX = x;
        }

        public float getY () {
                return endY;
        }

        public void setY (float y) {
                this.endY = y;
        }

        public float getZ () {
                return endZ;
        }

        public void setZ (float z) {
                this.endZ = z;
        }
}