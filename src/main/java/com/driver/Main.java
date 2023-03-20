package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    dp.addExtraToppings();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}