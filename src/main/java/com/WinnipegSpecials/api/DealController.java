package com.WinnipegSpecials.api;

import com.WinnipegSpecials.model.Deal;
import com.WinnipegSpecials.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/deal")
@RestController
public class DealController {

    private final DealService dealService;

    @Autowired
    public DealController(DealService dealService) {
        this.dealService = dealService;
    }

    @PostMapping
    public void addDeal(@RequestBody Deal deal){
        dealService.addDeal(deal);

    }
}
