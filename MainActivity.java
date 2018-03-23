package mx.jesusa.fragmenttesting;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements Fragment1.OnFragmentInteractionListener,Fragment2.OnFragmentInteractionListener {

    FragmentManager fm;
    Fragment newFragment,newFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newFragment= new Fragment1();
        fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container,newFragment,"fragmentholder");
        ft.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void swap(View v){
        newFragment2 = new Fragment2();
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(newFragment);
        ft.add(R.id.container,newFragment2,"fragmentholder");
        ft.commit();

    }

}
