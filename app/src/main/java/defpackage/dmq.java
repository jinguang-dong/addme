package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmq implements uiu {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ dlm c;

    public dmq(dlm dlmVar, int i, Object obj) {
        this.c = dlmVar;
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
