package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    PriorityQueue<Person> test = new PriorityQueue<>();
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @Test
    public void priorityQueueAddTest(){
        Assert.assertTrue(test.add(person1));
    }

    @Test
    public void priorityQueueRemoveTest(){
        test.add(person1);
        Assert.assertTrue(test.remove(person1));
    }

    @Test
    public void priorityQueueSizeTest(){
        test.add(person1);
        test.add(person2);
        test.add(person3);

        int expected = 3;

        Assert.assertEquals(expected, test.size());
    }
}
