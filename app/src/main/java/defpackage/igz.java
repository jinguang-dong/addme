package defpackage;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.pairip.VMRunner;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class igz implements Runnable {
    final /* synthetic */ FusionProgressCallback a;
    final /* synthetic */ long b;
    final /* synthetic */ rwc c;
    final /* synthetic */ idx d;
    final /* synthetic */ szh e;
    final /* synthetic */ idx f;
    final /* synthetic */ iha g;

    public igz(iha ihaVar, FusionProgressCallback fusionProgressCallback, long j, rwc rwcVar, idx idxVar, szh szhVar, idx idxVar2) {
        this.a = fusionProgressCallback;
        this.b = j;
        this.c = rwcVar;
        this.d = idxVar;
        this.e = szhVar;
        this.f = idxVar2;
        this.g = ihaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        VMRunner.invoke("ARxIzrQNinAIKFG9", new Object[]{this});
    }
}
