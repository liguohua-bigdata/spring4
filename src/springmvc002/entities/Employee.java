package springmvc002.entities;

/**
 * Created by liguohua on 4/21/16.
 */
public class Employee {

    private int id;
    private String lastName;
    private String email;
    private Integer gender;
    private Department demparment;
    public Employee() {
    }

    public Employee(int id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.demparment = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDemparment() {
        return demparment;
    }

    public void setDemparment(Department demparment) {
        this.demparment = demparment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", demparment=" + demparment +
                '}';
    }
}
