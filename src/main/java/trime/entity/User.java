package trime.entity;

/**
 * Created by better on 15/3/10.
 */

public class User {
    private String id;
    private String name;
    private String gender;
    private int age;
    private String userid;
    private String password;
    private String username;
    private String birthday;
    private String picture;
    private String location;
    private String description;
    private String school;
    private String work;
    private String phone;
    private String email;
    private Integer isServiceProvider;
    private Integer isDeleted;
    private Integer isLocked;

    public User(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsServiceProvider() {
        return isServiceProvider;
    }

    public void setIsServiceProvider(Integer isServiceProvider) {
        this.isServiceProvider = isServiceProvider;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null) return false;
        if (description != null ? !description.equals(user.description) : user.description != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (isDeleted != null ? !isDeleted.equals(user.isDeleted) : user.isDeleted != null) return false;
        if (isLocked != null ? !isLocked.equals(user.isLocked) : user.isLocked != null) return false;
        if (isServiceProvider != null ? !isServiceProvider.equals(user.isServiceProvider) : user.isServiceProvider != null)
            return false;
        if (location != null ? !location.equals(user.location) : user.location != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (picture != null ? !picture.equals(user.picture) : user.picture != null) return false;
        if (school != null ? !school.equals(user.school) : user.school != null) return false;
        if (userid != null ? !userid.equals(user.userid) : user.userid != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (work != null ? !work.equals(user.work) : user.work != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (work != null ? work.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (isServiceProvider != null ? isServiceProvider.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (isLocked != null ? isLocked.hashCode() : 0);
        return result;
    }
}
