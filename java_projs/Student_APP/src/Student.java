public class Student {
    private String firstname;
    private String lastname;
    private String id;
    private Address address;

    public Student(String firstname, String lastname, String id, Address address ){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.address = address;
    }

    public String getStudentInfo(){
        String result = "First name: " + this.firstname + "\n";
        result  += "Last name: " + this. lastname + "\n";
        result += "Id: " + this.id + "\n";
        result += "Address: \n" + address.getAddressInfo();
        return result;

    }
}
