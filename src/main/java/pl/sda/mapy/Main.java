package pl.sda.mapy;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Generyka<String> generyk1 = new Generyka<>("String");
        System.out.println(generyk1.getField());

        Generyka<Integer> generyk2 = new Generyka<>(15);
        System.out.println(generyk2.getField());
    }
}
