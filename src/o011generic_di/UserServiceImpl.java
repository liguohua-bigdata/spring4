package o011generic_di;

import org.springframework.stereotype.Service;

/**
 * Created by liguohua on 4/7/16.
 */
@Service("userService")
public class UserServiceImpl extends UserService<User>   {
    @Override
    public void save() {
        super.save();
    }
}
