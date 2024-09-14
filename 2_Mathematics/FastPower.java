public class FastPower {
    public static void main(String[] args) {
        FastPower obj = new FastPower();
        System.out.println(obj.fastPower(9246352,6));
    }
    long fastPower(long x, long y){
        if(x <= 1 || y <= 1) return 1;
        final long MODULOCONSTANT = 1000000007;

        long res=1;
        while(y>0){
            if((y&1)!=0){
                res = (res*y%MODULOCONSTANT)%MODULOCONSTANT;
            }
            x = (x%MODULOCONSTANT * x%MODULOCONSTANT)%MODULOCONSTANT;
            y = y>>1;
        }
        return res;
    }
}