package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbb implements cnj {
    private final fba a;
    private final fbd b;
    private final cnj c;

    public fbb(cnj cnjVar, fba fbaVar, fbd fbdVar) {
        this.c = cnjVar;
        this.a = fbaVar;
        this.b = fbdVar;
    }

    @Override // defpackage.cnj
    public final Object a() {
        Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
        }
        if (objA instanceof fbc) {
            ((fbc) objA).dF().a = false;
        }
        return objA;
    }

    @Override // defpackage.cnj
    public final boolean b(Object obj) {
        if (obj instanceof fbc) {
            ((fbc) obj).dF().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
