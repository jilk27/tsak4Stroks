package org.example;

public static void main(String[] args) {
    Stroki arr = new Stroki();

    arr.add("Maclaren");
    arr.add("Honda");
    arr.add("Lamborghini");
    arr.add("Mercedes");

    System.out.println("Max length's string: " + arr.getMaxLengthString());
    System.out.println("Average strings length: " + arr.getAverageLength());
}