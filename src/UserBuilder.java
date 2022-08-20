public class UserBuilder {
    private final String name;
    private int age;
    private String city;

//    Mandatory fields
    public UserBuilder(String name) {
        this.name = name;
    }

//    optional fields
    public UserBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder withCity(String city) {
        this.city = city;
        return this;
    }

//    build method
    public User build() {
        return new User(this.name, this.age, this.city); // all properties
    }
}
