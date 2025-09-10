package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffc implements klf {
    private final fee a;
    private final syu b;
    private final klf c;
    private final pjo d;

    public ffc(klf klfVar, fee feeVar, pjo pjoVar, syu syuVar) {
        this.a = feeVar;
        syuVar.getClass();
        this.b = syuVar;
        this.c = klfVar;
        this.d = pjoVar;
    }

    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        return new ffb(this.a, this.d, this.b, this.c.a(ggaVar));
    }

    @Override // defpackage.klf
    public final kle b(gga ggaVar) {
        kle kleVarB = this.c.b(ggaVar);
        if (kleVarB == null) {
            return null;
        }
        return new ffb(this.a, this.d, this.b, kleVarB);
    }
}
