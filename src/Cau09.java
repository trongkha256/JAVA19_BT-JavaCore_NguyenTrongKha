import java.util.Scanner;

public class Cau09 {
    public static void main(String[] args){

        int soThuNhat;
        int soThuHai;
        String chuoiThuNhat;
        String chuoiThuHai;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 2 số nguyên dương từ 10-99: ");

        soThuNhat = input.nextInt();
        soThuHai = input.nextInt();
        if (soThuNhat <10 || soThuNhat >99 || soThuHai<10 || soThuHai>99){
            System.out.printf("Số không hợp lệ");
            return;
        }

        chuoiThuNhat = String.valueOf(soThuNhat);
        chuoiThuHai = String.valueOf(soThuHai);

        if(chuoiThuHai.contains(chuoiThuNhat.substring(0,1)) || chuoiThuHai.contains(chuoiThuNhat.substring(1,2))) {
            System.out.println("TRUE");

        }
        else {
            System.out.println("FALSE");
        }
    }
}
