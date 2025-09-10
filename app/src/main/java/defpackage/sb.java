package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sb implements ti {
    private final pl a;
    private final wq b;
    private final qrh c;

    public sb(qrh qrhVar, pl plVar, wq wqVar) {
        qrhVar.getClass();
        this.c = qrhVar;
        this.a = plVar;
        this.b = wqVar;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ti
    public final Map a(ta taVar, Map map, tm tmVar) throws Exception {
        int i;
        ArrayList arrayList;
        pl plVar = this.a;
        int i2 = plVar.g;
        if (a.p(i2, 0)) {
            i = 0;
        } else if (a.p(i2, 1)) {
            i = 1;
        } else {
            if (a.p(i2, 2)) {
                String strA = pn.a(i2);
                Objects.toString(strA);
                throw new IllegalArgumentException("Unsupported session mode: ".concat(strA));
            }
            i = i2;
        }
        tv tvVarBw = byi.bw(plVar, this.b, map);
        List list = tvVarBw.a;
        if (list.isEmpty()) {
            Objects.toString(plVar);
            Log.w("CXCP", "Failed to create OutputConfigurations for ".concat(plVar.toString()));
            tmVar.g();
            return ufx.a;
        }
        List list2 = plVar.d;
        if (list2 != null) {
            arrayList = new ArrayList(ske.bq(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                qs qsVar = (qs) ske.bH(((ocq) ((qqv) it.next()).b).a);
                Size size = qsVar.b;
                arrayList.add(new tr(size.getWidth(), size.getHeight(), qsVar.c));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((tr) it2.next()).c != ((tr) arrayList2.get(0)).c) {
                    throw new IllegalStateException("All InputStream.Config objects must have the same format for multi resolution");
                }
            }
        }
        if (!taVar.g(new uo(i, arrayList2, list, this.c.m(), tmVar, plVar.f))) {
            Log.w("CXCP", mn.e((byte) 33, tmVar, taVar, "Failed to create capture session from ", " for "));
            tmVar.g();
        }
        return tvVarBw.b;
    }
}
