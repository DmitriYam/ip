package duke.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {

    protected LocalDate localDate;
    protected String time;

    public Deadline(String name, String dates, String time){
        super(name);
        this.localDate = LocalDate.parse(dates);
        this.time = time;
    }

    public String getTime(){
        return this.time;
    }
    public LocalDate getDates(){
        return this.localDate;
    }

    public String toString(){
        return "[D][" + super.getStatus() + "]" + super.name + "by "
                + localDate.format(DateTimeFormatter.ofPattern("MMM d yyyy")) +" " + time;
    }
}
