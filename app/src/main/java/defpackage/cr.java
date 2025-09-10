package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cr {
    public static final cy a = new cx();
    public static final cy b;

    static {
        cy cyVar = null;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            cls.getClass();
            cyVar = (cy) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = cyVar;
    }

    public static final void a(bm bmVar, bm bmVar2, boolean z, yd ydVar, boolean z2) {
        if ((z ? bmVar2.z() : bmVar.z()) != null) {
            ArrayList arrayList = new ArrayList(ydVar.d);
            Iterator it = ydVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(ydVar.d);
            Iterator it2 = ydVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public static final void b(List list, int i) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
