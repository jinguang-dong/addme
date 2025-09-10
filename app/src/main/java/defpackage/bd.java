package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bd extends bk {
    final /* synthetic */ bm a;

    public bd(bm bmVar) {
        this.a = bmVar;
    }

    @Override // defpackage.bk
    public final void a() {
        bm bmVar = this.a;
        bmVar.af.W();
        cxf.c(bmVar);
        Bundle bundle = bmVar.g;
        bmVar.af.X(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
