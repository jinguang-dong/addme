package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtu extends rqp {
    final /* synthetic */ ArCoreApk.ICheckAvailabilityCallback a;

    public rtu(ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        this.a = iCheckAvailabilityCallback;
    }

    @Override // defpackage.rqq
    public final void c(Bundle bundle) {
    }

    @Override // defpackage.rqq
    public final void b(Bundle bundle) {
        int i = bundle.getInt("error.code", -100);
        String str = PJGqOKsIpSdZ.LrwLJU;
        if (i == -5) {
            Log.e(str, "The device is not supported.");
            this.a.onResult(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i == -3) {
            Log.e(str, "The Google Play application must be updated.");
            this.a.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i == 0) {
            this.a.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        } else {
            Log.e(str, a.bv(i, "requestInfo returned: "));
            this.a.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
