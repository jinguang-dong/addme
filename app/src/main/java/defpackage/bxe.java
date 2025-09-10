package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxe extends axp {
    public bxe(bvm bvmVar) {
        super(bvmVar);
    }

    @Override // defpackage.axp
    protected final void e() {
        ((bvm) this.a).O();
    }

    @Override // defpackage.axp, defpackage.axr
    public final void f() {
        bws bwsVar = ((bvm) this.a).i;
        if (bwsVar != null) {
            bwsVar.h();
        }
    }

    @Override // defpackage.axr
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
        ((bvm) this.b).D(i, (bvm) obj);
    }

    @Override // defpackage.axr
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
    }

    @Override // defpackage.axr
    public final void k(int i, int i2, int i3) {
        ((bvm) this.b).M(i, i2, i3);
    }

    @Override // defpackage.axr
    public final void l(int i, int i2) {
        ((bvm) this.b).P(i, i2);
    }

    @Override // defpackage.axp, defpackage.axr
    public final void g() {
        bvm bvmVar = (bvm) this.b;
        if (!bvmVar.ag()) {
            bqs.b(oUZhwRhE.xYyFj);
        }
        bsn bsnVar = bvmVar.u;
        if (bsnVar != null) {
            bsnVar.i(false);
        }
        bvmVar.m = false;
        if (bvmVar.w) {
            bvmVar.w = false;
        } else {
            bvmVar.U();
        }
        int i = bvmVar.c;
        bvmVar.c = cbp.a();
        bws bwsVar = bvmVar.i;
        if (bwsVar != null) {
            yq yqVar = ((bxv) bwsVar).G;
            yqVar.d(i);
            yqVar.f(bvmVar.c, bvmVar);
        }
        bwe bweVar = bvmVar.s;
        bweVar.b();
        bweVar.e();
        if (bweVar.j(8)) {
            bvmVar.H();
        }
        bvmVar.T(bvmVar);
        bws bwsVar2 = bvmVar.i;
        if (bwsVar2 != null) {
            bxv bxvVar = (bxv) bwsVar2;
            bit bitVar = bxvVar.H;
            if (bitVar != null) {
                if (bitVar.f.e(i)) {
                    bitVar.h.ax(bitVar.a, i, false);
                }
                cbn cbnVarP = bvmVar.p();
                if (cbnVarP != null && bay.q(cbnVarP)) {
                    bitVar.f.d(bvmVar.c);
                    bitVar.h.ax(bitVar.a, bvmVar.c, true);
                }
            }
            bxvVar.k.e(bvmVar, bvmVar.t.o.m, true);
        }
    }
}
