package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvn {
    public final SidecarInterface a;
    public final dvk b;
    public final Map c;
    public final Map d;
    public dvl e;

    public dvn(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        dvk dvkVar = new dvk();
        this.a = sidecarImpl;
        this.b = dvkVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final duy a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderY = cij.y(activity);
        if (iBinderY == null) {
            return new duy(ufw.a);
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderY) : null;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return dvk.a(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(IBinder iBinder, Activity activity) {
        Map map = this.c;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        int size = map.size();
        int i = 1;
        if (size == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        dvl dvlVar = this.e;
        if (dvlVar != null) {
            dvlVar.a(activity, a(activity));
        }
        Map map2 = this.d;
        if (map2.get(activity) == null && (activity instanceof clw)) {
            jmi jmiVar = new jmi(this, activity, i);
            map2.put(activity, jmiVar);
            ((clw) activity).er(jmiVar);
        }
    }
}
