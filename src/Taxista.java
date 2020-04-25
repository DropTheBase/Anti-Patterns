public class Taxista {
    private String name;
    private Integer age;
    private String name_car;

    public Taxista(String name, Integer age, String name_car) {
        this.name = name;
        this.age = age;
        this.name_car = name_car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getName_car() {
        return name_car;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }
}
