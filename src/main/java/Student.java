/**
 * The Student class represents a student with name, age, and student number attributes.
 * It provides constructors, getters, and overridden toString and equals methods.
 *
 * @author Shaoyang Chen
 * @version 114.514
 * @since 1919.08.10
 */
public class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructs a new Student with the specified name, age, and student number.
     *
     * @param name the name of the student
     * @param age the age of the student
     * @param studentNumber the student number of the student
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Returns the name of the student.
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the student.
     *
     * @return the age of the student
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the student number of the student.
     *
     * @return the student number of the student
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Returns a string representation of the student in the format "name, age - studentNumber".
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return name + ", " + age + " - " + studentNumber;
    }

    /**
     * Compares this student to the specified object for equality.
     * The result is true if and only if the argument is not null, is a Student object,
     * and has the same student number as this student.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // Check if the object is the same reference
        if (this == obj) {
            return true;
        }

        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to Student and compare student numbers
        Student student = (Student) obj;
        return studentNumber != null ? studentNumber.equals(student.studentNumber) : student.studentNumber == null;
    }

    /**
     * Returns a hash code value for the student based on the student number.
     *
     * @return a hash code value for this student
     */
    @Override
    public int hashCode() {
        return studentNumber != null ? studentNumber.hashCode() : 0;
    }
}