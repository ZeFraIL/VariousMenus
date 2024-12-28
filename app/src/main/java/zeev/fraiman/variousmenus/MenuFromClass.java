package zeev.fraiman.variousmenus;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuFromClass extends AppCompatActivity {

    Context context=this;
    private MenuManager menuManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_from_class);

        menuManager=new MenuManager(context);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return menuManager.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return menuManager.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}