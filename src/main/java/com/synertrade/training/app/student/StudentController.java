package com.synertrade.training.app.student;

import com.synertrade.training.app.common.JerseyClientImpl;
import com.synertrade.training.app.student.dto.StudentDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.GenericType;
import java.util.List;

/**
 * Created by tudorg on 10/18/2016.
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @RequestMapping(value = "/listall", method = RequestMethod.GET)
    public List<StudentDto> getAllStudents(){
    return new JerseyClientImpl().target("http://localhost:1235/trainingcore/rest/student/list").request().get(new GenericType<List<StudentDto>>(){});
    }
}
