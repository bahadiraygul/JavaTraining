package school.management;

public class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;

    public Student(String typeOfStudy, int yearOfStudy, double studyPrice){
        this.typeOfStudy = typeOfStudy;
        this. yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public String getTypeOfStudy(){
        return typeOfStudy;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

    public double getStudyPrice(){
        return studyPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", studyPrice=" + studyPrice +
                '}';
    }
}
