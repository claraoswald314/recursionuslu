import java.util.Scanner;

public class Main {
    static int recursivePower(int taban, int us){

        if (us == 0) {
            return 1;
        }else if(us==1){
            return taban;
        }
        return taban * recursivePower(taban,(us-1));
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("taban değeri giriniz : ");
        int taban = input.nextInt();

        System.out.print("üs değeri giriniz : ");
        int us = input.nextInt();

        System.out.println(recursivePower(taban,us));
    }
}
