package consuldibanben.demo;

import consuldibanben.demo.producer.ProducerService;
import consuldibanben.demo.producer.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements ProducerService {
    @GetMapping(value = "/")
    public String hello(){
        return "hello";
    }

    @Override
    public String say(@PathVariable("id") String id, @RequestBody User user) {
        if (StringUtils.isBlank(id)) {
            return "我得到了null";
        }
        if (user == null) {
            return "我没获取到你给我的对象";
        }
        return user+id;
    }
}
