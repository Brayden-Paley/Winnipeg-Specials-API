package com.WinnipegSpecials.dao;

import com.WinnipegSpecials.model.Deal;

import java.util.UUID;


public interface DealDao {

    int insertDeal(UUID id, Deal deal);

    default int insertDeal(Deal deal){
        UUID id = UUID.randomUUID();
        return insertDeal(id, deal);
    }
}
