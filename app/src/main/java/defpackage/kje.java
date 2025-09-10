package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kje implements klf {
    private final klf a;
    private final iil b;
    private final ocq c;

    public kje(klf klfVar, ocq ocqVar, iil iilVar) {
        this.a = klfVar;
        this.c = ocqVar;
        this.b = iilVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lss] */
    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        return new kjk(ggaVar.b, this.a.a(ggaVar), this.b, 1);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, lss] */
    @Override // defpackage.klf
    public final kle b(gga ggaVar) {
        kle kleVarB = this.a.b(ggaVar);
        if (kleVarB == null) {
            return null;
        }
        return new kjk(ggaVar.b, kleVarB, this.b, 1);
    }
}
