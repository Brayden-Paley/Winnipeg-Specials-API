package com.WinnipegSpecials.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auth")
public class Auth {

    @Id
    @Column(name = "authId")
    public String authId;
    public String deviceId;
    @Column(name = "dealId")
    public String dealId;

    public Auth(String authId, String deviceId, String dealId) {
        this.authId = authId;
        this.deviceId = deviceId;
        this.dealId = dealId;
    }

    public String getAuthId() {
        return authId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDealId() {
        return dealId;
    }
}
