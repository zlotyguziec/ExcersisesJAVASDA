package SuperShop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Order {

    private int orderSize;
    private OrderItem[] order;

    public Order() {
        this.order = new OrderItem[0];
    }

//    public int getOrderSize() {
//        return orderSize;
//    }
//
//    public void setOrderSize(int orderSize) {
//        this.orderSize = orderSize;
//    }

//    private Order(int orderSize){
//        this.orderSize = orderSize;
//        this.orderWorkspace = new OrderItem[orderSize];
//    }

    public void extendOrder() {
        ++this.orderSize;
        OrderItem[] orderWorkspace = new OrderItem[this.orderSize];
        System.arraycopy(this.order, 0, orderWorkspace, 0, this.order.length);
        this.order = new OrderItem[this.orderSize];
        if (this.order.length >= 0) System.arraycopy(orderWorkspace, 0, this.order, 0, this.order.length);

    }

    Integer[] array = new Integer[10];

    public void addItem(OrderItem item) {
        if (item.isCorrect()) {
            extendOrder();
            this.order[this.order.length - 1] = item;
        } else {
            System.out.println("Niepoprawne dane produktu! Produkt niedodany do zamówienia.");
        }
    }


    public double getValue() {
        double sum = 0;
        for (int i = 0; i < this.orderSize; i++) {
            sum += this.order[i].getValue();
        }
        return sum;
    }

    public int getItemsCount() {
        int sum = 0;
        for (int i = 0; i < this.orderSize; i++) {
            sum += this.order[i].getItemQuantity();
        }
        return sum;
    }


    public void printAll() {
        for (OrderItem x : this.order) {
            x.print();
        }
        System.out.println("Wartość zamówienia: " + BigDecimal.valueOf(getValue()).setScale(2, RoundingMode.HALF_UP).doubleValue() + " zł");
    }

}
