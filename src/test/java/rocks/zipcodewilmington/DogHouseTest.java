package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @Test
    public void testGetNumberOfDogs() {

        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }


    // Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog() {

        // Given
        Dog sparky = new Dog("Sparky", null, 1120);

        // When
        DogHouse.add(sparky);

        // Then
        Assert.assertEquals(sparky, DogHouse.getDogById(1120));

    }

    // Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveDogById() {

        // Given
        Dog skip = new Dog("Skip", null, 1);


        // When
        DogHouse.remove(1);

        // Then
        Assert.assertEquals(null, DogHouse.getDogById(1));

    }

    // Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDogByDog() {

        // Given
        Dog sadPup = new Dog("Flappy", null, 63);
        DogHouse dogPound = new DogHouse();

        // When
        dogPound.add(sadPup);
        dogPound.remove(sadPup);
        Dog actual = dogPound.getDogById(63);

        // Then
        Assert.assertEquals(null, actual);

    }

    // Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById() {

        // Given
        Dog loopy = new Dog("Loopy", null, 34);
        DogHouse dogPound = new DogHouse();

        // When
        dogPound.add(loopy);
        Dog actual = dogPound.getDogById(34);
        Dog expected = loopy;

        // Then
        Assert.assertEquals(expected, actual);

    }

    // Create tests for `Integer getNumberOfDogs()`
    // Given
    @Test
    public void testGetNumberOfDogsInHome(){

        // Given
        Dog bob = new Dog(null, null, 600);
        DogHouse home = new DogHouse();

        // When
        home.add(bob);
        Integer actual = home.getNumberOfDogs();
        Integer expected = 1;

        // Then
        Assert.assertEquals(expected, actual);

    }



}
