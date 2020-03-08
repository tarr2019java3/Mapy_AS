package pl.sda.mapy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Generyka<String> generyk1 = new Generyka<>("String");
        System.out.println(generyk1.getField());

        Generyka<Integer> generyk2 = new Generyka<>(15);
        System.out.println(generyk2.getField());
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jan");
        map.put(2, "Józef");
        map.put(3, "Johnny");
        map.put(4, "Jennie");
        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {           //foreach do iterowania po mapie
            System.out.println("Klucz " + entry.getKey() + "     " + entry.getValue());

        }

        School s1 = new School("SP1", "Torun");
        School s2 = new School("SP2", "Tczew");
        School s3 = new School("SP3", "Inowroclaw");
        School s4 = new School("SP4", "Krakow");

        Student st1 = new Student("Adam", "Stępień", s1);
        Student st2 = new Student("maciej", "Nowak", s2);
        Student st3 = new Student("jan", "kowalski", s3);
        Student st4 = new Student("karyna", "Brzęczyszczykiewicz", s4);
        Student st5 = new Student("monika", "ZZZ", s4);
        Student st6 = new Student("wieslaw", "Spioch", s1);
        Student st7 = new Student("ziom", "Kwoch", s2);
        Student st8 = new Student("Daisy", "Dog", s3);
        Student st9 = new Student("Dominika", "Abram", s4);
        Student st10 = new Student("Wiesiek", "Field", s1);
        Student st11 = new Student("Maciej", "Godlewski", s2);
        Student st12 = new Student("Adam", "Goldbaum", s3);
        Student st13 = new Student("bodzio", "Miś", s4);

        List<Student> szkolaAll = new ArrayList<>();

        szkolaAll.add(st1);
        szkolaAll.add(st2);
        szkolaAll.add(st3);
        szkolaAll.add(st4);
        szkolaAll.add(st5);
        szkolaAll.add(st6);
        szkolaAll.add(st7);
        szkolaAll.add(st8);
        szkolaAll.add(st9);
        szkolaAll.add(st10);
        szkolaAll.add(st11);
        szkolaAll.add(st12);
        szkolaAll.add(st13);

        List<Student> szkola1 = new ArrayList<>();
        List<Student> szkola2 = new ArrayList<>();
        List<Student> szkola3 = new ArrayList<>();
        List<Student> szkola4 = new ArrayList<>();

        for (Student it : szkolaAll) {
            if (it.getSchool() == s1) {
                szkola1.add(it);
            } else if (it.getSchool() == s2) {
                szkola2.add(it);
            } else if (it.getSchool() == s3) {
                szkola3.add(it);
            } else if (it.getSchool() == s4) {
                szkola4.add(it);
            }
        }
        Map<School, List<Student>> schoolListMap = new HashMap<School, List<Student>>();

        schoolListMap.put(s4, szkola4);
        schoolListMap.put(s3, szkola3);
        schoolListMap.put(s2, szkola2);
        schoolListMap.put(s1, szkola1);
        System.out.println();
        for (var entry : schoolListMap.entrySet()) {           //foreach do iterowania po mapie
            System.out.println(entry.getKey().getName().toUpperCase() + "   " + entry.getKey().getCity().toUpperCase());
//            List<Student> tmp = new ArrayList<>();
//            //tmp.addAll(entry.getValue());
            int x = 1;
            for (var it : entry.getValue()) {
                System.out.println(String.format("%5s", x++ +"--") + it.getName() + " " + it.getLastname());
            }

        }
    }
}
