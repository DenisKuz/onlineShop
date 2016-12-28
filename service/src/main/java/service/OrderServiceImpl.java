package service;

import entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepo orderRepo;

    public Order getOrderById(final int id) {
        return orderRepo.findOne(id);
    }
}
