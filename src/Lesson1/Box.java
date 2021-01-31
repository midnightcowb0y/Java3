package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box < T extends Fruit > {

    private ArrayList<T> fruits;

    public Box (T... fruits){this.fruits = new ArrayList<>(Arrays.asList(fruits)); }


    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }

        return totalWeight;
    }

   public void  add (T fruit){
       this.fruits.add(fruit);
   }

   public  boolean compare (Box<?> another){
       return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;

   }
   public void pourOver ( Box<? super T> another ){
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
}



}
