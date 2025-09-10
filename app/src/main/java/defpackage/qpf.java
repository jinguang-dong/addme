package defpackage;

import android.app.Application;
import android.content.Context;
import android.hardware.HardwareBuffer;
import android.util.Log;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpf {
    public final Object a;

    public qpf(HardwareBuffer hardwareBuffer) {
        this.a = hardwareBuffer;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    private final synchronized java.lang.Object m(defpackage.peo r12, defpackage.pag r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L4c
            java.lang.Object r2 = r13.a()     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r11.a     // Catch: java.lang.Throwable -> L95
            wp r4 = new wp     // Catch: java.lang.Throwable -> L95
            r5 = 11
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L95
            java.util.Collections.sort(r3, r4)     // Catch: java.lang.Throwable -> L95
            r4 = r1
        L16:
            if (r2 != 0) goto L93
            if (r4 == 0) goto L93
            r4 = r3
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L95
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L95
            r5 = r0
            r6 = r5
        L23:
            if (r6 >= r4) goto L4a
            r7 = r3
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L95
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L95
            pfd r7 = (defpackage.pfd) r7     // Catch: java.lang.Throwable -> L95
            pgb r8 = r7.i()     // Catch: java.lang.Throwable -> L95
            scn r8 = r8.c     // Catch: java.lang.Throwable -> L95
            boolean r8 = r8.contains(r12)     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L47
            boolean r7 = r7.u()     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L47
            java.lang.Object r2 = r13.a()     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L93
            r5 = r1
        L47:
            int r6 = r6 + 1
            goto L23
        L4a:
            r4 = r5
            goto L16
        L4c:
            java.lang.Object r12 = r13.a()     // Catch: java.lang.Throwable -> L95
            r2 = r12
            r12 = r1
        L52:
            if (r2 != 0) goto L93
            if (r12 == 0) goto L93
            java.lang.Object r12 = r11.a     // Catch: java.lang.Throwable -> L95
            cbi r3 = defpackage.cbi.e     // Catch: java.lang.Throwable -> L95
            java.util.Collections.sort(r12, r3)     // Catch: java.lang.Throwable -> L95
            r3 = r12
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L95
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L95
            r5 = r0
            r4 = r2
            r2 = r5
        L67:
            if (r5 >= r3) goto L90
            r6 = r12
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L95
            pfd r6 = (defpackage.pfd) r6     // Catch: java.lang.Throwable -> L95
            long r7 = r6.r()     // Catch: java.lang.Throwable -> L95
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L8d
            boolean r6 = r6.u()     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L8d
            java.lang.Object r2 = r13.a()     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L8b
            r4 = r2
            r2 = r1
            goto L8d
        L8b:
            monitor-exit(r11)
            return r2
        L8d:
            int r5 = r5 + 1
            goto L67
        L90:
            r12 = r2
            r2 = r4
            goto L52
        L93:
            monitor-exit(r11)
            return r2
        L95:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L95
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpf.m(peo, pag):java.lang.Object");
    }

    public final void a(qpe qpeVar) {
        qpeVar.getClass();
        Object obj = ((qqe) this.a).a;
        int i = qpg.c;
        ((qpg) obj).a.add(qpeVar);
    }

    public final void b(qpe qpeVar) {
        Object obj = ((qqe) this.a).a;
        int i = qpg.c;
        ((qpg) obj).a.remove(qpeVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uem] */
    public final qvl c(float f) {
        Random random = (Random) this.a.a();
        random.getClass();
        return new qvl(random, f);
    }

    public final String d(String str) {
        try {
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            String str2 = (String) ((Method) obj).invoke(null, str, null);
            if ("".equals(str2)) {
                return null;
            }
            return str2;
        } catch (Exception e) {
            Log.e("CAM_SystemProperties", "get error", e);
            return null;
        }
    }

    public final void e() {
        ((HardwareBuffer) this.a).close();
    }

    public final void f(byte[] bArr, int i, int i2, int i3) {
        ReadHardwareBufferJniFunctions.readHardwareBuffer((HardwareBuffer) this.a, bArr, i, i2, i3);
    }

    public final paq g() {
        return ((pmg) this.a).c();
    }

    public final synchronized Object h(pag pagVar) {
        return m(null, pagVar);
    }

    public final synchronized Object i(peo peoVar, pag pagVar) {
        return m(peoVar, pagVar);
    }

    public final synchronized void j(pfd pfdVar) {
        ((ArrayList) this.a).add(pfdVar);
    }

    public final synchronized void k(pfd pfdVar) {
        ((ArrayList) this.a).remove(pfdVar);
    }

    public final synchronized void l(peo peoVar) {
        m(peoVar, new pag() { // from class: pgh
            @Override // defpackage.pag
            public final Object a() {
                return null;
            }
        });
    }

    public qpf(uem uemVar, byte[] bArr) {
        this.a = uemVar;
    }

    public qpf() {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("set", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
            } catch (Exception e) {
                throw new IllegalStateException("Unable to reflect SystemProperties.", e);
            }
        } finally {
            this.a = method;
        }
    }

    public qpf(uem uemVar) {
        uemVar.getClass();
        this.a = uemVar;
    }

    public qpf(byte[] bArr) {
        this.a = new ArrayList();
    }

    public qpf(int i) {
        this.a = new pmg(new pmj(i));
    }

    public qpf(rwc rwcVar) {
        this.a = (prb) rwcVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.ComponentCallbacks, java.lang.Object] */
    public qpf(Context context, qqe qqeVar) {
        this.a = qqeVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(qqeVar.a);
        application.registerComponentCallbacks(qqeVar.a);
    }
}
