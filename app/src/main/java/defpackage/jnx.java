package defpackage;

import android.util.Range;
import android.view.WindowManager;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnx implements ncm {
    public final owq a;
    public final owf c;
    public final WindowManager d;
    private final ScheduledExecutorService j;
    private final rww l;
    private final owf m;
    private final boolean n;
    public final jsy b = new jsy();
    private final AtomicBoolean k = new AtomicBoolean();
    public volatile Optional e = Optional.empty();
    public volatile float f = 0.0f;
    public volatile float g = 0.0f;
    public volatile float h = 0.0f;
    public volatile float i = 0.0f;

    public jnx(owq owqVar, owf owfVar, ScheduledExecutorService scheduledExecutorService, rww rwwVar, WindowManager windowManager, hbj hbjVar, owf owfVar2) {
        this.a = owqVar;
        this.c = owfVar;
        this.j = scheduledExecutorService;
        this.l = rwwVar;
        this.d = windowManager;
        this.m = owfVar2;
        this.n = hbjVar.p(gzo.bw);
    }

    public static float b(float f, Range range) {
        return (f * (((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue())) + ((Float) range.getLower()).floatValue();
    }

    public static Range c(float f, float f2) {
        return Range.create(Float.valueOf(f), Float.valueOf(Math.max(f, f2)));
    }

    public static float h(float f) {
        return Math.min(1.0f, Math.max(f, 0.0f));
    }

    private final mxj i() {
        return ((mxu) this.l.fr()).a.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a() {
        /*
            r7 = this;
            android.view.WindowManager r0 = r7.d
            mxj r1 = r7.i()
            android.util.Size r0 = defpackage.nlj.h(r0)
            int r2 = r0.getHeight()
            int r0 = r0.getWidth()
            boolean r7 = r7.n
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1055286886(0x3ee66666, float:0.45)
            r5 = 1059816735(0x3f2b851f, float:0.67)
            r6 = 3
            if (r7 == 0) goto L29
            int r7 = r1.ordinal()
            if (r7 == 0) goto L33
            if (r7 == r6) goto L28
            return r3
        L28:
            return r4
        L29:
            int r7 = r1.ordinal()
            if (r7 == 0) goto L33
            if (r7 == r6) goto L32
            goto L34
        L32:
            return r4
        L33:
            r3 = r5
        L34:
            if (r2 < r0) goto L37
            return r3
        L37:
            r7 = 1063675494(0x3f666666, float:0.9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnx.a():float");
    }

    public final synchronized void d() {
        this.h = 0.0f;
        this.k.set(false);
    }

    public final synchronized void e(Range range) {
        if (this.k.getAndSet(true)) {
            return;
        }
        this.j.schedule(new jnw(this, range, 0), 33L, TimeUnit.MILLISECONDS);
    }

    public final void f(Range range) {
        if (this.k.get()) {
            owq owqVar = this.a;
            float fFloatValue = ((Float) owqVar.dL()).floatValue();
            float fMax = Math.max(((Float) range.getLower()).floatValue(), fFloatValue - this.h);
            if (fFloatValue > fMax) {
                Float f = (Float) range.clamp(Float.valueOf(fMax));
                float fFloatValue2 = f.floatValue();
                owqVar.dL();
                owqVar.a(f);
                this.f = fFloatValue2;
                this.g = fFloatValue2;
                this.j.schedule(new jnw(this, range, 2), 33L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final int g() {
        int iOrdinal;
        if (this.n && (iOrdinal = i().ordinal()) != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                int iOrdinal2 = ((mxm) this.m.dL()).ordinal();
                if (iOrdinal2 != 1) {
                    return iOrdinal2 != 2 ? 1 : 3;
                }
                return 2;
            }
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
        }
        return 1;
    }
}
