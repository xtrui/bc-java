package practice08;

public class Person {
    String name;
    Integer age;
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return person.id.equals(this.id);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.id;
//     result = prime * result + age;  
//     result = prime * result + ((uname == null) ? 0 : uname.hashCode());  
//     result = prime * result + ((sex == null) ? 0 : sex.hashCode());  
//     result = prime * result + ((city == null) ? 0 : city.hashCode());
        return result;

    }
}