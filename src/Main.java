import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student students1 = new Student("Ajybek", "sadykov", "male", LocalDate.of(2022, 9, 1), "school");
        Student students2 = new Student("Adilet", "artykov", "male", LocalDate.of(2014, 9, 2), "kgma");
        Student students3 =new Student("Karina", "Bokombaeva", "female", LocalDate.of(2020, 12, 3), "Voenno-antonovka School");
        Student students4 =new Student("Alisher", "keneshov", "male", LocalDate.of(2021, 8, 12), "muk");
        Student students5 =new Student("daulet", "alimbekov", "female", LocalDate.of(2023, 9, 21), "arabaev");
        Student students6 = new Student("Erbol", "Jakypov", "male", LocalDate.of(2018, 9, 1), "politeh");
        Student students7 = new Student("Bilal", "Sharapaev", "male", LocalDate.of(2016, 9, 6), "colleg");
        Student students8 =new Student("Urmat", "Taichikov", "male", LocalDate.of(2022, 12, 4), "school");
        Student students9 =new Student("Nurlan", "Gaparov", "male", LocalDate.of(2011, 8, 17), "colleg");
        Student students10 =new Student("acema", "jusupova", "female", LocalDate.of(2017, 9, 25), "bgu");

Student[] students = {students1,students3,students2,students4,students5,students6,students7,students8,students9,students10};
        System.out.println(Arrays.toString(students));
Arrayss(students);






    }
    public  static  void Arrayss(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsEducationCenter();
        }
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsEducationCenter();

        }


    }
}