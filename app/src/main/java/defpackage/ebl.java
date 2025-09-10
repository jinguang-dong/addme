package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebl implements ebh {
    public final dco a;
    public final dcv b;
    public final dcv c;
    private final dcc d;

    public ebl(dco dcoVar) {
        this.a = dcoVar;
        this.d = new ebi(dcoVar);
        this.b = new ebj(dcoVar);
        this.c = new ebk(dcoVar);
    }

    @Override // defpackage.ebh
    public final void a(ebg ebgVar) {
        dco dcoVar = this.a;
        dcoVar.k();
        dcoVar.l();
        try {
            this.d.a(ebgVar);
            dcoVar.p();
        } finally {
            this.a.n();
        }
    }
}
