package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atl implements uiv {
    final /* synthetic */ asz a;
    final /* synthetic */ ami b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ uiu f;
    final /* synthetic */ uiv g;
    final /* synthetic */ uiu h;
    final /* synthetic */ uiu i;
    final /* synthetic */ uiv j;
    final /* synthetic */ ejs k;

    public atl(asz aszVar, ami amiVar, long j, long j2, int i, uiu uiuVar, uiv uivVar, uiu uiuVar2, uiu uiuVar3, uiv uivVar2, ejs ejsVar) {
        this.a = aszVar;
        this.b = amiVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = uiuVar;
        this.g = uivVar;
        this.h = uiuVar2;
        this.i = uiuVar3;
        this.j = uivVar2;
        this.k = ejsVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bik bikVar = (bik) obj;
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != aycVar.B(bikVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && aycVar.G()) {
            aycVar.r();
        } else {
            asz aszVar = this.a;
            boolean zB = aycVar.B(aszVar);
            ami amiVar = this.b;
            boolean zB2 = zB | aycVar.B(amiVar);
            Object objF = aycVar.f();
            if (zB2 || objF == ayb.a) {
                objF = new aff(aszVar, amiVar, 13, null);
                aycVar.w(objF);
            }
            akg.l(bay.x(bikVar, new amj((uiq) objF, 0)), null, this.c, this.d, 0.0f, bdq.k(-1761194824, new atk(this.e, this.f, this.g, this.h, aszVar, this.i, this.j, this.k), aycVar), aycVar, 1572864, 50);
        }
        return ufg.a;
    }
}
