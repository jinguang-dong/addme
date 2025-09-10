package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qom {
    public static sbp a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            Stream map = Collection.EL.stream(list).map(new qoi(2));
            int i = sbp.d;
            return (sbp) map.collect(ryv.a);
        }
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((qol) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            Stream map2 = Collection.EL.stream(list).map(new qoi(2));
            int i2 = sbp.d;
            return (sbp) map2.collect(ryv.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        int i3 = sbp.d;
        sbk sbkVar = new sbk();
        int size = arrayList.size();
        long jA2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            qol qolVar = (qol) arrayList.get(i5);
            i4++;
            jA2 += qolVar.a();
            if ((j >= 0 && i4 > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            sbkVar.h(qolVar.b());
        }
        return sbkVar.g();
    }

    public static void b(Context context) {
        try {
            Intent intent = new Intent("com.google.android.primes.action.DEBUG_PRIMES_EVENTS");
            intent.setPackage(context.getPackageName());
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ((sgt) qnj.a.c().M(5687)).s("PrimesEventActivity not found: primes/debug is not included in the app.");
        }
    }
}
