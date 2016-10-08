package o011generic_di;

import org.springframework.beans.factory.annotation.Autowired;

import java.security.PrivateKey;

/**
 * Created by liguohua on 4/7/16.
 */
public class UserService<T> {
    @Autowired
    UserReporsitory<T> userUserReporsitory;

    public void save() {
        System.out.println("UserService.save()" + userUserReporsitory);
    }
}
