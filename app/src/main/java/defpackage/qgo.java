package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgo extends qft {
    final /* synthetic */ int a;
    final /* synthetic */ qgp b;

    public qgo(qgp qgpVar, int i) {
        this.a = i;
        this.b = qgpVar;
    }

    @Override // defpackage.qft
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        qgp qgpVar = this.b;
        qgpVar.c[this.a] = (qgg) obj;
        qgpVar.d = true;
        qgpVar.a();
    }
}
