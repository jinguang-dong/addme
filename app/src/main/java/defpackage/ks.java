package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ks {
    RecyclerView a;
    private Scroller b;
    private final kk c = new ln(this);

    public abstract int a(kq kqVar, int i, int i2);

    public abstract View b(kq kqVar);

    public abstract int[] c(kq kqVar, View view);

    protected lc d(kq kqVar) {
        if (kqVar instanceof lb) {
            return new lo(this, this.a.getContext());
        }
        return null;
    }

    public void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aA(this.c);
            this.a.H = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.H != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.az(this.c);
            RecyclerView recyclerView3 = this.a;
            recyclerView3.H = this;
            this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void f() {
        kq kqVar;
        View viewB;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (kqVar = recyclerView.m) == null || (viewB = b(kqVar)) == null) {
            return;
        }
        int[] iArrC = c(kqVar, viewB);
        int i = 0;
        int i2 = iArrC[0];
        if (i2 != 0) {
            i = i2;
        } else if (iArrC[1] == 0) {
            return;
        }
        this.a.aw(i, iArrC[1]);
    }

    public boolean g(int i, int i2) {
        lc lcVarD;
        int iA;
        RecyclerView recyclerView = this.a;
        kq kqVar = recyclerView.m;
        if (kqVar == null || recyclerView.l == null) {
            return false;
        }
        int i3 = recyclerView.I;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(kqVar instanceof lb) || (lcVarD = d(kqVar)) == null || (iA = a(kqVar, i, i2)) == -1) {
            return false;
        }
        lcVarD.b = iA;
        kqVar.aZ(lcVarD);
        return true;
    }

    public int[] h(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }
}
