package com.bilgeli.order.command.service;

import com.bilgeli.order.command.dto.CreateOrderCommand;
import com.bilgeli.order.command.model.Order;
import com.bilgeli.order.command.repository.OrderRepository;
import com.bilgeli.order.command.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderCommandHandler {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public void handle(CreateOrderCommand orderRequest) {
        Order order = orderMapper.toDto(orderRequest);
        orderRepository.save(order);
    }
}
