package defpackage;

import androidx.wear.ambient.SharedLibraryVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsg implements uiv {
    final /* synthetic */ int a;
    final /* synthetic */ ltw b;

    public nsg(int i, ltw ltwVar) {
        this.a = i;
        this.b = ltwVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((amc) obj).getClass();
        if ((iIntValue & 17) == 16 && aycVar.G()) {
            aycVar.r();
        } else {
            jsv.r(this.a, this.b, 0L, SharedLibraryVersion.j(aycVar).i, SharedLibraryVersion.h(aycVar).s, aycVar, 0, 4);
        }
        return ufg.a;
    }
}
