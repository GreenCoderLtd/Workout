package workout.greencoder.com.workout;


import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {


    public WorkoutListFragment() {
        // Required empty public constructor
    }

    static interface WorkListListener
    {
        public void itemClicked(long workoutId);

    }

    WorkListListener listener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<Workout> adapter=new ArrayAdapter<Workout>(inflater.getContext(),android.R.layout.simple_list_item_1,Workout.workout);

        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener=(WorkListListener)activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        if(listener!=null)
        {
            listener.itemClicked(id);
        }
    }
}
