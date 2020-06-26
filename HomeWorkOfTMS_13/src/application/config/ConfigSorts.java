package application.config;


import entity.Student;
import entity.comparators.ByNameSortAscendingComparator;
import entity.comparators.ByNameSortDescendingComparator;
import entity.comparators.ByAverageMarkSortAscendingComparator;
import entity.comparators.ByAverageMarkSortDescendingComparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ConfigSorts {
    public static Map<Integer, Comparator<Student>> sorts = new HashMap<>();

    static {
        sorts.put(1, new ByNameSortAscendingComparator());
        sorts.put(2, new ByNameSortDescendingComparator());
        sorts.put(3, new ByAverageMarkSortAscendingComparator());
        sorts.put(4, new ByAverageMarkSortDescendingComparator());
    }
}
