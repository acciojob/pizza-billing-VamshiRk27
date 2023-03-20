package com.driver;

public class Pizza {

    private int price;
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
    public int getPrice() {
        return this.price;
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
}
