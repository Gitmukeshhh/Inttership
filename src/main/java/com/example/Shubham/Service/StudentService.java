package com.example.Shubham.Service;


import com.example.Shubham.DTO.StudentDto;
import com.example.Shubham.DTO.UpdateStudentDto;
import com.example.Shubham.Model.Student;
import com.example.Shubham.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public  String create(StudentDto studentDto){


        Student student=new Student();
        student.setAge(studentDto.getAge());
        student.setName(studentDto.getName());


        studentRepo.save(student);




        return "student create";

    }

    public  String delete(int id){

        studentRepo.deleteById(id);
        return "Delete kar diya Bhai";
    }

    public  String update(UpdateStudentDto updateStudentDto){


           Student student=studentRepo.findById(updateStudentDto.getStudentId()).get();
           student.setName(updateStudentDto.getName());

           studentRepo.save(student);

          return "update kar diya bhai";
    }


     public Student getById(int id){

        return studentRepo.findById(id).get();
     }









}
