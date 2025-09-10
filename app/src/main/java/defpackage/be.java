package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class be extends br {
    final /* synthetic */ bm a;

    public be(bm bmVar) {
        this.a = bmVar;
    }

    @Override // defpackage.br
    public final View a(int i) {
        bm bmVar = this.a;
        View view = bmVar.P;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(a.bz(bmVar, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.br
    public final boolean b() {
        return this.a.P != null;
    }
}
