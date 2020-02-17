package com.mibu.decorator;

public class Main {

  public static void main(String[] args) {
    Pizza simplePizza = new SimplePizza();
    System.out.println(simplePizza.getDescriptionAndCost());

    Pizza hawaiana = new Hawaiana();
    System.out.println(hawaiana.getDescriptionAndCost());

    // create new pizza ChickenFiesta with freshtomato and Barbeque topping
    Pizza pizza2 = new ChickenFiesta();
    pizza2 = new FreshTomato(pizza2);
    System.out.println(pizza2.getDescriptionAndCost());

    pizza2 = new Barbeque(pizza2);
    System.out.println(pizza2.getDescriptionAndCost());
  }
}
