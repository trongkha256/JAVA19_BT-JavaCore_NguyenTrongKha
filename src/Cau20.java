import java.util.Scanner;

public class Cau20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int indexChan, indexLe;

        System.out.print("Bạn nhập bao nhiêu số tự nhiên? ");
        n = scanner.nextInt();

        int[] soTuNhien = new int[n];
        int[] soChan = new int[n];
        int[] soLe = new int[n];

        for(int i=0;i<n;i++) {
            System.out.print("Số thứ " + i + ": ");
            soTuNhien[i] =scanner.nextInt();
        }

        indexChan = indexLe = 0;
        for(int i=0;i<n;i++) {
            if(soTuNhien[i] % 2 == 0) {
                soChan[indexChan] = soTuNhien[i];
                indexChan++;
            }
            else {
                soLe[indexLe] = soTuNhien[i];
                indexLe++;
            }
        }
        System.out.print("Mảng số chẵn: ");
        for(int i=0;i<indexChan;i++) {
            System.out.print(soChan[i] + " ");
        }

        System.out.print("\nMảng số lẻ: ");
        for(int i=0;i<indexLe;i++) {
            System.out.print(soLe[i] +" ");
        }

    }
}
