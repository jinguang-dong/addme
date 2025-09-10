package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hkh extends SurfaceView {
    public final pbu a;

    public hkh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new pbu();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.a.e(i, i2, i3, i4, pao.e(nfl.a(getContext())));
    }
}
