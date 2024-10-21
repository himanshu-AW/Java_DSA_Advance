public class FriendPairingProblem {
    static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        return friendPairing(n-1) + (n-1)*friendPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println("--------- friend pairing problem --------------------");
        System.out.println("The number of ways of pairing: "+friendPairing(3));
        System.out.println("The number of ways of pairing: "+friendPairing(4));
        System.out.println("The number of ways of pairing: "+friendPairing(5));
    }
}
