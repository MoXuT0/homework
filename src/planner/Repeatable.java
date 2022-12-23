package planner;

import java.time.LocalDate;

public interface Repeatable {

    boolean nextDateTime(LocalDate localDate);

}
