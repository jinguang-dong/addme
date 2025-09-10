package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ia extends hw {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public ia(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.hw
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, i);
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = fa.g;
        pmg pmgVarJ = pmg.J(context, attributeSet, iArr, i, 0);
        Object obj = pmgVarJ.b;
        Context context2 = seekBar.getContext();
        int[] iArr2 = con.a;
        col.b(seekBar, context2, iArr, attributeSet, (TypedArray) obj, i, 0);
        Drawable drawableA = pmgVarJ.A(0);
        if (drawableA != null) {
            seekBar.setThumb(drawableA);
        }
        Drawable drawableZ = pmgVarJ.z(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableZ;
        if (drawableZ != null) {
            drawableZ.setCallback(seekBar);
            drawableZ.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableZ.isStateful()) {
                drawableZ.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (pmgVarJ.F(3)) {
            int iU = pmgVarJ.u(3, -1);
            PorterDuff.Mode mode = this.e;
            Rect rect = je.a;
            this.e = a.n(iU, mode);
            this.g = true;
        }
        if (pmgVarJ.F(2)) {
            this.d = pmgVarJ.y(2);
            this.f = true;
        }
        pmgVarJ.D();
        c();
    }
}
