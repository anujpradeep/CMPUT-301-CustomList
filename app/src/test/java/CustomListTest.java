import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup() {
        list = new CustomList(null, new ArrayList<City>());
    }

    public City mockCity() {
        return new City("Halifax","NS");
    }

    @Test
    public void addCityTest(){
        City c = new City("Edmonton", "AB");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size + 1,list.getCount());
    }

    @Test
    public void deleteCityTest(){
        City c = mockCity();
        list.addCity(c);
        assertTrue(list.deleteCity(c));
    }

    @Test
    public void hasCityTest(){
        City c = mockCity();
        list.addCity(c);
        assertTrue(list.hasCity(c));
    }

    public void getCountTest() {
        City c = mockCity();
        list.addCity(c);
        assertEquals(1,list.getCount());
    }
}
