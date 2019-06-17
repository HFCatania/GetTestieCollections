package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetTest {
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @Test
    public void hashSetTest1(){   //add
        HashSet<Person> testSet = new HashSet<>();

        Assert.assertTrue(testSet.add(person1));
    }

    @Test
    public void hashSetTest2(){  //clear and is empty
        HashSet<Person> testSet = new HashSet<>();
        testSet.add(person1);
        testSet.add(person2);
        testSet.add(person3);

        testSet.clear();

        Assert.assertTrue(testSet.isEmpty());
    }

    @Test
    public void hashSetTest3(){ //contains
        HashSet<Person> testSet = new HashSet<>();
        testSet.add(person2);

        Assert.assertTrue(testSet.contains(person2));
    }

    @Test
    public void hashSetTest4(){ // size
        HashSet<Person> testSet = new HashSet<>();
        testSet.add(person2);
        testSet.add(person1);
        testSet.add(person3);

        Integer expected = 3;
        Integer actual = testSet.size();

        Assert.assertEquals(expected, actual);
    }
}
