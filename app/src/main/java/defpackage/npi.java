package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npi {
    public byte a;
    public npt b;
    private pjo c;
    private pdn d;
    private peo e;
    private owf f;
    private hbj g;

    public final npr a() {
        int i = ~this.a;
        if ((i & 55) != 0) {
            throw new IllegalStateException();
        }
        pjo pjoVar = this.c;
        pdn pdnVar = this.d;
        peo peoVar = this.e;
        npt nptVar = this.b;
        owf owfVar = this.f;
        hbj hbjVar = this.g;
        if ((i & 8) != 0) {
            nptVar = null;
        }
        return new npr(pjoVar, pdnVar, peoVar, nptVar, owfVar, hbjVar);
    }

    public final void b(owf owfVar) {
        owfVar.getClass();
        this.f = owfVar;
        this.a = (byte) (this.a | 16);
    }

    public final void c(pdn pdnVar) {
        this.d = pdnVar;
        this.a = (byte) (this.a | 2);
    }

    public final void d(peo peoVar) {
        peoVar.getClass();
        this.e = peoVar;
        this.a = (byte) (this.a | 4);
    }

    public final void e(hbj hbjVar) {
        hbjVar.getClass();
        this.g = hbjVar;
        this.a = (byte) (this.a | 32);
    }

    public final void f(pjo pjoVar) {
        this.c = pjoVar;
        this.a = (byte) (this.a | 1);
    }
}
