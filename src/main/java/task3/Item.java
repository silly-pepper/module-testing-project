package task3;

import java.util.Objects;

public class Item implements Describeable, Moveable{
    private String name;
    private String genus;

    public Item(String name, String genus) {
        this.name = name;
        this.genus = genus;
    }

    public String toPrint(Object o){
        return (o.toString());
    }

    @Override
    public String lookAlike(Item item) throws Exception {
        checkExistence();
        if (Objects.equals(this.genus, "it")) {
            return toPrint("напоминало предмет" + item.toString() );
        } else if (Objects.equals(this.genus, "she")) {
            return toPrint("напоминала предмет" + item.toString() );

        }
        else if (Objects.equals(this.genus, "he")){
            return toPrint("напоминал предмет" + item.toString() );
        }
        else {
            return toPrint("напоминали предмет" + item.toString() );

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public String hasFormOf(Item item) throws Exception {
        checkExistence();
        return toPrint("имеет форму " + item.toString() );
    }

    @Override
    public String hasProperty(Property property) throws Exception {
        checkExistence();
        if (property == null) throw new Exception("Свойство должно существовать");

        return toPrint(this.name + " имеет свойство: " + property.toString() );

    }

    @Override
    public String hasColor(Color color) throws Exception {
        checkExistence();
        if (color == null) throw new Exception("Цвет должен существовать");

        if (Objects.equals(this.genus, "they")) {
            switch (color) {
                case BLACK_RED:
                    return toPrint(this.name + " имеют цвет: красно-черный ");

            }
            return toPrint(this.name + " имеют цвет: " + color);

        }
        else {
            switch (color) {
                case BLACK_RED:
                    return toPrint(this.name + " имеет цвет: красно-черный ");

            }
            return toPrint(this.name + " имеет цвет: " + color);
        }
    }

    @Override
    public String lieAround(GeographicalObject object) throws Exception {
        checkExistence();
        if (object == null) throw new Exception("Место должно существовать");

        if (Objects.equals(this.genus, "it")) {
            return toPrint(this.name + " валялось в месте: " + object.toString() );
        } else if (Objects.equals(this.genus, "she")) {
            return toPrint(this.name + " валялась в месте: " + object.toString() );

        }
        else if (Objects.equals(this.genus, "he")){
            return toPrint(this.name + " валялся в месте: " + object.toString() );
        }
        else {
            return toPrint(this.name + " валялись в месте: " + object.toString() );

        }
    }

    @Override
    public String toString() {
        return name;
    }
    public void checkExistence() throws Exception {
        if (this.name == null){
            throw new Exception("Объект должен иметь имя");
        }
        if (this.genus == null) {
            throw new Exception("Объект должен иметь род");
        }

    }
}
