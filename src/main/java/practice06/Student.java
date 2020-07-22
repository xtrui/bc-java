package practice06;

public class Student extends Person {
    Integer klass;

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

        return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
    }

    public Student(String name, Integer age) {
        super(name, age);
    }
}
