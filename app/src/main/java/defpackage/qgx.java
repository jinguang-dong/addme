package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgx implements Runnable {
    private final Object a;
    private final qhd b;
    private final qfh c;
    private final /* synthetic */ int d;

    public qgx(Object obj, qfh qfhVar, qhd qhdVar, int i) {
        this.d = i;
        this.a = obj;
        this.b = qhdVar;
        this.c = qfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            qhd qhdVar = this.b;
            qpt.ao(this.a, this.c, qhdVar);
        } else {
            qhd qhdVar2 = this.b;
            qpt.ao(this.a, this.c, qhdVar2);
        }
    }

    public final String toString() {
        int i = this.d;
        qfh qfhVar = this.c;
        return i != 0 ? qfhVar.toString() : qfhVar.toString();
    }
}
