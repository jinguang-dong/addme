package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jxz extends nqg {
    final /* synthetic */ jyb a;

    public jxz(jyb jybVar) {
        this.a = jybVar;
    }

    @Override // defpackage.nqh
    public final boolean a(PointF pointF) {
        jyb jybVar = this.a;
        synchronized (jybVar.e) {
            if (!jybVar.h) {
                return false;
            }
            if (jybVar.f.c().compareTo(jyb.b) < 0) {
                jybVar.c.a(true);
            }
            jybVar.k(jybVar.k);
            return true;
        }
    }
}
