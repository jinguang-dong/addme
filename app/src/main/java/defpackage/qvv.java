package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qvv {
    protected final uyz a;

    public qvv(uyz uyzVar) {
        this.a = uyzVar;
    }

    public abstract long a(String str);

    public abstract uyz b(Long l);

    public abstract uyz c(Long l);

    public abstract boolean d();

    public final uyz e() {
        uyz uyzVarB = b(null);
        tpc tpcVar = (tpc) uyzVarB.a(5, null);
        tpcVar.r(uyzVarB);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        uyz uyzVar = (uyz) tpcVar.b;
        uyz uyzVar2 = uyz.a;
        uyzVar.b |= 2;
        uyzVar.c = -1L;
        return (uyz) tpcVar.l();
    }
}
