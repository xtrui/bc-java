package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements JoinListener {
    LinkedList<Klass> classes;

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> {
            klass.joinListeners.add(this);
        });
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }


    public boolean isTeaching(Student student) {
        return this.classes.contains(student.klass);
    }

    public String introduceWith(Student student) {
        return isTeaching(student) ? super.introduce() + " I am a Teacher. I teach Jerry." : super.introduce() + " I am a Teacher. I don't teach Jerry.";
    }

    @Override
    public String introduce() {
        StringBuilder classesStr = new StringBuilder();
        if (this.classes != null) {
            for (Klass klass : this.classes) {
                classesStr.append(klass.number);
                classesStr.append(", ");
            }
            classesStr.delete(classesStr.length() - 2, classesStr.length());
        }
        return this.classes != null ? super.introduce() + " I am a Teacher. I teach Class " + classesStr + "." : super.introduce() + " I am a Teacher. I teach No Class.";
    }

    @Override
    public void update(Student student) {
        System.out.print("I am Tom. I know " + student.name + " has joined Class " + student.klass.number + ".\n");
    }

    @Override
    public void leaderChange(Student student) {
        System.out.print("I am Tom. I know " + student.name + " become Leader of Class " + student.klass.number + ".\n");
    }
}
