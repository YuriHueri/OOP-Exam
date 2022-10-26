public class Main extends Product {
    public static void main(String[] args) {
        Product list = new Product();
        Card r = new Card();
        boolean boughtCard = true;

        Customer c = new Customer();
        System.out.println("Welcome to 7-Eleven!");
        System.out.println("-----------------------");
        c.setName("John Armor Espinosa");
        c.setAge(19);
        System.out.println("Customer name: " + c.getName());
        System.out.println("Customer age: " + c.getAge());
        System.out.println("Has reward card: " + boughtCard);
        System.out.println("Reward card expiration date:");
        r.expiry();
        list.main();
    }
}
