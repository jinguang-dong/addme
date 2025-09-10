package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfo extends View {
    public final pbu e;

    public hfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new pbu();
    }

    public final Matrix a() {
        return this.e.a();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.e.e(i, i2, i3, i4, pao.e(nfl.a(getContext())));
    }
}
