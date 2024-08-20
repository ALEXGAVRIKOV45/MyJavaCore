package supportClasses;

import java.util.Arrays;

public enum AnimalStatus {
    PREDATOR("Хищник"),
    HEBRIVORE("Травоядное");
    private final String status;

    AnimalStatus(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

}
