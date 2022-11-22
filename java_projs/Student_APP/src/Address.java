public class Address {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    public Address (String address1, String address2, String city, String state, String zipcode){
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressInfo() {
        String result = "\tAddress1: " + this.address1 + "\n";
        result += "\tAddress2: " + this.address2 + "\n";
        result += "\tCity: " + this.city + "\n";
        result += "\tState: " + this.state + "\n";
        result += "\tZipcode: " + this.zipcode + "\n";

        return result;
    }
}
