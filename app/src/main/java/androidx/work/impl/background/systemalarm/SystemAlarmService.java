package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import defpackage.cwk;
import defpackage.dwj;
import defpackage.dzh;
import defpackage.dzj;
import defpackage.edd;
import defpackage.ede;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemAlarmService extends cwk implements dzh {
    private dzj a;
    private boolean b;

    static {
        dwj.a("SystemAlarmService");
    }

    private final void b() {
        dzj dzjVar = new dzj(this);
        this.a = dzjVar;
        if (dzjVar.i == null) {
            dzjVar.i = this;
        } else {
            dwj.b();
            Log.e(dzj.a, "A completion listener for SystemAlarmDispatcher already exists.");
        }
    }

    @Override // defpackage.dzh
    public final void a() {
        this.b = true;
        dwj.b();
        String str = edd.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (ede.a) {
            linkedHashMap.putAll(ede.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                dwj.b();
                Log.w(edd.a, "WakeLock held for ".concat(String.valueOf(str2)));
            }
        }
        stopSelf();
    }

    @Override // defpackage.cwk, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.b = false;
    }

    @Override // defpackage.cwk, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            dwj.b();
            this.a.b();
            b();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.a.d(intent, i2);
        return 3;
    }
}
