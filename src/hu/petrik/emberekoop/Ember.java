package hu.petrik.emberekoop;

import java.time.LocalDate;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;


    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzuletesiEv(){
        return Integer.parseInt(this.szulDatum.substring(0,4));
    }

    public int getSzuletesiHonap(){
        String[] szuletesAdatok = this.szulDatum.split("-");
        return Integer.parseInt((szuletesAdatok[1]));
    }
    public int getSzuletesiNap(){
        String[] szuletesAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesAdatok[2]);
    }

    public int getEletkor(){
        return LocalDate.now().getYear() - this.getSzuletesiEv();
    }

    @Override
    public String toString() {
        return  String.format("%30s %10s(%3d év) %20s " , this.nev, this.szulDatum,this.getEletkor(),this.szulHely);
    }
    ////
}
