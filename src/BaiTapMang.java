import java.util.Random;
import java.util.Scanner;

public class BaiTapMang {
    //khai bao bien
    float a[];
    int n;
    //
    public BaiTapMang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        n = sc.nextInt();
        a = taoMangSoThuc(n);
        printA();
    }
    // viet phuong trinh in ra mang
    public void printA(){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    // viet phuong trinh mang so thuc
    public float[] taoMangSoThuc(int n){
        Random r = new Random();
        float temp[] =  new float[n];
        for(int i=0;i<n;i++){
            temp[i] = r.nextFloat();
        }
        return temp;
    }

    // them mot phan tu x vao cuoi mang
    public void add(float x){
        // tăng n lên:
        n=n+1;
        // tao mang temp
        //  | | | | | | | | | | | |
        float[] temp = new float[n];
        // copy du lieu
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        // them x vao cuoi mang
        temp[n-1]=x;
        // gan lai cho mang a
        a = temp;
    }

    // cong hai phan tu dau tien cua mang
    public void printSum2FirstElements(){
        float sum = 0;
        for(int i=0; i <= 1 && i < a.length;i++){
            sum+=a[i];
        }
        System.out.println("tong = " + sum);
    }

    // tong cac phan tu mang
    public void sumArr(){
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("tong mang = " + sum);
    }

    // tim gia tri nho nhat trong mang
    public void arrMin(){
        float min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Min = " + min);
    }

    // in ra gia tri ngau nhien
    public void printRandom(){
        Random random = new Random();
        int index = random.nextInt(n); // random 0 -> n-1
        System.out.println("A["+index+"] = " + a[index]);
    }

    // ham main
    public static void main(String[] args) {
        BaiTapMang b = new BaiTapMang();
        b.add(1.5f);
        System.out.println();
        b.printA();
        b.printSum2FirstElements();
        b.sumArr();
        b.arrMin();
        b.printRandom();
        // Array Init
        float[] array = {3.5f, 5.5f,4.52f, 5.6f};
    }
}
