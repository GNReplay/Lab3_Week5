package hcmute.edu.vn.lab3_week5;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.Nullable;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("my_intend_thread");
    }

    @Override
    public int onStartCommand( Intent intent, int flags, int startId) {
        Toast.makeText(MyIntentService.this, "Service Started", Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(MyIntentService.this, "Service Destroyed", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this){
            try{
                wait(20000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}