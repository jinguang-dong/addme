package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogd implements Handler.Callback {
    public static ogd d;
    public final Context g;
    public final odn h;
    public final Handler n;
    public volatile boolean o;
    public final pit p;
    private oiv r;
    private ojd t;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    private static volatile boolean q = false;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final Map k = new ConcurrentHashMap(5, 0.75f, 1);
    public ofx l = null;
    public final Set m = new yf();
    private final Set s = new yf();

    private ogd(Context context, Looper looper, odn odnVar) {
        this.o = true;
        this.g = context;
        ols olsVar = new ols(looper, this);
        this.n = olsVar;
        this.h = odnVar;
        this.p = new pit(odnVar);
        if (oji.a(context)) {
            this.o = false;
        }
        olsVar.sendMessage(olsVar.obtainMessage(6));
    }

    public static Status a(ofl oflVar, odj odjVar) {
        return new Status(17, "API: " + oflVar.a() + " is not available on this device. Connection failed with: " + String.valueOf(odjVar), odjVar.d, odjVar);
    }

    public static ogd c(Context context) {
        ogd ogdVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (ohz.a) {
                    handlerThread = ohz.b;
                    if (handlerThread == null) {
                        ohz.b = new HandlerThread("GoogleApiHandler", 9);
                        ohz.b.start();
                        handlerThread = ohz.b;
                    }
                }
                d = new ogd(context.getApplicationContext(), handlerThread.getLooper(), odn.a);
            }
            ogdVar = d;
        }
        return ogdVar;
    }

    private final oga j(oet oetVar) {
        Map map = this.k;
        ofl oflVar = oetVar.e;
        oga ogaVar = (oga) map.get(oflVar);
        if (ogaVar == null) {
            ogaVar = new oga(this, oetVar);
            map.put(oflVar, ogaVar);
        }
        if (ogaVar.p()) {
            this.s.add(oflVar);
        }
        ogaVar.d();
        return ogaVar;
    }

    private final void k() {
        oiv oivVar = this.r;
        if (oivVar != null) {
            if (oivVar.a > 0 || g()) {
                l().a(oivVar);
            }
            this.r = null;
        }
    }

    private final ojd l() {
        if (this.t == null) {
            this.t = new ojd(this.g, oiw.b);
        }
        return this.t;
    }

    final oga b(ofl oflVar) {
        return (oga) this.k.get(oflVar);
    }

    public final void d(odj odjVar, int i) {
        if (h(odjVar, i)) {
            return;
        }
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(5, i, 0, odjVar));
    }

    public final void e() {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(ofx ofxVar) {
        synchronized (c) {
            if (this.l != ofxVar) {
                this.l = ofxVar;
                this.m.clear();
            }
            this.m.addAll(ofxVar.e);
        }
    }

    final boolean g() {
        if (this.f) {
            return false;
        }
        oit oitVar = ois.a().a;
        if (oitVar != null && !oitVar.b) {
            return false;
        }
        int i = this.p.i(203400000);
        return i == -1 || i == 0;
    }

    final boolean h(odj odjVar, int i) {
        Context context = this.g;
        if (ojl.s(context)) {
            return false;
        }
        odn odnVar = this.h;
        PendingIntent pendingIntentH = odjVar.b() ? odjVar.d : odnVar.h(context, odjVar.c, null);
        if (pendingIntentH == null) {
            return false;
        }
        odnVar.d(context, odjVar.c, lpa.v(context, GoogleApiActivity.a(context, pendingIntentH, i, true), 167772160));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.pfl r9, int r10, defpackage.oet r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L75
            ofl r3 = r11.e
            boolean r11 = r8.g()
            r0 = 0
            if (r11 != 0) goto Ld
        Lb:
            r1 = r8
            goto L62
        Ld:
            ois r11 = defpackage.ois.a()
            oit r11 = r11.a
            r1 = 1
            if (r11 == 0) goto L48
            boolean r2 = r11.b
            if (r2 != 0) goto L1b
            goto Lb
        L1b:
            boolean r11 = r11.c
            oga r2 = r8.b(r3)
            if (r2 == 0) goto L47
            oeo r4 = r2.b
            boolean r5 = r4 instanceof defpackage.ohm
            if (r5 != 0) goto L2a
            goto Lb
        L2a:
            ohm r4 = (defpackage.ohm) r4
            boolean r5 = r4.C()
            if (r5 == 0) goto L47
            boolean r5 = r4.l()
            if (r5 != 0) goto L47
            ohs r11 = defpackage.ogo.b(r2, r4, r10)
            if (r11 != 0) goto L3f
            goto Lb
        L3f:
            int r0 = r2.j
            int r0 = r0 + r1
            r2.j = r0
            boolean r1 = r11.c
            goto L48
        L47:
            r1 = r11
        L48:
            ogo r0 = new ogo
            r4 = 0
            if (r1 == 0) goto L53
            long r6 = java.lang.System.currentTimeMillis()
            goto L54
        L53:
            r6 = r4
        L54:
            if (r1 == 0) goto L5a
            long r4 = android.os.SystemClock.elapsedRealtime()
        L5a:
            r1 = r6
            r6 = r4
            r4 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
        L62:
            if (r0 == 0) goto L75
            java.lang.Object r8 = r9.a
            android.os.Handler r9 = r1.n
            r9.getClass()
            ofz r10 = new ofz
            r10.<init>()
            oor r8 = (defpackage.oor) r8
            r8.i(r10, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogd.i(pfl, int, oet):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02b7  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r10) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogd.handleMessage(android.os.Message):boolean");
    }
}
