package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class evj implements evg {
    private final List a;
    private final cnj b;

    public evj(List list, cnj cnjVar) {
        this.a = list;
        this.b = cnjVar;
    }

    @Override // defpackage.evg
    public final boolean a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((evg) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.evg
    public final tdy b(Object obj, int i, int i2, eqm eqmVar) {
        tdy tdyVarB;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r5 = 0;
        while (i3 < size) {
            evg evgVar = (evg) list.get(i3);
            if (evgVar.a(obj) && (tdyVarB = evgVar.b(obj, i, i2, eqmVar)) != null) {
                arrayList.add(tdyVarB.b);
                r5 = tdyVarB.c;
            }
            i3++;
            r5 = r5;
        }
        if (arrayList.isEmpty() || r5 == 0) {
            return null;
        }
        return new tdy((eqi) r5, new evi(arrayList, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
