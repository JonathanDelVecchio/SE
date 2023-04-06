package com.sebe.mapper;

import com.sebe.dto.StudentDTO;
import com.sebe.model.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-06T11:42:50-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDTO toStudentDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );
        studentDTO.setEmail( student.getEmail() );
        studentDTO.setPassword( student.getPassword() );
        studentDTO.setDateOfBirth( student.getDateOfBirth() );
        studentDTO.setGender( student.getGender() );
        studentDTO.setCity( student.getCity() );
        studentDTO.setState( student.getState() );
        studentDTO.setPhoneNumber( student.getPhoneNumber() );
        studentDTO.setIndustry( student.getIndustry() );
        studentDTO.setUniversityName( student.getUniversityName() );
        studentDTO.setMonthOfGraduation( student.getMonthOfGraduation() );
        studentDTO.setYearOfGraduation( student.getYearOfGraduation() );
        studentDTO.setMajor( student.getMajor() );
        studentDTO.setMinor( student.getMinor() );
        studentDTO.setGpa( student.getGpa() );

        return studentDTO;
    }

    @Override
    public Student toStudent(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setName( studentDTO.getName() );
        student.setEmail( studentDTO.getEmail() );
        student.setPassword( studentDTO.getPassword() );
        student.setDateOfBirth( studentDTO.getDateOfBirth() );
        student.setGender( studentDTO.getGender() );
        student.setCity( studentDTO.getCity() );
        student.setState( studentDTO.getState() );
        student.setPhoneNumber( studentDTO.getPhoneNumber() );
        student.setIndustry( studentDTO.getIndustry() );
        student.setUniversityName( studentDTO.getUniversityName() );
        student.setMonthOfGraduation( studentDTO.getMonthOfGraduation() );
        student.setYearOfGraduation( studentDTO.getYearOfGraduation() );
        student.setMajor( studentDTO.getMajor() );
        student.setMinor( studentDTO.getMinor() );
        student.setGpa( studentDTO.getGpa() );

        return student;
    }
}
