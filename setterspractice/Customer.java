public class Customer extends Person {
    private String customerId;
    public Customer(String name, String gender, int age, address address, String customerId) {
        super(name, gender, age, address);
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
