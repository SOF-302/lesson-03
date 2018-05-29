/**
 * 
 */
package vn.poly.sof302.lesson03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import vn.poly.sof302.lesson03.dto.StudentDto;

/**
 * @author duongnguyen
 *
 */
@Repository
public class StudentRepository {

    
    Map<Long, StudentDto> studentDtoMap = new HashMap<>();
    
    public StudentRepository() {

        StudentDto studentDto = new StudentDto();
        studentDto.setFullName("Nguyen Van Duong");
        studentDto.setGender("M");
        
        List<Long> classesList = new ArrayList<>();
        classesList.add(1L);
        classesList.add(5L);
        studentDto.setClasses(classesList);

        studentDtoMap.put(1L, studentDto);
    }

    public StudentDto select(Long id) {

        return studentDtoMap.get(id);
    }

    public void update(Long id, StudentDto studentDto) {
        
        studentDtoMap.put(id, studentDto);
    }
}
