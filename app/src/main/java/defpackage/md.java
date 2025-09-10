package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class md implements gm {
    gb a;
    public gd b;
    final /* synthetic */ Toolbar c;

    public md(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.gm
    public final void b(Context context, gb gbVar) {
        gd gdVar;
        gb gbVar2 = this.a;
        if (gbVar2 != null && (gdVar = this.b) != null) {
            gbVar2.t(gdVar);
        }
        this.a = gbVar;
    }

    @Override // defpackage.gm
    public final void d(gl glVar) {
        throw null;
    }

    @Override // defpackage.gm
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gm
    public final boolean f(gt gtVar) {
        return false;
    }

    @Override // defpackage.gm
    public final boolean g(gd gdVar) {
        Toolbar toolbar = this.c;
        View view = toolbar.i;
        if (view instanceof gf) {
            ((gf) view).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.v;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                gdVar.h(false);
                toolbar.t();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // defpackage.gm
    public final boolean h(gd gdVar) {
        Toolbar toolbar = this.c;
        if (toolbar.h == null) {
            toolbar.h = new ht(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.h.setImageDrawable(toolbar.f);
            toolbar.h.setContentDescription(toolbar.g);
            me meVar = new me();
            meVar.a = (toolbar.n & ScriptIntrinsicBLAS.TRANSPOSE) | 8388611;
            meVar.b = 2;
            toolbar.h.setLayoutParams(meVar);
            toolbar.h.setOnClickListener(new gx(toolbar, 2));
        }
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        toolbar.i = gdVar.getActionView();
        this.b = gdVar;
        ViewParent parent2 = toolbar.i.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            me meVar2 = new me();
            meVar2.a = (toolbar.n & ScriptIntrinsicBLAS.TRANSPOSE) | 8388611;
            meVar2.b = 2;
            toolbar.i.setLayoutParams(meVar2);
            toolbar.addView(toolbar.i);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((me) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.v.add(childAt);
            }
        }
        toolbar.requestLayout();
        gdVar.h(true);
        View view = toolbar.i;
        if (view instanceof gf) {
            ((gf) view).a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.gm
    public final void i() {
        if (this.b != null) {
            gb gbVar = this.a;
            if (gbVar != null) {
                int size = gbVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // defpackage.gm
    public final void c(gb gbVar, boolean z) {
    }
}
