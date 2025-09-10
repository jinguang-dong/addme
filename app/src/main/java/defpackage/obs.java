package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class obs implements obg {
    final /* synthetic */ Runnable a;
    final /* synthetic */ obu b;

    public obs(obu obuVar, Runnable runnable) {
        this.a = runnable;
        this.b = obuVar;
    }

    @Override // defpackage.obg
    public final void a() {
        ((Handler) this.b.a).post(this.a);
    }
}
