package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfw {
    public final Object b = new Object();
    public szh c;
    public final gop d;
    private final CameraManager g;
    private final tzj h;
    private final Executor i;
    private static final sgv e = sgv.g("hfw");
    public static final Duration a = Duration.ofSeconds(7);
    private static final Duration f = Duration.ofMillis(200);

    public final hfv a() throws CameraAccessException {
        try {
            String[] cameraIdList = this.g.getCameraIdList();
            if (cameraIdList == null || cameraIdList.length <= 0) {
                return null;
            }
            return new hfv(true);
        } catch (CameraAccessException unused) {
            return null;
        }
    }

    public final hfv b(Duration duration) {
        Exception timeoutException;
        pbw pbwVar;
        hfu hfuVar;
        sgv sgvVar = e;
        sgt sgtVar = (sgt) sgvVar.c().M(1238);
        long millis = duration.toMillis();
        Duration duration2 = f;
        sgtVar.A("Attempting to reconnect to the camera service with a %dms timeout in %dms increments.", millis, duration2.toMillis());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        hfu hfuVar2 = null;
        try {
            try {
                our ourVar = new our();
                try {
                    hfuVar = new hfu(atomicBoolean);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    CameraManager cameraManager = this.g;
                    cameraManager.registerAvailabilityCallback(hfuVar, ojl.cg(ourVar, "PollUntilReconnect"));
                    long jDividedBy = duration.dividedBy(duration2);
                    long j = 0;
                    while (j < jDividedBy) {
                        try {
                            try {
                                String[] cameraIdList = cameraManager.getCameraIdList();
                                if (cameraIdList != null && cameraIdList.length > 0 && atomicBoolean.get()) {
                                    ((sgt) sgvVar.c().M(1241)).u("Camera Manager reconnect attempted and succeeded after ~%dms", (j + 1) * duration2.toMillis());
                                    mdy mdyVar = (mdy) this.h.a();
                                    pbw pbwVar2 = pbw.CAMERAS_NOT_ENUMERATED;
                                    mdyVar.J(1, pbwVar2, pbwVar2.c());
                                    this.d.i();
                                    hfv hfvVar = new hfv(true);
                                    ourVar.close();
                                    cameraManager.unregisterAvailabilityCallback(hfuVar);
                                    return hfvVar;
                                }
                                Duration duration3 = duration2;
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                Thread.sleep(duration3.toMillis(), 0);
                                j++;
                                atomicBoolean = atomicBoolean2;
                                duration2 = duration3;
                            } catch (CameraAccessException | InterruptedException e2) {
                                timeoutException = e2;
                                hfuVar2 = hfuVar;
                                ((sgt) ((sgt) e.b().i(timeoutException)).M(1240)).s("Camera Manager reconnect failed, or there are no cameras on this device.");
                                pbw pbwVarA = pbw.CAMERA_ERROR_CODE_UNKNOWN;
                                if (timeoutException instanceof CameraAccessException) {
                                    pbwVarA = pbw.a(((CameraAccessException) timeoutException).getReason());
                                } else if (timeoutException instanceof InterruptedException) {
                                    pbwVarA = pbw.CAMERAS_NOT_ENUMERATED;
                                }
                                pbwVar = pbwVarA;
                                this.d.e(pbwVar);
                                ((mdy) this.h.a()).J(3, pbwVar, timeoutException.getMessage());
                                if (hfuVar2 != null) {
                                    this.g.unregisterAvailabilityCallback(hfuVar2);
                                }
                                hfv hfvVar2 = new hfv(false);
                                hfvVar2.b = pbwVar;
                                hfvVar2.c = timeoutException;
                                return hfvVar2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            hfuVar2 = hfuVar;
                            if (hfuVar2 != null) {
                                this.g.unregisterAvailabilityCallback(hfuVar2);
                            }
                            throw th;
                        }
                    }
                    pbwVar = pbw.CAMERAS_NOT_ENUMERATED;
                    timeoutException = new TimeoutException("Camera Manager reconnect timed out after " + duration.toMillis() + "ms");
                    ((sgt) ((sgt) sgvVar.b().i(timeoutException)).M(1239)).s("Camera Manager reconnect failed, or there are no cameras on this device.");
                    this.d.e(pbwVar);
                    ((mdy) this.h.a()).J(2, pbwVar, pbwVar.c());
                    ourVar.close();
                    this.g.unregisterAvailabilityCallback(hfuVar);
                } catch (Throwable th3) {
                    th = th3;
                    hfuVar2 = hfuVar;
                    Throwable th4 = th;
                    try {
                        ourVar.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (CameraAccessException | InterruptedException e3) {
                timeoutException = e3;
            }
            hfv hfvVar22 = new hfv(false);
            hfvVar22.b = pbwVar;
            hfvVar22.c = timeoutException;
            return hfvVar22;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final syu c(Duration duration) {
        boolean z;
        szh szhVar;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new szh();
                z = true;
            } else {
                z = false;
            }
            szhVar = this.c;
        }
        if (z) {
            this.i.execute(new hdk(this, duration, 5));
        }
        return szhVar;
    }

    public hfw(CameraManager cameraManager, tzj tzjVar, Executor executor, pbn pbnVar, gop gopVar) {
        this.g = cameraManager;
        this.h = tzjVar;
        this.i = new pbs(executor, pbnVar, GAQqzWiWWcYOgy.eudM);
        this.d = gopVar;
    }
}
