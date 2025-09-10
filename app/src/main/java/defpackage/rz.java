package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rz implements ti {
    private final wq a;
    private final pl b;

    public rz(qrh qrhVar, wq wqVar, pl plVar) {
        qrhVar.getClass();
        this.a = wqVar;
        this.b = plVar;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ti
    public final Map a(ta taVar, Map map, tm tmVar) throws Exception {
        boolean zM;
        pl plVar = this.b;
        List list = byi.bw(plVar, this.a, map).a;
        if (list.isEmpty()) {
            Objects.toString(plVar);
            Log.w("CXCP", "Failed to create OutputConfigurations for ".concat(plVar.toString()));
            tmVar.g();
            return ufx.a;
        }
        List list2 = plVar.d;
        if (list2 == null) {
            zM = taVar.j(list, tmVar);
        } else {
            qs qsVar = (qs) ske.bH(((ocq) ((qqv) ske.bH(list2)).b).a);
            Size size = qsVar.b;
            zM = taVar.m(new tr(size.getWidth(), size.getHeight(), qsVar.c), list, tmVar);
        }
        if (!zM) {
            Log.w("CXCP", mn.e((byte) 33, tmVar, taVar, "Failed to create capture session from ", " for "));
            tmVar.g();
        }
        return ufx.a;
    }
}
