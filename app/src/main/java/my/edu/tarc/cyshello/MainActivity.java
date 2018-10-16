package my.edu.tarc.cyshello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        super.onCreate(savedInstanceState);

        //To display UI
        //R = resource class
        //layout = foulder name
        setContentView(R.layout.activity_main);
        //linking UI o program
        textViewmsg =findViewById(R.id.textViewMessage);

    }
    //view = class v = an instance of a class
    public void showMessage(View v){

        textViewmsg.setText("Hello, LMAO CHAN YONG SHENG");
    }

    public void clearScreen(View v){
        textViewmsg.setText("");
    }
}
