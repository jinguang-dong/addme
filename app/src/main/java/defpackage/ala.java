package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ala {
    private static final bsr a = new alc(akq.b, bib.d);

    public static final bsr a(akp akpVar, bic bicVar, ayc aycVar, int i) {
        if (a.ao(akpVar, akq.b) && a.ao(bicVar, bib.d)) {
            aycVar.u(-1446570776);
            aycVar.n();
            return a;
        }
        aycVar.u(-1446516929);
        boolean z = ((((i & 14) ^ 6) > 4 && aycVar.B(akpVar)) || (i & 6) == 4) | ((((i & ScriptIntrinsicBLAS.TRANSPOSE) ^ 48) > 32 && aycVar.B(bicVar)) || (i & 48) == 32);
        Object objF = aycVar.f();
        if (z || objF == ayb.a) {
            objF = new alc(akpVar, bicVar);
            aycVar.w(objF);
        }
        alc alcVar = (alc) objF;
        aycVar.n();
        return alcVar;
    }
}
