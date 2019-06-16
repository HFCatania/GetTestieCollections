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
}
