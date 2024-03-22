package task3;

public class GeographicalObject implements Describeable{
    private String name;
    private int size;

    public GeographicalObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String lookAlike(Item item) throws Exception {
        checkExistence();
        return toPrint("напоминает предмет " + item.toString());
    }

    @Override
    public String hasFormOf(Item item) throws Exception {
        checkExistence();
        if (item == null) throw new Exception("Предмет должен существовать");

        return toPrint("имеет форму предмета " + item.toString());

    }

    @Override
    public String hasProperty(Property property) throws Exception {
        checkExistence();
        switch (property){
            case WET:
                return toPrint("имеет свойство: влажный ");
            case FRESH:
                return toPrint("имеет свойство: свежий ");
        }
        return toPrint("имеет свойство: " + property);
    }

    @Override
    public String hasColor(Color color) throws Exception {
        checkExistence();
        switch (color) {
            case BLACK_RED:
                return toPrint("имеет цвет: красно-черный ");

        }
        return toPrint("имеет цвет: " + color);
    }
    @Override
    public String toString() {
        return name ;
    }

    public String describe() throws Exception {
        checkExistence();
        try {
            if (this.size != 0){
                return toPrint(this.name + " имеет размер " + this.size + " ярдов");

            }
            else{
                throw new Exception("размер географического объекта не указан");
            }
        }
        catch(Exception e){
            throw new Exception("размер географического объекта не указан");
        }
    }
    public String toPrint(Object o){
        return (o.toString());
    }

    public void checkExistence() throws Exception {
        if (this.name == null){
            throw new Exception("Объект должен иметь имя");
        }

    }
}
