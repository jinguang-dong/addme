package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ba extends br {
    final /* synthetic */ br a;
    final /* synthetic */ bb b;

    public ba(bb bbVar, br brVar) {
        this.b = bbVar;
        this.a = brVar;
    }

    @Override // defpackage.br
    public final View a(int i) {
        br brVar = this.a;
        if (brVar.b()) {
            return brVar.a(i);
        }
        Dialog dialog = this.b.c;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.br
    public final boolean b() {
        return this.a.b() || this.b.d;
    }
}
