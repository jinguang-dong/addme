package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgn extends qft {
    final /* synthetic */ int a;
    final /* synthetic */ qgp b;

    public qgn(qgp qgpVar, int i) {
        this.a = i;
        this.b = qgpVar;
    }

    @Override // defpackage.qft
    public final void b(Object obj) {
        qgp qgpVar = this.b;
        qgpVar.b[this.a] = obj;
        qgpVar.a();
    }
}
