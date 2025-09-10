package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gt extends gb implements SubMenu {
    public final gb k;
    public final gd l;

    public gt(Context context, gb gbVar, gd gdVar) {
        super(context);
        this.k = gbVar;
        this.l = gdVar;
    }

    @Override // defpackage.gb
    public final gb a() {
        return this.k.a();
    }

    @Override // defpackage.gb
    public final String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return a.bv(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.l;
    }

    @Override // defpackage.gb
    public final void p(fz fzVar) {
        this.k.p(fzVar);
    }

    @Override // defpackage.gb, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // defpackage.gb, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // defpackage.gb
    public final boolean t(gd gdVar) {
        return this.k.t(gdVar);
    }

    @Override // defpackage.gb
    public final boolean u(gb gbVar, MenuItem menuItem) {
        return super.u(gbVar, menuItem) || this.k.u(gbVar, menuItem);
    }

    @Override // defpackage.gb
    public final boolean v(gd gdVar) {
        return this.k.v(gdVar);
    }

    @Override // defpackage.gb
    public final boolean w() {
        return this.k.w();
    }

    @Override // defpackage.gb
    public final boolean x() {
        return this.k.x();
    }

    @Override // defpackage.gb
    public final boolean y() {
        return this.k.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }
}
