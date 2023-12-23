package com.bilgeli.order.command.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderCommand implements Command{
    // command requestiyse araya gir
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}

