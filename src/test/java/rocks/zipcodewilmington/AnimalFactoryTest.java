package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {

        // Given
        AnimalFactory animalCreator = new AnimalFactory();
        String givenName = "Cooper";
        Date givenBirthDate = new Date(1234);

        // When
        Dog cooper = animalCreator.createDog(givenName, givenBirthDate);

        // Then
        Assert.assertEquals(givenName, cooper.getName());
        Assert.assertEquals(givenBirthDate, cooper.getBirthDate());

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {

        // Given
        AnimalFactory animalCreator = new AnimalFactory();
        String givenName = "Shadow";
        Date givenBirthDate = new Date(76);

        // When
        Cat shadow = animalCreator.createCat(givenName, givenBirthDate);

        // Then
        Assert.assertEquals(givenName, shadow.getName());
        Assert.assertEquals(givenBirthDate, shadow.getBirthDate());

    }

}
