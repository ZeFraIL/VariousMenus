package zeev.fraiman.variousmenus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

public class ForOptionsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_options_menu);


    }

    private void sendSMS() {

    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.total,menu);
        if (menu instanceof MenuBuilder)  {
            MenuBuilder mb=(MenuBuilder) menu;
            mb.setOptionalIconsVisible(true);
        }
        MenuItem menuItem=menu.findItem(R.id.restart);
        menuItem.setVisible(false);
        menu.add(0,1,0,"Send SMS").setIcon(R.drawable.ic_sms);
        MenuItem menuItem1=menu.add(0,1,0,"Send SMS");
        menuItem1.setIcon(R.drawable.ic_sms);
        menu.add(0,2,0,"Send E-mail");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if (id==R.id.restart)  {
            Intent go=new Intent(ForOptionsMenu.this, Start.class);
            startActivity(go);
        }
        if (id==R.id.back)  {
            finish();
        }
        if (id==R.id.exit)  {
            finishAffinity();
        }
        if (id==1)  {
            sendSMS();
        }
        return super.onOptionsItemSelected(item);
    }

}