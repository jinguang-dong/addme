package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvk {
    public static final /* synthetic */ int a = 0;
    private static final String b = "dvk";

    public static final duy a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        duq duqVar;
        dup dupVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new duy(ufw.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int iA = cij.A(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = iA;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(iA));
        }
        List<SidecarDisplayFeature> listB = cij.B(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : listB) {
            sidecarDisplayFeature.getClass();
            b.getClass();
            Object objB = new duj(sidecarDisplayFeature).a("Type must be either TYPE_FOLD or TYPE_HINGE", new axa(20)).a("Feature bounds must not be 0", new dvj(1)).a("TYPE_FOLD must have 0 area", new dvj(0)).a("Feature be pinned to either left or top", new dvj(2)).b();
            dur durVar = null;
            if (objB != null) {
                int type = ((SidecarDisplayFeature) objB).getType();
                if (type == 1) {
                    duqVar = duq.a;
                } else if (type == 2) {
                    duqVar = duq.b;
                }
                int iA2 = cij.A(sidecarDeviceState2);
                if (iA2 == 2) {
                    dupVar = dup.b;
                } else if (iA2 == 3) {
                    dupVar = dup.a;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                durVar = new dur(new duc(rect), duqVar, dupVar);
            }
            if (durVar != null) {
                arrayList.add(durVar);
            }
        }
        return new duy(arrayList);
    }
}
