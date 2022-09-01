import java.util.Scanner;

public class Cau10 {
    public static boolean checkPrime(int a){
        if (a==0 || a==1) return false;
        if (a==2) return true;
        for (int i=2;i<= Math.sqrt(a);i++){
            if (a % i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vào số tự nhien: ");
        int num=scanner.nextInt();
        int sum=0;
        if (num>0){
            for (int i=1; i<=num; i++){

                if (checkPrime(i)){
                    sum+=i;
                }
            }
        }
        System.out.printf("Tổng các số nguyên tố tù 1 đến "+num+" là: "+sum);

    }
}
