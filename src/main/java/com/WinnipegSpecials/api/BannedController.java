package com.WinnipegSpecials.api;

import com.WinnipegSpecials.model.Banned;
import com.WinnipegSpecials.service.BannedService;
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

    @RequestMapping("api/v1/banned")
    @RestController
    public class BannedController {

        private final BannedService bannedService;

        @Autowired
        public BannedController(BannedService bannedService) {
            this.bannedService = bannedService;
        }

        @PostMapping
        public void addBan(@RequestBody Banned banned) {
            bannedService.addBanned(banned);
        }

        @GetMapping
        public List<Banned> getAllBanned() {
            return bannedService.getAllBanned();
        }

        @GetMapping(path = "{deviceId}")
        public Banned getBannedByDeviceId(@PathVariable("deviceId") String deviceId) {
            return bannedService.getBannedByDeviceId(deviceId);
        }

        @DeleteMapping(path = "{deviceId}")
        public void deleteBannedByDeviceId(@PathVariable("deviceId") String deviceId) {
            Banned bannedToDelete = bannedService.getBannedByDeviceId(deviceId);
            bannedService.deleteBanned(bannedToDelete);
        }

        @PutMapping
        public void updatedBanned (@RequestBody Banned updatedBanned) {
            bannedService.updateBanned(updatedBanned);
        }
    }

