package com.bridgelabz.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class HotelMain {
    Scanner scanner=new Scanner(System.in);
    static ArrayList<Hotel> hotelList=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
        Hotel hotel1=new Hotel("Lakewood",110,80,90,80,3);
        Hotel hotel2=new Hotel("Bridgewood",160,110,60,50,4);
        Hotel hotel3=new Hotel("Ridgewood",220,100,150,40,5);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
        System.out.println(hotelList);

        HotelMain hotelMain=new HotelMain();
        System.out.print("Days:");
        hotelMain.cheapestHotel();



    }

    public void cheapestHotel() {
        System.out.println("Enter the startDate : ");
        String startDate=scanner.nextLine();
        System.out.println("Enter the endDate : ");
        String endDate=scanner.nextLine();
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        long daysBetween= ChronoUnit.DAYS.between(startDateFormat,endDateFormat);
        System.out.println(daysBetween);
        List<Hotel> cheapHotel = hotelList.stream().min(Comparator.comparing(Hotel -> Hotel.weekdayRewardCustomer > 3)).stream().collect(Collectors.toList());
        System.out.println(cheapHotel);


    }
}
