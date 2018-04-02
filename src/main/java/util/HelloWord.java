package util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 郭兰芳 on 2018/3/22.
 */
@Controller
public class HelloWord {
    @RequestMapping("/")
    public String hello() {
        return "hello,Spring boot!";
    }
}
