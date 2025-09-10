package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jth implements kfg {
    public final our a;
    public final jtd b;
    public final kgw c;
    private final kfg d;

    public jth(kfg kfgVar, our ourVar, jtd jtdVar, kgw kgwVar) {
        ourVar.getClass();
        jtdVar.getClass();
        kgwVar.getClass();
        this.d = kfgVar;
        this.a = ourVar;
        this.b = jtdVar;
        this.c = kgwVar;
    }

    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        return this.d.a(ejtVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, owf] */
    public final owf b() {
        return this.d.i().d;
    }

    @Override // defpackage.kfg
    public final paq c(pdh pdhVar) {
        return this.d.c(pdhVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
        this.a.close();
    }

    @Override // defpackage.kfg
    public final syu d() {
        return this.d.d();
    }

    @Override // defpackage.kfg
    public final syu e(kfl kflVar, lss lssVar) {
        return this.d.e(kflVar, lssVar);
    }

    @Override // defpackage.kfg
    public final boolean f() {
        return this.a.b();
    }

    @Override // defpackage.kfg
    public final our g() {
        return this.d.g();
    }

    @Override // defpackage.kfg
    public final pfu h() {
        return this.d.h();
    }

    @Override // defpackage.kfg
    public final uh i() {
        return this.d.i();
    }
}
