package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<Person> test = new Stack<>();
    Person person1 = new Person("MJ", 1950);
    Person person2 = new Person("JamesBrown", 1930);
    Person person3 = new Person("SamCooke", 1930);

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void stackEmptyTest(){
        test.push(person1);

        Assert.assertFalse(test.empty());
    }

    @Test
    public void stackPopTest(){
        test.push(person1);
        test.push(person2);
        test.push(person3);

        Person expected = person3;

        Assert.assertEquals(expected, test.pop());
    }

    @Test
    public void stackSearchTest(){
        test.push(person1);
        test.push(person2);
        test.push(person3);

        int expected = 3;

        Assert.assertEquals(expected, test.search(person1));
    }

    // Make a bigger test exercising more Stack methods.....
}
