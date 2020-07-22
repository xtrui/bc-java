package practice07;

public class Teacher extends Person {
    Klass klass;

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public String introduce() {

        return this.klass != null ? super.introduce() + " I am a Teacher. I teach Class " + this.klass.number + "." : super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    public String introduceWith(Student jerry) {
        return jerry.klass.number == this.klass.number ? super.introduce() + " I am a Teacher. I teach Jerry." : super.introduce() + " I am a Teacher. I don't teach Jerry.";
    }
}
