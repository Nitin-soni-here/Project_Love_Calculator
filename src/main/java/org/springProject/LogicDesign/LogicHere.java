package org.springProject.LogicDesign;

import org.springframework.stereotype.Service;

@Service
public class LogicHere implements LOveCalculatorServices {


    @Override
    public String calculateLove(String userName, String crushName) {
        final String formula = "FLAME";
        int count = (userName + crushName).toCharArray().length;
        int formulaCount = formula.toCharArray().length;
        int rem = count % formulaCount;
        char resultChar = formula.charAt(rem);

        String Result = WhatBetweenUs(resultChar);
        return Result;
    }

    public String WhatBetweenUs(char CalculateResult) {
        String result=null;
        if (CalculateResult == 'F') {
            return LoveCalculatorConstant.F;
        }
        else if (CalculateResult == 'L') {
            return LoveCalculatorConstant.L;
        }
        else if (CalculateResult == 'A') {
            return LoveCalculatorConstant.A;
        }
        else if (CalculateResult == 'M') {
            return LoveCalculatorConstant.M;
        }
        else if (CalculateResult == 'E') {

            return LoveCalculatorConstant.E;
        }
        else if (CalculateResult == 'S') {
            return LoveCalculatorConstant.S;
        }
        return result;
    }

}
