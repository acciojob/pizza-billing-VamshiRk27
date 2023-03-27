package com.driver;

public class Pizza {

    private int price=0;
    private Boolean isVeg;
    private String bill="";
    private boolean bag=false;
    private boolean cheese=false;
    private boolean toppings=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price+=300;
            bill+="Base Price Of The Pizza: 300\n";
        }
        else{
            price+=400;
            bill+="Base Price Of The Pizza: 400\n";
        }
    }

    public void addExtraCheese(){
        if(!cheese){
            price+=80;
            bill+="Extra Cheese Added: 80\n";
            cheese=true;
        }
    }

    public void addExtraToppings(){
        if(!toppings){
            if(isVeg){
                price+=70;
                bill+="Extra Toppings Added: 70\n";
            }
            else{
                price+=120;
                bill+="Extra Toppings Added: 120\n";
            }
            toppings=true;
        }
    }

    public void addTakeaway(){
        if(!bag){
            price+=20;
            bill+="Paperbag Added: 20\n";
            bag=true;
        }
    }

    public String getBill(){
        bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public boolean isBag() {
        return bag;
    }

    public void setBag(boolean bag) {
        this.bag = bag;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isToppings() {
        return toppings;
    }

    public void setToppings(boolean toppings) {
        this.toppings = toppings;
    }
}
