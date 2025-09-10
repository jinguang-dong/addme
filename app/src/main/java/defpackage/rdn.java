package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdn implements rch {
    public boolean a = false;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, rds] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rch
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InputStream a(rcg rcgVar) {
        InputStream inputStreamE = rcgVar.b.e((Uri) rcgVar.f);
        if (this.a) {
            inputStreamE = new BufferedInputStream(inputStreamE);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamE);
        ?? r1 = rcgVar.d;
        if (!r1.isEmpty()) {
            int i = rcd.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((rdw) it.next()).b();
            }
            rcd rcdVar = !arrayList2.isEmpty() ? new rcd(inputStreamE, arrayList2) : null;
            if (rcdVar != null) {
                arrayList.add(rcdVar);
            }
        }
        for (rdx rdxVar : rcgVar.c) {
            arrayList.add(rdxVar.d());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
