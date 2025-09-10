package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lvz {
    public static final sgv a = sgv.g("lvz");
    public final CameraManager b;
    public final Executor c;
    private final ScheduledExecutorService d;

    public lvz(CameraManager cameraManager, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.b = cameraManager;
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    final syu a() throws CameraAccessException {
        try {
            String[] cameraIdList = this.b.getCameraIdList();
            if (cameraIdList == null || cameraIdList.length == 0) {
                return ske.M(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            final lvy lvyVar = new lvy(cameraIdList, scheduledExecutorService);
            syu syuVarK = cgh.k(new cix() { // from class: lvw
                @Override // defpackage.cix
                public final Object a(civ civVar) {
                    lvy lvyVar2 = lvyVar;
                    lvyVar2.a = civVar;
                    lvz lvzVar = this.a;
                    lvzVar.b.registerAvailabilityCallback(lvzVar.c, lvyVar2);
                    return "SidelineCameraStateChecker#waitForCamerasAllAvailable";
                }
            });
            Runnable runnable = new Runnable() { // from class: lvx
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.unregisterAvailabilityCallback(lvyVar);
                }
            };
            Executor executor = this.c;
            syuVarK.c(runnable, executor);
            return swf.i(ske.T(syuVarK, 60000L, TimeUnit.MILLISECONDS, scheduledExecutorService), TimeoutException.class, new mdv(1), executor);
        } catch (CameraAccessException unused) {
            return ske.M(true);
        }
    }
}
