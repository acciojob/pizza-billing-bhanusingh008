package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean is_extra_cheese = false;

    boolean is_extra_topping = false;

    boolean is_takeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        this.is_extra_cheese = false;
        this.is_extra_topping = false;
        this.bill = "\nBase Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.is_extra_topping){
            this.price += 80;
            this.bill += "Extra Cheese Added: 80 \n";
            this.is_extra_cheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.is_extra_topping){
            if(isVeg){
               this.price += 70;
               this.bill += "Extra Toppings Added: 70 \n";
            }else{
                this.price += 120;
                this.bill += "Extra Toppings Added: 120 \n";
            }

            this.is_extra_topping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.is_takeaway) {
            this.price += 20;
            this.bill += "Paperbag Added: 20 \n";
            this.is_takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill+"Total Price: "+this.price;
    }
}
