package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1920);

    @Test
    public void comparableTest1(){
        Assert.assertEquals(20, person1.compareTo(person2));
    }
}
