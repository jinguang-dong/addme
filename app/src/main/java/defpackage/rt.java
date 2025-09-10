package defpackage;

import android.util.Log;
import j$.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rt implements ti {
    private final pl a;
    private final wq b;
    private final ut c;
    private final qrh d;

    public rt(qrh qrhVar, pl plVar, wq wqVar, ut utVar) {
        qrhVar.getClass();
        utVar.getClass();
        this.d = qrhVar;
        this.a = plVar;
        this.b = wqVar;
        this.c = utVar;
    }

    @Override // defpackage.ti
    public final Map a(ta taVar, Map map, tm tmVar) throws Exception {
        pl plVar = this.a;
        int i = plVar.g;
        if (!a.p(i, 2)) {
            throw new IllegalArgumentException("Unsupported session mode: " + ((Object) pn.a(i)) + " for Extension CameraGraph");
        }
        Map map2 = plVar.f;
        qm qmVar = tb.a;
        Object obj = map2.get(tb.a);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            throw new IllegalStateException("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
        }
        ut utVar = this.c;
        int iIntValue = num.intValue();
        Set setM = utVar.c(taVar.d()).m();
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (!setM.contains(numValueOf)) {
            throw new IllegalStateException(taVar + " does not support extension mode " + iIntValue + ". Supported extensions are " + Collection.EL.stream(setM));
        }
        List list = byi.bw(plVar, this.b, map).a;
        if (list.isEmpty()) {
            Objects.toString(plVar);
            Log.w("CXCP", "Failed to create OutputConfigurations for ".concat(plVar.toString()));
            tmVar.g();
            return ufx.a;
        }
        if (plVar.d != null) {
            throw new IllegalStateException("Reprocessing is not supported for Extensions");
        }
        if (!taVar.h(new tp(list, this.d.m(), tmVar, map2, numValueOf, new tq(tmVar)))) {
            Log.w("CXCP", mn.e((byte) 33, tmVar, taVar, "Failed to create ExtensionCaptureSession from ", " for "));
            tmVar.h();
        }
        return ufx.a;
    }
}
