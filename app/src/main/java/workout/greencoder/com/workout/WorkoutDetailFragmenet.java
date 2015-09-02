package workout.greencoder.com.workout;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragmenet extends Fragment {

    private int workoutId;

    public WorkoutDetailFragmenet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(savedInstanceState!=null)
        {
            workoutId=savedInstanceState.getInt("workoutId");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Workout workout=Workout.workout[workoutId];
        View view=getView();
        TextView title=(TextView)view.findViewById(R.id.textTitle);
        TextView description=(TextView)view.findViewById(R.id.textDescription);
        title.setText(workout.getName());
        description.setText(workout.getDetails());

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("workoutId",workoutId);
    }



    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }
}
