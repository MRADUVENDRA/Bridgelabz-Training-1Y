package src.com.gla.Generic_Problem_Statements;
import java.util.*;
abstract class CourseType{}
class ExamCourse extends CourseType{}
class Course<T extends CourseType>{
    T type;
}
public class UniversityCourseManagement {
    static void show(List<? extends CourseType> list){
        System.out.println(list.size());
    }
}