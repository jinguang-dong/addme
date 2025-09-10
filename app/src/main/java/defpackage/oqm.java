package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class oqm extends Service implements oqe, opw {
    public oqk a;
    public Intent b;
    public boolean d;
    private ComponentName f;
    private IBinder g;
    private Looper h;
    public final Object c = new Object();
    public final orb e = new orb(new nwj());

    public void a(osy osyVar) {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IBinder onBind(android.content.Intent r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L3
            goto L5f
        L3:
            java.lang.String r2 = r2.getAction()
            if (r2 == 0) goto L5f
            int r0 = r2.hashCode()
            switch(r0) {
                case -1487371046: goto L4d;
                case -1140095138: goto L43;
                case -786751258: goto L39;
                case 705066793: goto L2f;
                case 915816236: goto L25;
                case 1003809169: goto L1b;
                case 1460975593: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r0 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            r2 = 0
            goto L58
        L1b:
            java.lang.String r0 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            r2 = 3
            goto L58
        L25:
            java.lang.String r0 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            r2 = 1
            goto L58
        L2f:
            java.lang.String r0 = "com.google.android.gms.wearable.NODE_MIGRATED"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            r2 = 2
            goto L58
        L39:
            java.lang.String r0 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            r2 = 5
            goto L58
        L43:
            java.lang.String r0 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            r2 = 4
            goto L58
        L4d:
            java.lang.String r0 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            r2 = 6
            goto L58
        L57:
            r2 = -1
        L58:
            switch(r2) {
                case 0: goto L5c;
                case 1: goto L5c;
                case 2: goto L5c;
                case 3: goto L5c;
                case 4: goto L5c;
                case 5: goto L5c;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L5f
        L5c:
            android.os.IBinder r1 = r1.g
            return r1
        L5f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqm.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new ComponentName(this, getClass().getName());
        if (this.h == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.h = handlerThread.getLooper();
        }
        this.a = new oqk(this, this.h);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.b = intent;
        intent.setComponent(this.f);
        this.g = new oql(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        synchronized (this.c) {
            this.d = true;
            oqk oqkVar = this.a;
            if (oqkVar == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.f));
            }
            oqkVar.getLooper().quit();
            oqkVar.b();
        }
        super.onDestroy();
    }

    @Override // defpackage.opw
    public final void b(ord ordVar) {
    }

    @Override // defpackage.opw
    public final void c(ord ordVar) {
    }

    @Override // defpackage.opw
    public final void d(ord ordVar) {
    }

    @Override // defpackage.opw
    public final void e(ord ordVar) {
    }
}
