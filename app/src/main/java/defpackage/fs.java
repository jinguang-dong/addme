package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fs {
    final Context a;
    public aaa b;

    public fs(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof cmn)) {
            return menuItem;
        }
        cmn cmnVar = (cmn) menuItem;
        if (this.b == null) {
            this.b = new aaa();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(cmnVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        gi giVar = new gi(this.a, cmnVar);
        this.b.put(cmnVar, giVar);
        return giVar;
    }
}
