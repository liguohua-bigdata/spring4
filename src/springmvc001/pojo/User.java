package springmvc001.pojo;

/**
 * Created by liguohua on 4/10/16.
 */
public class User {
    private String username;
    private String password;
    private String email;
    private int age;
    private Address address;


    public User() {
    }

    public User(String username, String password, String email, int age, Address address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.address = address;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
