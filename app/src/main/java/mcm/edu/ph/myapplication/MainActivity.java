package mcm.edu.ph.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget. EditText;
import android.widget. TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtVar1, txtVar2;
    Button btnAdd, btnSubtract, btnMultiply, btnModulo, btnDivide;
    TextView txtAnswer;

    double Var1, var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnAdd = findViewById (R.id.btnAdd);
        btnSubtract = findViewById (R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById (R.id.btnModulo);



        //Answer text view
        txtAnswer = findViewById(R.id.txtAnswer);


        

        //creating button on-click listeners to make the buttons work
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener (this);
    }
    @Override
    public void onClick(View v) { //this method is responsible for doing functions for on-click events

        //variable text boxes
        txtVar1 = findViewById(R.id.txtVariable1);
        txtVar2 = findViewById(R.id.txtVariable2);


        //RAW text --> String --> Double

        Var1 = Double.parseDouble(txtVar1.getText().toString());
        var2 = Double.parseDouble(txtVar2.getText().toString());


        switch(v.getId()){
            case R.id.btnAdd:
                //Double -- > String
                txtAnswer.setText(Double.toString( Var1 + var2));

                break;
            case R.id.btnSubtract:
                txtAnswer.setText(Double.toString( Var1 - var2));

                break;
            case R.id.btnMultiply:
                txtAnswer.setText(Double.toString( Var1 * var2));

                break;
            case R.id.btnDivide:
                txtAnswer.setText (Double.toString( Var1 / var2));

                break;
            case R.id.btnModulo:
                txtAnswer.setText(Double.toString(Var1 % var2));

                break;
        }


    }


}