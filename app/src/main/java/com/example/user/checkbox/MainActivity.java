package com.example.user.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox checkBox1,checkBox2,checkBox3;
Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkBox1=(CheckBox)findViewById(R.id.checkBox1);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder FinalOrder=new StringBuilder();
                FinalOrder.append("Selected :");
                if(checkBox1.isChecked())
                {
                    FinalOrder.append("\n Item 1");
                }
                if(checkBox2.isChecked())
                {
                    FinalOrder.append("\n Item 2");
                }
                if(checkBox3.isChecked())
                {
                    FinalOrder.append("\n Item 3");
                }
                Toast.makeText(getApplicationContext(),FinalOrder.toString(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
