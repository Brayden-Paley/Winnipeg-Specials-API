package com.WinnipegSpecials;


import com.WinnipegSpecials.model.Auth;
import com.WinnipegSpecials.repository.AuthRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthControllerTests {

    @Autowired
    private AuthRepository authRepository;

    @Test
    public void saveTest() {
        Auth auth = new Auth("testId,", "testDeviceId", "testDealId", false);
        authRepository.save(auth);
        Assert.assertNotNull(authRepository.findAll());
    }
    //Integration testing is a bit messy as we are using an external db for this project
    //Also, unit testing isn't applicable using JPA repo because the save/delete/update methods are implemented, not written
}
