package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    Vector<Person> test = new Vector<>();
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @Test
    public void vectorAddTest(){
        Assert.assertTrue(test.add(person1));
    }

    @Test
    public void vectorAddTest2(){
        test.add(person1);
        test.add(person2);
        test.add(1, person3);

        Person expected = person3;

        Assert.assertEquals(expected, test.elementAt(1));
    }

    @Test
    public void vectorClearIsEmptyTest(){
        test.add(person1);
        test.add(person2);
        test.add(person3);

        test.clear();

        Assert.assertTrue(test.isEmpty());
    }
}
