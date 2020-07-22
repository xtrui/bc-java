package practice06;

public class Teacher extends Person {
    Integer klass;

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public String introduce() {

        return this.klass != null ? super.introduce() + " I am a Teacher. I teach Class " + this.klass + "." : super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }
}
