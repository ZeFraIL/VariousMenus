package zeev.fraiman.variousmenus;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PopUpMenuFromClass extends AppCompatActivity {

    ImageView ivWolf;
    MenuManager menuManager;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_menu_from_class);

        context=this;
        menuManager=new MenuManager(context);
        ivWolf=findViewById(R.id.ivWolf);
        ivWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuManager.showPopupMenu(v);
            }
        });
    }
}

