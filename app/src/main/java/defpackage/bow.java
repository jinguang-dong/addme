package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bow extends bij implements bov {
    public uiq a;

    public bow(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bov
    public final boolean q(KeyEvent keyEvent) {
        uiq uiqVar = this.a;
        if (uiqVar != null) {
            return ((Boolean) uiqVar.a(new bou(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.bov
    public final void x() {
    }
}
