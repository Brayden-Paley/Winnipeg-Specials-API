package com.WinnipegSpecials.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auth")
public class Auth {

    public Auth(){

    }
    @Id
    @Column(name = "authId")
    public String authId;
    public String deviceId;
    @Column(name = "dealId")
    public String dealId;
    public Boolean upvoted;

    public Auth(String authId, String deviceId, String dealId, Boolean vote) {
        this.authId = authId;
        this.deviceId = deviceId;
        this.dealId = dealId;
        this.upvoted = vote;
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

    public Boolean getUpvoted() {
        return upvoted;
    }
}
