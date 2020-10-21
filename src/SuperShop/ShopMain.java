package SuperShop;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Random;

public class ShopMain {
    public static void main(String[] args) {

        Order order = new Order();
        order.addItem(new OrderItem("glue",2,1.5));
        order.addItem(new OrderItem("Game",1,99.99));
        order.addItem(new OrderItem("Paint",2,38.89));
        order.printAll();

    }
}
