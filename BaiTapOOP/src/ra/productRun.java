package ra;

import java.util.ArrayList;
import java.util.Scanner;

public class productRun {
    public static void main(String[] args) {
        product pr = new product();
        ArrayList<product> products = new ArrayList<product>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("********MENU********");
            System.out.println("1. Nhập thông tin Sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Kiểm tra trạng thái");
            System.out.println("4. Thoát");
            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    pr.inputData(products);
                    break;
                case 2:
                    pr.displayData(products);
                    break;
                case 3:
                    pr.checkStatus(products);
                    break;
                case 4:
                    System.exit(0);
            }
        }while(true);
    }
}