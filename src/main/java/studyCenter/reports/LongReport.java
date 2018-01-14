package studyCenter.reports;

import studyCenter.Program;
import studyCenter.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongReport implements Report {
    SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy HH:mm");

    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentsProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        StringBuilder fullInfo = new StringBuilder();
        fullInfo.append("STUDENT: " + currentStudent.getName() + " " + currentStudent.getSurname() + "\r\n");
        fullInfo.append("STUDENTS PROGRAM: " + program.getProgramName() + "\r\n");
        fullInfo.append("START: " + format.format(programStartDate) + "\r\n");
        fullInfo.append("PROGRAM DURATION: " + program.countProgramDuration() + " hours" + "\r\n");
        if (program.getCourses() != null) {
            fullInfo.append(program.showProgramCourses());
        } else {
            fullInfo.append("No assigned courses for this student \r\n");
        }
        System.out.println(fullInfo.toString());
    }
}
