public class Customer {
    private String firstName;
    private String lastName;
    private String dob;
    private int ssn;
    Address address;
    public Customer(){
        this.address = new Address();
    }
    public String getFirstName() {
        return firstName;
    }
    public boolean setFirstName(String firstName) {
        if(!firstName.isEmpty())
        {
            this.firstName = firstName;
            return true;
        }
        return false;
    }
    public String getLastName() {
        return lastName;
    }
    public boolean setLastName(String lastName) {
        if(!lastName.isEmpty())
        {
            this.lastName = lastName;
            return true;
        }
        return false;
    }
    public String getDob() {
        return dob;
    }
    public boolean setDob(String dob) {
        if(!dob.isEmpty())
        {
            this.dob = dob;
            return true;
        }
        return false;
    }
    public int getSsn() {
        return ssn;
    }
    public boolean setSsn(int ssn) {
        try{
            if((ssn+"").length()==4){
                this.ssn = ssn;
                return true;
            }
        }catch(Exception e){}
        return false;
    }
}
