package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqj implements cnp {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public cqj(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.cnp
    public final float a() {
        float fA;
        if (this.b != 0) {
            RecyclerView recyclerView = (RecyclerView) this.a;
            if (recyclerView.m.Y()) {
                fA = recyclerView.K;
            } else {
                if (!recyclerView.m.X()) {
                    return 0.0f;
                }
                fA = recyclerView.J;
            }
        } else {
            fA = ((NestedScrollView) this.a).a();
        }
        return -fA;
    }

    @Override // defpackage.cnp
    public final void b() {
        if (this.b != 0) {
            ((RecyclerView) this.a).aj();
        } else {
            ((NestedScrollView) this.a).a.abortAnimation();
        }
    }

    @Override // defpackage.cnp
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.b == 0) {
            if (f == 0.0f) {
                return false;
            }
            b();
            ((NestedScrollView) this.a).j((int) f);
            return true;
        }
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.m.Y()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.m.X()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.aj();
        return recyclerView.an(i, i2, 0, Integer.MAX_VALUE);
    }
}
