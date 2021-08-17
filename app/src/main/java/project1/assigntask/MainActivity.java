package project1.assigntask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import util.CommonFunctions;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();


    }
    public void onClick(View v) {

        if( v == startButton){
            CommonFunctions.changeActivity(this, NamesActivity.class, null,false,true);
        }

    }
    private void findViews(){
         startButton = (Button) findViewById(R.id.start);

         startButton.setOnClickListener(this);
    }

}