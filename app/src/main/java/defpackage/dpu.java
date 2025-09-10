package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpu implements uiv {
    final /* synthetic */ long a;
    final /* synthetic */ cdo b;
    final /* synthetic */ drn c;
    final /* synthetic */ uiv d;
    private final /* synthetic */ int e;

    public dpu(long j, cdo cdoVar, drn drnVar, uiv uivVar, int i) {
        this.e = i;
        this.a = j;
        this.b = cdoVar;
        this.c = drnVar;
        this.d = uivVar;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            ayc aycVar = (ayc) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != ((iIntValue & 8) == 0 ? aycVar.B(obj) : aycVar.D(obj)) ? 2 : 4;
            }
            if (aycVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
                bay.L(new bag[]{dou.a.b(new bkv(this.a)), drp.a.b(this.b), drp.b.b(this.c)}, bdq.k(-897692513, new ars(this.d, obj, 17, null), aycVar), aycVar, 56);
            } else {
                aycVar.r();
            }
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= true != ((iIntValue2 & 8) == 0 ? aycVar2.B(obj) : aycVar2.D(obj)) ? 2 : 4;
        }
        if (aycVar2.H((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            bay.L(new bag[]{dou.a.b(new bkv(this.a)), drp.a.b(this.b), drp.b.b(this.c)}, bdq.k(1639171905, new ars(this.d, obj, 19, null), aycVar2), aycVar2, 56);
        } else {
            aycVar2.r();
        }
        return ufg.a;
    }
}
