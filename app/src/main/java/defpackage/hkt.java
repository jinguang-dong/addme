package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hkt extends View {
    public final pbu j;
    public final Context k;

    public hkt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new pbu();
        this.k = context;
    }

    protected final Matrix h() {
        pbu pbuVar = this.j;
        if (pbuVar.f()) {
            return pbuVar.a();
        }
        return null;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.j.e(i, i2, i3, i4, pao.e(nfl.a(getContext())));
    }
}
