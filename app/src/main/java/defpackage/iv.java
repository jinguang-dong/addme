package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iv {
    public View d;
    public final rnu e;
    public int c = 0;
    public final iu a = new iu();
    public final List b = new ArrayList();

    public iv(rnu rnuVar) {
        this.e = rnuVar;
    }

    public final int a() {
        return this.e.w() - this.b.size();
    }

    public final int b(int i) {
        if (i < 0) {
            return -1;
        }
        int iW = this.e.w();
        int i2 = i;
        while (i2 < iW) {
            iu iuVar = this.a;
            int iA = i - (i2 - iuVar.a(i2));
            if (iA == 0) {
                while (iuVar.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA;
        }
        return -1;
    }

    public final int c() {
        return this.e.w();
    }

    final int d(View view) {
        int iX = this.e.x(view);
        if (iX != -1) {
            iu iuVar = this.a;
            if (!iuVar.f(iX)) {
                return iX - iuVar.a(iX);
            }
        }
        return -1;
    }

    public final View e(int i) {
        return this.e.y(b(i));
    }

    public final View f(int i) {
        return this.e.y(i);
    }

    public final void g(View view, int i, boolean z) {
        int iW = i < 0 ? this.e.w() : b(0);
        this.a.c(iW, z);
        if (z) {
            j(view);
        }
        RecyclerView recyclerView = (RecyclerView) this.e.a;
        recyclerView.addView(view, iW);
        lg lgVarI = RecyclerView.i(view);
        ki kiVar = recyclerView.l;
        if (kiVar != null && lgVarI != null) {
            kiVar.j(lgVarI);
        }
        List list = recyclerView.x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                kr krVar = (kr) view.getLayoutParams();
                if (krVar.width != -1 || krVar.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public final void h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iW = i < 0 ? this.e.w() : b(i);
        this.a.c(iW, z);
        if (z) {
            j(view);
        }
        rnu rnuVar = this.e;
        lg lgVarI = RecyclerView.i(view);
        if (lgVarI != null) {
            if (!lgVarI.w() && !lgVarI.z()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + lgVarI + ((RecyclerView) rnuVar.a).l());
            }
            lgVarI.i();
        }
        ((RecyclerView) rnuVar.a).attachViewToParent(view, iW, layoutParams);
    }

    final void i(int i) {
        iu iuVar = this.a;
        int iB = b(i);
        iuVar.g(iB);
        rnu rnuVar = this.e;
        View viewY = rnuVar.y(iB);
        if (viewY != null) {
            lg lgVarI = RecyclerView.i(viewY);
            if (lgVarI != null) {
                if (lgVarI.w() && !lgVarI.z()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + lgVarI + ((RecyclerView) rnuVar.a).l());
                }
                lgVarI.e(256);
            }
        } else {
            int i2 = RecyclerView.ad;
        }
        ((RecyclerView) rnuVar.a).detachViewFromParent(iB);
    }

    public final void j(View view) {
        this.b.add(view);
        lg lgVarI = RecyclerView.i(view);
        if (lgVarI != null) {
            rnu rnuVar = this.e;
            int i = lgVarI.p;
            if (i != -1) {
                lgVarI.o = i;
            } else {
                lgVarI.o = lgVarI.a.getImportantForAccessibility();
            }
            ((RecyclerView) rnuVar.a).au(lgVarI, 4);
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.z(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
