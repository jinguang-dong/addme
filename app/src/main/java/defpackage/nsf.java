package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.ambient.SharedLibraryVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsf implements uiv {
    final /* synthetic */ int a;

    public nsf(int i) {
        this.a = i;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((akx) obj).getClass();
        if ((iIntValue & 17) == 16 && aycVar.G()) {
            aycVar.r();
        } else {
            AmbientModeSupport.AmbientCallback.h(byx.d(this.a, aycVar, 0), null, amd.c(bik.c, 26.0f), SharedLibraryVersion.h(aycVar).a, aycVar, 432);
        }
        return ufg.a;
    }
}
