public class Driver {

    public static final int MINIMUM_ADULT_AGE = 10;
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }
    public boolean isAdult() {
        return age >= MINIMUM_ADULT_AGE;
    }

}
