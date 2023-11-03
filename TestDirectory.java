import java.util.Iterator;
import java.util.TreeMap;

public class TestDirectory {
    public static void main(String[] args) {
        // Create TelephoneNumber instances
        TelephoneNumber tn1 = new TelephoneNumber("+48", "123 456 789");
        TelephoneNumber tn2 = new TelephoneNumber("+48", "987 654 321");
        TelephoneNumber tn3 = new TelephoneNumber("+93", "111 222 333");
        TelephoneNumber tn4 = new TelephoneNumber("+64", "555 777 999");

        // Create Person instances
        Person person1 = new Person("Wiktor", "Kopczyński");
        person1.setAddress(new Address("Poland", "Łódź", "Kołowa", "19/21", "12", "93-142", tn1));

        Person person2 = new Person("Aleksandra", "Sternińska");
        person2.setAddress(new Address("Poland", "Łódź", "Nowe Sady", "87", "31", "94-102", tn2));

        Person person3 = new Person("Bob", "Johnson");
        person3.setAddress(new Address("USA", "Chicago", "Oak St", "789", "101", "60601", tn4));

        // Create Company instances
        Company company1 = new Company("ABC Inc.");
        company1.setAddress(new Address("USA", "San Francisco", "Oak St", "789", "101", "94101", tn3));

        Company company2 = new Company("XYZ Corporation");
        company2.setAddress(new Address("Poland", "Warsaw", "Łagiewnicka", "23", "201", "98-101", tn4));

        // Create a TreeMap to store the objects with TelephoneNumber as the key
        TreeMap<TelephoneNumber, TelephoneEntry> directory = new TreeMap<>();

        directory.put(tn1, person1);
        directory.put(tn2, person2);
        directory.put(tn3, company1);
        directory.put(tn4, person3);
        directory.put(new TelephoneNumber("+48", "444 888 666"), company2);

        // List the directory using an Iterator
        Iterator<TelephoneNumber> iterator = directory.keySet().iterator();

        while (iterator.hasNext()) {
            TelephoneNumber key = iterator.next();
            TelephoneEntry entry = directory.get(key);
            System.out.println(key.getFormattedTelephoneNumber() + " - " + entry.description());
        }
    }
}
