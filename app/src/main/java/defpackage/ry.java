package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ry implements ti {
    private final pl a;

    public ry(qrh qrhVar, pl plVar) {
        qrhVar.getClass();
        this.a = plVar;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ti
    public final Map a(ta taVar, Map map, tm tmVar) throws Exception {
        List list = this.a.d;
        if (list != null) {
            qs qsVar = (qs) ske.bH(((ocq) ((qqv) ske.bH(list)).b).a);
            Size size = qsVar.b;
            InputConfiguration inputConfiguration = new InputConfiguration(size.getWidth(), size.getHeight(), qsVar.c);
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
            }
            if (!taVar.l(inputConfiguration, arrayList, tmVar)) {
                Log.w("CXCP", mn.e((byte) 33, tmVar, taVar, "Failed to create reprocessable captures session from ", " for "));
                tmVar.h();
            }
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((Surface) ((Map.Entry) it2.next()).getValue());
            }
            if (!taVar.i(arrayList2, tmVar)) {
                Log.w("CXCP", mn.e((byte) 33, tmVar, taVar, "Failed to create captures session from ", " for "));
                tmVar.g();
            }
        }
        return ufx.a;
    }
}
