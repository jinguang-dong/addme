package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebv implements ebr {
    public final dco a;
    public final dcv b;
    private final dcv c;

    public ebv(dco dcoVar) {
        this.a = dcoVar;
        new ebs(dcoVar);
        this.c = new ebt(dcoVar);
        this.b = new ebu(dcoVar);
    }

    @Override // defpackage.ebr
    public final void a(String str) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.c.d();
        dfqVarD.g(1, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.c.f(dfqVarD);
        }
    }
}
