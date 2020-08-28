package cr.ac.ucr.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    /*Button btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight, btn_nine, btn_zero,
    btn_rest, btn_sum, btn_equal, btn_delete;*/
    String show, operator, reserv;
    TextView resultView;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btn_one = (Button)findViewById(R.id.btn_one);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_five = (Button)findViewById(R.id.btn_five);
        btn_six = (Button)findViewById(R.id.btn_six);
        btn_seven = (Button)findViewById(R.id.btn_seven);
        btn_eight = (Button)findViewById(R.id.btn_eight);
        btn_nine = (Button)findViewById(R.id.btn_nine);
        btn_zero = (Button)findViewById(R.id.btn_zero);
        btn_rest = (Button)findViewById(R.id.btn_rest);
        btn_sum = (Button)findViewById(R.id.btn_sum);
        btn_equal = (Button)findViewById(R.id.btn_equal);
        btn_delete = (Button)findViewById(R.id.btn_delete);*/

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                //Log.d("myTag", "This is my message");
                show = resultView.getText().toString();
                show = show + "1";
                resultView.setText(show);
                break;
            case R.id.btn_two:
                show = resultView.getText().toString();
                show = show + "2";
                resultView.setText(show);
                break;
            case R.id.btn_three:
                show = resultView.getText().toString();
                show = show + "3";
                resultView.setText(show);
                break;
            case R.id.btn_four:
                show = resultView.getText().toString();
                show = show + "4";
                resultView.setText(show);
                break;
            case R.id.btn_five:
                show = resultView.getText().toString();
                show = show + "5";
                resultView.setText(show);
                break;
            case R.id.btn_six:
                show = resultView.getText().toString();
                show = show + "6";
                resultView.setText(show);
                break;
            case R.id.btn_seven:
                show = resultView.getText().toString();
                show = show + "7";
                resultView.setText(show);
                break;
            case R.id.btn_eight:
                show = resultView.getText().toString();
                show = show + "8";
                resultView.setText(show);
                break;
            case R.id.btn_nine:
                show = resultView.getText().toString();
                show = show + "9";
                resultView.setText(show);
                break;
            case R.id.btn_zero:
                show = resultView.getText().toString();
                show = show + "0";
                resultView.setText(show);
                break;

            case R.id.btn_rest:
                reserv = resultView.getText().toString();
                operator = "-";
                resultView.setText("");
                break;
            case R.id.btn_sum:
                reserv = resultView.getText().toString();
                operator = "+";
                resultView.setText("");
                break;
            case R.id.btn_equal:
                show = resultView.getText().toString();
                show = show + "1";
                if(operator.equals("-")){
                    result = Double.parseDouble(reserv) - Double.parseDouble(resultView.getText().toString());
                    resultView.setText(String.valueOf(result));
                }
                if(operator.equals("+")){
                    result = Double.parseDouble(reserv) + Double.parseDouble(resultView.getText().toString());
                    resultView.setText(String.valueOf(result));
                }
                if(operator.equals("*")){
                    result = Double.parseDouble(reserv) * Double.parseDouble(resultView.getText().toString());
                    resultView.setText(String.valueOf(result));
                }
                if(operator.equals("/")){
                    result = Double.parseDouble(reserv) / Double.parseDouble(resultView.getText().toString());
                    resultView.setText(String.valueOf(result));
                }
                break;
            case R.id.btn_delete:
                show = resultView.getText().toString();
                show = show.substring(0,show.length()-1);
                resultView.setText(show);
                break;


            default:
                break;


        }
    }

}