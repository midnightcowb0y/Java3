package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

                Integer[] arr1 = new Integer[]{1,2,3,4,5,6,7,8,9};

        System.out.print("Исходныый массив:");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(" " + arr1[i]);
        System.out.println();
        swap (arr1, 0, 5);
        System.out.print("Изменённый массив:");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(" " + arr1[i]);
        System.out.println();

        toArrayList(arr1);


    }


        //// Задание № 1
    public static <T> void swap( T [] arr,int i,int j){
        T k = arr[i];
       arr[i]=arr[j];
        arr[j] = k;
    }


        //// Задание № 2
    public static <T> ArrayList<T> toArrayList(T[]arr){

        return new ArrayList<>(Arrays.asList(arr));

    }

   }


