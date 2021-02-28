package tcore_9;

import java.util.List;

interface Student {

    String getName();

    List<Course> getAllCourses();

    void subscribeToCourse(Course course);
}
