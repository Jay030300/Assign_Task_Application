package project1.assigntask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> names, tasks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        recyclerView = findViewById(R.id.recyclerView);
        Bundle bundle = getIntent().getExtras();

        names = bundle.getStringArrayList("NAMES");
        tasks = bundle.getStringArrayList("TASKS");

        Log.i("Names", names.toString());
        Log.i("Tasks",tasks.toString());

        MyAdapter myAdapter = new MyAdapter(this,names,tasks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }
}