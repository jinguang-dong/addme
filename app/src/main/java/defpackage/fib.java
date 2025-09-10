package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fib implements kmz {
    private final kmz a;
    private final owf b;
    private final owf c;
    private final owf d;
    private final owf e;

    public fib(owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, kmz kmzVar) {
        this.a = kmzVar;
        this.b = owfVar;
        this.c = owfVar2;
        this.d = owfVar3;
        this.e = owfVar4;
    }

    @Override // defpackage.kmz
    public final owf a() {
        return owb.a(owl.c(this.a.a(), this.b, this.c, this.d, this.e));
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.a.b();
    }

    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        this.a.c(kmyVar, ggaVar);
    }
}
