package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @Test
    public void ArrayListTest1() {
        ArrayList<Person> testList = new ArrayList<>();
        Assert.assertTrue(testList.add(person1));
    }

    @Test
    public void ArrayListTest2(){
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(0, person2);

        Assert.assertEquals(person2, testList.get(0));
    }

    @Test
    public void ArrayListTest3(){
        ArrayList<Person> testList = new ArrayList<>();
        ArrayList<Person> testList2 = new ArrayList<>();
        testList2.add(person1);
        testList2.add(person2);

        testList.addAll(0, testList);

        Assert.assertEquals(testList, testList2);
    }

    @Test
    public void ArrayListTest4(){
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);

        Assert.assertTrue(testList.contains(person2));
    }

    @Test
    public void ArrayListTest5() {
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);
        testList.clear();

        Assert.assertTrue(testList.isEmpty());
    }

    @Test
    public void ArrayListTest6(){
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);
        testList.remove(person1);

        Assert.assertFalse(testList.contains(person1));
    }

    @Test
    public void ArrayListTest7(){
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);
        testList.set(0, person3);

        Assert.assertFalse(testList.contains(person1));

    }

    @Test
    public void ArrayListTest8(){
        ArrayList<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);
        testList.add(person3);

        Integer expected = 3;
        Integer actual = testList.size();

        Assert.assertEquals(expected, actual);
    }
}
