import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    User user = new User("Kathryn");

    user.getAddress().ifPresent(address -> {
      System.out.println("City: " + address.getCity());
    });
  }
}

class User {
  private String name;
  private Optional<Address> address;

  public User(String name) {
    this.name = name;
  }

  public Optional<Address> getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = Optional.ofNullable(address);
  }
}

class Address {
  private String city;

  public Address(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }
}