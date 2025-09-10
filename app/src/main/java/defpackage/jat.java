package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jat implements itk {
    final /* synthetic */ jbc a;

    public jat(jbc jbcVar) {
        this.a = jbcVar;
    }

    @Override // defpackage.itk
    public final void e() {
        this.a.aw.a();
    }

    @Override // defpackage.itk
    public final void f(boolean z) {
        jbc jbcVar = this.a;
        if (jbcVar.J) {
            return;
        }
        if (!z) {
            itn itnVar = this.a.e;
            synchronized (itnVar.a) {
                int i = itnVar.f;
                if (i == 2) {
                    itnVar.f = 1;
                } else if (i == 3) {
                    itnVar.f = 1;
                    itnVar.d.b(3);
                }
                jbc jbcVar2 = this.a;
                if (jbcVar2.W.h()) {
                    return;
                }
                if (jbcVar2.ap.i) {
                    jbcVar2.am.b(3);
                    return;
                } else if (jbcVar2.N() || jbcVar2.L()) {
                    jbcVar2.I = true;
                    jbcVar2.g.a();
                }
            }
        } else if (!jbcVar.ap.i) {
            if (!((Boolean) jbcVar.ah.dL()).booleanValue() && !jbcVar.aB.m() && !jbcVar.W.i() && (jbcVar.z || !((Boolean) jbcVar.Z.dL()).booleanValue())) {
                itn itnVar2 = jbcVar.e;
                pql pqlVar = itnVar2.b;
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (itnVar2.a) {
                    int i2 = itnVar2.f;
                    if (i2 == 1) {
                        itnVar2.f = 2;
                        itnVar2.e = jElapsedRealtimeNanos;
                    } else if (jElapsedRealtimeNanos - itnVar2.e > itnVar2.c && i2 == 2) {
                        itnVar2.f = 3;
                        itnVar2.d.a(3);
                    }
                }
            }
            jbc jbcVar3 = this.a;
            if (jbcVar3.N() || jbcVar3.L()) {
                jbcVar3.g.d();
            }
        }
        this.a.f.G(z);
    }

    @Override // defpackage.itk
    public final void g(boolean z) {
        jbc jbcVar = this.a;
        boolean z2 = jbcVar.ap.i;
        if (z) {
            if (z2 || jbcVar.N()) {
                jbcVar.aD.b(true);
            }
        }
    }

    @Override // defpackage.itk
    public final void h(boolean z) {
        jbc jbcVar = this.a;
        boolean z2 = jbcVar.ap.i;
        if (z) {
            if (z2 || jbcVar.N()) {
                jbcVar.aD.b(false);
            }
        }
    }

    @Override // defpackage.itk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void c(boolean z) {
    }
}
