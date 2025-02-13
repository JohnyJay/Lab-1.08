package com.ironhack.labs.lab_108;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // TASK ONE

        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        BigDecimal bd1 = new BigDecimal("4.2545");
        BigDecimal bd2 = new BigDecimal("-26.3661");
        BigDecimal bd3 = new BigDecimal("1.2345");
        BigDecimal bd4 = new BigDecimal("-45.67");
        result1 = roundToHundreth(bd1);
        result2 = roundToHundreth(bd2);
        result3 = changeSignAndRoundToTenth(bd3);
        result4 = changeSignAndRoundToTenth(bd4);

        System.out.println("BIG DECIMAL OPERATIONS");
        System.out.println("The result of the round operation is: "+result1);
        System.out.println("The result of the round operation is: "+result2);
        System.out.println("The result of the sign operation is: "+result3);
        System.out.println("The result of the sign operation is: "+result4);
        System.out.println();

        //TASK TWO

        Sedan sedan1 = new Sedan("1234A","Volvo","s80",200_000);
        Sedan sedan2 = new Sedan("4325B","Audi","A8",150_000);
        UtilityVehicle utility1 = new UtilityVehicle("9980C","Ford","Escort",130_000,true);
        UtilityVehicle utility2 = new UtilityVehicle("4587J","Citroen","Picasso",30_000,false);
        Truck truck1 = new Truck("8493K","Tesla","X9",115_000,65.8);
        Truck truck2 = new Truck("9001P","Toyota","Prius",800_000,25.5);

        System.out.println("CAR INVENTORY SYSTEM");
        System.out.println(sedan1.getInfo());
        System.out.println(sedan2.getInfo());
        System.out.println(utility1.getInfo());
        System.out.println(utility1.fourWheelInfo());
        System.out.println(utility2.getInfo());
        System.out.println(utility2.fourWheelInfo());
        utility2.setFourWheelDrive(true);
        System.out.println(utility2.fourWheelInfo());
        System.out.println(truck1.getInfo());
        System.out.println(truck1.towingInfo());
        truck1.setTowingCapacity(105.6);
        System.out.println(truck1.towingInfo());
        System.out.println(truck2.getInfo());
        System.out.println(truck2.towingInfo());
        System.out.println();

        //TASK THREE

        TvSeries grey = new TvSeries("Grey's Anatomy",600,60);
        TvSeries house = new TvSeries("House",800,40);
        Movie gladiator = new Movie("Gladiator",130,4.5);
        Movie gladiator2 = new Movie("Gladiator 2",140,4.5);

        System.out.println("VIDEO STREAMING SERVICE");
        System.out.println(grey.getInfo() + " It has a total number of "+grey.getEpisodes()+" episodes.");
        System.out.println(house.getInfo() + " It has a total number of "+house.getEpisodes()+" episodes.");
        System.out.println("The new Season 5 for House has been added. Updating info...");
        house.setEpisodes(50);
        house.setDuration(1_000);
        System.out.println(house.getInfo() + " It has a total number of "+house.getEpisodes()+" episodes.");
        System.out.println(gladiator.getInfo() + " It has a rating of "+gladiator.getRating());
        System.out.println(gladiator2.getInfo()+" It has a rating of "+gladiator2.getRating());
        System.out.println("It seems like the public did not like the second Gladiator movie. Updating the rating acordingly...");
        gladiator2.setRating(3.5);
        System.out.println(gladiator2.getInfo()+" It has a rating of "+gladiator2.getRating());
        System.out.println();

        // TASK FOUR

        System.out.println("INTLIST INTERFACE");
        IntArrayList array = new IntArrayList();
        array.add(5);
        array.add(5);
        System.out.println(array.arrayInfo());
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        System.out.println(array.arrayInfo());
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        System.out.println(array.arrayInfo());
        array.add(5);
        array.add(5);
        System.out.println(array.arrayInfo());
        array.add(5);
        System.out.println(array.arrayInfo());
        System.out.println(Arrays.toString(array.getArray()));
        array.add(5);
        System.out.println(array.arrayInfo());
        System.out.println(Arrays.toString(array.getArray()));
        array.add(5);
        System.out.println(array.arrayInfo());
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        System.out.println(array.arrayInfo());
        System.out.println(array.get(20)); // NOTE THAT USAGE STARTS AT 1, INDEX OF ARRAY STARTS AT ZERO.
        System.out.println(Arrays.toString(array.getArray()));
        System.out.println();

        IntVector array2 = new IntVector();
        array2.add(5);
        array2.add(5);
        System.out.println(array2.arrayInfo());
        array2.add(5);
        array2.add(5);
        array2.add(5);
        array2.add(5);
        array2.add(5);
        System.out.println(array2.arrayInfo());
        array2.add(5);
        array2.add(5);
        array2.add(5);
        array2.add(5);
        array2.add(5);
        System.out.println(array2.arrayInfo());
        array2.add(5);
        array2.add(5);
        System.out.println(array2.arrayInfo());
        array2.add(5);
        System.out.println(array2.arrayInfo());
        System.out.println(Arrays.toString(array2.getArray()));
        array2.add(5);
        System.out.println(array2.arrayInfo());
        System.out.println(Arrays.toString(array2.getArray()));
        array2.add(5);
        System.out.println(array2.arrayInfo());
        array2.add(5);
        array2.add(5);
        array2.add(5);
        array2.add(5);
        System.out.println(array2.arrayInfo());
        System.out.println(array2.get(20)); // NOTE THAT USAGE STARTS AT 1, INDEX OF ARRAY STARTS AT ZERO.
        System.out.println(Arrays.toString(array2.getArray()));

    }

    private static double changeSignAndRoundToTenth(BigDecimal bd1) {
        return bd1.setScale(1, RoundingMode.HALF_EVEN).negate().doubleValue();
    }

    private static double roundToHundreth(BigDecimal bd1) {
        return bd1.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
}
