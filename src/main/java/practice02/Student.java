package practice02;

public class Student extends Person {
    int klass;

    public Student(String name, Integer age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class " + this.klass + ".";
    }

    public Student(String name, Integer age) {
        super(name, age);
    }
}
