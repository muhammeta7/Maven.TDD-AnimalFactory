package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {


    //  Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat (){

        // Given
        Cat cat1 = new Cat(null, null, 1234);

        // When
        CatHouse.add(cat1);

        // Then
        Assert.assertEquals(cat1, CatHouse.getCatById(1234) );
    }


    // Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveCatById () {

        // Given
        Cat cat2 = new Cat(null, null, 369);

        // When
         CatHouse.remove(369);

        // Then
        Assert.assertEquals(null, CatHouse.getCatById(369) );

    }

    // Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCatByCat () {
        CatHouse home = new CatHouse();

        // Given
        Cat cat3 = new Cat("Larry", new Date(), 400);

        // When
        home.add(cat3);
        home.remove(cat3);
        Cat actual = home.getCatById(400);
        Object expected = null;

        // Then
        Assert.assertEquals(null, actual);

    }


    // Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById () {

        // Given
        Cat cat3 = new Cat(null, null, 500);
        CatHouse home = new CatHouse();
        // When
        home.add(cat3);
        Cat actual = home.getCatById(500);
        Cat expected = cat3;

        // Then
        Assert.assertEquals(expected,actual);

    }


    // Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats () {

        // Given
        Cat cat3 = new Cat(null, null, 600);
        CatHouse home = new CatHouse();
        home.add(cat3);
        Integer actual = home.getNumberOfCats();
        Integer expected = 1;
        // Then
        Assert.assertEquals(expected, actual);

    }

}
