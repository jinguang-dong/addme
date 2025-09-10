package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
class nm extends nl {
    @Override // defpackage.nk, defpackage.e
    public void g(nw nwVar, nw nwVar2, Window window, View view, boolean z, boolean z2) {
        nwVar.getClass();
        nwVar2.getClass();
        window.getClass();
        view.getClass();
        window.setDecorFitsSystemWindows(false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        cpq cpqVar = new cpq(window, (byte[]) null);
        com.e(!z, cpqVar);
        com.d(true ^ z2, cpqVar);
    }
}
