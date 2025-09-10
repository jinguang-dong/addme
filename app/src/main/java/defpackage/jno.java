package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jno {
    private final boolean a;
    private final tzj b;
    private final gga c;
    private final cxb d;
    private final cxb e;
    private final cxb f;

    public jno(rwc rwcVar, tzj tzjVar, tzj tzjVar2, tzj tzjVar3, tzj tzjVar4, gga ggaVar) {
        this.a = ((Boolean) rwcVar.e(false)).booleanValue();
        this.d = new cxb(tzjVar);
        this.e = new cxb(tzjVar2);
        this.f = new cxb(tzjVar3);
        this.b = tzjVar4;
        this.c = ggaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, lss] */
    public final rwc a() {
        cxb cxbVar = this.d;
        if (!cxbVar.C()) {
            return rvk.a;
        }
        ?? r4 = this.c.b;
        return rwc.j(((joa) cxbVar.B()).a(r4, r4.e(), false, rvk.a));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lss] */
    public final void b() {
        if (this.a) {
            kbn kbnVar = (kbn) this.e.B();
            kxy kxyVar = new kxy((let) this.b.a(), 1);
            gga ggaVar = this.c;
            kbnVar.s(kxyVar, ggaVar);
            ((kal) this.f.B()).f(ggaVar.b.l());
        }
    }

    public final void c() {
        if (this.a) {
            ((kbn) this.e.B()).q(new kxy((let) this.b.a(), 1), this.c);
        }
    }
}
