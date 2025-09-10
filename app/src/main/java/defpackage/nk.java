package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
class nk extends e {
    public nk() {
        super(null);
    }

    @Override // defpackage.e
    public void g(nw nwVar, nw nwVar2, Window window, View view, boolean z, boolean z2) {
        nwVar.getClass();
        nwVar2.getClass();
        window.getClass();
        view.getClass();
        window.setDecorFitsSystemWindows(false);
        window.setStatusBarColor(nwVar.a(z));
        window.setNavigationBarColor(nwVar2.a(z2));
        cpq cpqVar = new cpq(window, (byte[]) null);
        com.e(!z, cpqVar);
        com.d(!z2, cpqVar);
    }
}
