package defpackage;

import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuf {
    private final int a = c(R.dimen.boba_pip_foldable_tablet_layout_right_margin_4_3);
    private final int b = c(R.dimen.boba_pip_foldable_tablet_layout_right_margin_3_4);
    private final int c = c(R.dimen.boba_pip_foldable_tablet_layout_right_margin_16_9);
    private final int d = c(R.dimen.pro_controls_pip_landscape_offset_4_3);
    private final int e = c(R.dimen.pro_controls_pip_landscape_offset_16_9);
    private final owf f;
    private final owf g;
    private final Context h;

    public kuf(owf owfVar, owf owfVar2, Context context) {
        this.f = owfVar;
        this.g = owfVar2;
        this.h = context;
    }

    private final synchronized int c(int i) {
        return (int) this.h.getResources().getDimension(i);
    }

    private final synchronized boolean d() {
        owf owfVar = this.g;
        if (owfVar != null) {
            if (((mxj) owfVar.dL()).equals(mxj.TABLET_LAYOUT)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized float a(float f, qfq qfqVar, float f2, pae paeVar) {
        if (d()) {
            owf owfVar = this.f;
            if (((mxm) owfVar.dL()).e == 0) {
                if (paeVar.equals(pae.c)) {
                    return this.b;
                }
            } else if (((mxm) owfVar.dL()).e == 90) {
                if (paeVar.equals(pae.c)) {
                    return (qfqVar.b() - f) - f2;
                }
                if (paeVar.equals(pae.a) || paeVar.equals(pae.b)) {
                    return (qfqVar.a() - f) - f2;
                }
            } else if (((mxm) owfVar.dL()).e == 180) {
                if (paeVar.equals(pae.a)) {
                    return (qfqVar.a() - f) - f2;
                }
                if (paeVar.equals(pae.b)) {
                    return (qfqVar.b() - f) - f2;
                }
            }
        }
        return f;
    }

    public final synchronized float b(float f, qfq qfqVar, float f2, pae paeVar) {
        if (d()) {
            owf owfVar = this.f;
            if (((mxm) owfVar.dL()).e == 0) {
                if (paeVar.equals(pae.b)) {
                    return f + this.e;
                }
            } else if (((mxm) owfVar.dL()).e == 90) {
                if (paeVar.equals(pae.a)) {
                    return this.a - this.d;
                }
                if (paeVar.equals(pae.b)) {
                    return this.c;
                }
            } else if (((mxm) owfVar.dL()).e == 180) {
                if (paeVar.equals(pae.a)) {
                    return (qfqVar.b() - f) - f2;
                }
                if (paeVar.equals(pae.b)) {
                    return (qfqVar.a() - f) - f2;
                }
            } else if (((mxm) owfVar.dL()).e == 270) {
                if (paeVar.equals(pae.c)) {
                    return (qfqVar.a() - f) - f2;
                }
                if (paeVar.equals(pae.a)) {
                    return (qfqVar.b() - this.a) - f2;
                }
                if (paeVar.equals(pae.b)) {
                    return (qfqVar.b() - this.c) - f2;
                }
            }
        }
        return f;
    }
}
