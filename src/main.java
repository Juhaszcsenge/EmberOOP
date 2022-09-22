import hu.petrik.emberekoop.Ember;

public class main {
    public static void main(String[] args) {
         Ember e1 = new Ember("Gipsz Jakab", "2002-2-9","Budapest");
         Ember e2 = new Ember("Teszt Elek", "2004-10-27","Visegrád");
         Ember e3 = new Ember("Máté Péter", "1978-5-12","Kukutyin");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
