package com.bilgeli.order.command.controller;

import com.bilgeli.order.command.dto.CreateOrderCommand;
import com.bilgeli.order.command.service.OrderCommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderCommandController {
    private final OrderCommandHandler orderCommandService;

    @PostMapping("/place")
    public void placeOrder(@RequestBody CreateOrderCommand orderRequest) {
        orderCommandService.handle(orderRequest);
    }

    @PostMapping("/cancel")
    public void cancelOrder() {

    }
}
