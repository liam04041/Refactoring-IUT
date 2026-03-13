public class Conducteur {

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

    public Conducteur(String name, int years) {
        this.name = name;
        this.age = years;
    }
    public boolean estAdulte() {
        return age >= 10;
    }

}
