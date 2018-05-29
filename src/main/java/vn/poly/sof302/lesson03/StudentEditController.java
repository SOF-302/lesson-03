package vn.poly.sof302.lesson03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.lesson03.dto.ClassDto;

/**
 * @author duongnguyen
 */
@Controller
@RequestMapping("/student")
public class StudentEditController {

    @Autowired
    StudentRepository studentRepository;
    
    @GetMapping("/edit/{id}")
    public String input(@PathVariable Long id, ModelMap model) {
        
        model.addAttribute("studentDto", studentRepository.select(id));

        Map<String, String> gendersMap = new HashMap<>();

        gendersMap.put("M", "Male");
        gendersMap.put("F", "Femal");
        gendersMap.put("G", "Gay");
        gendersMap.put("L", "Les");
        model.addAttribute("gendersMap", gendersMap);

        List<ClassDto> classDtoList = new ArrayList<>();

        ClassDto classDto1 = new ClassDto();
        classDto1.setId(1L);
        classDto1.setName("Lớp số 1");
        classDtoList.add(classDto1);

        ClassDto classDto2 = new ClassDto();
        classDto2.setId(2L);
        classDto2.setName("Lớp số 2");
        classDtoList.add(classDto2);

        ClassDto classDto3 = new ClassDto();
        classDto3.setId(3L);
        classDto3.setName("Lớp số 3");
        classDtoList.add(classDto3);

        ClassDto classDto4 = new ClassDto();
        classDto4.setId(4L);
        classDto4.setName("Lớp số 4");
        classDtoList.add(classDto4);

        ClassDto classDto5 = new ClassDto();
        classDto5.setId(5L);
        classDto5.setName("Lớp số 5");
        classDtoList.add(classDto5);
        
        model.addAttribute("classDtoList", classDtoList);

        return "/student/input";
    }

    @PostMapping("/edit/{id}")
    public String save(@PathVariable Long id) {

        return "redirect:/student/edit";
    }
}
