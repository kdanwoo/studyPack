package hpcnt;

import java.util.stream.*;
import java.util.*;

class TestResults
{
    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        List<String> names = new ArrayList<>();

        List<Student> list = students.filter(student -> student.getScore() > 50).sorted(Comparator.comparing(Student::getScore)).collect(Collectors.toList());
        for(Student student : list) {
            names.add(student.getName());
        }

        return names;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }

    static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }
}