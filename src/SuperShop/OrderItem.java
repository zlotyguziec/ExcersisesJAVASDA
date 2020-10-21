package SuperShop;

import java.math.BigDecimal;

public class OrderItem {
    private String itemName;
    private int itemQuantity;
    private double itemPrice;

    public OrderItem(String itemName, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

//    public String getItemName() {
//        return itemName;
//    }
//
//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }

    public int getItemQuantity() {
        return itemQuantity;
    }

//    public void setItemQuantity(int itemQuantity) {
//        this.itemQuantity = itemQuantity;
//    }
//
//    public double getItemPrice() {
//        return itemPrice;
//    }
//
//    public void setItemPrice(double itemPrice) {
//        this.itemPrice = itemPrice;
//    }

    public double getValue() {
        return this.itemPrice * this.itemQuantity;
    }

    public boolean isCorrect() {
        return this.itemPrice >0 && this.itemQuantity>0;
    }

    public void print(){
        System.out.println(this.itemName + " " + this.itemPrice + " zł " + this.itemQuantity + " szt " + this.getValue() + " zł");
    }


}
