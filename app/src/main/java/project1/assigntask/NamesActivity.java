package project1.assigntask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import util.CommonFunctions;

public class NamesActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaration Variables
    EditText editName1;
    EditText editName2;
    EditText editName3;
    EditText editName4;
    EditText editName5;
    EditText editName6;
    EditText editName7;
    EditText editName8;
    Button nextButton;
    ArrayList<String> namesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);
        findViews();


    }
    @Override
    public void onClick(View v) {
        if(v ==  nextButton){
            Bundle bundle = createBundle();
            CommonFunctions.changeActivity(this,TaskActivity.class,bundle,true,false);
        }

    }
    public Bundle createBundle(){
        Bundle namesBundle = new Bundle();
        namesList = new ArrayList<>();

        namesList.add(editName1.getText().toString());
        namesList.add(editName2.getText().toString());
        namesList.add(editName3.getText().toString());
        namesList.add(editName4.getText().toString());
        namesList.add(editName5.getText().toString());
        namesList.add(editName6.getText().toString());
        namesList.add(editName7.getText().toString());
        namesList.add(editName8.getText().toString());
        namesBundle.putStringArrayList("names",namesList);
        return namesBundle;

    }
    private void findViews(){

        editName1 = (EditText)findViewById(R.id.editName1);
        editName2 = (EditText)findViewById(R.id.editName2);
        editName3 = (EditText)findViewById(R.id.editName3);
        editName4 = (EditText)findViewById(R.id.editName4);
        editName5 = (EditText)findViewById(R.id.editName5);
        editName6 = (EditText)findViewById(R.id.editName6);
        editName7 = (EditText)findViewById(R.id.editName7);
        editName8 = (EditText)findViewById(R.id.editName8);
        nextButton = (Button)findViewById(R.id.totask);


        nextButton.setOnClickListener(this);

    }


}