package defpackage;

import android.content.pm.PackageInstaller;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtv extends PackageInstaller.SessionCallback {
    final Map a = new HashMap();
    final /* synthetic */ rtr b;
    final /* synthetic */ rtt c;

    public rtv(rtt rttVar, rtr rtrVar) {
        this.b = rtrVar;
        this.c = rttVar;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        this.a.put(Integer.valueOf(i), this.c.c.getSessionInfo(i));
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) this.a.remove(Integer.valueOf(i));
        if (sessionInfo == null || !"com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            return;
        }
        this.b.a(rts.COMPLETED);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
    }
}
