package serpis.ed.asumav2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAddOnClick(View view) {
        Log.i(TAG, "buttonAddOnClick");
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        TextView textViewResult = findViewById(R.id.textViewResult);
        BigDecimal number1 = new BigDecimal(editText1.getText().toString());
        BigDecimal number2 = new BigDecimal(editText2.getText().toString());
        BigDecimal result = number1.add(number2);
        textViewResult.setText(result.toString());
    }

    public void buttonSubtractOnClick(View view) {
        Log.i(TAG, "buttonSubtractOnClick");
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        TextView textViewResult = findViewById(R.id.textViewResult);
        BigDecimal number1 = new BigDecimal(editText1.getText().toString());
        BigDecimal number2 = new BigDecimal(editText2.getText().toString());
        BigDecimal result = number1.subtract(number2);
        textViewResult.setText(result.toString());
    }
}
