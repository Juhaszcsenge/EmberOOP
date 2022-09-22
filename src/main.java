import hu.petrik.emberekoop.Ember;
import hu.petrik.emberekoop.Emberek;

import java.io.FileNotFoundException;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
         Ember e1 = new Ember("Gipsz Jakab", "2002-2-9","Budapest");
         Ember e2 = new Ember("Teszt Elek", "2004-10-27","Visegrád");
         Ember e3 = new Ember("Máté Péter", "1978-5-12","Kukutyin");
         Ember e4 = new Ember("József Péter", "1978-5-12","Falu");
         Ember e5 = new Ember("Zsiga Péter", "1978-5-12","Érdekes");
         Ember[] emberTomb = new Ember[]{e1, e2, e3, e4, e5};
         Emberek ek = new Emberek(emberTomb);
         String fajlNev = "sajt.txt";
         try{
             Emberek ek2 = new Emberek(fajlNev);
         }
         catch (FileNotFoundException e) {
             System.out.printf("A %s nem található\n", fajlNev);
         }catch (IOException e) {
             System.out.println("Ismeretlen hiba történt");
         }
         }
////
       /* System.out.println(ek);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        */

    }

