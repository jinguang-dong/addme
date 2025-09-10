package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdt implements fre {
    public final CameraActivityTiming a;
    public final hhc b;
    public final Executor c;
    public final qrh d;
    public final cxb e;
    private final hfr f;

    public fdt(hfr hfrVar, qrh qrhVar, CameraActivityTiming cameraActivityTiming, cxb cxbVar, hhc hhcVar, Executor executor) {
        this.f = hfrVar;
        this.d = qrhVar;
        this.a = cameraActivityTiming;
        this.e = cxbVar;
        this.b = hhcVar;
        this.c = executor;
    }

    public static pbw d(hfv hfvVar) {
        pbw pbwVar = hfvVar.b;
        if (pbwVar == null) {
            pbwVar = pbw.CAMERA_ERROR_CODE_UNKNOWN;
        }
        pbwVar.getClass();
        return pbwVar;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() {
        CameraActivityTiming cameraActivityTiming = this.a;
        cameraActivityTiming.l(mej.WAIT_FOR_CAMERA_DEVICES_TASK_START, CameraActivityTiming.b);
        cameraActivityTiming.h = cameraActivityTiming.d.a("waitForCameraDevice");
        syu syuVarA = this.f.a();
        fdz fdzVar = new fdz(this, 1);
        sxo sxoVar = sxo.a;
        return swf.j(swz.i(syuVarA, fdzVar, sxoVar), Throwable.class, new jie(1), sxoVar);
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }
}
