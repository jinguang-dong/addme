package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ji extends kk {
    final /* synthetic */ jk a;

    public ji(jk jkVar) {
        this.a = jkVar;
    }

    @Override // defpackage.kk
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        jk jkVar = this.a;
        int iComputeVerticalScrollRange = jkVar.l.computeVerticalScrollRange();
        int i3 = jkVar.k;
        jkVar.m = iComputeVerticalScrollRange - i3 > 0 && i3 >= jkVar.a;
        int iComputeHorizontalScrollRange = jkVar.l.computeHorizontalScrollRange();
        int i4 = jkVar.j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= jkVar.a;
        jkVar.n = z;
        if (jkVar.m) {
            float f = i3;
            jkVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            jkVar.d = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (jkVar.o != 0) {
                jkVar.b(0);
                return;
            }
            return;
        }
        if (jkVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i4;
            jkVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            jkVar.g = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = jkVar.o;
        if (i5 == 0 || i5 == 1) {
            jkVar.b(1);
        }
    }
}
