package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);

    @Test
    public void ArrayDequeTest1(){
        ArrayDeque<Person> expected = new ArrayDeque<>();
        ArrayDeque<Person> testDQ = new ArrayDeque<>();
            testDQ.add(person1);
            testDQ.add(person2);

        Assert.assertNotEquals(expected, testDQ);


    }

    @Test
    public void ArrayDequeTest2(){
        ArrayDeque<Person> testDQ = new ArrayDeque<>();
        testDQ.add(person1);
        testDQ.add(person2);

        boolean actual = testDQ.contains(person1);

        Assert.assertTrue(actual);
    }

    @Test
    public void ArrayDequeTest3(){
        ArrayDeque<Person> testDQ = new ArrayDeque<>();
        testDQ.add(person1);
        testDQ.add(person2);

        boolean actual = testDQ.contains(person2);

        Assert.assertTrue(actual);
    }

    @Test
    public void ArrayDequeTest4(){
        ArrayDeque<Person> testDQ = new ArrayDeque<>();
        testDQ.add(person1);
        testDQ.add(person2);

        Assert.assertEquals(person1, testDQ.removeFirst());
    }
}
