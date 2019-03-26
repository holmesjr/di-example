package MyApplication.respositories;

public class Person {

    private final String FirstName;
    private final String LastName;


    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }
}
