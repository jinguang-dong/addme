package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class so extends CameraManager.AvailabilityCallback {
    final /* synthetic */ uqx a;
    final /* synthetic */ sp b;

    public so(uqx uqxVar, sp spVar) {
        this.a = uqxVar;
        this.b = spVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        Object objO = ukc.O(this.a, wu.a);
        if (objO instanceof uqp) {
            uqq.b(objO);
            Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        if (a.ao(str, this.b.a)) {
            uqx uqxVar = this.a;
            pp.b(str);
            Object objO = ukc.O(uqxVar, new wt(str));
            if (objO instanceof uqp) {
                uqq.b(objO);
                Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        str.getClass();
        if (a.ao(str, this.b.a)) {
            uqx uqxVar = this.a;
            pp.b(str);
            Object objO = ukc.O(uqxVar, new wv(str));
            if (objO instanceof uqp) {
                uqq.b(objO);
                Log.w("CXCP", SHXc.cDZijqhSZCLkE + str + ')');
            }
        }
    }
}
