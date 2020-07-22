package practice08;

public class Student extends Person {
    Klass klass;

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {

        return this.klass.leader != null && this.klass.leader.id ==
                this.id ? super.introduce() + " I am a Student. I am Leader of Class "
                + this.klass.number + "." : super.introduce() + " I am a Student. I am at Class " + this.klass.number + ".";
    }

    public Student(String name, Integer age) {
        super(name, age);
    }
}
