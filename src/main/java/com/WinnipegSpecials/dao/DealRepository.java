package com.WinnipegSpecials.dao;

import com.WinnipegSpecials.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DealRepository extends JpaRepository<Deal, String> {
    List<Deal> getDealsByRestaurant(String restaurant);
}
