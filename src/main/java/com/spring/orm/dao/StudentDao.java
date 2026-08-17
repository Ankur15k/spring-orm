package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


    @Override
    public String toString() {
        return "StudentDao{" +
                "hibernateTemplate=" + hibernateTemplate +
                '}';
    }

    //save student
    @Transactional
    public int insert(Student student){
        Integer i =(Integer) this.hibernateTemplate.save(student);

        return i;
    }

    //get the single data(object)
    public Student getStudent(Integer studentId){
        return (Student) this.hibernateTemplate.get(Student.class, studentId);
    }

    //get all student(all rows)
    public List<Student> getStudents(){
        return (List<Student>) this.hibernateTemplate.loadAll(Student.class);
    }

    //deleting the data
   public void deleteStudent(int studentId){
       Student student= this.hibernateTemplate.get(Student.class, studentId);
       this.hibernateTemplate.delete(student);
   }

   //updating data
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }

}
