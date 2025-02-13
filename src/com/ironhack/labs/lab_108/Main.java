package com.ironhack.labs.lab_108;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        System.out.println("The result of the round operation is: "+result1);
        System.out.println("The result of the round operation is: "+result2);
        System.out.println("The result of the sign operation is: "+result3);
        System.out.println("The result of the sign operation is: "+result4);
    }

    private static double changeSignAndRoundToTenth(BigDecimal bd1) {
        return bd1.setScale(1, RoundingMode.HALF_EVEN).negate().doubleValue();
    }

    private static double roundToHundreth(BigDecimal bd1) {
        return bd1.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
}
