public class Address {
    private String name;
    private String street;

    private String city;

    private String country;
    private int zipCode;


public Address(String name, String street, String city, String country, int zipCode) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.country = country;
    this.zipCode = zipCode;
}

    public String getName() {
        return name;
    }
}



