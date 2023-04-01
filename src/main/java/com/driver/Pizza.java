package com.driver;

public class Pizza {

    private int totalPrice=0;
    private int basePrice;
    private int toppingsPrice;
    private int paperBagPrice;
    private String bill="";
    private boolean bagAdded=false;
    private boolean cheeseAdded=false;
    private boolean toppingsAdded=false;

    public Pizza(Boolean isVeg){
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }
        else{
            basePrice=400;
            toppingsPrice=120;
        }
        totalPrice+=basePrice;
        paperBagPrice=20;
        bill+="Base Price Of The Pizza: "+basePrice+"\n";
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            totalPrice+=80;
            bill+="Extra Cheese Added: 80\n";
            cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
            totalPrice+=toppingsPrice;
            bill+="Extra Toppings Added: "+toppingsPrice+"\n";
            toppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            totalPrice+=paperBagPrice;
            bill+="Paperbag Added: "+paperBagPrice+"\n";
            bagAdded=true;
        }
    }

    public String getBill(){
        bill+="Total Price: "+getTotalPrice()+"\n";
        return this.bill;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getToppingsPrice() {
        return toppingsPrice;
    }

    public void setToppingsPrice(int toppingsPrice) {
        this.toppingsPrice = toppingsPrice;
    }

    public int getPaperBagPrice() {
        return paperBagPrice;
    }

    public void setPaperBagPrice(int paperBagPrice) {
        this.paperBagPrice = paperBagPrice;
    }

    public boolean isBagAdded() {
        return bagAdded;
    }

    public void setBagAdded(boolean bagAdded) {
        this.bagAdded = bagAdded;
    }

    public boolean isCheeseAdded() {
        return cheeseAdded;
    }

    public void setCheeseAdded(boolean cheeseAdded) {
        this.cheeseAdded = cheeseAdded;
    }

    public boolean isToppingsAdded() {
        return toppingsAdded;
    }

    public void setToppingsAdded(boolean toppingsAdded) {
        this.toppingsAdded = toppingsAdded;
    }
}
