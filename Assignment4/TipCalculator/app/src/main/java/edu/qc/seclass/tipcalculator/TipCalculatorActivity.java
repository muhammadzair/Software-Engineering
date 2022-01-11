package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TipCalculatorActivity extends AppCompatActivity {

    //Create variables that will hold the user's input
    Button tipCompute;
    EditText checkAmount;
    EditText partySize;
    EditText tipVal15;
    EditText tipVal20;
    EditText tipVal25;
    EditText totalVal15;
    EditText totalVal20;
    EditText totalVal25;
    int partySizeNumber;
    int checkAmountNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Store the user's input
        checkAmount = (EditText) findViewById(R.id.checkAmountValue);
        partySize = (EditText) findViewById(R.id.partySizeValue);
        tipCompute = findViewById(R.id.buttonCompute);

        //Store the tip values
        tipVal15 = findViewById(R.id.fifteenPercentTipValue);
        tipVal20 = findViewById(R.id.twentyPercentTipValue);
        tipVal25 = findViewById(R.id.twentyfivePercentTipValue);

        //Store the total values
        totalVal15 = findViewById(R.id.fifteenPercentTotalValue);
        totalVal20 = findViewById(R.id.twentyPercentTotalValue);
        totalVal25 = findViewById(R.id.twentyfivePercentTotalValue);

        //On click listener for the submit button
        tipCompute.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //If either user input field is empty, return toast with error
                if(TextUtils.isEmpty(checkAmount.getText().toString()) || TextUtils.isEmpty(partySize.getText().toString())) {
                    renderToast("Empty or incorrect value(s)!");
                }
                else {
                    //Take the values the user entered
                    partySizeNumber = Integer.parseInt(partySize.getText().toString());
                    checkAmountNumber = Integer.parseInt(checkAmount.getText().toString());

                    //If either user input field is wrong, render the error toast
                    if (checkAmountNumber <= 0 || partySizeNumber <= 0) {
                        renderToast("Empty or incorrect value(s)!");
                    }
                    else {
                        //Calculate the tip that each person has to pay
                        int tipPerPerson15 = (int)(Math.ceil((double) (checkAmountNumber * .15) / partySizeNumber));
                        int tipPerPerson20 = (int)(Math.ceil((double) (checkAmountNumber * .20) / partySizeNumber));
                        int tipPerPerson25 = (int)(Math.ceil((double) (checkAmountNumber * .25) / partySizeNumber));

                        //Calculate the total that each person has to pay
                        int totalPerPerson15 = tipPerPerson15 + (int)(Math.ceil((double) checkAmountNumber  / partySizeNumber));
                        int totalPerPerson20 = tipPerPerson20 + (int)(Math.ceil((double) checkAmountNumber  / partySizeNumber));
                        int totalPerPerson25 = tipPerPerson25 + (int)(Math.ceil((double) checkAmountNumber  / partySizeNumber));

                        //Set the tip each person has to pay
                        tipVal15.setText(String.valueOf(tipPerPerson15));
                        tipVal20.setText(String.valueOf(tipPerPerson20));
                        tipVal25.setText(String.valueOf(tipPerPerson25));

                        //Set the total each person has to pay
                        totalVal15.setText(String.valueOf(totalPerPerson15));
                        totalVal20.setText(String.valueOf(totalPerPerson20));
                        totalVal25.setText(String.valueOf(totalPerPerson25));

                    }
                }
            }
        });
    }

    //Toast that will display error message
    private void renderToast (String text){
        Toast.makeText(TipCalculatorActivity.this,text, Toast.LENGTH_SHORT).show();
    }
}