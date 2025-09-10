package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class diu extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    public diu(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void Q(ld ldVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h == -1) {
            super.Q(ldVar, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.e;
        if (viewPager2.a() == 0) {
            recyclerView.getWidth();
            recyclerView.getPaddingLeft();
            recyclerView.getPaddingRight();
        } else {
            recyclerView.getHeight();
            recyclerView.getPaddingTop();
            recyclerView.getPaddingBottom();
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // defpackage.kq
    public final boolean bc(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.kq
    public final void n(kv kvVar, ld ldVar, View view, cpt cptVar) {
        ViewPager2 viewPager2 = ((dix) this.a.i).a;
        cptVar.p(ejs.p(viewPager2.a() == 1 ? LinearLayoutManager.bi(view) : 0, 1, viewPager2.a() == 0 ? LinearLayoutManager.bi(view) : 0, 1, false));
    }
}
