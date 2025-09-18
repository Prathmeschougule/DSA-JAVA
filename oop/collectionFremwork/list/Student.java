package oop.collectionFremwork.list;

public class Student implements  Comparable<Student>{
    String name;
    Integer mark ;

    public Student(String name, Integer mark) {
        this.name = name;
        this.mark = mark;
    }

    public int compareTo(Student s) {
        return this.mark - s.mark;
    }

    public String toString() {
        return name + " - " + mark;
    }


}

