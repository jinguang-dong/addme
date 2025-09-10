package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fea implements fre {
    public final CameraActivityTiming a;
    private final fdy b;

    public fea(fdy fdyVar, CameraActivityTiming cameraActivityTiming) {
        this.b = fdyVar;
        this.a = cameraActivityTiming;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() {
        this.a.l(mej.PERMISSIONS_STARTUP_TASK_START, CameraActivityTiming.b);
        fdy fdyVar = this.b;
        if (fdyVar.c.b() && fdyVar.d()) {
            fdyVar.g.e(fsq.g);
        }
        szh szhVar = fdyVar.g;
        if (!szhVar.isDone()) {
            fdyVar.b();
        }
        szhVar.isDone();
        return swz.i(szhVar, new fdz(this, 0), sxo.a);
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }
}
