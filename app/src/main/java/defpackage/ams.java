package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ams implements uiu {
    final /* synthetic */ amt a;
    final /* synthetic */ int b;

    public ams(amt amtVar, int i) {
        this.a = amtVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, uiw] */
    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (aycVar.H(i != 2, iIntValue & 1)) {
            amt amtVar = this.a;
            int i2 = this.b;
            ant antVarA = ((apg) amtVar.c.a).a(i2);
            ((byz) antVarA.c).b.e(amtVar.b, Integer.valueOf(i2 - antVarA.a), aycVar, 0);
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
