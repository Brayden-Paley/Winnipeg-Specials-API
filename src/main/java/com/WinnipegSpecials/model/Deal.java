package com.WinnipegSpecials.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    public class Deal {
        private String dealID;
        private String restaurant;
        private String title;
        private String description;
        private int price;
        private int rating;

        public Deal(@JsonProperty("dealID") String dealID,
                    @JsonProperty("restaurant") String restaurant,
                    @JsonProperty("title") String title,
                    @JsonProperty("description") String description,
                    @JsonProperty("price") int price,
                    @JsonProperty("rating") int rating) {
            this.dealID = dealID;
            this.restaurant = restaurant;
            this.title = title;
            this.description = description;
            this.price = price;
            this.rating = rating;
        }
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        public int getId() {
//            return id;
//        }

        public String getDealID() {
            return dealID;
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

        public int getPrice() {
            return price;
        }

        public int getRating() {
            return rating;
        }

        //other setters and getters
    }
