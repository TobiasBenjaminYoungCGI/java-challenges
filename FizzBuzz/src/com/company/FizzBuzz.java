package com.company;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main (String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] fizzBuzzResult = fizzBuzz.isFizzBuzz(20);

        for(int i = 0; i < fizzBuzzResult.length; i++){
            System.out.println(fizzBuzzResult[i]);
        }
    }

    public String[] isFizzBuzz(int input) {
        List<String> FizzBuzzResult = new ArrayList<>();
        for (int i = 0; i <= input; i++) {
            if (isBuzz(input) && isFizz(input)) {
                FizzBuzzResult.add("FizzBuzz");
            }
            else if (isFizz(input)) {
                FizzBuzzResult.add("Fizz");
            }
            else if (isBuzz(input)) {
                FizzBuzzResult.add("Buzz");
            } else {
                FizzBuzzResult.add(String.valueOf(input));
            }
        };
        String[] FizzBuzzArray = new String[FizzBuzzResult.size()];
        return FizzBuzzResult.toArray(FizzBuzzArray);
    }

    public Boolean isBuzz(int input){
        if (input % 3 == 0) {
            return true;
        };
        return false;
    }

    public Boolean isFizz(int input){
        if (input % 5 == 0) {
            return true;
        };
        return false;
    }
}
