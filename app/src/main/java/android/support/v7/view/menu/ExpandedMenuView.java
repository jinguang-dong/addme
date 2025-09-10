package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ga;
import defpackage.gb;
import defpackage.gd;
import defpackage.go;
import defpackage.pmg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ga, go {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private gb b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.go
    public final void a(gb gbVar) {
        this.b = gbVar;
    }

    @Override // defpackage.ga
    public final boolean b(gd gdVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((gd) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        pmg pmgVarJ = pmg.J(context, attributeSet, a, i, 0);
        if (pmgVarJ.F(0)) {
            setBackgroundDrawable(pmgVarJ.z(0));
        }
        if (pmgVarJ.F(1)) {
            setDivider(pmgVarJ.z(1));
        }
        pmgVarJ.D();
    }
}
