package defpackage;

import android.content.Context;
import android.os.SystemClock;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omv implements AutoCloseable {
    private final int c;
    private final Context d;
    private final float e;
    private int f = 13;
    private final long a = System.currentTimeMillis();
    private final long b = SystemClock.uptimeMillis();

    public omv(Context context, int i, float f) {
        this.c = i;
        this.d = context;
        this.e = f;
    }

    public final void a() {
        this.f = 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.d;
        if (omu.a == null) {
            synchronized (omu.b) {
                if (omu.a == null) {
                    omu.a = new omu(context);
                }
            }
        }
        int i = this.c;
        omu omuVar = omu.a;
        int i2 = this.f;
        long j = this.a;
        long j2 = this.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis() - j2;
        if (ThreadLocalRandom.current().nextFloat() < this.e) {
            omuVar.a(i, i2, j, jCurrentTimeMillis, (int) jUptimeMillis);
        }
    }
}
