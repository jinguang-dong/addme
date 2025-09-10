package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hg extends fr {
    he g;
    public int h;
    public hf i;
    public hc j;
    public kha k;
    final en l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r;
    private AmbientMode.AmbientController s;

    public hg(Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.l = new en(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gn] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.fr
    public final View a(gd gdVar, View view, ViewGroup viewGroup) {
        View actionView = gdVar.getActionView();
        if (actionView == null || gdVar.m()) {
            ActionMenuItemView actionMenuItemView = view instanceof gn ? (gn) view : (gn) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.f(gdVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            if (this.s == null) {
                this.s = new AmbientMode.AmbientController(this);
            }
            actionMenuItemView2.c = this.s;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == gdVar.o ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof hj)) {
            actionView.setLayoutParams(ActionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.fr, defpackage.gm
    public final void b(Context context, gb gbVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = gbVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = a.aS(context);
        int measuredWidth = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new he(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.fr, defpackage.gm
    public final void c(gb gbVar, boolean z) {
        n();
        gl glVar = this.e;
        if (glVar != null) {
            glVar.a(gbVar, z);
        }
    }

    @Override // defpackage.fr, defpackage.gm
    public final boolean e() {
        ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        gb gbVar = this.c;
        View view = null;
        boolean z4 = false;
        if (gbVar != null) {
            arrayListF = gbVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.h;
        int i2 = this.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i3 = 0;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            gd gdVar = (gd) arrayListF.get(i3);
            if (gdVar.r()) {
                i4++;
            } else if (gdVar.q()) {
                i5++;
            } else {
                z5 = true;
            }
            if (this.q && gdVar.o) {
                i = 0;
            }
            i3++;
        }
        if (this.m && (z5 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            gd gdVar2 = (gd) arrayListF.get(i7);
            if (gdVar2.r()) {
                View viewA = a(gdVar2, view, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = gdVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                gdVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (gdVar2.q()) {
                int i10 = gdVar2.b;
                boolean z6 = sparseBooleanArray.get(i10);
                boolean z7 = ((i6 > 0 || z6) && i2 > 0) ? z : z4;
                if (z7) {
                    View viewA2 = a(gdVar2, view, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z7 = i2 + i8 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z6) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        gd gdVar3 = (gd) arrayListF.get(i11);
                        boolean z9 = z;
                        if (gdVar3.b == i10) {
                            if (gdVar3.o()) {
                                i6++;
                            }
                            gdVar3.k(false);
                        }
                        i11++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i6--;
                }
                gdVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                gdVar2.k(z2);
            }
            i7++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3, types: [gb] */
    @Override // defpackage.fr, defpackage.gm
    public final boolean f(gt gtVar) {
        boolean z = false;
        if (!gtVar.hasVisibleItems()) {
            return false;
        }
        gt gtVar2 = gtVar;
        while (true) {
            gb gbVar = gtVar2.k;
            if (gbVar == this.c) {
                break;
            }
            gtVar2 = (gt) gbVar;
        }
        gd gdVar = gtVar2.l;
        ViewGroup viewGroup = (ViewGroup) this.f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                ?? childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof gn) && ((gn) childAt).a() == gdVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        gd gdVar2 = gtVar.l;
        int size = gtVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = gtVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        hc hcVar = new hc(this, this.b, gtVar, view);
        this.j = hcVar;
        hcVar.d(z);
        if (!this.j.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        gl glVar = this.e;
        gt gtVar3 = gtVar;
        if (glVar != null) {
            if (gtVar == null) {
                gtVar3 = this.c;
            }
            glVar.b(gtVar3);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    @Override // defpackage.fr, defpackage.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg.i():void");
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        Object obj;
        kha khaVar = this.k;
        if (khaVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(khaVar);
            this.k = null;
            return true;
        }
        hf hfVar = this.i;
        if (hfVar == null) {
            return false;
        }
        hfVar.b();
        return true;
    }

    public final boolean l() {
        hf hfVar = this.i;
        return hfVar != null && hfVar.g();
    }

    public final boolean m() {
        gb gbVar;
        if (!this.m || l() || (gbVar = this.c) == null || this.f == null || this.k != null || gbVar.e().isEmpty()) {
            return false;
        }
        this.k = new kha(this, new hf(this, this.b, this.c, this.g), 1);
        ((View) this.f).post(this.k);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.q = true;
    }

    public final void p() {
        this.m = true;
        this.n = true;
    }

    public final void q() {
        hc hcVar = this.j;
        if (hcVar != null) {
            hcVar.b();
        }
    }
}
