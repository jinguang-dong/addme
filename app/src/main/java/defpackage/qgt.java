package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgt implements Runnable {
    final /* synthetic */ qfh a;
    final /* synthetic */ qhd b;
    final /* synthetic */ qhd c;

    public qgt(qhd qhdVar, qfh qfhVar, qhd qhdVar2) {
        this.a = qfhVar;
        this.b = qhdVar2;
        this.c = qhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qhd qhdVar = this.c;
        Object obj = qhdVar.a;
        if (obj != null) {
            qpt.ao(obj, this.a, this.b);
        } else {
            this.b.j(qhdVar.b);
        }
    }

    public final String toString() {
        qfh qfhVar = this.a;
        return this.c.toString() + "then[" + qfhVar.toString() + "]";
    }
}
