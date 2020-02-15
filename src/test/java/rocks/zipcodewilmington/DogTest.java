package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void testSetName() {
        // Given
        String givenName = "Spot";
        Dog Dog = new Dog(givenName, null, null);

        // When
        String expected = Dog.getName();

        // Then
        Assert.assertEquals(expected, givenName);

    }

    // Create tests for `speak`
    @Test
    public void testSpeak() {

        // Given
        Dog Dog = new Dog(null, null, null);

        // When
        String expected = "bark!";

        // Then
        Assert.assertEquals(expected, Dog.speak());

    }

    // Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testGetDate() {
        // Given
        Date birthDate = new Date(6);
        Dog Dog = new Dog(null, birthDate, null);

        // When
        Dog.setBirthDate(birthDate);

        // Then
        Assert.assertEquals(birthDate, Dog.getBirthDate());

    }

    // Create tests for `void eat(Food food)`
    @Test
    public void testEatFood() {
        // Given
        Food food = new Food();
        Dog Dog = new Dog(null, null, null);

        // When
        Dog.eat(food);

        // Then
        Assert.assertEquals(new Integer(1), Dog.getNumberOfMealsEaten());

    }

    // Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        // Given
        Integer id = 55;
        Dog Dog = new Dog(null, null, id);

        // When
        Integer newId = Dog.getId();

        // Then
        Assert.assertEquals(newId, id);

    }

    // Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {

        // Given
        Dog Dog = new Dog(null, null, null);

        // Then
        Assert.assertEquals(true, Dog instanceof Animal);
    }

    // Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void mammalInheritanceTest() {

        // Given
        Dog Dog = new Dog(null, null, null);

        // Then
        Assert.assertEquals(true, Dog instanceof Mammal);

    }
}