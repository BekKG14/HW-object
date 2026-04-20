import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer) {
        this.customer = customer;
        this.basket = new Product[10];
    }

    public Product[] addProduct(Product product) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                break;
            }
        }
        return basket;
    }

    public String getCustomer() {
        return customer;
    }
    @Override
    public String toString() {
        return "Order{" + "customer='" + customer + '\'' + ", basket=" + Arrays.toString(basket) + '}';
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Order order = (Order) o;
        Product[] order1 = order.getBasket();
        Product[] order2 = this.getBasket();

        if(order1.length != order2.length){
            return false;
        }
        if (order1 == null && order2 == null) {
            return true;
        }
        if (order1 == null || order2 == null) {
            return false;
        }
        if (Objects.equals(customer, order.customer)) {
            return false;
        }

        for (int i = 0; i < basket.length; i++) {

            if (order1[i] == null && order2[i] == null) {
                continue;
            }
            if (order1[i] == null || order2 == null) {
                return false;
            }
            if (!order1[i].equals(order2[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}
