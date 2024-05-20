package ra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class product {
    private String productId;
    private String productName;
    private int productPrice;
    private String description;
    private boolean status;

    public product() {

    }

    public product(String productId, String productName, int productPrice, String description, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(ArrayList<product> products){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sản phẩm:");
        this.productId = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        this.productName = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        this.productPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Điền mô tả:");
        this.description = scanner.nextLine();
        System.out.println("Nhập trạng thái:");
        this.status = scanner.nextBoolean();
        products.add(new product(this.productId, this.productName, this.productPrice, this.description, this.status));
    }

    public void display(){
        System.out.printf("Mã sản phẩm: %s\n", this.productId);
        System.out.printf("Tên sản phẩm: %s\n", this.productName);
        System.out.printf("Giá sản phẩm: %s\n", this.productPrice);
        System.out.printf("Mô tả sản phẩm: %s\n", this.description);
        System.out.printf("Trạng thái: %s\n", this.status ? "Còn hàng" : "Hết hàng");
        System.out.println();
    }

    public void displayData(ArrayList<product> products){
        for (ra.product product : products) {
            product.display();
        }
    }

    public void checkStatus(ArrayList<product> products){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điền vào món hàng mà banj muốn kiểm tra: ");
        int check = Integer.parseInt(scanner.nextLine());
        for (ra.product product : products) {
            if (product.getProductId().equalsIgnoreCase(String.valueOf(check))) {
                if (product.status) {
                    System.out.println("Còn hàng");
                } else {
                    System.out.println("Hết hàng");
                }
            }
        }
    }
}
