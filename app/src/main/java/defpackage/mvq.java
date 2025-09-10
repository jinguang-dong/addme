package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvq implements mng {
    final /* synthetic */ ndj a;
    final /* synthetic */ mvk b;

    public mvq(mvk mvkVar, ndj ndjVar) {
        this.b = mvkVar;
        this.a = ndjVar;
    }

    @Override // defpackage.mng
    public final void e(int i) {
        if (i == 15 && this.b.b) {
            new Handler().postDelayed(new mub(this.a, 10), 300L);
        }
    }

    @Override // defpackage.mng
    public final void eE(int i) {
    }
}
