package Level_3_Exercise_1.Modules;

public class Person {
    private String name;
    private String lastNames;
    private String DNI;

    public Person(String name, String lastNames, String DNI) {
        this.name = name;
        this.lastNames = lastNames;
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public String getLastNames() {
        return lastNames;
    }

    public String getDNI() {
        return DNI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
