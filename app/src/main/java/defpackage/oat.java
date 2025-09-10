package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oat implements ServiceConnection {
    public volatile boolean a;
    public final /* synthetic */ oau b;
    public volatile obk c;

    protected oat(oau oauVar) {
        this.b = oauVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ojl.at("AnalyticsServiceConnection.onServiceDisconnected");
        this.b.e().b(new nzq(this, componentName, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #1 {all -> 0x0045, blocks: (B:5:0x0008, B:10:0x0015, B:12:0x0021, B:14:0x002b, B:16:0x0033, B:25:0x0051, B:27:0x0061, B:29:0x0065, B:30:0x007a, B:23:0x0048, B:15:0x002e, B:18:0x003c), top: B:41:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "AnalyticsServiceConnection.onServiceConnected"
            defpackage.ojl.at(r4)
            monitor-enter(r3)
            if (r5 != 0) goto L14
            oau r4 = r3.b     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "Service connected with null binder"
            r4.n(r5)     // Catch: java.lang.Throwable -> L45
            r3.notifyAll()     // Catch: java.lang.Throwable -> L85
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L85
            return
        L14:
            r4 = 0
            java.lang.String r0 = r5.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            if (r1 == 0) goto L3c
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            boolean r1 = r0 instanceof defpackage.obk     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            if (r1 == 0) goto L2e
            obk r0 = (defpackage.obk) r0     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            goto L33
        L2e:
            obk r0 = new obk     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
        L33:
            oau r5 = r3.b     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48
            r1 = 0
            java.lang.String r1 = com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd.NfZl     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48
            r5.q(r1)     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48
            goto L4f
        L3c:
            oau r5 = r3.b     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r5.o(r1, r0)     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L47
            r0 = r4
            goto L4f
        L45:
            r4 = move-exception
            goto L81
        L47:
            r0 = r4
        L48:
            oau r5 = r3.b     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r5.n(r1)     // Catch: java.lang.Throwable -> L45
        L4f:
            if (r0 != 0) goto L61
            ojf r4 = defpackage.ojf.a()     // Catch: java.lang.Throwable -> L45 java.lang.IllegalArgumentException -> L7c
            oau r5 = r3.b     // Catch: java.lang.Throwable -> L45 java.lang.IllegalArgumentException -> L7c
            android.content.Context r0 = r5.d()     // Catch: java.lang.Throwable -> L45 java.lang.IllegalArgumentException -> L7c
            oat r5 = r5.a     // Catch: java.lang.Throwable -> L45 java.lang.IllegalArgumentException -> L7c
            r4.b(r0, r5)     // Catch: java.lang.Throwable -> L45 java.lang.IllegalArgumentException -> L7c
            goto L7c
        L61:
            boolean r5 = r3.a     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L7a
            oau r5 = r3.b     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r5.t(r1)     // Catch: java.lang.Throwable -> L45
            oak r5 = r5.e()     // Catch: java.lang.Throwable -> L45
            nzq r1 = new nzq     // Catch: java.lang.Throwable -> L45
            r2 = 6
            r1.<init>(r3, r0, r2, r4)     // Catch: java.lang.Throwable -> L45
            r5.b(r1)     // Catch: java.lang.Throwable -> L45
            goto L7c
        L7a:
            r3.c = r0     // Catch: java.lang.Throwable -> L45
        L7c:
            r3.notifyAll()     // Catch: java.lang.Throwable -> L85
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L85
            return
        L81:
            r3.notifyAll()     // Catch: java.lang.Throwable -> L85
            throw r4     // Catch: java.lang.Throwable -> L85
        L85:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L85
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oat.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
