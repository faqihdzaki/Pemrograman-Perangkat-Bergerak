package faqih.nat.flexiblefragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SecondFragment extends Fragment implements View.OnClickListener {

    public SecondFragment() {
        // required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnThird = view.findViewById(R.id.SecondButton);
        btnThird.setOnClickListener(this);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Kedua");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("(fragment_second.xml)");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setHasOptionsMenu(true);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.SecondButton){
            ThirdFragment thirdFragment = new ThirdFragment();
            FragmentManager mFragmentmanager = getFragmentManager();
            if (mFragmentmanager != null){
                mFragmentmanager
                        .beginTransaction()
                        .replace(R.id.frame_content, thirdFragment, SecondFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home ){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }
}
