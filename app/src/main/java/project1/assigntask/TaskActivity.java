package project1.assigntask;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import java.util.Collections;

import util.CommonFunctions;

public class TaskActivity extends AppCompatActivity implements View.OnClickListener{

    //Declaration Variables
    EditText editTask1;
    EditText editTask2;
    EditText editTask3;
    EditText editTask4;
    EditText editTask5;
    EditText editTask6;
    EditText editTask7;
    EditText editTask8;
    Button nextButton;
    ArrayList<String> namesList;
    ArrayList<String> taskList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        findViews();
        Bundle namesBundle = getIntent().getExtras();
        namesList = new ArrayList<>();
        namesList = namesBundle.getStringArrayList("names");
    }

    @Override
    public void onClick(View v) {
        if(v ==  nextButton){
            Bundle bundle = new Bundle();
            ArrayList<String> task = createTaskList();
            bundle.putStringArrayList("NAMES", namesList);
            bundle.putStringArrayList("TASKS",task);
            Log.e("String",namesList.get(1));
            CommonFunctions.changeActivity(this,ResultActivity.class,bundle,false,false);
        }

    }
    public ArrayList<String> createTaskList(){

        taskList = new ArrayList<>();

        taskList.add(editTask1.getText().toString());
        taskList.add(editTask2.getText().toString());
        taskList.add(editTask3.getText().toString());
        taskList.add(editTask4.getText().toString());
        taskList.add(editTask5.getText().toString());
        taskList.add(editTask6.getText().toString());
        taskList.add(editTask7.getText().toString());
        taskList.add(editTask8.getText().toString());
        Collections.shuffle(taskList);

        return taskList;

    }
    private void findViews(){

        editTask1 = findViewById(R.id.editTask1);
        editTask2 = findViewById(R.id.editTask2);
        editTask3 = findViewById(R.id.editTask3);
        editTask4 = findViewById(R.id.editTask4);
        editTask5 = findViewById(R.id.editTask5);
        editTask6 = findViewById(R.id.editTask6);
        editTask7 = findViewById(R.id.editTask7);
        editTask8 = findViewById(R.id.editTask8);
        nextButton = findViewById(R.id.toResult);

        nextButton.setOnClickListener(this);
    }
}