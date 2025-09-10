package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxo extends gsn {
    final /* synthetic */ jxp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxo(jxp jxpVar) {
        super((int[]) null);
        this.a = jxpVar;
    }

    @Override // defpackage.gsn
    public final void b() {
        jxp jxpVar = this.a;
        synchronized (jxpVar.h) {
            fwk fwkVar = jxpVar.p;
            if (fwkVar != null) {
                fwkVar.e();
            }
        }
    }

    @Override // defpackage.gsn
    public final void e() {
        jxp jxpVar = this.a;
        synchronized (jxpVar.h) {
            fwk fwkVar = jxpVar.p;
            if (fwkVar != null && fwkVar.p()) {
                jxpVar.i.d();
            }
        }
    }

    @Override // defpackage.gsn
    public final void f() {
        jxp jxpVar = this.a;
        synchronized (jxpVar.h) {
            fwk fwkVar = jxpVar.p;
            if (fwkVar != null && fwkVar.q()) {
                jxpVar.i.f();
            }
        }
    }

    @Override // defpackage.gsn
    public final void j() {
        jxp jxpVar = this.a;
        synchronized (jxpVar.h) {
            fwk fwkVar = jxpVar.p;
            if (fwkVar != null) {
                fwkVar.h();
            }
        }
    }

    @Override // defpackage.gsn
    public final void k() {
        jxp jxpVar = this.a;
        synchronized (jxpVar.h) {
            fwk fwkVar = jxpVar.p;
            if (fwkVar != null) {
                fwkVar.i();
            }
        }
    }
}
