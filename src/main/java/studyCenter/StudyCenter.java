package studyCenter;

import studyCenter.persons.Student;
import studyCenter.reports.LongReport;
import studyCenter.reports.Report;
import studyCenter.reports.ShortReport;

public class StudyCenter {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Ivanov");
        Course java = new Course("Java", 16);
        Course js = new Course("JavaScript", 10);
        Program program = new Program("05/01/2018 10:00", "Programming");
        Course courses[] = new Course[] {java, js};
        program.addCoursesToProgram(courses);
        ivan.setStudentsProgram(program);
        program.calculateProgramEndDate();
        System.out.println("------------------Short Report------------------");
        Report shortReport = new ShortReport();
        shortReport.showReportForStudent(ivan);
        System.out.println("------------------Long Report------------------");
        Report longReport = new LongReport();
        longReport.showReportForStudent(ivan);
    }
}
