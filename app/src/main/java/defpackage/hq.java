package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hq {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public hq(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.b) {
                    drawableMutate.setTintList(null);
                }
                if (this.c) {
                    drawableMutate.setTintMode(this.a);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    final void b(AttributeSet attributeSet, int i) {
        int iX;
        int iX2;
        CompoundButton compoundButton = this.d;
        Context context = compoundButton.getContext();
        int[] iArr = fa.m;
        pmg pmgVarJ = pmg.J(context, attributeSet, iArr, i, 0);
        Object obj = pmgVarJ.b;
        Context context2 = compoundButton.getContext();
        int[] iArr2 = con.a;
        col.b(compoundButton, context2, iArr, attributeSet, (TypedArray) obj, i, 0);
        try {
            if (pmgVarJ.F(1) && (iX2 = pmgVarJ.x(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(byi.bJ(compoundButton.getContext(), iX2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (pmgVarJ.F(0) && (iX = pmgVarJ.x(0, 0)) != 0) {
                CompoundButton compoundButton2 = this.d;
                compoundButton2.setButtonDrawable(byi.bJ(compoundButton2.getContext(), iX));
            }
            if (pmgVarJ.F(2)) {
                this.d.setButtonTintList(pmgVarJ.y(2));
            }
            if (pmgVarJ.F(3)) {
                CompoundButton compoundButton3 = this.d;
                int iU = pmgVarJ.u(3, -1);
                Rect rect = je.a;
                compoundButton3.setButtonTintMode(a.n(iU, null));
            }
        } finally {
            pmgVarJ.D();
        }
    }

    final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
