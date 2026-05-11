package Monday;


public class PersonApp {

    public static void main(String[] args) {

        ///instantiate objects

        Student student;
        Teacher teacher;

        student = new Student();
        teacher = new Teacher();

        //__________________________________
        ///set common attributes

        student.setName("Arsema");
        teacher.setName("Sara");

        student.setAge(15);
        teacher.setAge(30);

        student.setResponsibility("Study");
        teacher.setResponsibility("Teach");

        //____________________________________
        ///set unique attributes

        student.setStudentID(112233);
        teacher.setAccessCode(1234);


        student.setStudyField("Art");
        teacher.setSubject("History");

        student.setClubMember(false);
        teacher.setSponsor(true);

        //_______________________________________
        /// declare + initialize

        //name
        String studentName = student.getName();
        String teacherName = teacher.getName();

        //age
        int studentAge = student.getAge();
        int teacherAge = teacher.getAge();

        //ID/Code
        int studentID = student.getStudentID();
        int accessCode = teacher.getAccessCode();

        //responsibility
        String studentRes = student.getResponsibility();
        String teacherRes = teacher.getResponsibility();

        //field
        String studentField = student.getStudyField();
        String subject = teacher.getSubject();

        //extracurricular
        boolean isClubMember = student.isClubMember;
        boolean isSponsor = teacher.isSponsor;

        //___________________________________
        ///display  info

        System.out.println(
                        "I'm a student."  +
                        "\nMy name is " + studentName +
                        "\nI'm (age)" + studentAge +
                        "\nMy job is to (res) " + studentRes +
                        "\nMy field is (student field) " + studentField +
                        "\nI attend club: (t/f)" + isClubMember);

        System.out.println("\n" +
                "\nI'm a teacher." +
                "\nMy name is " + teacherName +
                "\nI'm (age) " + teacherAge +
                "\nMy job is (res)" + teacherRes  +
                "\nI teach (sub)" + subject + 
                "\nI'm a sponsor of a club: " + isSponsor);
    }

}
