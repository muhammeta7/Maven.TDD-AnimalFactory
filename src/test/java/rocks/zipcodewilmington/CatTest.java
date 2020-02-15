package rocks.zipcodewilmington;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    //
   /* @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @AfterClass
    public static void afterClass() throws Exception {

    }*/



    // Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        // Given
        String givenName = "Whiskers";
        Cat cat = new Cat(givenName, null , null);

        // When
        String expected = cat.getName();

        // Then
        Assert.assertEquals(expected, givenName);

    }

    // Create tests for `speak`
    @Test
    public void testSpeak() {
        // Given
        Cat cat = new Cat(null, null , null);

        // When
        String expected = "meow!";

        // Then
        Assert.assertEquals(expected, cat.speak());

    }

    // Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testGetDate() {
        // Given
        Date birthDate = new Date(6);
        Cat cat = new Cat(null, birthDate , null);

        // When
         cat.setBirthDate(birthDate);

        // Then
        Assert.assertEquals(birthDate, cat.getBirthDate());

    }
    // Create tests for `void eat(Food food)`
    @Test
    public void testEatFood() {
        // Given
        Food food = new Food();
        Cat cat = new Cat(null, null , null);

        // When
        cat.eat(food);

        // Then
        Assert.assertEquals(new Integer(1), cat.getNumberOfMealsEaten());

    }
    // Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        // Given
        Integer id = 55;
        Cat cat = new Cat(null, null , id);

        // When
        Integer newId = cat.getId();

        // Then
        Assert.assertEquals(newId, id);

    }

    // Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {

        // Given
        Cat cat = new Cat(null, null, null);

        // Then
        Assert.assertEquals(true, cat instanceof Animal);
    }

    // Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void mammalInheritanceTest(){

        // Given
        Cat cat = new Cat(null,  null, null);

        // Then
        Assert.assertEquals(true, cat instanceof Mammal);
    }

}

