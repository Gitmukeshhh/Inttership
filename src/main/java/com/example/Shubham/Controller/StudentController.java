package com.example.Shubham.Controller;



import com.example.Shubham.DTO.StudentDto;
import com.example.Shubham.DTO.UpdateStudentDto;
import com.example.Shubham.Model.Student;
import com.example.Shubham.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public  String create( @RequestBody StudentDto studentDto){

       return  studentService.create(studentDto);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam ("id") int id){
        return  studentService.delete(id);
    }

    @PutMapping("/update")
    public  String update(@RequestBody UpdateStudentDto updateStudentDto){
          return studentService.update(updateStudentDto);
    }


    @GetMapping("/get")
    public Student getById(@RequestParam("id") int id){
        return  studentService.getById(id);
    }





}
