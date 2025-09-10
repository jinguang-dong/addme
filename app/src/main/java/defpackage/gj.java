package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class gj implements AdapterView.OnItemClickListener, gq, gm {
    public Rect g;

    protected static fy v(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (fy) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (fy) listAdapter;
    }

    protected static boolean w(gb gbVar) {
        int size = gbVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gbVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static int x(ListAdapter listAdapter, Context context, int i) {
        int i2 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    @Override // defpackage.gm
    public final boolean g(gd gdVar) {
        return false;
    }

    @Override // defpackage.gm
    public final boolean h(gd gdVar) {
        return false;
    }

    public abstract void j(gb gbVar);

    public abstract void l(View view);

    public abstract void m(boolean z);

    public abstract void n(int i);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        v(listAdapter).a.A((MenuItem) listAdapter.getItem(i), this, true != t() ? 4 : 0);
    }

    public abstract void p(PopupWindow.OnDismissListener onDismissListener);

    public abstract void q(boolean z);

    public abstract void r(int i);

    protected boolean t() {
        return true;
    }

    @Override // defpackage.gm
    public final void b(Context context, gb gbVar) {
    }
}
