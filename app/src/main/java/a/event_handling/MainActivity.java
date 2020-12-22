package a.event_handling;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.button_click:
                Intent intent = new Intent(this, ButtonClick.class);
                startActivity(intent);
                break;
            case R.id.motion_event:
                intent = new Intent(this, MotionEvent.class);
                startActivity(intent);
                break;
            case R.id.common_gestures:
                intent = new Intent(this, CommonGestures.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
