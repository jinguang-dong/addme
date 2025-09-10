package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkk implements syf {
    final /* synthetic */ boolean a;
    final /* synthetic */ jkl b;

    public jkk(jkl jklVar, boolean z) {
        this.a = z;
        this.b = jklVar;
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        lag lagVar = (lag) obj;
        float f = lagVar.a;
        jkl jklVar = this.b;
        jklVar.o = f;
        boolean z = this.a;
        nhz nhzVar = jklVar.a;
        if (!z || nhzVar == null) {
            return;
        }
        nhzVar.g(lagVar.b, false, niz.a);
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
    }
}
