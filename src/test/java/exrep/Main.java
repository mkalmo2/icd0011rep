package exrep;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import otherpackage.Util;

public class Main {

    @Test
    public void ex1a() {
        new Company();
        new Company();
    }

    @Test
    public void ex1b() {

        try {
            System.out.println("in try block");
            // throw new RuntimeException();
            // return;

        } catch (Exception e) {
            System.out.println("Caught: " + e);
        } finally {
            System.out.println("in finally block");
        }

    }

    @Test
    public void ex1c() {
        Util.readFromFile();

        // readFromWeb();
    }

    private void readFromWeb() {
        // Util.readFromWeb();
    }

    @Test
    public void ex1d() {
        List<Person> persons1 = Arrays.asList(new Person("Jill"), new Person("Jack"));
        List persons2 = Arrays.asList(new Person("Jane"), new Person("Jim"));

        // käia üle listi elementide ja printida nimed
    }


}
