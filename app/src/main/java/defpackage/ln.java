package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ln extends kk {
    boolean a = false;
    final /* synthetic */ ks b;

    public ln(ks ksVar) {
        this.b = ksVar;
    }

    @Override // defpackage.kk
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }

    @Override // defpackage.kk
    public final void c(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }
}
