public class Students {

    // Declare variables
    private int studentId;
    private String firstName;
    private String lastName;

    // Constructor used to create objects
    public Students(int studentId, String firstName, String lastName) {
        this.setStudentId(studentId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    // Getter and Setter methods used to access private fields
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
