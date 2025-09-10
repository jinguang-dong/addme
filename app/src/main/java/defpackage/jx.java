package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jx extends DataSetObserver {
    final /* synthetic */ jz a;

    public jx(jz jzVar) {
        this.a = jzVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        jz jzVar = this.a;
        if (jzVar.u()) {
            jzVar.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
