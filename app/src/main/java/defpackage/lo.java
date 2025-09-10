package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lo extends lc {
    final /* synthetic */ ks a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(ks ksVar, Context context) {
        super(context);
        this.a = ksVar;
    }

    @Override // defpackage.lc
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.lc
    protected final void c(View view, la laVar) {
        ks ksVar = this.a;
        RecyclerView recyclerView = ksVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrC = ksVar.c(recyclerView.m, view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iJ = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (iJ > 0) {
            laVar.b(i, i2, iJ, this.j);
        }
    }
}
