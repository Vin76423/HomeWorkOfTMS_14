package application.config;

import application.action.*;

import java.util.HashMap;
import java.util.Map;

public class ConfigActions {
    public static Map<Integer, Action> actions = new HashMap<>();

    static {
        actions.put(1, new AddStudentAction());
        actions.put(2, new ShowStudentsAction());
        actions.put(3, new ShowSortedStudentsAction());
        actions.put(4, new ShowSubStudentsByAverageMark());
        actions.put(5, new RemoveStudentAction());
        actions.put(6, new UpdateStudentAction());
        actions.put(7, new GetStudentByNameAction());
        actions.put(0, new StopApplicationAction());
    }
}
