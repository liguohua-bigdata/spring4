package springmvc003.demo001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liguohua on 5/27/16.
 */
@Controller
public class ControllerDemo001 {
    @RequestMapping(value = "/get/age", method = RequestMethod.GET)
    @ResponseBody
    public int test0001(@RequestParam("age") int age) {
        return age;
    }
}
