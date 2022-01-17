package com.company;

public class Main {
    public static int avgValue(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total+=arr[i];
        }
        int avg = total/ arr.length;
        return avg;
    }
    public static int maxValue(int[] arr){
        int maxValue = arr[0];
        for (int  i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static int minValue(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static long[] calculateFibonacci(int n){
        long[] series = new long[n];
        //create first 2 series elements
        series[0] = 0;
        series[1] = 1;
        //create the Fibonacci series and store it in an array
        for(int i=2; i < n; i++)
        {
            series[i] = series[i-1] + series[i-2];
        }
        return series;
    }
    public static void printFibonacci(){
        long[] fibonacci = calculateFibonacci(11);
        for (int i = 0; i < fibonacci.length; i++)
            System.out.print(fibonacci[i] + " ");
    }
    public static void main(String[] args) {
	// write your code here
        int[] arr = {1, 2, 5, 9,3};
        long[] fibonacci = calculateFibonacci(11);
        String string = "Sabina";
        System.out.println("Size of array: " + arr.length);
        System.out.println("MaxValue: " + maxValue(arr));
        System.out.println("MinValue: " + minValue(arr));
        System.out.println("AverageValue: " + avgValue(arr));
        System.out.println("LowerCase string result: " + string.toLowerCase());
        System.out.println("Fibonacci numbers: ");
        printFibonacci();
        System.out.println();

        Person person = new Person();
        Person person1 = new Person("Meiram Sopy", 19);
        Person person2 = new Person("Sabina", 18);

        System.out.println(person1.getFullName() + " is " + person1.getAge() + " years old" + " and he's " + person1.move());
        System.out.println(person2.getFullName() + " is " + person2.getAge() + " years old" + " and she's " + person1.talk());
        System.out.println();

        Phone phone = new Phone();
        Phone phone1 = new Phone("+7747775454", "IPhone 8 Plus", "1kg");
        Phone phone2 = new Phone("+77473183123", "IPhone 13 Pro Max", "1kg");
        Phone phone3 = new Phone("Anonym", "Android", "1kg");

        phone1.receiveCall(person1);
        phone1.receiveCall(person1, phone1);
        phone2.receiveCall(person2, phone2);
        phone1.sendMessage("87712313122");



    }
}
