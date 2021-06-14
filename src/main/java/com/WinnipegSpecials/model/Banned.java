package com.WinnipegSpecials.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banned")
public class Banned {

    public Banned(){

    }
    @Id
    @Column(name = "bannedId")
    public String bannedId;
    @Column(name = "deviceId")
    public String deviceId;

    public Banned(String bannedId, String deviceId) {
        this.bannedId = bannedId;
        this.deviceId = deviceId;

    }

    public String getBannedId() {
        return bannedId;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
