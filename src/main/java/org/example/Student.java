package org.example;

public class Student {
    private int age;
    private int rollno;
    private Writer writer;

    public Student(int age, int rollno, Writer writer) {
        this.age = age;
        this.rollno = rollno;
        this.writer = writer;
    }
    public Student(){

    }

    public void writeExam(){
        writer.write();
    }
}
