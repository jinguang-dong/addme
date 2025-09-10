package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sjq extends sjg {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile sif g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public sjq(String str) {
        super(str);
        if (a || b) {
            this.g = new sjh().a(a());
            return;
        }
        if (!c) {
            this.g = null;
            return;
        }
        sjs sjsVar = sju.c;
        String str2 = sjsVar.a;
        boolean z = sjsVar.b;
        int i = sjsVar.g;
        this.g = new sjs(str2, z, 2, Level.OFF, sjsVar.d, sjsVar.e, sjsVar.f).a(a());
    }

    public static void e() {
        while (true) {
            sjq sjqVar = (sjq) sjo.a.poll();
            if (sjqVar == null) {
                f();
                return;
            }
            sjqVar.g = ((sji) d.get()).a(sjqVar.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, sid] */
    private static void f() {
        while (true) {
            sjp sjpVar = (sjp) f.poll();
            if (sjpVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = sjpVar.b;
            Object obj = sjpVar.a;
            if (!r1.K()) {
                if (((sif) obj).d(r1.o())) {
                }
            }
            ((sif) obj).c(r1);
        }
    }

    @Override // defpackage.sjg, defpackage.sif
    public final void b(RuntimeException runtimeException, sid sidVar) {
        if (this.g != null) {
            this.g.b(runtimeException, sidVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.sif
    public final void c(sid sidVar) {
        if (this.g != null) {
            this.g.c(sidVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new sjp((sif) this, sidVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.sif
    public final boolean d(Level level) {
        return this.g == null || this.g.d(level);
    }
}
