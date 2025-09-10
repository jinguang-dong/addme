package defpackage;

import android.hardware.camera2.CameraManager;
import j$.lang.Iterable$EL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kgm extends CameraManager.AvailabilityCallback {
    final /* synthetic */ kgn a;
    private final kgl b;
    private final pjr c;
    private final scn d;

    public kgm(kgn kgnVar, kgl kglVar, pjr pjrVar, scn scnVar) {
        this.a = kgnVar;
        this.b = kglVar;
        this.c = pjrVar;
        this.d = scnVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final synchronized void onCameraAvailable(String str) {
        if (this.c.a.equals(str)) {
            synchronized (this.a) {
                scn scnVar = this.d;
                kgl kglVar = this.b;
                kglVar.getClass();
                Iterable$EL.forEach(scnVar, new gok(kglVar, 14));
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final synchronized void onPhysicalCameraAvailable(String str, String str2) {
        if (this.c.a.equals(str)) {
            synchronized (this.a) {
                this.b.a(str2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final synchronized void onPhysicalCameraUnavailable(String str, String str2) {
        if (this.c.a.equals(str)) {
            synchronized (this.a) {
                kgl kglVar = this.b;
                synchronized (kglVar.c) {
                    Map map = kglVar.a;
                    if (map.containsKey(str2)) {
                        map.put(str2, false);
                        kglVar.b();
                    }
                }
            }
        }
    }
}
