package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipq {
    public final gnt a;
    public final msh b;
    public dtp c;
    public final cxb d;
    private final out e;
    private final owf f;
    private paq g;

    public ipq(cxb cxbVar, gnt gntVar, msh mshVar, out outVar, owf owfVar) {
        this.d = cxbVar;
        this.a = gntVar;
        this.b = mshVar;
        this.e = outVar;
        this.f = owfVar;
    }

    public final void a(Runnable runnable, Runnable runnable2, our ourVar) {
        paq paqVar = this.g;
        if (paqVar != null) {
            paqVar.close();
        }
        paq paqVarDK = this.f.dK(new fcd(this, runnable2, runnable, 3), this.e);
        this.g = paqVarDK;
        ourVar.d(paqVarDK);
    }
}
