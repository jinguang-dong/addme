package defpackage;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.pairip.VMRunner;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iek implements Runnable {
    final /* synthetic */ szh a;
    final /* synthetic */ long b;
    final /* synthetic */ idx c;
    final /* synthetic */ idx d;
    final /* synthetic */ pas e;
    final /* synthetic */ FusionProgressCallback f;
    final /* synthetic */ iel g;
    final /* synthetic */ kgw h;

    public iek(iel ielVar, szh szhVar, long j, idx idxVar, idx idxVar2, kgw kgwVar, pas pasVar, FusionProgressCallback fusionProgressCallback) {
        this.a = szhVar;
        this.b = j;
        this.c = idxVar;
        this.d = idxVar2;
        this.h = kgwVar;
        this.e = pasVar;
        this.f = fusionProgressCallback;
        this.g = ielVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        VMRunner.invoke("GZwhLBZRvfP61cGt", new Object[]{this});
    }
}
