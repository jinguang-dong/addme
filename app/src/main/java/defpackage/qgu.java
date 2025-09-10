package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgu implements Runnable {
    final /* synthetic */ qfh a;
    final /* synthetic */ qhd b;
    final /* synthetic */ qfh c;
    final /* synthetic */ qhd d;

    public qgu(qhd qhdVar, qfh qfhVar, qhd qhdVar2, qfh qfhVar2) {
        this.a = qfhVar;
        this.b = qhdVar2;
        this.c = qfhVar2;
        this.d = qhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qhd qhdVar = this.d;
        Object obj = qhdVar.a;
        if (obj != null) {
            qpt.ao(obj, this.a, this.b);
            return;
        }
        qgg qggVar = qhdVar.b;
        qfh qfhVar = this.c;
        qhd qhdVar2 = this.b;
        try {
            qhdVar2.i(qfhVar.a(qggVar));
        } catch (qgg e) {
            qhdVar2.j(e);
        } catch (Throwable th) {
            qhdVar2.j(qgg.a(th));
        }
    }

    public final String toString() {
        qfh qfhVar = this.c;
        qfh qfhVar2 = this.a;
        return this.d.toString() + "then[" + qfhVar2.toString() + ", " + qfhVar.toString() + "]";
    }
}
