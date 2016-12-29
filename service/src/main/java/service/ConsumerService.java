package service;

import entity.Consumer;

public interface ConsumerService {
    Consumer getConsumerById(final int id);
    Consumer getConsumerByLogin(final String login);
}
