public class Address {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    public String getAddress1() {
        return address1;
    }
    public boolean setAddress1(String address1) {
        if(!address1.isEmpty())
        {
            this.address1 = address1;
            return true;
        }
        return false;
    }
    public String getAddress2() {
        return address2;
    }
    public boolean setAddress2(String address2) {
        if(!address2.isEmpty())
        {
            this.address2 = address2;
            return true;
        }
        return false;
    }
    public String getCity() {
        return city;
    }
    public boolean setCity(String city) {
        if(!city.isEmpty())
        {
            this.city = city;
            return true;
        }
        return false;
    }
    public String getState() {
        return state;
    }
    public boolean setState(String state) {
        if(!state.isEmpty())
        {
            this.state = state;
            return true;
        }
        return false;
    }
    public String getZipcode() {
        return zipcode;
    }
    public boolean setZipcode(String zipcode) {
        if(!zipcode.isEmpty())
        {
            this.zipcode = zipcode;
            return true;
        }
        return false;
    }

}
