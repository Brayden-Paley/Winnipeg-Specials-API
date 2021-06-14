package com.WinnipegSpecials;

import com.WinnipegSpecials.model.Deal;
import com.WinnipegSpecials.repository.DealRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DealControllerTest {

    @Autowired
    private DealRepository dealRepository;

    @Test
    public void saveTest() {
        Deal deal = new Deal("Test", "Test", "Test", "Test", "0", 0, false, false, false, false, false, false, false, false, false);
        dealRepository.save(deal);
        Assert.assertNotNull(dealRepository.findAll());
    }

    //Integration testing is a bit messy as we are using an external db for this project
    //Also, unit testing isn't applicable using JPA repo because the save/delete/update methods are implemented, not written
}

