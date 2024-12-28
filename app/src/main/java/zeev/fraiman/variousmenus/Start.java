package zeev.fraiman.variousmenus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button bOM=findViewById(R.id.bOM);
        bOM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go=new Intent(Start.this, ForOptionsMenu.class);
                startActivity(go);
            }
        });

        Button bPUM=findViewById(R.id.bPUM);
        bPUM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go=new Intent(Start.this, ForPopUpMenu.class);
                startActivity(go);
            }
        });

        Button bMFC=findViewById(R.id.bMFC);
        bMFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go=new Intent(Start.this, MenuFromClass.class);
                startActivity(go);
            }
        });

        Button bPUMFC=findViewById(R.id.bPUMFC);
        bPUMFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go=new Intent(Start.this, PopUpMenuFromClass.class);
                startActivity(go);
            }
        });
    }
}