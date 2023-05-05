package com.bridgelabz.hotel;

public class Hotel {
    String hotelName;
    int weekdayRegularCustomer;
    int weekdayRewardCustomer;
    int weekendRegularCustomer;
    int weekendRewardCustomer;
    int hotelRating;

    public Hotel(String hotelName, int weekdayRegularCustomer, int weekdayRewardCustomer, int weekendRegularCustomer, int weekendRewardCustomer, int hotelRating) {
        this.hotelName = hotelName;
        this.weekdayRegularCustomer = weekdayRegularCustomer;
        this.weekdayRewardCustomer = weekdayRewardCustomer;
        this.weekendRegularCustomer = weekendRegularCustomer;
        this.weekendRewardCustomer = weekendRewardCustomer;
        this.hotelRating = hotelRating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularCustomer=" + weekdayRegularCustomer +
                ", weekdayRewardCustomer=" + weekdayRewardCustomer +
                ", weekendRegularCustomer=" + weekendRegularCustomer +
                ", weekendRewardCustomer=" + weekendRewardCustomer +
                ", hotelRating=" + hotelRating +
                '}';
    }
}
