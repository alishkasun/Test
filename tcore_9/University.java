package tcore_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/***
 *
 Имеется следующая структура:
 interface Student {
 String getName();
 List<Course> getAllCourses();
 }
 interface Course {}

 Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
 Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных
 (любознательность определяется количеством курсов).
 Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.
 *
 *
 */



public class University {

    public static void main(String[] args) {

        Course courseAlgebra = new CourseImpl("algebra");
        Course courseGeometry = new CourseImpl("geometry");
        Course courseGeography = new CourseImpl("geography");
        Course courseEnglish = new CourseImpl("english");
        Course courseRussia = new CourseImpl("russia");


        Student studentAlina = new StudentImpl("Alina");
        studentAlina.subscribeToCourse(courseAlgebra);
        studentAlina.subscribeToCourse(courseGeometry);

        Student studentSasha = new StudentImpl("Sasha");
        studentSasha.subscribeToCourse(courseEnglish);
        studentSasha.subscribeToCourse(courseRussia);
        studentSasha.subscribeToCourse(courseAlgebra);

        Student studentAndrey = new StudentImpl("Andrey");
        studentAndrey.subscribeToCourse(courseEnglish);
        studentAndrey.subscribeToCourse(courseRussia);
        studentAndrey.subscribeToCourse(courseAlgebra);
        studentAndrey.subscribeToCourse(courseGeography);

        Student studentFool = new StudentImpl("Fool");
        studentAndrey.subscribeToCourse(courseEnglish);


        List<Student> students = new ArrayList<>();
        students.add(studentAlina);
        students.add(studentSasha);
        students.add(studentAndrey);
        students.add(studentFool);


        Set<Course> uniqueCourses = getUniqueCourses(students);
        List<Student> curiosStudents = getCuriosStudents(students, 3);
        List<Student> subscribedToCourse = getSubscribedToCourse(students, courseGeography);


        String test = "";

    }

    private static List<Student> getSubscribedToCourse(List<Student> students, Course courseToCheck) {
        return students.stream()
                .filter(student -> student.getAllCourses().contains(courseToCheck))
                .collect(Collectors.toList());

    }



    private static List<Student> getCuriosStudents(List<Student> students, int limit) {
        List<Student> collect = students.stream().sorted((student1, student2) -> {
            int size1 = student1.getAllCourses().size();
            int size2 = student2.getAllCourses().size();

            return size2 - size1;
        }).limit(limit)
                .collect(Collectors.toList());


        return collect;
    }

    private static Set<Course> getUniqueCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .collect(Collectors.toSet());
    }


}


