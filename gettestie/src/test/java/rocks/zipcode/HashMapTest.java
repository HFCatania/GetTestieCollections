package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Address;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapTest {
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    Address address1 = new Address("123 State st", "AnyTown", "12345", "USA");
    Address address2 = new Address("666 Lucifer st", "Hellville", "66666", "meggido");
    Address address3 = new Address("80085 hill st", "Yomamaville", "23456", "CCCP");

    @Test
    public void hashMapTest1(){
        HashMap<Person, Address> testMap = new HashMap<>();
        testMap.put(person1, address1);

        Assert.assertEquals(address1, testMap.get(person1));

    }

    @Test
    public void hashMapTest2(){
        HashMap<Person, Address> testMap = new HashMap<>();
        testMap.put(person1, address1);

        Assert.assertTrue(testMap.containsKey(person1));
    }

    @Test
    public void hashMapTest3(){
        HashMap<Person, Address> testMap = new HashMap<>();
        testMap.put(person1,address1);
        testMap.put(person2, address2);
        testMap.put(person3, address3);

        testMap.clear();

        Assert.assertTrue(testMap.isEmpty());
    }

    @Test
    public void hashMapTest4(){
        HashMap<Person, Address> testMap = new HashMap<>();
        HashMap<Person, Address> testMap2 = new HashMap<>();
        testMap.put(person3, address3);
        testMap.put(person1, address1);
        testMap.put(person2, address2);

        Integer expected = 3;
        Integer actual = testMap.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashMapTest5(){
        HashMap<Person, Address> testMap = new HashMap<>();
        testMap.put(person2, address2);

        Assert.assertTrue(testMap.remove(person2, address2));
    }

    @Test
    public void hashMapTest6(){
        HashMap<Person, Address> testMap = new HashMap<>();
        testMap.put(person3, address1);

        Assert.assertFalse(testMap.remove(person3,address2));
    }

    @Test
    public void hashMapTest7(){
        HashMap<Person, Address> testMap = new HashMap<>();
        testMap.put(person2, address2);
        testMap.put(person1, address3);
        testMap.put(person3, address1);

        Assert.assertNotNull(testMap.values());

    }
}
