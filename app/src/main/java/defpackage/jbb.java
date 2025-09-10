package defpackage;

import com.google.ar.core.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbb extends kfn {
    public final /* synthetic */ jbc a;
    private final boolean b;

    public jbb(jbc jbcVar, boolean z) {
        this.a = jbcVar;
        this.b = z;
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void b() {
        this.a.d(false);
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void c(long j) {
        jbc jbcVar = this.a;
        rwc rwcVar = jbcVar.q;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).b(this.b);
        }
        rwc rwcVar2 = jbcVar.ag;
        if (rwcVar2.h() && ((hko) rwcVar2.c()).i()) {
            ((hko) rwcVar2.c()).e();
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void d() {
        jbc jbcVar = this.a;
        kfg kfgVar = jbcVar.C;
        if (Objects.equals(kfgVar != null ? (kox) ((oww) kfgVar.i().f).dL() : null, kox.AUTO)) {
            jbcVar.c.execute(new ivi(this, 19));
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void e(float f) {
        g(f, -1L);
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void g(float f, long j) {
        jbc jbcVar = this.a;
        if (((Boolean) jbcVar.U.b.dL()).booleanValue()) {
            rwc rwcVar = jbcVar.q;
            if (rwcVar.h()) {
                ((fty) rwcVar.c()).i(f, j);
            }
        } else {
            kfg kfgVar = jbcVar.C;
            if (kfgVar == null || !jbcVar.ay.a((kow) kfgVar.i().f)) {
                jbcVar.v.f((int) (100.0f * f));
            } else {
                mnt mntVar = jbcVar.ax;
                kfg kfgVar2 = jbcVar.C;
                kfgVar2.getClass();
                mntVar.d(f, j, (kow) kfgVar2.i().f);
            }
            if (f == 0.0f) {
                if (!jbcVar.aB.l()) {
                    jbcVar.an.K.p();
                }
                jbcVar.G(true);
            } else if (f == 1.0f) {
                if (!jbcVar.aB.l()) {
                    jbcVar.an.K.q();
                }
                jbcVar.G(false);
            }
        }
        if (f == 1.0f) {
            jbcVar.ao.c(R.raw.camera_shutter);
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void f(float f, int i) {
    }
}
