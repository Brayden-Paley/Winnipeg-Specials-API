package com.WinnipegSpecials.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deals")
public class Deal {

    public Deal(){

    }
        @Id
        @Column(name = "dealId")
        private String dealId;
        @Column(name = "restaurant")
        private String restaurant;
        private String title;
        private String description;
        private String price;
        private int rating;
        private boolean everyday;
        private boolean monday;
        private boolean tuesday;
        private boolean wednesday;
        private boolean thursday;
        private boolean friday;
        private boolean saturday;
        private boolean sunday;

    public Deal(@JsonProperty("dealId") String dealId,
                @JsonProperty("restaurant") String restaurant,
                @JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("price") String price,
                @JsonProperty("rating") int rating,
                @JsonProperty("everyday") boolean everyday,
                @JsonProperty("monday") boolean monday,
                @JsonProperty("tuesday") boolean tuesday,
                @JsonProperty("wednesday") boolean wednesday,
                @JsonProperty("thursday") boolean thursday,
                @JsonProperty("friday") boolean friday,
                @JsonProperty("saturday") boolean saturday,
                @JsonProperty("sunday") boolean sunday) {
            this.dealId = dealId;
            this.restaurant = restaurant;
            this.title = title;
            this.description = description;
            this.price = price;
            this.rating = rating;
            this.everyday = everyday;
            this.monday = monday;
            this.tuesday = tuesday;
            this.wednesday = wednesday;
            this.thursday = thursday;
            this.friday = friday;
            this.saturday = saturday;
            this.sunday = sunday;
        }

        public String getDealId() {
            return dealId;
        }

        public String getRestaurant() {
            return restaurant;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getPrice() {
            return price;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int newRating){
            //new rating should always be +- 1
            this.rating = this.rating + newRating;
        }

        public boolean isEveryday() {
            return everyday;
        }

        public boolean isMonday() {
            return monday;
        }

        public boolean isTuesday() {
            return tuesday;
        }

        public boolean isWednesday() {
            return wednesday;
        }

        public boolean isThursday() {
            return thursday;
        }

        public boolean isFriday() {
            return friday;
        }

        public boolean isSaturday() {
            return saturday;
        }

        public boolean isSunday() {
            return sunday;
        }

}
