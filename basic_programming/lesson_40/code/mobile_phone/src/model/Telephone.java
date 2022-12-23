package model;

import java.util.ArrayList;

public class Telephone {
   private String number;
   private String brand;
   private String model;
   private ArrayList<Contact> contacts;

   public Telephone(String number, String brand, String model, ArrayList<Contact> contacts){
      this.brand = brand;
      this.model = model;
      this.number = number;
      this.contacts = contacts;
   }

   @Override
   public String toString() {
      return "Telephone{" +
              "number='" + number + '\'' +
              ", brand='" + brand + '\'' +
              ", model='" + model + '\'' +
              ", contacts=" + contacts +
              '}';
   }
}
