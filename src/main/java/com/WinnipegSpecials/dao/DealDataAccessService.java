package com.WinnipegSpecials.dao;

import com.WinnipegSpecials.model.Deal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class DealDataAccessService implements DealDao {

    private static List<Deal> db = new ArrayList<>();
    @Override
    public int insertDeal(UUID id, Deal deal) {
        db.add(new Deal(id.toString(), deal.getRestaurant(), deal.getTitle(), deal.getDescription(), deal.getPrice(), 0));
        return 1;
    }

}
