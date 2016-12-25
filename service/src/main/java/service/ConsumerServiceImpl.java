package service;

import entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ConsumerRepo;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    private final ConsumerRepo consumerRepo;

    @Autowired
    public ConsumerServiceImpl(ConsumerRepo consumerRepo) {
        this.consumerRepo = consumerRepo;
    }

    public Consumer getConsumerById(final int id) {
        return consumerRepo.findOne(id);
    }
}
