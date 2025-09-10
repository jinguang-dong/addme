package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byg {
    public static final byg a = new byg();

    private byg() {
    }

    public final void a(View view, bps bpsVar) {
        boolean z = bpsVar instanceof bpf;
        Context context = view.getContext();
        if (z) {
            throw null;
        }
        PointerIcon systemIcon = bpsVar instanceof bpg ? PointerIcon.getSystemIcon(context, ((bpg) bpsVar).a) : PointerIcon.getSystemIcon(context, 1000);
        if (a.ao(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
