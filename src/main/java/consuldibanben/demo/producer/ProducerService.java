package consuldibanben.demo.producer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "producer")
public interface ProducerService {
    @PostMapping("/producer/say/{id}")
    String say(@PathVariable("id") String id, @RequestBody User user) ;
}
