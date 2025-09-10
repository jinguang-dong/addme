package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dla implements uiv {
    final /* synthetic */ int a;
    final /* synthetic */ dlb b;
    final /* synthetic */ uiv c;

    public dla(int i, dlb dlbVar, uiv uivVar) {
        this.a = i;
        this.b = dlbVar;
        this.c = uivVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = iIntValue & 17;
        if (aycVar.H(i != 16, iIntValue & 1)) {
            int i2 = this.a;
            dlb dlbVar = this.b;
            AmbientLifecycleObserverKt.g(i2, dlbVar.a, dlbVar.b, this.c, aycVar, 0);
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
