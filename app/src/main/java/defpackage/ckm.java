package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckm {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public ckm(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void a(cjn cjnVar, cjv cjvVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (cjnVar == null) {
            return;
        }
        if (cjnVar.ah == 8) {
            cjvVar.c = 0;
            cjvVar.d = 0;
            cjvVar.e = 0;
            return;
        }
        if (cjnVar.U != null) {
            int i3 = cjvVar.i;
            int i4 = cjvVar.j;
            int i5 = cjvVar.a;
            int i6 = cjvVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            Object obj = cjnVar.ag;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = cjnVar.s;
                int i11 = cjvVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int iH = cjnVar.h();
                    if (cjvVar.h == 2 || i10 != 1 || measuredHeight == iH || (obj instanceof ckw) || cjnVar.e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(cjnVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                cjm cjmVar = cjnVar.J;
                int i13 = cjmVar != null ? cjmVar.f : 0;
                cjm cjmVar2 = cjnVar.L;
                if (cjmVar2 != null) {
                    i13 += cjmVar2.f;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = cjnVar.t;
                int i16 = cjvVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int iJ = cjnVar.j();
                    if (cjvVar.h == 2 || i15 != 1 || measuredWidth == iJ || (obj instanceof ckw) || cjnVar.f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(cjnVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = cjnVar.J != null ? cjnVar.K.f : 0;
                if (cjnVar.L != null) {
                    i18 += cjnVar.M.f;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            cjn cjnVar2 = cjnVar.U;
            if (cjnVar2 != null && cjs.b(this.h.f, 256)) {
                View view = (View) obj;
                if (view.getMeasuredWidth() == cjnVar.j() && view.getMeasuredWidth() < cjnVar2.j() && view.getMeasuredHeight() == cjnVar.h() && view.getMeasuredHeight() < cjnVar2.h() && view.getBaseline() == cjnVar.ab && !cjnVar.J() && b(cjnVar.H, iMakeMeasureSpec, cjnVar.j()) && b(cjnVar.I, iMakeMeasureSpec2, cjnVar.h())) {
                    cjvVar.c = cjnVar.j();
                    cjvVar.d = cjnVar.h();
                    cjvVar.e = cjnVar.ab;
                    return;
                }
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && cjnVar.X > 0.0f;
            boolean z6 = z2 && cjnVar.X > 0.0f;
            if (obj != null) {
                View view2 = (View) obj;
                ckl cklVar = (ckl) view2.getLayoutParams();
                boolean z7 = z4;
                int i19 = cjvVar.h;
                if (i19 != 1 && i19 != 2 && z && cjnVar.s == 0 && z2 && cjnVar.t == 0) {
                    i = -1;
                    baseline = 0;
                    iMax = 0;
                    iMax2 = 0;
                } else {
                    if ((obj instanceof ckz) && (cjnVar instanceof cjt)) {
                        throw null;
                    }
                    view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    cjnVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                    int i20 = cjnVar.v;
                    iMax = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = cjnVar.w;
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    int i22 = cjnVar.y;
                    iMax2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    int i23 = cjnVar.z;
                    if (i23 > 0) {
                        iMax2 = Math.min(i23, iMax2);
                    }
                    if (!cjs.b(this.h.f, 1)) {
                        if (z5 && z3) {
                            iMax = (int) ((iMax2 * cjnVar.X) + 0.5f);
                        } else if (z6 && z7) {
                            iMax2 = (int) ((iMax / cjnVar.X) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                        if (measuredWidth2 != iMax) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        cjnVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view2.getMeasuredWidth();
                        iMax2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                cjvVar.g = (iMax == cjvVar.a && iMax2 == cjvVar.b) ? false : true;
                boolean z9 = cklVar.ag | z8;
                if (!z9) {
                    i2 = baseline;
                } else if (baseline != -1) {
                    if (cjnVar.ab != baseline) {
                        cjvVar.g = true;
                    }
                    i2 = baseline;
                } else {
                    i2 = -1;
                }
                cjvVar.c = iMax;
                cjvVar.d = iMax2;
                cjvVar.f = z9;
                cjvVar.e = i2;
            }
        }
    }
}
