package studyCenter.reports;

import studyCenter.Program;
import studyCenter.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortReport implements Report{
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentsProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        StringBuilder shortInfo = new StringBuilder();
        shortInfo.append("STUDENT: " + currentStudent.getName() + " " + currentStudent.getSurname() + "\r\n");
        shortInfo.append("STUDENTS PROGRAM: " + program.getProgramName() + "\r\n");
        if(program.getProgramStartDate() != null){
            shortInfo.append("START: " + format.format(programStartDate) + "\r\n");
            shortInfo.append("PROGRAM DURATION: " + program.countProgramDuration() + " hours" + "\r\n");
            shortInfo.append(program.showProgramProgress(programStartDate, programStopDate));
        }else {
            shortInfo.append("No assigned courses for this student \r\n");
        }
        System.out.println(shortInfo.toString());
    }
}
