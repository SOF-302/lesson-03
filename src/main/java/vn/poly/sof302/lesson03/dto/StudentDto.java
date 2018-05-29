package vn.poly.sof302.lesson03.dto;

import java.util.List;

public class StudentDto {

    private Long id;

    private String fullName;
    
    private String gender;
    
    private String hobits;
    
    private String national;
    
    private List<Long> classes;

    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the hobits
     */
    public String getHobits() {
        return hobits;
    }

    /**
     * @param hobits the hobits to set
     */
    public void setHobits(String hobits) {
        this.hobits = hobits;
    }

    /**
     * @return the national
     */
    public String getNational() {
        return national;
    }

    /**
     * @param national the national to set
     */
    public void setNational(String national) {
        this.national = national;
    }

    /**
     * @return the classes
     */
    public List<Long> getClasses() {
        return classes;
    }

    /**
     * @param classes the classes to set
     */
    public void setClasses(List<Long> classes) {
        this.classes = classes;
    }
}
