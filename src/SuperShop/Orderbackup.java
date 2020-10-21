package SuperShop;

public class Orderbackup {

    private int orderSize;
    private OrderItem[] order;

    public int getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(int orderSize) {
        this.orderSize = orderSize;
    }


    public Orderbackup(int orderSize) {

        setOrderSize(orderSize);
        this.order = new OrderItem[getOrderSize()];
    }

    public void addItem(OrderItem item, int orderPosition) {
        if (this.order[orderPosition] == null){
            this.order[orderPosition] = item;
        }
    }

    public double getValue(){
        double sum = 0;
        for (int i = 0; i < this.orderSize; i++) {
            sum += this.order[i].getValue();
        }
        return sum;
    }

    public int getItemsCount(){
        int sum = 0;
        for (int i = 0; i < this.orderSize; i++) {
            sum += this.order[i].getItemQuantity();
        }
        return sum;
    }



    public void printAll(){
        for (int i = 0; i < this.orderSize; i++) {
            this.order[i].print();

        }
        System.out.println("Wartość zamówienia: " + getValue() + " zł");
    }

}
