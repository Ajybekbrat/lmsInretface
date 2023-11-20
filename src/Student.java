import java.time.LocalDate;

public class Student implements Study {
    private  String name;
    private String surname;
    private  String  gender;
    private LocalDate dateOfStart;
    private  String educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, String educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public String getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(String educationCenter) {
        this.educationCenter = educationCenter;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationCenter='" + educationCenter + '\'' +
                '}';
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println("Student name: "+ name+ ", Student lastName: "+ surname+", gender: "+ gender);
    }

    @Override
    public void getStudentsStudyingYear() {
        System.out.println("date of start: "+ dateOfStart+ ", educationCenter: "+ educationCenter);

    }
}
