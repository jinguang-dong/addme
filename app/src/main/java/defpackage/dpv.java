package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpv implements uiv {
    final /* synthetic */ long a;
    final /* synthetic */ uiv b;

    public dpv(long j, uiv uivVar) {
        this.a = j;
        this.b = uivVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != ((iIntValue & 8) == 0 ? aycVar.B(obj) : aycVar.D(obj)) ? 2 : 4;
        }
        if (aycVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            bay.K(dou.a.b(new bkv(this.a)), bdq.k(-2078069172, new ars(this.b, obj, 20, null), aycVar), aycVar, 56);
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
