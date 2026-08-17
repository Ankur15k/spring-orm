package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Program Started.");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
//        Student student = new Student(2324,"Ankur Gautam","Sonipat");
//
//        int r = studentDao.insert(student);
//        System.out.println(r);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go) {
            System.out.println("Press 1 for add student");
            System.out.println("Press 2 for display all students");
            System.out.println("Press 3 for get detail of single student");
            System.out.println("Press 4 for delete student");
            System.out.println("Press 5 for update student");
            System.out.println("Press 6 for exit");
            System.out.println();

            try{
                int input = Integer.parseInt(br.readLine());
//                if(input == 1){
//                    //add a new student
//                } else if (input==2) {
//                    //display
//                }

                switch (input) {
                    case 1://add a new student
                         // taking inputs from users
                        System.out.println("Enter user id : ");
                        int userId = Integer.parseInt(br.readLine());
                        System.out.println("Enter user name : ");
                        String userName = br.readLine();
                        System.out.println("Enter user city : ");
                        String userCity = br.readLine();

                        //saving student object to database by calling insert of students
                       int i = studentDao.insert(new Student(userId,userName,userCity));
                       if(i>0) {
                           System.out.println("Student added successfully");
                       }else{
                           System.out.println("Student not added successfully");
                       }
                        System.out.println("******************************************************************");
                        break;
                    case 2://display all students
                           List<Student> allStudents = studentDao.getStudents();
                        System.out.println("Displaying all students");
                        System.out.println(allStudents);
                        System.out.println("*******************************************************************");
                        break;
                    case 3://for get details of single students
                        System.out.println("Enter student id : ");
                        int studentId = Integer.parseInt(br.readLine());
                        Student student = studentDao.getStudent(studentId);
                        System.out.println("The details of the student are:");
                        System.out.println(student);
                        break;
                    case 4://for delete student
                        System.out.println("Enter student id : ");
                        int studId = Integer.parseInt(br.readLine());
                        studentDao.deleteStudent(studId);
                        System.out.println("Student deleted successfully");
                        System.out.println("**************************************************************");
                        break;
                    case 5://update
                        System.out.println("Enter user id : ");
                        int useId = Integer.parseInt(br.readLine());
                        System.out.println("Enter user name : ");
                        String useName = br.readLine();
                        System.out.println("Enter user city : ");
                        String useCity = br.readLine();
                        studentDao.updateStudent(new Student(useId,useName,useCity));
                        System.out.println("Student updated successfully");
                        System.out.println("***************************************************************");
                        break;
                    case 6://for exit
                        go = false;
                        break;

                }

            }catch(Exception e){
                System.out.println("Invalid input Try with another one!");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Program Ended.");
    }
}