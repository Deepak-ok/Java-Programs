 class Course {
   static  int maxCapacity=100;
    String courseName;
    int enrollments;

     String[] enrolledStudents;

    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents= new String[maxCapacity];
    }



    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }

    void setEnrolledStudents(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student Removed");
        enrollments--;

    }
}
