package com.WinnipegSpecials.service;

import com.WinnipegSpecials.dao.AuthRepository;
import com.WinnipegSpecials.model.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    public void addAuth(Auth authToSave) {
        authRepository.save(authToSave);
    }

    public List<Auth> getAllAuth() {
        return authRepository.findAll();
    }

    public List<Auth> getAuthByDealId(String dealId){
        return authRepository.getAuthByDealId(dealId);
    }

    public Auth getAuthByAuthId(String authId) {
        if(authRepository.findById(authId).isPresent()){
            return authRepository.findById(authId).get();
        }
        return new Auth("invalid", "invalid", "invalid");
    }

    public void deleteAuth(Auth auth){
        authRepository.delete(auth);
    }

    public void updateAuth(Auth auth){
        //overrides and re-saves this auth
        //method should NOT be needed, serves as a placeholder
        authRepository.save(auth);
    }


}
