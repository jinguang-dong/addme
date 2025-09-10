package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cwk extends Service implements cwh {
    private final AmbientDelegate a = new AmbientDelegate((cwh) this);

    @Override // defpackage.cwh
    public final cwc getLifecycle() {
        return (cwc) this.a.b;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.q(cwa.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.q(cwa.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        AmbientDelegate ambientDelegate = this.a;
        ambientDelegate.q(cwa.ON_STOP);
        ambientDelegate.q(cwa.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @ueo
    public final void onStart(Intent intent, int i) {
        this.a.q(cwa.ON_START);
        super.onStart(intent, i);
    }
}
