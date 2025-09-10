package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aog implements ayy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aog(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ayy
    public final void a() {
        int i = this.b;
        if (i == 0) {
            ((aoh) this.a).d = null;
            return;
        }
        if (i == 1) {
            ado adoVar = (ado) this.a;
            adoVar.h();
            byz byzVar = adoVar.e;
        } else {
            if (i != 2) {
                Object obj = this.a;
                if (i != 3) {
                    ((bzg) obj).a.a();
                    return;
                } else {
                    ((aoq) obj).d = true;
                    return;
                }
            }
            aov aovVar = (aov) this.a;
            owd owdVar = aovVar.f;
            if (owdVar != null) {
                owdVar.a = false;
            }
            aovVar.f = null;
        }
    }
}
