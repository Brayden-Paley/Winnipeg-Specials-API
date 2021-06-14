package com.WinnipegSpecials.service;

import com.WinnipegSpecials.repository.DealRepository;
import com.WinnipegSpecials.model.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealService {

    @Autowired
    private DealRepository dealRepository;

    public void addDeal(Deal deal) {
        dealRepository.save(deal);
    }

    public List<Deal> getAllDeals() {
        return dealRepository.findAll();
    }

    public List<Deal> getDealsByRestaurant(String restaurant){
        return dealRepository.getDealsByRestaurant(restaurant);
    }

    public Deal getDealById(String id) {
        if(dealRepository.findById(id).isPresent()){
            return dealRepository.findById(id).get();
        }
        return new Deal("Not valid", "Not valid", "Not valid", "Not valid", "0", 0, false, false, false, false, false, false, false, false, false);
    }

    public void deleteDeal(Deal deal) {
        dealRepository.delete(deal);
    }


    public void updateDeal(Deal updatedDeal) {
        //overrides and re-saves this deal
        dealRepository.save(updatedDeal);
    }
}

