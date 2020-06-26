package controllers;

import dao.StudentDao;
import dao.SerializableStudentDao;
import entity.Student;
import exception.DuplicateStudentException;
import exception.NotStudentException;

import java.util.*;

public class StudentController {
    private StudentDao studentDao = new SerializableStudentDao();  //MemoryProductDao.getInstance()

    public void add(Student student) throws DuplicateStudentException {
        // повезло на зачете + 1 бал.
        if (student.getName().startsWith("С"))
            student.setAverageMark(student.getAverageMark() + 1);

        studentDao.add(student);
    }



    public List<Student> getList() {
        return studentDao.getList();
    }

    public List<Student> getSortedList(Comparator<Student> comparator) {
        List<Student> students = getList();
        students.sort(comparator);
        return students;
    }

    public List<Student> getSubList(double lowerLimit, double upperLimit) {
        NavigableSet<Student> students = new TreeSet<>(getList());
        return new ArrayList<>(students.subSet(new Student(lowerLimit),true,
                new Student(upperLimit), true));
    }



    public void remove(int id) {
        // может содержаться доп логика
        studentDao.remove(new Student(id));
    }

    public void update(Student student) {
        // может содержаться доп логика
        studentDao.update(student);
    }


    public Student getStudentByName(String name) throws NotStudentException {
        return studentDao.getStudentByName(new Student(name));
    }
}
