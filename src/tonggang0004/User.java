package tonggang0004;

/**
 * Created by liguohua on 4/6/16.
 */
public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
