package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeoObjectTest {
    private GeographicalObject geographicalObject;
    private Item item;

    @BeforeEach
    public void setup() {
        geographicalObject = new GeographicalObject("гребень земляного возвышения");
        item = new Item("кольцо", "it");
    }

    @DisplayName("Can has form")
    @Test
    public void checkCanHasForm() throws Exception {
        assertEquals("имеет форму предмета кольцо", geographicalObject.hasFormOf(item));
    }

    @DisplayName("Cannot has null form")
    @Test
    public void checkCannotHasNullForm() throws Exception {
        Throwable exception = assertThrows(Exception.class, ()->geographicalObject.hasFormOf(null));

        assertEquals("Предмет должен существовать", exception.getMessage());
    }

    @DisplayName("Can be described")
    @Test
    public void checkDescribe() throws Exception {
        GeographicalObject geoOb = new GeographicalObject("воронка");

        geoOb.setSize(100);
        assertEquals("воронка имеет размер 100 ярдов", geoOb.describe());
    }

    @DisplayName("Cannot be described if null or 0 size")
    @Test
    public void checkDescribeNull() throws Exception {
        GeographicalObject geoOb = new GeographicalObject("воронка");
        Throwable exception = assertThrows(Exception.class, ()->geoOb.describe());

        assertEquals("размер географического объекта не указан", exception.getMessage());
    }




}

