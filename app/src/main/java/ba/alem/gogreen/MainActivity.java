package ba.alem.gogreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton cameraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraButton = findViewById(R.id.camera);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });
    }

    public void OnPrviklik(View v) {
        Intent i = new Intent(getApplicationContext(), Education.class);

        startActivity(i);
    }

    public void OnDrugiklik(View v) {
        Intent i = new Intent(getApplicationContext(),EcoMapsActivity.class);

        startActivity(i);
    }

    public void OnTreciklik(View v) {
        Intent i = new Intent(getApplicationContext(), ZeleniKalendar.class);
        startActivity(i);

    }
}
