package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import defpackage.bpj;
import defpackage.cij;
import defpackage.cpn;
import defpackage.cpo;
import defpackage.cwk;
import defpackage.dwb;
import defpackage.dwj;
import defpackage.dyj;
import defpackage.eao;
import defpackage.eaw;
import defpackage.eax;
import defpackage.ebm;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemForegroundService extends cwk implements eaw {
    public static final String a = dwj.a("SystemFgService");
    eax b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        eax eaxVar = new eax(getApplicationContext());
        this.b = eaxVar;
        if (eaxVar.h == null) {
            eaxVar.h = this;
        } else {
            dwj.b();
            Log.e(eax.a, "A callback already exists.");
        }
    }

    @Override // defpackage.eaw
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.eaw
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.eaw
    public final void c(int i, int i2, Notification notification) {
        cpo.l(this, i, notification, i2);
    }

    @Override // defpackage.eaw
    public final void d() {
        this.d = true;
        dwj.b();
        stopForeground(true);
        stopSelf();
    }

    @Override // defpackage.cwk, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.cwk, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            dwj.b();
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        eax eaxVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            dwj.b();
            Objects.toString(intent);
            intent.toString();
            eaxVar.j.f(new eao((Object) eaxVar, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), 2, (byte[]) null));
            eaxVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            eaxVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            dwj.b();
            eaw eawVar = eaxVar.h;
            if (eawVar == null) {
                return 3;
            }
            eawVar.d();
            return 3;
        }
        dwj.b();
        Objects.toString(intent);
        intent.toString();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        dyj dyjVar = eaxVar.b;
        UUID uuidFromString = UUID.fromString(stringExtra);
        uuidFromString.getClass();
        cij cijVar = dyjVar.c.h;
        ?? r6 = dyjVar.k.b;
        r6.getClass();
        cpn.y(cijVar, "CancelWorkById", r6, new bpj(dyjVar, uuidFromString, 9));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
    }

    public final void onTimeout(int i, int i2) {
        eax eaxVar = this.b;
        dwj.b();
        for (Map.Entry entry : eaxVar.e.entrySet()) {
            if (((dwb) entry.getValue()).b == i2) {
                eaxVar.b.d((ebm) entry.getKey(), -128);
            }
        }
        eaw eawVar = eaxVar.h;
        if (eawVar != null) {
            eawVar.d();
        }
    }
}
