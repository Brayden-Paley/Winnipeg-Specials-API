package com.WinnipegSpecials.service;

import com.WinnipegSpecials.model.Banned;
import com.WinnipegSpecials.repository.BannedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannedService {

    @Autowired
    private BannedRepository bannedRepository;

    public void addBanned(Banned banToAdd) {
        bannedRepository.save(banToAdd);
    }

    public List<Banned> getAllBanned() {
        return bannedRepository.findAll();
    }

    public Banned getBannedByDeviceId(String deviceId){
        return bannedRepository.getBannedByDeviceId(deviceId);
    }

    public void deleteBanned(Banned banned){
        bannedRepository.delete(banned);
    }

    public void updateBanned(Banned banned){
        bannedRepository.save(banned);
    }
}
