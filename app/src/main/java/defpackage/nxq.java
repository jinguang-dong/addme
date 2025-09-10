package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nxq extends lc {
    private final float a;

    public nxq(Context context, float f) {
        super(context);
        this.a = 160.0f / Math.max(0.01f, f);
    }

    @Override // defpackage.lc
    protected final float a(DisplayMetrics displayMetrics) {
        return this.a / displayMetrics.densityDpi;
    }

    @Override // defpackage.lc
    public final int g(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? ((i3 + i4) - (i + i2)) / 2 : super.g(i, i2, i3, i4, i5);
    }

    @Override // defpackage.lc
    public final int h(View view, int i) {
        int iH = super.h(view, i);
        return i == 0 ? iH - nwj.a(this.d, view).x : iH;
    }

    @Override // defpackage.lc
    public final int i(View view, int i) {
        int i2 = super.i(view, i);
        return i == 0 ? i2 - nwj.a(this.d, view).y : i2;
    }

    @Override // defpackage.lc
    protected final int k() {
        return 0;
    }

    @Override // defpackage.lc
    protected final int l() {
        return 0;
    }
}
