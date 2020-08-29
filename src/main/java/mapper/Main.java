package mapper;

import common.Person;

public class Main {

    public static void main(String[] args) {

        PersonMapper mapper = new PersonMapper();

        Person person = mapper.parse("{ \"firstName\": \"Alice\" }");
        // { "firstName": "Alice" }

        System.out.println(person);

        String dataAsString = mapper.stringify(person);

        System.out.println(dataAsString);

    }
}
