package boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HeroDishonest on 16.04.2017.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String showHiMessage(){
        return "Hi!";
    }
}
