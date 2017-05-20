package springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marti on 2017-04-22.
 */
@RestController
public class HelloController
{
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi()
    {
        return "hi";
    }
}
