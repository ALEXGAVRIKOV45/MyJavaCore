package supportClasses;

public enum AnimalType {
    WOLF("Волк"),
    BEAR("Медведь"),
    TIGER("Тигр"),
    GIRAFFE("Жирафф"),
    OSTRICH("Страус"),
    DEER("Олень");
    private final String type;

    AnimalType(String value) {
        this.type = value;
    }

    public String getType() {
        return type;
    }
}
