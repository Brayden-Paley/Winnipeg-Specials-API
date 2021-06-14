package com.WinnipegSpecials.repository;

import com.WinnipegSpecials.model.Banned;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BannedRepository extends JpaRepository<Banned, String> {
    Banned getBannedByDeviceId(String deviceId);

}
