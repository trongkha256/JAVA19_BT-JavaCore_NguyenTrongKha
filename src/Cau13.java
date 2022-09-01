import java.util.Scanner;

public class Cau13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        double giaTriTong = 0;
        double giaTriTB;
        double giaTriMax;
        double giaTriMin;
        double giaTriAmMax;
        double giaTriAmMin;
        double giaTriDuongMax;
        double giaTriDuongMin;


        System.out.print("Nhập số phần tử của mảng: ");
        n = Integer.parseInt(input.nextLine());

        double[] giaTri = new double[n];
        for(int i= 0;i<n;i++) {
            System.out.print("Giá trị phần tử thứ " + (i+1) + " là: ");
            giaTri[i] = Integer.parseInt(input.nextLine());
            giaTriTong = giaTriTong + giaTri[i];
        }

        //gia tri TB
        giaTriTB = giaTriTong/n;
        System.out.println("\nGiá trị trung bình là: " + giaTriTB);

        //phần tử lớn nhất trong mảng //phần tử dương lớn nhất trong mảng
        giaTriMax = giaTri[0];
        for(int i=1;i<giaTri.length;i++) {
            giaTriMax = Math.max(giaTriMax, giaTri[i]);
        }
        System.out.println("Giá trị lớn nhất trong mảng là (giá trị dương lớn nhất nếu có): " + giaTriMax);

        //phần tử nhỏ nhất trong mảng // giá trị âm nhỏ nhất trong mảng
        giaTriMin = giaTri[0];
        for(int i=1;i<giaTri.length;i++) {
            giaTriMin = Math.min(giaTriMin, giaTri[i]);
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là (giá trị âm nhỏ nhất nếu có): " + giaTriMin);

        //in ra phần tử chẵn lẻ
        int indexChan=0,indexLe=0;
        double[] soChan = new double[n];
        double[] soLe = new double[n];

        for(int i=0;i<n;i++) {
            if(giaTri[i]%2 == 0) {
                soChan[indexChan] = giaTri[i];
                indexChan++;
            }
            else {
                soLe[indexLe] = giaTri[i];
                indexLe++;
            }
        }
        System.out.print("Các phần tử chẵn là: ");
        for(int i=0;i<indexChan;i++) {
            System.out.print(soChan[i]+ ", ");
        }
        System.out.print("\nCác phần tử lẻ là: ");
        for(int i=0;i<indexLe;i++) {
            System.out.print(soLe[i]+ ", ");
        }

        //phần tử âm lớn nhất trong mảng
        //loại bỏ phần từ dương khỏi mảng
        int indexAm=0;
        for(int i=0; i<n;i++) {
            if(giaTri[i] <0) {
                giaTri[indexAm] = giaTri[i];
                indexAm++;
            }
        }

        double max;
        max = giaTri[0];
        for(int y=1;y<indexAm;y++) {
            max = Math.max(max, giaTri[y]);
        }
        System.out.println("\nGiá trị âm lớn nhất trong mảng là: " + max);

        //thêm phần tử theo index
        double themPhanTu;
        System.out.print("Nhập phần tử muốn thêm: ");
        themPhanTu = Integer.parseInt(input.nextLine());

        double[] mangMoiThem = new double[n+1];
        for(int i=0;i<n;i++) {
            mangMoiThem[i] = giaTri[i];
            mangMoiThem[n] = themPhanTu;
        }
        System.out.println("Mảng mới là: ");
        for(int i=0;i<=n;i++) {
            System.out.print(mangMoiThem[i] + "\t");
        }

        //xóa phần tử theo index: vẫn chưa hoàn thiện, đang tìm nguyên nhân 1 số testcases vẫn không đúng
        double phanTuXoa;
        int indexXoa = 0;
        double[] mangMoiXoa = new double[n+1];
        System.out.print("Phần tử bạn muốn xóa: ");
        phanTuXoa = Integer.parseInt(input.nextLine());

        for(int i=0;i<n;i++) {
            if(giaTri[i] != phanTuXoa) {
                mangMoiXoa[indexXoa] = giaTri[i];
                indexXoa ++;
            }
        }

        System.out.print("Mảng mới sau khi xóa là: ");
        for(int i=0;i<indexXoa;i++) {
            System.out.print(mangMoiXoa[i] +"\t");
        }

    }
}
