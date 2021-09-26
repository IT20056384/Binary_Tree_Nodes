package com.example.studentsattendence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.naishadhparmar.zcustomcalendar.CustomCalendar;
import org.naishadhparmar.zcustomcalendar.Property;

import java.util.Calendar;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    CustomCalendar customCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCalendar=findViewById(R.id.customcal);
        HashMap<Object, Property>hashMap=new HashMap<>();

        //persent
        Property presentProp=new Property();
        presentProp.layoutResource=R.layout.present;
        presentProp.dateTextViewResource=R.id.text1;
        hashMap.put("present",presentProp);

        //absent
        Property absentProp=new Property();
        presentProp.layoutResource=R.layout.absent;
        presentProp.dateTextViewResource=R.id.text1;
        hashMap.put("absent",absentProp);

        //current
        Property currentProp=new Property();
        presentProp.layoutResource=R.layout.current;
        presentProp.dateTextViewResource=R.id.text1;
        hashMap.put("current",currentProp);

         //default
        Property defaultProp=new Property();
        presentProp.layoutResource=R.layout.default_vi;
        presentProp.dateTextViewResource=R.id.text1;
        hashMap.put("default",defaultProp);


        customCalendar.setMapDescToProp(hashMap);
        HashMap<Integer,Object> dateMap=new HashMap<>();
        Calendar calendar=Calendar.getInstance();
        dateMap.put(calendar.get(Calendar.DAY_OF_MONTH),"current");
        dateMap.put(2,"present");
        dateMap.put(3,"present");
        dateMap.put(1,"absent");
        dateMap.put(4,"present");

      //customCalendar.setDate(calendar,dateMap);

        
    }
}