package io.zipcoder;

public class Student {
     private String firstName;
    private String lastName;
    private Double[] examScores;
    private String numberOfExamsTaken;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        return numberOfExamsTaken;
    }


    public void addExamScore(double g) {

    }

    public void setExamScore(int i, double v) {
    }

    public double getAverageExamScore() {
        return 0;
    }

    public static void main(String[] args) {

    }
}
