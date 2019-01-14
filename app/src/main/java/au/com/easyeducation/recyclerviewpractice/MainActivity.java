package au.com.easyeducation.recyclerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> listText = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inflateArrayList();
    }

    private void inflateArrayList() {
        listText.add("One One One One One One One One One ");
        listText.add("Two Two Two Two Two Two Two Two ");
        listText.add("Three Three Three Three Three Three ");
        listText.add("Four Four Four Four Four Four Four ");
        listText.add("Five Five Five Five Five Five Five ");
        listText.add("Six Six Six Six Six Six Six Six Six ");

        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(listText, this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
