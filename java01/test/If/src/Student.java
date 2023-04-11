public class Student {
    private int number;
    private String name;
    private int age;
    static String kk = "信了";    //静态变量，类级别的
    Student() {}
    Student(int nu,String na,int ag) {
        nu = number;
        na = name;
        ag =  age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
