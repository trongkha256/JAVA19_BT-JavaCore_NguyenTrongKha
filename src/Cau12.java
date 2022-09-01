import java.util.Scanner;

public class Cau12 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.printf("Nhập vào số tự nhiên từ 1 đến 9: ");
        int num=scanner.nextInt();
        if (num>0 && num<10){
            for (int i=1;i<=num;i++){
                for (int j=1;j<=i;j++){
                    System.out.printf(""+j);
                }
                System.out.printf("\n");

            }
        }
    }
}
