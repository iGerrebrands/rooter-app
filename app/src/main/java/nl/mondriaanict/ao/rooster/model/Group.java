package nl.mondriaanict.ao.rooster.model;

import nl.mondriaanict.ao.rooster.model.schedule.Schedule;

/**
 * Created by Administrator on 9-6-2015.
 */
public class Group {
    private Schedule schedule;
    private String name;
    private String type;

    public Group(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
