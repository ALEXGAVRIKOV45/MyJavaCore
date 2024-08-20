package supportClasses;

public enum AnimalType {
    WOLF("Волк"),
    DEER("Олень");
    private final String type;

    AnimalType(String value) {
        this.type = value;
    }

    public String getType() {
        return type;
    }
}
