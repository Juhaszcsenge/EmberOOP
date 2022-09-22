package hu.petrik.emberekoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
        private List<Ember> emberek;

    public Emberek(Ember[] emberTomb) {
        emberek = new ArrayList<>();
        this.emberek.addAll(Arrays.asList(emberTomb));
        /*
        for(Ember e: emberTomb{
        this.emberek.add(e);
         */
    }

    public Emberek(String fajlNev) throws IOException {
        FileReader fr = new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);

        fr.close();
        br.close();

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.format("%30s %10s (%3s év) %20s",
                "Név", "Szül.dátum", "Kor", "Szül.hely"));
        for(int i = 0; i < this.emberek.size(); i++){
            s.append(System.lineSeparator()).append(this.emberek.get(i));
        }


        return s.toString();
    }
    ////
}
