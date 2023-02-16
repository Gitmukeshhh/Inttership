package com.example.Shubham.Service;

import com.example.Shubham.DTO.CollageDto;
import com.example.Shubham.Model.Collage;
import com.example.Shubham.Model.Student;
import com.example.Shubham.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class CollageService {
    @Autowired
    StudentRepo studentRepo;

    public  String add(CollageDto collageDto){


        int StudentId=collageDto.getStudentId();
        Student student=studentRepo.findById(StudentId).get();

        Collage collage=new Collage();
        collage.setClgName(collageDto.getClgName());
        collage.setClgRating(collageDto.getClgRating());

          student.setCollage(collage);
          collage.setStudent(student);

          studentRepo.save(student);
          return "bhai o Student or Clg table join  kar liya ab dekho shai hai ya nh";


    }

}
