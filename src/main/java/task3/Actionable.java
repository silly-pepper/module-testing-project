package task3;

public interface Actionable {
    String comeTo(GeographicalObject object) throws Exception;
    String stop() throws Exception;
    String realise() throws Exception;
    String takeALook(Item item) throws Exception;
    String see() throws Exception;
}
