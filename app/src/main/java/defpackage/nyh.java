package defpackage;

import android.content.Context;
import android.view.InputDevice;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyh {
    public boolean a;
    public final int b;

    public nyh(Context context) {
        int i;
        int[] deviceIds = InputDevice.getDeviceIds();
        int length = deviceIds.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = -1;
                break;
            }
            i = deviceIds[i2];
            InputDevice device = InputDevice.getDevice(i);
            if (device != null && device.supportsSource(4194304)) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = 1;
        if (i != -1 && ViewConfiguration.get(context).getScaledMinimumFlingVelocity(i, 26, 4194304) != Integer.MAX_VALUE) {
            i3 = 2;
        }
        this.b = i3;
    }
}
