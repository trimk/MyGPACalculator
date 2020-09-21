package com.example.mygpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

   //private static final String TAG = "";
    //double creditNum;
    //int gradeNum;
    int totalCoursePoints = 5;
    private EditText course1credit;
    private EditText course2credit;
    private EditText course3credit;
    private EditText course4credit;
    private EditText course5credit;
    private EditText course1grade;
    private EditText course2grade;
    private EditText course3grade;
    private EditText course4grade;
    private EditText course5grade;
   // private TextView gpaResult;
    //private TextView courseCreditResult;

    Button btn_computeGPA;
    Button btn_clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        course1credit = (EditText) findViewById(R.id.course1credit);
        course2credit = (EditText) findViewById(R.id.course2credit);
        course3credit = (EditText) findViewById(R.id.course3credit);
        course4credit = (EditText) findViewById(R.id.course4credit);
        course5credit = (EditText) findViewById(R.id.course5credit);


        course1grade = (EditText) findViewById(R.id.course1grade);
        course2grade = (EditText) findViewById(R.id.course2grade);
        course3grade = (EditText) findViewById(R.id.course3grade);
        course4grade = (EditText) findViewById(R.id.course4grade);
        course5grade = (EditText) findViewById(R.id.course5grade);

        btn_computeGPA = (Button) findViewById(R.id.btn_computeGPA);
        btn_computeGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (course1credit.getText().toString().length() == 0) {
                    course1credit.setText("0");
                }
                if (course2credit.getText().toString().length() == 0) {
                    course2credit.setText("0");
                }
                if (course3credit.getText().toString().length() == 0) {
                    course3credit.setText("0");
                }
                if (course4credit.getText().toString().length() == 0) {
                    course4credit.setText("0");
                }
                if (course5credit.getText().toString().length() == 0) {
                    course5credit.setText("0");
                }


                if (course1grade.getText().toString().length() == 0) {
                    course1grade.setText("0");
                }
                if (course2grade.getText().toString().length() == 0) {
                    course2grade.setText("0");
                }
                if (course3grade.getText().toString().length() == 0) {
                    course3grade.setText("0");
                }
                if (course4grade.getText().toString().length() == 0) {
                    course4grade.setText("0");
                }
                if (course5grade.getText().toString().length() == 0) {
                    course5grade.setText("0");
                }


                double credit1 = Double.parseDouble(course1credit.getText().toString());
                double credit2 = Double.parseDouble(course2credit.getText().toString());
                double credit3 = Double.parseDouble(course3credit.getText().toString());
                double credit4 = Double.parseDouble(course4credit.getText().toString());
                double credit5 = Double.parseDouble(course5credit.getText().toString());

                double creditNum = credit1 + credit2 + credit3 + credit4 + credit5;

                final TextView courseCreditResult = (TextView) findViewById(R.id.courseCreditResult);
                courseCreditResult.setText(String.valueOf(creditNum));

                int grade1 = Integer.parseInt(course1grade.getText().toString());
                int grade2 = Integer.parseInt(course2grade.getText().toString());
                int grade3 = Integer.parseInt(course3grade.getText().toString());
                int grade4 = Integer.parseInt(course4grade.getText().toString());
                int grade5 = Integer.parseInt(course5grade.getText().toString());

                int sum = ((grade1 + grade2 + grade3 + grade4 + grade5));
                int gradeNum = sum/totalCoursePoints;

                final TextView gpaResult = (TextView) findViewById(R.id.gpaResult);

                int count =0;
                if (count%2==0) {
                    if (course1grade.getText().toString().equals("") ||
                            course2grade.getText().toString().equals("") ||
                            course3grade.getText().toString().equals("") ||
                            course4grade.getText().toString().equals("") ||
                            course5grade.getText().toString().equals("")) {
                        gpaResult.setText("Please enter grades in the fields above");

                    }
                }
                 if (gradeNum <=100 && gradeNum>=80){
                     gpaResult.setText(String.valueOf(gradeNum));
                    gpaResult.setBackgroundColor(Color.GREEN);
                } else if (gradeNum <80 && gradeNum>60) {

                     gpaResult.setText(String.valueOf(gradeNum));
                     gpaResult.setBackgroundColor(Color.YELLOW);
                 }else if (gradeNum <=60){

                     gpaResult.setText(String.valueOf(gradeNum));
                     gpaResult.setBackgroundColor(Color.RED);
                 }




                btn_clear = (Button) findViewById(R.id.btn_clear);
                btn_clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String Text1 = course1credit.getText().toString();
                        course1credit.setText("");
                        String Text2 = course2credit.getText().toString();
                        course2credit.setText("");
                        String Text3 = course3credit.getText().toString();
                        course3credit.setText("");
                        String Text4 = course4credit.getText().toString();
                        course4credit.setText("");
                        String Text5 = course5credit.getText().toString();
                        course5credit.setText("");
                        String Text6 = course1grade.getText().toString();
                        course1grade.setText("");
                        String Text7 = course2grade.getText().toString();
                        course2grade.setText("");
                        String Text8 = course3grade.getText().toString();
                        course3grade.setText("");
                        String Text9 = course4grade.getText().toString();
                        course4grade.setText("");
                        String Text10 = course5grade.getText().toString();
                        course5grade.setText("");
                        String Text111 = gpaResult.getText().toString();
                        gpaResult.setText("");
                        gpaResult.setBackgroundColor(Color.TRANSPARENT);
                        String Text12 = courseCreditResult.getText().toString();
                        courseCreditResult.setText("");
                        courseCreditResult.setBackgroundColor(Color.TRANSPARENT);
                        Toast.makeText(getApplicationContext(), "Data has been cleared", Toast.LENGTH_LONG).show();

                    }
                });
            }

        });
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}