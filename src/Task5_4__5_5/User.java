package Task5_4__5_5;

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate DoB;
    private String position;

    public User() {
    }

    public User(String name, LocalDate DoB, String position) {
        this.name = name;
        this.DoB = DoB;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
