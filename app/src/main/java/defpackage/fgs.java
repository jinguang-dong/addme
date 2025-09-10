package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fgs {
    private static final sgv a = sgv.g("fgs");
    private final Resources b;
    private final boolean c;

    public fgs(Context context, fgn fgnVar) {
        this.b = context.getResources();
        this.c = fgnVar.c();
    }

    private final synchronized int b(int i) {
        try {
        } catch (Resources.NotFoundException e) {
            ((sgt) ((sgt) a.c().i(e)).M(ScriptIntrinsicBLAS.TRANSPOSE)).t(OPuAVreQM.uqhv, i);
            return 0;
        }
        return (int) this.b.getDimension(i);
    }

    private final synchronized boolean c() {
        return this.c;
    }

    public final synchronized fhb a(pae paeVar) {
        fhb fhbVar;
        fhbVar = new fhb();
        fhbVar.d = paeVar;
        boolean zC = c();
        fhbVar.a = zC;
        if (zC) {
            fhbVar.b = fhd.MEDIUM;
            fhbVar.c = fhd.LARGE;
        } else {
            fhbVar.b = fhd.SMALL;
            fhbVar.c = fhd.MEDIUM;
        }
        if (paeVar.equals(pae.b)) {
            fhbVar.l = b(R.dimen.pip_small_width_16_9);
            fhbVar.m = b(R.dimen.pip_small_height_16_9);
            fhbVar.e = fhbVar.a ? b(R.dimen.pip_large_width_16_9) : b(R.dimen.pip_medium_width_16_9);
            fhbVar.f = fhbVar.a ? b(R.dimen.pip_large_height_16_9) : b(R.dimen.pip_medium_height_16_9);
            fhbVar.n = fhbVar.a ? b(R.dimen.pip_medium_width_16_9) : b(R.dimen.pip_small_width_16_9);
            fhbVar.o = fhbVar.a ? b(R.dimen.pip_medium_height_16_9) : b(R.dimen.pip_small_height_16_9);
            b(R.dimen.pip_roi_bracket_width_16_9);
            b(R.dimen.pip_roi_bracket_height_16_9);
            fhbVar.g = b(R.dimen.pip_margin_16_9);
        } else if (paeVar.equals(pae.a)) {
            fhbVar.l = b(R.dimen.pip_small_width_4_3);
            fhbVar.m = b(R.dimen.pip_small_height_4_3);
            fhbVar.e = fhbVar.a ? b(R.dimen.pip_large_width_4_3) : b(R.dimen.pip_medium_width_4_3);
            fhbVar.f = fhbVar.a ? b(R.dimen.pip_large_height_4_3) : b(R.dimen.pip_medium_height_4_3);
            fhbVar.n = fhbVar.a ? b(R.dimen.pip_medium_width_4_3) : b(R.dimen.pip_small_width_4_3);
            fhbVar.o = fhbVar.a ? b(R.dimen.pip_medium_height_4_3) : b(R.dimen.pip_small_height_4_3);
            b(R.dimen.pip_roi_bracket_width_4_3);
            b(R.dimen.pip_roi_bracket_height_4_3);
            fhbVar.g = b(R.dimen.pip_margin_4_3);
        } else {
            fhbVar.l = b(R.dimen.pip_small_width_imm);
            fhbVar.m = b(R.dimen.pip_small_height_imm);
            fhbVar.e = fhbVar.a ? b(R.dimen.pip_large_width_imm) : b(R.dimen.pip_medium_width_imm);
            fhbVar.f = fhbVar.a ? b(R.dimen.pip_large_height_imm) : b(R.dimen.pip_medium_height_imm);
            fhbVar.n = fhbVar.a ? b(R.dimen.pip_medium_width_imm) : b(R.dimen.pip_small_width_imm);
            fhbVar.o = fhbVar.a ? b(R.dimen.pip_medium_height_imm) : b(R.dimen.pip_small_height_imm);
            b(R.dimen.pip_roi_bracket_width_imm);
            b(R.dimen.pip_roi_bracket_height_imm);
            fhbVar.g = b(R.dimen.pip_margin_imm);
        }
        fhbVar.h = b(R.dimen.pip_inside_stroke);
        fhbVar.i = b(R.dimen.pip_outside_stroke);
        fhbVar.j = b(R.dimen.pip_inside_radius);
        fhbVar.k = b(R.dimen.pip_outside_radius);
        fhbVar.p = b(R.dimen.pip_inside_collapsed_radius);
        fhbVar.q = b(R.dimen.pip_outside_collapsed_radius);
        return fhbVar;
    }
}
