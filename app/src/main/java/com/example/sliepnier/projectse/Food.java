package com.example.sliepnier.projectse;

/**
 * Created by Sliepnier on 10/13/2015.
 */
public class Food {

    private String foodName;
    private int weight;
    private int cal;
    private float price;

    public Food(String foodName,int weight,int cal,float price){
        this.foodName = foodName;
        this.weight = weight ;
        this.cal = cal;
        this.price = price ;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

}
