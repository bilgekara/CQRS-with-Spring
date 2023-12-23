package com.bilgeli.order.command.service.mapper;

import com.bilgeli.order.command.dto.CreateOrderCommand;
import com.bilgeli.order.command.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrderMapper {
    //private final OrderLineItemsMapper orderLineItemsMapper;

    public Order toDto(CreateOrderCommand orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        /*List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(orderLineItemsMapper::toDto)
                .collect(Collectors.toList());

        order.setOrderLineItemsList(orderLineItems);*/

        return order;
    }
}
