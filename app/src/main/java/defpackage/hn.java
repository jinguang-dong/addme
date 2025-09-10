package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hn {
    public lz a;
    private final View b;
    private lz e;
    private lz f;
    private int d = -1;
    private final hr c = hr.d();

    public hn(View view) {
        this.b = view;
    }

    public final void a() {
        View view = this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new lz();
                }
                lz lzVar = this.f;
                lzVar.a = null;
                lzVar.d = false;
                lzVar.b = null;
                lzVar.c = false;
                int[] iArr = con.a;
                ColorStateList colorStateListB = cog.b(view);
                if (colorStateListB != null) {
                    lzVar.d = true;
                    lzVar.a = colorStateListB;
                }
                PorterDuff.Mode modeC = cog.c(view);
                if (modeC != null) {
                    lzVar.c = true;
                    lzVar.b = modeC;
                }
                if (lzVar.d || lzVar.c) {
                    lj.g(background, lzVar, view.getDrawableState());
                    return;
                }
            }
            lz lzVar2 = this.a;
            if (lzVar2 != null) {
                lj.g(background, lzVar2, view.getDrawableState());
                return;
            }
            lz lzVar3 = this.e;
            if (lzVar3 != null) {
                lj.g(background, lzVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = fa.z;
        pmg pmgVarJ = pmg.J(context, attributeSet, iArr, i, 0);
        Object obj = pmgVarJ.b;
        Context context2 = view.getContext();
        int[] iArr2 = con.a;
        col.b(view, context2, iArr, attributeSet, (TypedArray) obj, i, 0);
        try {
            if (pmgVarJ.F(0)) {
                this.d = pmgVarJ.x(0, -1);
                ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (pmgVarJ.F(1)) {
                cog.f(view, pmgVarJ.y(1));
            }
            if (pmgVarJ.F(2)) {
                int iU = pmgVarJ.u(2, -1);
                Rect rect = je.a;
                cog.g(view, a.n(iU, null));
            }
        } finally {
            pmgVarJ.D();
        }
    }

    public final void c(int i) {
        this.d = i;
        hr hrVar = this.c;
        d(hrVar != null ? hrVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new lz();
            }
            lz lzVar = this.e;
            lzVar.a = colorStateList;
            lzVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
