package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsi {
    public static final aci a;
    public static final aci b;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    static {
        new aci(0.3f, 0.0f, 0.8f, 0.15f);
        new aci(0.05f, 0.7f, 0.1f, 1.0f);
        cwi cwiVar = new cwi();
        Object arrayList = cwiVar.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            cwiVar.b = arrayList;
        } else {
            ((ArrayList) arrayList).clear();
        }
        cwiVar.b("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1", (ArrayList) arrayList);
        bkn bknVar = new bkn((byte[]) null);
        ?? r0 = cwiVar.b;
        if (r0 != 0) {
            byi.B(r0, bknVar);
        } else {
            new bkn((byte[]) null);
        }
        new aci(0.4f, 0.0f, 1.0f, 1.0f);
        new aci(0.0f, 0.0f, 0.2f, 1.0f);
        new aci(0.4f, 0.0f, 0.2f, 1.0f);
        a = new aci(0.2f, 0.0f, 0.0f, 1.0f);
        new aci(0.3f, 0.0f, 1.0f, 1.0f);
        b = new aci(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
