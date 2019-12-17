package com.example.sdaassign32019johndoe;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/*
 * A simple {@link Fragment} subclass.
 * @author Chris Coughlan 2019
 */
public class ProductList extends Fragment {

    private static final String TAG = "RecyclerViewActivity";
    private ArrayList<FlavorAdapter> mFlavor = new ArrayList<>();

    public ProductList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_product_list, container, false);
        // Create an ArrayList of T-Shirts objects

        mFlavor.add(new FlavorAdapter("Beat shirt", "Spring 2020", R.drawable.t_shirt_4));
        mFlavor.add(new FlavorAdapter("Eclair shirt", "Summer 2020 ", R.drawable.t_shirt_5));
        mFlavor.add(new FlavorAdapter("Froyo shirt", "Summer 2019", R.drawable.t_shirt_9));
        mFlavor.add(new FlavorAdapter("Ginger shirt", "Summer 2019", R.drawable.t_shirt_8));
        mFlavor.add(new FlavorAdapter("Honey shirt", "Spring 2019", R.drawable.t_shirt_4));
        mFlavor.add(new FlavorAdapter("Ice shirt", "Spring 2020", R.drawable.t_shirt_1));
        mFlavor.add(new FlavorAdapter("Jelly shirt", "Spring 2019", R.drawable.t_shirt_2));
        mFlavor.add(new FlavorAdapter("KitKat shirt ", "Winter 2020", R.drawable.t_shirt_3));
        mFlavor.add(new FlavorAdapter("Lollipop shirt", "Summer 2020", R.drawable.t_shirt_6));
        mFlavor.add(new FlavorAdapter("Mars shirt", "Spring 2020", R.drawable.t_shirt_7));

        //start it with the view
        Log.d(TAG, "Starting recycler view");
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView_view);
        FlavorViewAdapter recyclerViewAdapter = new FlavorViewAdapter(getContext(), mFlavor);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }
}