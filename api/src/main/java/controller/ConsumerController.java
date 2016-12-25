package controller;

import entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ConsumerService;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    private final ConsumerService consumerService;

    @Autowired
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping(path = "/get/{id}")
    public Consumer getConsumerById(@PathVariable("id") final int consumerId) {
        return consumerService.getConsumerById(consumerId);
    }
}
