package zeev.fraiman.variousmenus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

public class MenuManager {
    private Context context;

    public MenuManager (Context context) {
        this.context = context;
    }

    @SuppressLint("RestrictedApi")
    public boolean onCreateOptionsMenu(Menu menu) {
        ((AppCompatActivity) context).getMenuInflater().inflate(R.menu.total, menu);
        if (menu instanceof MenuBuilder)  {
            MenuBuilder mb = (MenuBuilder) menu;
            mb.setOptionalIconsVisible(true);
        }
        menu.add(0, 1, 0, "Send SMS");
        menu.add(0, 2, 0, "Send E-mail");
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.restart)  {
            Intent go = new Intent(context, Start.class);
            context.startActivity(go);
        }
        if (id == R.id.back)  {
            ((AppCompatActivity) context).finish();
        }
        if (id == R.id.exit)  {
            ((AppCompatActivity) context).finishAffinity();
        }
        if (id == 1)  {
            sendSMS();
        }
        return true;
    }

    public void showPopupMenu(View anchorView) {
        PopupMenu popupMenu = new PopupMenu(context, anchorView);
        popupMenu.getMenuInflater().inflate(R.menu.total, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.restart) {
                    Intent go = new Intent(context, Start.class);
                    context.startActivity(go);
                    return true;
                }
                if (id == R.id.back) {
                    ((AppCompatActivity) context).finish();
                    return true;
                }
                return false;
            }
        });
        popupMenu.show();
    }


    private void sendSMS() {

    }
}
