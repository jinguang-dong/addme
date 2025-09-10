package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmj extends rlx {
    public final int o;
    public int p;
    public int q;
    public final int r;
    public final boolean s;

    public rmj(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayA = rlg.a(context, attributeSet, rne.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.o = typedArrayA.getInt(0, 0);
        int iB = rnt.b(context, typedArrayA, 4, dimensionPixelSize);
        int i = this.a;
        this.p = Math.max(iB, i + i);
        this.q = rnt.b(context, typedArrayA, 3, dimensionPixelSize2);
        this.r = typedArrayA.getInt(2, 0);
        this.s = typedArrayA.getBoolean(1, true);
        typedArrayA.recycle();
        b();
    }
}
