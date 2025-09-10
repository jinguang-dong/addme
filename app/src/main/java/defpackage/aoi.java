package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoi implements uiu {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ amt c;

    public aoi(amt amtVar, int i, Object obj) {
        this.c = amtVar;
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (aycVar.H(i != 2, iIntValue & 1)) {
            this.c.e(this.a, this.b, aycVar, 0);
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
