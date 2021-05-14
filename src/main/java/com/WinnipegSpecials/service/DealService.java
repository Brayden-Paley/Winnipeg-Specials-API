package com.WinnipegSpecials.service;

import com.WinnipegSpecials.dao.DealRepository;
import com.WinnipegSpecials.model.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DealService {

    @Autowired
    private DealRepository dealRepository;

    public void addDeal(Deal deal) {
        dealRepository.save(deal);
    }

    public List<Deal> getAllDeals() {
        List<Deal> dealList = new ArrayList<>();
        dealRepository.findAll().forEach(dealList::add);
        return dealList;
    }

    public List<Deal> getDealsByRestaurant(String restaurant){
        return dealRepository.getDealsByRestaurant(restaurant);
    }

    public Deal getDealById(String id) {
        return dealRepository.findById(id).get();
    }

    public void deleteDeal(Deal deal) {
        dealRepository.delete(deal);
    }


    public void updateDeal(Deal updatedDeal) {
        //overrides and re-saves this deal
        dealRepository.save(updatedDeal);
    }
}

