import java.util.Scanner;

public class Karaoke {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Nhập giờ vào: ");
        int timeIn=scanner.nextInt();
        System.out.printf("Nhập giờ ra: ");
        int timeOut=scanner.nextInt();
        System.out.printf("Nhập số chai nước: ");
        int drink=scanner.nextInt();
        if ( timeIn>=9 && timeIn <=24 && timeOut>=9 && timeOut <=24 && timeIn < timeOut){
            double sum=0;
            int count=timeOut-timeIn;
            if (count >3 ){
                sum=30000*3 + (count-3)*300000*1.3 + drink*10000;

            }
            else sum=count*30000+ drink*10000;
            System.out.printf("Tổng tiền là: "+sum);
        }
        else {
            System.out.printf("Thời gian vào ra không hợp lệ");
        }
    }
}
