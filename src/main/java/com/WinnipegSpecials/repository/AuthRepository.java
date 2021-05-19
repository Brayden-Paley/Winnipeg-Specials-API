package com.WinnipegSpecials.repository;

import com.WinnipegSpecials.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthRepository extends JpaRepository<Auth, String> {
    List<Auth> getAuthByDealId(String dealId);
}
