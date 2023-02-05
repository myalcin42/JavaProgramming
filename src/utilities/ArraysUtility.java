package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //print each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //print each decimal number of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //print each char of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //print each String of a String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);

        return numbers[numbers.length-1];
    }

    //returns the maximum number for double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);

        return numbers[numbers.length-1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);

        return numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);

        return numbers[0];
    }



    //check if the  given integer is contained in the given array.returns boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }

    //check if the  given double is contained in the given array.returns boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }


    //check if the  given char is contained in the given array.returns boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }

    //check if the  given string is contained in the given array.returns boolean
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                result = true;
            }
        }

        return result;
    }

    //adds an element to an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }
    //adds an element to an double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;
        //result[result.length - 1] = element;
        return result;
    }
    //adds an element to an String array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }
    //adds an element to an char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array,int element){

        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array,double element){

        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array,char element){

        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array,String element){

        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }

        return count;
    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the element at the given index of the array and returns the new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j = 0;
        for (int i =0 ; i < array.length ; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the element at the given index of the array and returns the new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];

        int j = 0;
        for (int i =0 ; i < array.length ; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the element at the given index of the array and returns the new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length-1];

        int j = 0;
        for (int i =0 ; i < array.length ; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the element at the given index of the array and returns the new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];

        int j = 0;
        for (int i =0 ; i < array.length ; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    //merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //reverse the given array, returns a new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverse the given array, returns a new array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverse the given array, returns a new array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverse the given array, returns a new array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }


    //replace the elements of the array at given index with the new element
    public static int[] replaceElement(int[] array, int index, int newElement){

        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static double[] replaceElement(double[] array, int index, double newElement){

        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static char[] replaceElement(char[] array, int index, char newElement){

        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static String[] replaceElement(String[] array, int index, String newElement){

        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replaces all the matching old values of the array with the new value
    public static int[] replaceAllElements(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static double[] replaceAllElements(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static char[] replaceAllElements(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){ //char da primitive bir data tipi olduğu için eşit olup olmadığını kontrol etmek için == kullanılır
                array[i] = newValue;
            }
        }

        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static String[] replaceAllElements(String[] array,String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }

        return array;
    }


    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each : array) {
            if( ! ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each : array) {
            if( ! ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each : array) {
            if( ! ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each : array) {
            if( ! ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }





}
