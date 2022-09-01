import java.util.Scanner;

public class Cau18 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Nhập tiền gửi: ");
        double money=scanner.nextDouble();
        System.out.printf("Nhap tien cần mua oto: ");
        double oto=scanner.nextDouble();
        System.out.printf("Nhập lãi: ");
        int lai=scanner.nextInt();
        if (money > oto){
            System.out.printf("Tien không hợp lệ");
            return;
        }
        int year= 0;
        while (money < oto){
            year++;
            money= money+money*(lai/100);
        }
        System.out.printf("Số năm chờ đợi mua ô tô: "+ year);

    }
}
