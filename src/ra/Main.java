package ra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//        main.baiMot();
//        main.baiHai();
//        main.baiBa();
//        main.baiBon();
        main.baiNam();
    }
    public void baiMot(){
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello: "+name);
    }
    public void baiHai(){
        System.out.println("please input vnd");
        Scanner sc = new Scanner(System.in);
        float vnd = sc.nextFloat();
        float usd;
        usd = vnd / 25000;
        System.out.println("You have been charged to:  "+usd);
    }
    public void baiBa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        int d = sc.nextInt();
        System.out.println("Nhap chieu rong");
        int r = sc.nextInt();
        System.out.println("Dien tich hinh chu nhat la: " + d*r);
        System.out.println("Chu vi hinh chu nhat la: " + (d+r)*2);
    }
    public void baiBon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem mon toan:");
        float math = sc.nextFloat();
        System.out.println("Nhap diem mon van:");
        float van = sc.nextFloat();
        System.out.println("Nhap diem mon tieng anh");
        float tieng = sc.nextFloat();
        System.out.println("diem trung binh 3 mon: " + (math+van+tieng)/3);
    }
    public void baiNam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron:");
        int r = sc.nextInt();
        double p = 3.14;
        System.out.println("Chu vi hinh tron la: " + r*p*2);
        System.out.println("Dien tich hinh tron la: " + r*r*p);
    }
}
