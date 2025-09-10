package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnd extends rlx {
    public final int o;
    public final int p;
    public boolean q;
    public final int r;
    public Integer s;
    public int t;
    public float u;
    public boolean v;
    public boolean w;

    public rnd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray typedArrayA = rlg.a(context, attributeSet, rne.c, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.o = typedArrayA.getInt(0, 1);
        int i = typedArrayA.getInt(1, 0);
        this.p = i;
        this.r = Math.min(typedArrayA.getDimensionPixelSize(4, 0), this.a);
        if (typedArrayA.hasValue(3)) {
            this.s = Integer.valueOf(typedArrayA.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayA.peekValue(2);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                this.t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayA.getResources().getDisplayMetrics()), this.a / 2);
                this.v = false;
                this.w = true;
            } else if (typedValuePeekValue.type == 6) {
                this.u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.v = true;
                this.w = true;
            }
        }
        typedArrayA.recycle();
        b();
        this.q = i == 1;
    }

    @Override // defpackage.rlx
    public final void b() {
        super.b();
        if (this.r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.o == 0) {
            if ((a() > 0 || (this.w && g() > 0)) && this.i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    @Override // defpackage.rlx
    public final boolean f() {
        return super.f() && g() == a();
    }

    public final int g() {
        return !this.w ? a() : this.v ? (int) (this.a * this.u) : this.t;
    }
}
