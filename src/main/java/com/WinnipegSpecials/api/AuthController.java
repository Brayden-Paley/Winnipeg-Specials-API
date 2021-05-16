package com.WinnipegSpecials.api;

import com.WinnipegSpecials.model.Auth;
import com.WinnipegSpecials.model.Deal;
import com.WinnipegSpecials.service.AuthService;
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

@RequestMapping("api/v1/auth")
@RestController
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping
    public void addAuth(@RequestBody Auth auth){
        authService.addAuth(auth);
    }

    @GetMapping
    public List<Auth> getAllAuth(){
        return authService.getAllAuth();
    }

    @GetMapping(path = "{authId}")
    public Auth getAuthById(@PathVariable("AuthId") String authId){
        return authService.getAuthByAuthId(authId);
    }

    @GetMapping(path = "deal/{dealId}")
    public List<Auth> getAuthByDealId(@PathVariable("dealId") String dealId){
        return authService.getAuthByDealId(dealId);
    }

    @DeleteMapping(path = "{authId}")
    public void deleteAuthById(@PathVariable("authId") String authId){
        Auth authToDelete = authService.getAuthByAuthId(authId);
        authService.deleteAuth(authToDelete);
    }

    @PutMapping
    public void updatedAuth (@RequestBody Auth updatedAuth){
        authService.updateAuth(updatedAuth);
    }










}
