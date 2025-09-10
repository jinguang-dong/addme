package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpt implements uiv {
    final /* synthetic */ long a;
    final /* synthetic */ cdo b;
    final /* synthetic */ uiv c;

    public dpt(long j, cdo cdoVar, uiv uivVar) {
        this.a = j;
        this.b = cdoVar;
        this.c = uivVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != ((iIntValue & 8) == 0 ? aycVar.B(obj) : aycVar.D(obj)) ? 2 : 4;
        }
        if (aycVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            bay.L(new bag[]{dou.a.b(new bkv(this.a)), drp.a.b(this.b)}, bdq.k(-1114628348, new ars(this.c, obj, 18, null), aycVar), aycVar, 56);
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
