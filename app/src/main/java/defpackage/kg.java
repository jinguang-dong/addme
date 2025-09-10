package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kg extends lc {
    final /* synthetic */ kh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(kh khVar, Context context) {
        super(context);
        this.a = khVar;
    }

    @Override // defpackage.lc
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.lc
    protected final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.lc
    protected final void c(View view, la laVar) {
        kh khVar = this.a;
        int[] iArrC = khVar.c(khVar.a.m, view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iJ = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (iJ > 0) {
            laVar.b(i, i2, iJ, this.j);
        }
    }
}
