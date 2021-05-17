package com.WinnipegSpecials.api;

import com.WinnipegSpecials.model.Deal;
import com.WinnipegSpecials.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping
    public List<Deal> getAllDeals(){
        return dealService.getAllDeals();
    }

    @GetMapping(path = "{dealId}")
    public Deal getDealById(@PathVariable("dealId") String dealId){
        return dealService.getDealById(dealId);
    }

    @GetMapping(path = "/restaurant/{restaurant}")
    public List<Deal> getDealsByRestaurant(@PathVariable("restaurant") String restaurant){
        return dealService.getDealsByRestaurant(restaurant);
    }

    @DeleteMapping(path = "{dealId}")
    public void deleteDealById(@PathVariable("dealId") String dealId){
        Deal dealToDelete = dealService.getDealById(dealId);
        dealService.deleteDeal(dealToDelete);
    }

    //don't seem to need dealId as a path variable here, will consider changing
    @PutMapping(path = "{dealId}")
    public void updateDeal(@PathVariable("dealId") String dealId,
                           @RequestBody Deal updatedDeal){
        //Deal dealToUpdate = dealService.getDealById(dealId);
        dealService.updateDeal(updatedDeal);
    }
}
