package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klb implements klf {
    public final Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public klb(klf klfVar, hbp hbpVar, int i) {
        this.b = i;
        this.c = hbpVar;
        this.a = klfVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, lss] */
    private final kle c(kle kleVar, gga ggaVar) {
        ?? r5 = ggaVar.b;
        a.I(!r5.w().isEmpty());
        klc klcVar = new klc();
        hbp hbpVar = (hbp) this.c;
        return new kla(kleVar, r5.s(), new hty(hbpVar, klcVar, 17), hbpVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, klf] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, klf] */
    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        return this.b != 0 ? new kjf(this, this.c.a(ggaVar)) : c(this.a.a(ggaVar), ggaVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, klf] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, klf] */
    @Override // defpackage.klf
    public final kle b(gga ggaVar) {
        if (this.b != 0) {
            kle kleVarB = this.c.b(ggaVar);
            if (kleVarB == null) {
                return null;
            }
            return new kjf(this, kleVarB);
        }
        kle kleVarB2 = this.a.b(ggaVar);
        if (kleVarB2 == null) {
            return null;
        }
        return c(kleVarB2, ggaVar);
    }

    public klb(klf klfVar, Set set, int i) {
        this.b = i;
        this.c = klfVar;
        this.a = set;
    }
}
