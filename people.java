
import java.util.Objects;
public class people {
    private String address;
    private int age;
    private int phone_number;
    private int id;
    private String fName;
    private String lName;

    public people(int id,String fName,String lName,int age,String address ){
this.id=id;this.fName=fName;this.lName=lName;this.age=age;this.address=address;

    }
public people(int id,String fName,String lName){
    this.id=id;this.fName=fName;this.lName=lName;
}
    public people(int id,String fName,String lName,String address,int phone_number) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone_number = phone_number;
    }


        public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "people{" +
                "address='" + address + '\'' +
                ", age=" + age +
                ", phone_number=" + phone_number +
                ", id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }



}
