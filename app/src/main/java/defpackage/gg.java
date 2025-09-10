package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gg implements MenuItem.OnActionExpandListener {
    final /* synthetic */ gi a;
    private final MenuItem.OnActionExpandListener b;

    public gg(gi giVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = giVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
