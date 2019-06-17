package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);
    Person person4 = new Person("RayCharles", 1925);
    Person person5 = new Person("SolomonBurke", 1940);

    @Test
    public void iteratorTest1(){
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);
        testList.add(person3);
        Iterator<Person> pli = testList.iterator();
        Assert.assertTrue(pli.hasNext());
    }

    @Test
    public void iteratorTest2(){
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person3);
        testList.add(person2);
        Iterator<Person> pli = testList.iterator();
        Assert.assertEquals(person3, pli.next());
    }

    @Test
    public void iteratorTest3() {
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);
        testList.remove(person1);
        Iterator<Person> pli = testList.iterator();

        Person expected = person2;


        Assert.assertEquals(expected, pli.next());
    }
}
