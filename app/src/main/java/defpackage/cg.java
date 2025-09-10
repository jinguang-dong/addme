package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cg implements ce {
    final /* synthetic */ ch a;

    public cg(ch chVar) {
        this.a = chVar;
    }

    @Override // defpackage.ce
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        boolean zAf;
        int i;
        ch chVar = this.a;
        if (ch.X(2)) {
            Objects.toString(chVar.a);
        }
        int i2 = 0;
        if (chVar.c.isEmpty()) {
            zAf = false;
        } else {
            chVar.f = (ai) chVar.c.get(r0.size() - 1);
            ArrayList arrayList3 = chVar.f.d;
            int size = arrayList3.size();
            for (int i3 = 0; i3 < size; i3++) {
                bm bmVar = ((cp) arrayList3.get(i3)).b;
                if (bmVar != null) {
                    bmVar.s = true;
                }
            }
            zAf = chVar.af(arrayList, arrayList2, -1, 0);
        }
        if (!chVar.j.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(ch.ac((ai) arrayList.get(i4)));
            }
            ArrayList arrayList4 = chVar.j;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                cd cdVar = (cd) arrayList4.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        cdVar.e();
                    }
                }
                i2 = i;
            }
        }
        return zAf;
    }
}
