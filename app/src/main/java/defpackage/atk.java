package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atk implements uiu {
    final /* synthetic */ int a;
    final /* synthetic */ uiu b;
    final /* synthetic */ uiv c;
    final /* synthetic */ uiu d;
    final /* synthetic */ asz e;
    final /* synthetic */ uiu f;
    final /* synthetic */ uiv g;
    final /* synthetic */ ejs h;

    public atk(int i, uiu uiuVar, uiv uivVar, uiu uiuVar2, asz aszVar, uiu uiuVar3, uiv uivVar2, ejs ejsVar) {
        this.a = i;
        this.b = uiuVar;
        this.c = uivVar;
        this.d = uiuVar2;
        this.e = aszVar;
        this.f = uiuVar3;
        this.g = uivVar2;
        this.h = ejsVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            atn.a(this.a, this.b, this.c, bdq.k(545329543, new ars(this.g, this.h, 3, null), aycVar), this.d, this.e, this.f, aycVar, 24576);
        }
        return ufg.a;
    }
}
