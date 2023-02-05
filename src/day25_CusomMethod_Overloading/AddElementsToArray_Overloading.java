package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        numbers = addElement(numbers, 7); //addElement metodunu çağırmak istediğimizde birçok seçenek karşımıza çıkar intellij tarafından.Compiler hangisini uygulayacağını girdiğimiz parametrelere göre belirler

        char[] chars = {'A', 'B', 'C', 'D'};

        chars = addElement(chars, 'E');

        String[] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"};

        names = addElement(names, "Layan");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));

    }
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

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

    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

}
