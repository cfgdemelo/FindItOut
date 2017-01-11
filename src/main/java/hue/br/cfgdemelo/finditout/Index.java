package hue.br.cfgdemelo.finditout;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Index extends AppCompatActivity {

    private View wat;
    private int clickTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_index);

        wat = findViewById(R.id.wat);

        wat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                click();
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }



    public String advice_1 = String.valueOf(R.string.advice1);
    public String advice_2 = String.valueOf(R.string.advice2);
    public String advice_3 = String.valueOf(R.string.advice3);

    private void click(){
        clickTimes++;
        if (clickTimes == 12){
            Toast.makeText(Index.this, advice_1, Toast.LENGTH_SHORT).show();
        }else if(clickTimes == 24){
            Toast.makeText(Index.this, advice_2, Toast.LENGTH_SHORT).show();
        }else if(clickTimes == 36){
            Toast.makeText(Index.this, advice_3, Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
