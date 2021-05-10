package com.WinnipegSpecials.service;

import com.WinnipegSpecials.dao.DealDao;
import com.WinnipegSpecials.model.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DealService {

    private final DealDao dealDao;

    @Autowired
    public DealService(@Qualifier("fakeDao") DealDao dealDao) {
        this.dealDao = dealDao;
    }



    public int addDeal(Deal deal){
        return dealDao.insertDeal(deal);
    }
}
