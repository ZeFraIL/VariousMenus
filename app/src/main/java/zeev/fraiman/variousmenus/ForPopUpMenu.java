package zeev.fraiman.variousmenus;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ForPopUpMenu extends AppCompatActivity {

    TextView tvPUM;
    Context context;
    LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_pop_up_menu);

        context=this;
        tvPUM=findViewById(R.id.tvPUM);
        main=findViewById(R.id.main);
        tvPUM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu();
            }
        });

    }


    private void showPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(context, tvPUM);
        popupMenu.getMenuInflater().inflate(R.menu.total, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id=item.getItemId();

                if (id==R.id.restart)  {

                }
                if (id==R.id.back)  {
                    finish();
                }
                return false;
            }
        });
        popupMenu.show();
    }
}