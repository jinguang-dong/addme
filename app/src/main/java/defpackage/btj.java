package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btj extends bvk {
    public static final btj a = new btj();

    private btj() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.bsr
    public final bss e(bst bstVar, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return bstVar.ds(cho.d(j), cho.c(j), ufx.a, aau.e);
        }
        if (size == 1) {
            bte bteVarR = ((bsq) list.get(0)).r(j);
            return bstVar.ds(chp.c(j, bteVarR.a), chp.b(j, bteVarR.b), ufx.a, new aal(bteVarR, 11));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            bte bteVarR2 = ((bsq) list.get(i)).r(j);
            iMax = Math.max(bteVarR2.a, iMax);
            iMax2 = Math.max(bteVarR2.b, iMax2);
            arrayList.add(bteVarR2);
        }
        return bstVar.ds(chp.c(j, iMax), chp.b(j, iMax2), ufx.a, new aaw(arrayList, 9));
    }
}
