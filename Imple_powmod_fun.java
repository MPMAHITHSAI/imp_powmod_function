package powerfun_num;

import java.util.Scanner;

public class Imple_powmod_fun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();

        int powMod=powModMet(A,B,C);
        System.out.println(powMod);
    }

    private static int powModMet(int a, int b, int c) {
        if(b==0){
            return 1;
        }
        int p=powModMet(a,b/2,c);
        if(b%2==0){
            return (p*p) % c;
        }
        else{
            return (p*p*a) % c;
        }
    }
}