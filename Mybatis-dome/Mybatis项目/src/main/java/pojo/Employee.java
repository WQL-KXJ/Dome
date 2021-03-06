package pojo;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.name
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.bmid
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    private Integer bmid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.gender
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.age
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.phone
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.addr
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    private String addr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.id
     *
     * @return the value of employee.id
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.id
     *
     * @param id the value for employee.id
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.name
     *
     * @return the value of employee.name
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.name
     *
     * @param name the value for employee.name
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.bmid
     *
     * @return the value of employee.bmid
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public Integer getBmid() {
        return bmid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.bmid
     *
     * @param bmid the value for employee.bmid
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.gender
     *
     * @return the value of employee.gender
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.gender
     *
     * @param gender the value for employee.gender
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.age
     *
     * @return the value of employee.age
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.age
     *
     * @param age the value for employee.age
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.phone
     *
     * @return the value of employee.phone
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.phone
     *
     * @param phone the value for employee.phone
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.addr
     *
     * @return the value of employee.addr
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.addr
     *
     * @param addr the value for employee.addr
     *
     * @mbg.generated Mon Dec 13 15:16:08 CST 2021
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }
}