package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kx extends byi {
    final /* synthetic */ RecyclerView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(RecyclerView recyclerView) {
        super((char[]) null);
        this.a = recyclerView;
    }

    @Override // defpackage.byi
    public final void cF() {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        recyclerView.O.f = true;
        recyclerView.V(true);
        if (recyclerView.aa.m()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.byi
    public final void cG(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        ovo ovoVar = recyclerView.aa;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) ovoVar.d;
        arrayList.add(ovoVar.d(4, i, i2, obj));
        ovoVar.b |= 4;
        if (arrayList.size() == 1) {
            e();
        }
    }

    @Override // defpackage.byi
    public final void cH(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        ovo ovoVar = recyclerView.aa;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) ovoVar.d;
        arrayList.add(ovoVar.d(1, i, i2, null));
        ovoVar.b |= 1;
        if (arrayList.size() == 1) {
            e();
        }
    }

    @Override // defpackage.byi
    public final void cI(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        ovo ovoVar = recyclerView.aa;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) ovoVar.d;
        arrayList.add(ovoVar.d(2, i, i2, null));
        ovoVar.b |= 2;
        if (arrayList.size() == 1) {
            e();
        }
    }

    final void e() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.s || !recyclerView.r) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.i;
            int[] iArr = con.a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}
