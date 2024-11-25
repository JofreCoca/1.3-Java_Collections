package Level_1_Exercise_1.Modules;

public class Month {
    private String name;
    public Month(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
