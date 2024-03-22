package task3;

public interface Describeable {
    String lookAlike(Item item) throws Exception;
    String hasFormOf(Item item) throws Exception;
    String hasProperty(Property property) throws Exception;
    String hasColor(Color color) throws Exception;
}
