package entity;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Comparable<Student>, Serializable {
    private int id;
    private String name;
    private double averageMark; // средний бал за симестр
    private static final long serialVersionUID = 1L;

    public Student(int id, String name, double averageMark) {
        this.id = id;
        this.name = name;
        this.averageMark = averageMark;
    }

    public Student() { }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(double averageMark) { this.averageMark = averageMark; }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id студента =" + id +
                ", имя ='" + name + '\'' +
                ", средний бал успеваемости за симестр =" + averageMark +
                '}';
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        if (id == 0) {
            return name.equals(student.name);
        }
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }





    @Override
    public int compareTo(Student o) {
        return (int) ((this.getAverageMark() - o.getAverageMark()) * 100);
    }
}
