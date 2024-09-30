package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits.
Create a subclass "OnlineCourse" that adds attributes for platform and duration.
Implement methods to display course details and check if the course is eligible for a certificate based on duration.
*/

class Course{
    private String name;
    private String instructor;
    private int credits;

    public Course(String name, String instructor, int credits){
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void details(){
        System.out.println("Course name: " + name);
        System.out.println("Course instructor: " + instructor);
        System.out.println("Course credits: " + credits);
    }

}

class OnlineCourse extends Course{
    private String platform;
    private int duration;

    public OnlineCourse(String name, String instructor, int credits, String platform, int duration){
        super(name, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    @Override
    public void details(){
        super.details();
        System.out.println("Course platform: " + platform);
        System.out.println("Course duration: " + duration);
    }

    public boolean isEligibleForCertificate(){
        return duration >= 120;
    }

}

public class Zad23 {
    public static void main(String[] args) {
        Course course = new Course("Java", "nobody", 2);
        course.details();
        System.out.println();

        System.out.println("Online course: ");
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", "NoobNobody", 3, "Teams", 150);
        onlineCourse.details();
        System.out.println("Eligible for Certificate: " + onlineCourse.isEligibleForCertificate());
    }
}
