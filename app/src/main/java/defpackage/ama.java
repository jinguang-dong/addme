package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ama {
    private static final bsr a = new amb(akq.a, bib.a);

    public static final bsr a(akk akkVar, bid bidVar, ayc aycVar, int i) {
        if (a.ao(akkVar, akq.a) && a.ao(bidVar, bib.a)) {
            aycVar.u(-1073796759);
            aycVar.n();
            return a;
        }
        aycVar.u(-1073745888);
        boolean z = ((((i & 14) ^ 6) > 4 && aycVar.B(akkVar)) || (i & 6) == 4) | ((((i & ScriptIntrinsicBLAS.TRANSPOSE) ^ 48) > 32 && aycVar.B(bidVar)) || (i & 48) == 32);
        Object objF = aycVar.f();
        if (z || objF == ayb.a) {
            objF = new amb(akkVar, bidVar);
            aycVar.w(objF);
        }
        amb ambVar = (amb) objF;
        aycVar.n();
        return ambVar;
    }
}
