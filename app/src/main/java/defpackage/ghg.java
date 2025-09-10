package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ghg implements ggz {
    public static final sgv a = sgv.g("ghg");
    public final ghh b;
    public long c;
    private final ngk d;
    private final gnt e;
    private final oup f;
    private final gau g;
    private final owf h;
    private final owf i;
    private final hbj j;

    public ghg(gdi gdiVar, gav gavVar, ngk ngkVar, gnt gntVar, ghh ghhVar, owf owfVar, owf owfVar2, hbj hbjVar) {
        this.f = gdiVar.b();
        this.d = ngkVar;
        this.e = gntVar;
        this.b = ghhVar;
        this.g = gavVar.a();
        this.h = owfVar;
        this.i = owfVar2;
        this.j = hbjVar;
    }

    @Override // defpackage.ggz
    public final syu a(lte lteVar) {
        this.c = System.currentTimeMillis();
        szh szhVar = new szh();
        owf owfVar = this.i;
        gnt gntVar = this.e;
        pka pkaVarA = gntVar.a();
        pka pkaVar = ((Boolean) owfVar.dL()).booleanValue() ? pka.FRONT : pkaVarA;
        int iG = 90;
        if (this.j.p(gza.d)) {
            owf owfVar2 = this.h;
            if (owfVar2 != null) {
                iG = ((Integer) owfVar2.dL()).intValue();
            }
        } else {
            rwc rwcVarD = gntVar.d();
            if (rwcVarD.h()) {
                iG = ((kgw) rwcVarD.c()).g();
            }
        }
        int i = ((pao) ((ovx) this.g.t).d).e - iG;
        if (pkaVar.equals(pka.FRONT)) {
            i = (360 - i) % 360;
        }
        ske.W(b(pkaVar, pao.b(i)), new ghf(this, szhVar, pkaVarA, lteVar), this.f);
        return szhVar;
    }

    @Override // defpackage.ggz
    public final syu b(pka pkaVar, pao paoVar) throws Throwable {
        rwc rwcVarE = this.d.e(pkaVar == pka.FRONT, 1, paoVar);
        return rwcVarE.h() ? ske.M(((ngq) rwcVarE.c()).a) : ske.L(new IllegalStateException("Can't take screen snapshot."));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
