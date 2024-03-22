package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemTest {
    private GeographicalObject geographicalObject;
    private Item item;

    @BeforeEach
    public void setup() {
        geographicalObject = new GeographicalObject("внешний склон воронки");
        item = new Item("куски", "they");
    }

    @DisplayName("Can lie around")
    @Test
    public void checkCanLieAround() throws Exception {
        assertEquals("куски валялись в месте: внешний склон воронки", item.lieAround(geographicalObject));
    }

    @DisplayName("Cannot lie around null")
    @Test
    public void checkCannotLieAroundNull() throws Exception {
        Throwable exception = assertThrows(Exception.class, ()->item.lieAround(null));

        assertEquals("Место должно существовать",  exception.getMessage());
    }

    @DisplayName("Can has color")
    @Test
    public void checkCanHasColor() throws Exception {

        assertEquals("куски имеют цвет: красно-черный ", item.hasColor(Color.BLACK_RED));
    }

    @DisplayName("Cannot has color null")
    @Test
    public void checkCannotHasColorNull() throws Exception {
        Throwable exception = assertThrows(Exception.class, ()->item.hasColor(null));

        assertEquals("Цвет должен существовать",  exception.getMessage());
    }

    @DisplayName("Can has property")
    @Test
    public void checkCanHasProperty() throws Exception {

        assertEquals("куски имеет свойство: WET", item.hasProperty(Property.WET));

        item.setName("китовое мясо");
        assertEquals("китовое мясо имеет свойство: FRESH", item.hasProperty(Property.FRESH));

    }

    @DisplayName("Cannot has property null")
    @Test
    public void checkCannotHasPropertyNull() throws Exception {
        Throwable exception = assertThrows(Exception.class, ()->item.hasProperty(null));

        assertEquals("Свойство должно существовать",  exception.getMessage());

    }




}
