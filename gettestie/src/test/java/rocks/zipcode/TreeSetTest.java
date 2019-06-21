package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    TreeSet<Person> test = new TreeSet<>();
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @Test
    public void treeSetAddTest(){
        Assert.assertTrue(test.add(person1));
    }

    @Test
    public void treeSetSizeTest(){
        test.add(person1);
        test.add(person2);
        test.add(person3);

        int expected = 2;

        Assert.assertEquals(expected, test.size());
    }

    @Test
    public void treeSetContainsTest(){
        test.add(person1);
        test.add(person2);
        test.add(person3);

        Assert.assertTrue(test.contains(person2));
    }
}
