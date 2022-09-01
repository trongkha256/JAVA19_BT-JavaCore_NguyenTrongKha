import java.util.Scanner;

public class Cau21 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int x1, x2, v1, v2;
        int soLanNhay;

        System.out.print("Địa chỉ của Kan1: ");
        x1 = scanner.nextInt();
        System.out.print("Địa chỉ của Kan2: ");
        x2 = scanner.nextInt();
        System.out.print("Vận tốc của Kan1: ");
        v1 = scanner.nextInt();
        System.out.print("Vận tốc của Kan2: ");
        v2 = scanner.nextInt();

        soLanNhay = (x1-x2)/(v2-v1);

        if(x1>=0 && x2>x1 && x2>0 && x1<=10000 && x2<=10000 && v1>=1 && v2>=1 && v1<=10000 && v2<=10000) {
            if ((x1-x2) % (v2-v1) == 0 && soLanNhay > 0) {
                System.out.println("Sau " + soLanNhay + " lần nhảy thì 2 con Kan gặp nhau" );
            }
            else {
                System.out.println("Không gặp nhau");
            }
        }
        else {
            System.out.println("Không thỏa điều kiện");
        }
    }
}
