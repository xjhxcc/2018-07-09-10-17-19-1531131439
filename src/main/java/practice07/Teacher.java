package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass!=null){
            return super.introduce()+" I am a Teacher. I teach Class "+klass.getNumber()+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }
    public String introduceWith(Student stu){
        if(stu.getKlass().getNumber()==klass.getNumber()){
            return super.introduce() + " I am a Teacher. I teach "+stu.getName()+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+stu.getName()+".";
        }
    }
}

