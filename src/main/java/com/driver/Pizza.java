package com.driver;

public class Pizza {

    private int Price;
    private int basePrice;
    private int toppingsPrice;
    private int cheesePrice;
    private int paperBagPrice;
    private String bill="";
    private boolean bagAdded;
    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean billGenerated;

    public Pizza(Boolean isVeg){
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }
        else {
            basePrice = 400;
            toppingsPrice = 120;
        }
        cheesePrice=80;
        paperBagPrice=20;
        Price=basePrice;

        cheeseAdded=false;
        toppingsAdded=false;
        bagAdded=false;
        billGenerated=false;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            Price+=80;
            cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
            Price+=toppingsPrice;
            toppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            Price+=paperBagPrice;
            bagAdded=true;
        }
    }

    public String getBill(){
        if(!billGenerated){
            bill+="Base Price Of The Pizza: "+basePrice+"\n";
            if(cheeseAdded==true){
                bill+="Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(toppingsAdded==true){
                bill+="Extra Toppings Added: "+toppingsPrice+"\n";
            }
            if(bagAdded==true){
                bill+="Paperbag Added: "+paperBagPrice+"\n";
            }
            bill+="Total Price: "+getPrice()+"\n";
        }
        billGenerated=true;
        return bill;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
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

    public int getCheesePrice() {
        return cheesePrice;
    }

    public void setCheesePrice(int cheesePrice) {
        this.cheesePrice = cheesePrice;
    }

    public int getPaperBagPrice() {
        return paperBagPrice;
    }

    public void setPaperBagPrice(int paperBagPrice) {
        this.paperBagPrice = paperBagPrice;
    }

    public void setBill(String bill) {
        this.bill = bill;
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
