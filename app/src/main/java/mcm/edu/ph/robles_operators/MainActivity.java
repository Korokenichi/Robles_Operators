package mcm.edu.ph.robles_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayText);

        int birthYear = 2002;
        int birthMonth = 11;
        int birthDay = 5;

        int currentYear = 2021;
        int currentMonth = 3;
        int currentDay = 2;

        int ageInYears, ageInMonths, ageInDays;

        if (birthMonth > currentMonth) {
            currentMonth += 12;
            currentYear -= 1;
        }
        if (birthDay > currentDay) {
            currentDay += 30;
            currentMonth -= 1;
        }


        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My Precise age is \n"+String.valueOf(ageInYears)+
                " Years, " +String.valueOf(ageInMonths)+
                " Months, and "+String.valueOf(ageInDays)+
                " Days.");
    }
}