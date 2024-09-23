package enumerated.exercise;

public class PackageSize {

    public static void main(String[] args) {
        Packagesize packagesize = Packagesize.getPackageSize(50,50);
        System.out.println(packagesize);
    }


    enum Packagesize {
        SMALL(40,90),
        MEDIUM(90,140),
        LARGE(140,250),
        UNKNOWN(0,0);

        private int minPackageSize;
        private int maxPackageSize;

        Packagesize(int minPackageSize, int maxPackageSize){
            this.minPackageSize = minPackageSize;
            this.maxPackageSize = maxPackageSize;
        }

        public static Packagesize getPackageSize(int minPackageSize, int maxPackageSize){
            for(Packagesize packagesize : values()){
                if(minPackageSize >= packagesize.minPackageSize && maxPackageSize <= packagesize.maxPackageSize){
                    return packagesize;
                }
            }
            return UNKNOWN;
        }
    }
}
