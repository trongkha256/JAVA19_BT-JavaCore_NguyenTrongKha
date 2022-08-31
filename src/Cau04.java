import java.util.Scanner;

public class Cau04 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.printf("Nhập vào số tự nhiên: ");
        int num=scanner.nextInt();
        if (num<0){
            System.out.printf("Số không hợp lệ. ");
            return;
        }
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        System.out.printf("Tổng các chữ số là: "+ sum);
    }
}
