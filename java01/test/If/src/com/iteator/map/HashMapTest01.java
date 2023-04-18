package com.iteator.map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//
public class HashMapTest01 {
    public static void main(String[] args) {
        Student s1 = new Student("zz");
        Student s2 = new Student("zz");
        System.out.println(s1.equals(s2));
        /*
        s1的hashcode = 1163157884
        s2的hashcode = 1956725890
         */
        System.out.println("s1的hashcode = " + s1.hashCode());
        System.out.println("s2的hashcode = " + s2.hashCode());
        /*
        s1.equals(s2)结果已经是true了，表示s1和s2是一样的，在hash中放的时候按说只能装一个
         */
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());    //结果为2，正常为一，应该重写hashcode()
    }
}
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}