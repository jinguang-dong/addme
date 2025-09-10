package defpackage;

import com.google.android.apps.camera.jni.gxp.GxpUtils;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final hbj j;

    public hyd(iso isoVar, hbj hbjVar) throws NumberFormatException {
        this.j = hbjVar;
        int iMax = Math.max(1, ((Integer) hbjVar.a(gzs.d).get()).intValue());
        int i = (isoVar.n() ? 1 : 0) + iMax;
        boolean zN = isoVar.n();
        if (isoVar.n() && hbjVar.p(haa.F)) {
            int iMax2 = Math.max(i, (zN ? 1 : 0) + iMax);
            this.a = iMax2;
            this.d = isoVar.n() ? iMax2 - iMax : 0;
            this.e = isoVar.n() ? iMax2 - iMax : 0;
        } else {
            int iMax3 = Math.max(i, iMax);
            this.a = iMax3;
            this.d = isoVar.n() ? iMax3 - iMax : 0;
            this.e = 0;
        }
        this.b = (int) (this.a * ((Float) hbjVar.e(gzs.ad).get()).floatValue());
        this.c = ((Integer) hbjVar.a(hac.f).get()).intValue();
        this.f = hbjVar.p(hac.K);
        this.g = ((Float) hbjVar.e(gze.a).get()).floatValue();
        this.h = hbjVar.p(hac.q);
        hbjVar.a(hac.b);
        this.i = hbjVar.p(hac.t);
    }

    public final boolean a() {
        hbj hbjVar = this.j;
        if (hbjVar.p(gzs.D) && hbjVar.p(gzs.E)) {
            return GxpUtils.a();
        }
        return false;
    }

    public final boolean b(Duration duration) {
        return this.h && duration.toMillis() >= ((long) ((Integer) this.j.a(hac.a).get()).intValue());
    }
}
