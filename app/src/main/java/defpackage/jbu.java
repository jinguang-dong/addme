package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbu implements msk {
    final /* synthetic */ fqf a;
    private final /* synthetic */ int b;

    public jbu(fqf fqfVar, int i) {
        this.b = i;
        this.a = fqfVar;
    }

    @Override // defpackage.msk
    public final void b() {
        if (this.b != 1) {
            return;
        }
        ((jbm) this.a).K.a(this);
    }

    @Override // defpackage.msk
    public final void ev(boolean z) {
        int i = this.b;
        if (i == 0) {
            jby jbyVar = (jby) this.a;
            hjb hjbVar = jbyVar.p;
            if (hjbVar != null) {
                hjbVar.h();
            }
            if (z) {
                jbyVar.d();
                return;
            }
            return;
        }
        if (i != 1) {
            hjb hjbVar2 = ((jcv) this.a).l;
            if (hjbVar2 != null) {
                hjbVar2.h();
                return;
            }
            return;
        }
        fqf fqfVar = this.a;
        if (fqfVar.t) {
            ((jbm) fqfVar).K.h(this);
        } else {
            ((sgt) jbm.a.c().M(2612)).s("Skipping re-showing UI since mode is stopped.");
        }
    }

    @Override // defpackage.msk
    public final void c(int i) {
    }
}
