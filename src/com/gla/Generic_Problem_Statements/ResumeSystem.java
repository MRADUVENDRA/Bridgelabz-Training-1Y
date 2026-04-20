package src.com.gla.Generic_Problem_Statements;
import java.util.*;
abstract class JobRole{}
class SoftwareEngineer extends JobRole{}
class Resume<T extends JobRole>{}
public class ResumeSystem {
    static void process(List<? extends JobRole> list){
        System.out.println(list.size());
    }
}