package org.roaringbitmap;

/**
 *
 */
public final class ContainerFactory {

        public static BitmapContainer copyToArrayContainer(ArrayContainer ac) {
                BitmapContainer bc = new BitmapContainer();
                bc.loadData(ac);
                return bc;
        }

        public static ArrayContainer copyToArrayContainer(BitmapContainer bc) {
                ArrayContainer ac = new ArrayContainer();
                ac.loadData(bc);
                return ac;
        }

        public static ArrayContainer getArrayContainer() {
                return new ArrayContainer();
        }

        public static BitmapContainer getCopyOfBitmapContainer(
                BitmapContainer bc) {
                return bc.clone();
        }

        /**
         * The returned BitmapContainer will not be initialized as empty by
         * default. Called "clear" if needed.
         * 
         * @return a BitmapContainer
         */
        public static BitmapContainer getUnintializedBitmapContainer() {
                return new BitmapContainer();
        }

        public static ArrayContainer transformToArrayContainer(
                BitmapContainer bc) {
                ArrayContainer ac = new ArrayContainer();
                ac.loadData(bc);
                return ac;
        }

        public static BitmapContainer transformToBitmapContainer(
                ArrayContainer ac) {
                BitmapContainer bc = new BitmapContainer();
                bc.loadData(ac);
                return bc;
        }

}