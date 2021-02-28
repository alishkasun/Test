package tcore_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentImpl implements Student {

    private String name;

    private Set<Course> coursesSubscription;

    public StudentImpl(String name) {
        this.name = name;
        this.coursesSubscription = new HashSet<>();
    }

    @Override
    public void subscribeToCourse(Course course) {
        this.coursesSubscription.add(course);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Course> getAllCourses() {
        return new ArrayList<>(this.coursesSubscription);
    }
}
