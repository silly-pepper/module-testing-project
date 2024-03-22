package task3;

import lombok.SneakyThrows;

public class Human implements Actionable {
    private String name;
    private boolean hasGroup;
    private Gender gender;

    public Human(String name, boolean hasGroup, Gender gender) {
        this.name = name;
        this.hasGroup = hasGroup;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasGroup() {
        return hasGroup;
    }

    public void setHasGroup(boolean hasGroup) {
        this.hasGroup = hasGroup;
    }


    @Override
    public String comeTo(GeographicalObject object) throws Exception {
        checkExistence();
        if (object == null) throw new Exception("Географический объект должен существовать");

        if (this.hasGroup){
             return  toPrint("подошли к объекту " + object.toString());
        }
        else if (this.gender.equals(Gender.M)){
            return toPrint("подошел к объекту " + object.toString());
        }
        return toPrint("подошла к объекту " + object.toString());

    }

    @Override
    public String stop() throws Exception {
        checkExistence();
        if (this.hasGroup){
            return toPrint("остановились ");
        }
        else if (this.gender.equals(Gender.M)){
            return toPrint("остановился ");
        }
        return toPrint("остановилась ");

    }

    @Override
    public String realise() throws Exception {
        checkExistence();

        if (this.hasGroup){
            return toPrint("поняли ");
        }
        else if (this.gender.equals(Gender.M)){
            return toPrint("понял ");
        }
        else{
            return toPrint("поняла ");
        }

    }

    @Override
    public String takeALook(Item item) throws Exception {
        checkExistence();
        if (item == null) throw new Exception("Предмет для оценивания должен существовать");

        if (this.hasGroup){
            return toPrint("рассмотрели " + item.toString());
        }
        else if (this.gender.equals(Gender.M)){
            return toPrint("рассмотрел " + item.toString());
        }
        else{
            return toPrint("рассмотрела " + item.toString());
        }
    }


    @Override
//    @SneakyThrows
    public String see() throws Exception {
        checkExistence();

        if (this.hasGroup){
            return toPrint("увидели ");
        }
        else if (this.gender.equals(Gender.M)){
            return toPrint("увидел ");
        }
        else{
            return toPrint("увидела ");
        }
    }

    public String getName() {
        return name;
    }

    public String toPrint(Object o){
        return (o.toString());
    }

    public void checkExistence() throws Exception {
        if (this.name == null){
            throw new Exception("Субъект должен иметь имя");
        }
        if (this.gender == null ) {
            throw new Exception("Субъект должен иметь пол M или W");
        }
    }
}
