package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    LinkedList<Person> test = new LinkedList<>();
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @Test
    public void linkedListAddTest(){
        Assert.assertTrue(test.add(person1));
    }

    @Test
    public void linkedListAddElementTest(){
        test.add(person1);
        test.add(person3);
        test.add(2, person2);
        Person expected = person2;
        Assert.assertEquals(expected, person2);
    }

    @Test
    public void linkedListAddFirstTest(){
        test.add(person2);
        test.add(person3);
        test.addFirst(person1);

        Person expected = person1;

        Assert.assertEquals(expected, test.get(0));
    }

    @Test
    public void linkedListAddLastTest(){
        test.add(person1);
        test.add(person2);
        test.addLast(person3);

        Person expected = person3;

        Assert.assertEquals(expected, test.getLast());
    }

    @Test
    public void linkedListClearTest(){
        test.add(person2);
        test.add(person1);
        test.add(person3);

        test.clear();

        Assert.assertTrue(test.isEmpty());
    }

}
