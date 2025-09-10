package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gh implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ gi a;
    private final MenuItem.OnMenuItemClickListener b;

    public gh(gi giVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = giVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
