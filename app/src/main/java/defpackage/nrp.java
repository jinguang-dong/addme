package defpackage;

import com.google.android.apps.camera.wear.wearappv2.ui.settings.ComposeMenuButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrp implements uiv {
    final /* synthetic */ ComposeMenuButton a;
    final /* synthetic */ nrx b;

    public nrp(ComposeMenuButton composeMenuButton, nrx nrxVar) {
        this.a = composeMenuButton;
        this.b = nrxVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((akx) obj).getClass();
        if ((iIntValue & 17) == 16 && aycVar.G()) {
            aycVar.r();
        } else {
            this.a.f(this.b, aycVar, 0);
        }
        return ufg.a;
    }
}
