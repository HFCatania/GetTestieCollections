package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    TreeMap<Integer, Person> test = new TreeMap<>();
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @Test
    public void treeMapPutContainsTest(){
        test.put(1, person1);

        Assert.assertTrue(test.containsKey(1));


    }

    @Test
    public void treeMapContainsValueTest(){
        test.put(1, person1);
        test.put(2, person2);

        Assert.assertTrue(test.containsValue(person2));
    }

    @Test
    public void treeMapTest(){
        Assert.assertTrue(test.isEmpty());
    }
}
