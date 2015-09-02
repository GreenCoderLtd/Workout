package workout.greencoder.com.workout;

/**
 * Created by Avishek on 9/1/2015.
 */
public class Workout {

    private String name;
    private String details;

    public Workout(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public static final Workout[] workout={
     new Workout("Beautiful Life","1 litre water\nWalk at morning\nRunning at Evening"),
            new Workout("Green Life","Vegeterian Food\nWalk at 7 am\nVisit Park"),
            new Workout("Blue Life","Sea food\nWatch Moontlight"),

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return name;
    }
}
