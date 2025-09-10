package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.a;
import defpackage.cij;
import defpackage.dvk;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    private SidecarDeviceState b;
    private final SidecarInterface.SidecarCallback d;
    private final Object a = new Object();
    private final Map c = new WeakHashMap();

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback, byte[] bArr) {
        this.d = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (defpackage.cij.A(r1) == defpackage.cij.A(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            androidx.window.sidecar.SidecarDeviceState r1 = r3.b     // Catch: java.lang.Throwable -> L27
            boolean r2 = defpackage.a.ao(r1, r4)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto Lf
            goto L1c
        Lf:
            if (r1 != 0) goto L12
            goto L1e
        L12:
            int r1 = defpackage.cij.A(r1)     // Catch: java.lang.Throwable -> L27
            int r2 = defpackage.cij.A(r4)     // Catch: java.lang.Throwable -> L27
            if (r1 != r2) goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L1e:
            r3.b = r4     // Catch: java.lang.Throwable -> L27
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.d     // Catch: java.lang.Throwable -> L27
            r3.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.a) {
            Map map = this.c;
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) map.get(iBinder);
            if (!a.ao(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                    List listB = cij.B(sidecarWindowLayoutInfo2);
                    List listB2 = cij.B(sidecarWindowLayoutInfo);
                    if (listB != listB2) {
                        if (listB.size() == listB2.size()) {
                            int size = listB.size();
                            for (int i = 0; i < size; i++) {
                                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) listB.get(i);
                                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) listB2.get(i);
                                if (!a.ao(sidecarDisplayFeature, sidecarDisplayFeature2)) {
                                    if (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && a.ao(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect())) {
                                    }
                                }
                            }
                        }
                    }
                }
                map.put(iBinder, sidecarWindowLayoutInfo);
                this.d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback) {
        int i = dvk.a;
        this.d = sidecarCallback;
    }
}
