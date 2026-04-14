import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer) {
        this.customer = customer;
        this.basket = new Product[10];
    }

    public Product[] addProduct(Product product){
        for (int i = 0; i < basket.length; i++) {
            if(basket[i] == null){
                basket[i] = product;
                break;
            }
        }
        return basket;
    }
    @Override
    public String toString() {
        return "Order{" +
                "customer='" + customer + '\'' +
                ", basket=" + Arrays.toString(basket) +
                '}';
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) && Objects.deepEquals(basket, order.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}
