package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwy implements rww {
    private static final rww a = new qxd(3);
    private volatile rww b;
    private Object c;
    private final ujf d = new ujf();

    public rwy(rww rwwVar) {
        rwwVar.getClass();
        this.b = rwwVar;
    }

    @Override // defpackage.rww
    public final Object fr() {
        rww rwwVar = this.b;
        rww rwwVar2 = a;
        if (rwwVar != rwwVar2) {
            synchronized (this.d) {
                if (this.b != rwwVar2) {
                    Object objFr = this.b.fr();
                    this.c = objFr;
                    this.b = rwwVar2;
                    return objFr;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        }
        return mn.i(obj, "Suppliers.memoize(", ")");
    }
}
