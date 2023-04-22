package com.food.ordering.system.domain.vo;

import java.util.UUID;

/**
 * This is a common value object, which will be used not only in ordering system
 * but payment, so it's here
 */
public class OrderId extends BaseId<UUID> {

    public OrderId(UUID value){
        super(value);
    }

}

