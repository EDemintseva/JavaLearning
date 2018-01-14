package studyCenter.persons;

import studyCenter.Program;

public class Student extends Person {
    private Program studentsProgram;

    public Student(String name, String surname) {
        super(name, surname);
    }

    public Program getStudentsProgram() {
        return studentsProgram;
    }

    public void setStudentsProgram(Program studentsProgram) {
        this.studentsProgram = studentsProgram;
    }
}
