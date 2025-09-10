package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bf implements cwf {
    final /* synthetic */ bm a;

    public bf(bm bmVar) {
        this.a = bmVar;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        View view;
        if (cwaVar != cwa.ON_STOP || (view = this.a.P) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
