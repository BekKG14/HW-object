//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Product cucumber = new Product(1, "Cucumber", 12,"Vege");
    Product picle = new Product(2, "pickle", 12, "Vege");
    System.out.println(cucumber.equals(picle));

    Order order1 = new Order("Customer 1");
    Order order2 = new Order("Customer 2");
    order1.addProduct(cucumber);
    order1.addProduct(picle);
    order1.addProduct(cucumber);

    order2.addProduct(cucumber);
    order2.addProduct(cucumber);
    order2.addProduct(cucumber);
    System.out.println(order2.toString());
    System.out.println(order2.orderEquals(order1));
}
