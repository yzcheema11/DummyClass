public class StudentsTest {

    public static void main(String[] args) {

        // Creates new Student object
        Students studentsObj = new Students(10,"Bale","Cheema");
        System.out.println(studentsObj.getStudentId() +", " + studentsObj.getFirstName()+" " +studentsObj.getLastName());
        studentsObj.setStudentId(20);
        studentsObj.setFirstName("Brian");
        studentsObj.setLastName("Mullin");
        System.out.println(studentsObj.getStudentId() +", " + studentsObj.getFirstName()+" " +studentsObj.getLastName());
        studentsObj.setStudentId(30);
        studentsObj.setFirstName("Sally");
        studentsObj.setLastName("Seasehlls");
        System.out.println(studentsObj.getStudentId() +", " + studentsObj.getFirstName()+" " +studentsObj.getLastName());
    }

}
