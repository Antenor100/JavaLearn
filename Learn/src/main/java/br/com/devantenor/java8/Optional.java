package br.com.devantenor.java8;

import br.com.devantenor.java8.model.people.Person;

import java.util.Date;

public class Optional {
    public static void tests() {
        // With all attributes
        Person c = new Person();
        c.setName("Carlos");
        c.setHeight(1.70);
        c.setBirthday(new Date(2008, 02, 14));
        c.setSurname("Carlin PVP");

        // Without an Optional attribute(surname)
        Person g = new Person();
        g.setName("Gabriela");
        g.setHeight(1.64);
        g.setBirthday(new Date(2003, 03, 27));

        // Without a Double attribute(height)
        Person ca = new Person();
        ca.setName("Carol");
        ca.setBirthday(new Date(2000, 11, 23));
        ca.setSurname("CC");

        try {
            System.out.println(c.toString());
            System.out.println(g.toString());
            System.out.println(ca.toString());
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }
    }
}
