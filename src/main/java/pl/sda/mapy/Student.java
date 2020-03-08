package pl.sda.mapy;

public class Student {
    private String name;
    private String lastname;
    private School school;

    public Student(String name, String lastname, School school) {
        this.name = name;
        this.lastname = lastname;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
