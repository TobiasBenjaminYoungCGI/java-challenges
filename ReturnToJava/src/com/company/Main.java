package com.company;

public class Main {

    public static void main(String[] args) {
        int top = 20;
	    for(int i=0; i<=top; i++ ){
        if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(i % 5 == 0){
            System.out.println("Fizz");
        } else if (i % 3 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        }
    }
}
