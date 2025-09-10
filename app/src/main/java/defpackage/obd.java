package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class obd {
    private static volatile Handler a;
    public final oar b;
    public final Runnable c = new ntd(this, 18, null);
    public volatile long d;

    public obd(oar oarVar) {
        this.b = oarVar;
    }

    public abstract void a();

    public final Handler b() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (obd.class) {
            if (a == null) {
                a = new ols(this.b.a.getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    public final void c() {
        this.d = 0L;
        b().removeCallbacks(this.c);
    }

    public final void d(long j) {
        c();
        if (j >= 0) {
            this.d = System.currentTimeMillis();
            if (b().postDelayed(this.c, j)) {
                return;
            }
            this.b.d().o("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean e() {
        return this.d != 0;
    }
}
