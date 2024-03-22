package task3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    private Human human;
    private GeographicalObject geographicalObject;
    private Item item;

    @BeforeEach
    public void setup() {
        human = new Human("Lisa", true, Gender.W);
        geographicalObject = new GeographicalObject("гребень земляного возвышения");
        item = new Item("кольцо", "it");
    }

    @DisplayName("Can come to")
    @Test
    public void canComeTo() throws Exception {
        assertEquals("подошли к объекту гребень земляного возвышения", human.comeTo(geographicalObject));

    }
    @DisplayName("Can see")
    @Test
    public void canSee() throws Exception {
        assertEquals("увидели ", human.see());
    }
    @DisplayName("Can stop")
    @Test
    public void canStop() throws Exception {
        assertEquals("остановились ", human.stop());
    }
    @DisplayName("Can realise")
    @Test
    public void canRealise() throws Exception {
        assertEquals("поняли ", human.realise());
    }

    @DisplayName("Can take a look at")
    @Test
    public void canTakeALook() throws Exception {
        Item meat = new Item("куски", "they");
        assertEquals("рассмотрели куски", human.takeALook(meat));
    }

    @Test
    @DisplayName("Check null value of name")
    public void checkHumanNameNotNull() throws Exception  {
        Human human1 = new Human(null, true, Gender.W);
        Throwable exception = assertThrows(Exception.class, human1::see);
        assertEquals("Субъект должен иметь имя", exception.getMessage());
    }

    @Test
    @DisplayName("Check name value of gender")
    public void checkHumanGenderNotNull() throws Exception  {
        Human human1 = new Human("Lisa", true, null);
        Throwable exception = assertThrows(Exception.class, human1::see);
        assertEquals("Субъект должен иметь пол M или W", exception.getMessage());
    }

    @DisplayName("Check cannot take a look at null obj")
    @Test
    public void cannotTakeALook() throws Exception {
        Throwable exception = assertThrows(Exception.class, ()->human.takeALook(null));
        assertEquals("Предмет для оценивания должен существовать", exception.getMessage());
    }

    @DisplayName("Check cannot come to null geo obj")
    @Test
    public void cannotComeTo() throws Exception {
        Throwable exception = assertThrows(Exception.class, ()->human.comeTo(null));
        assertEquals("Географический объект должен существовать", exception.getMessage());
    }




}
