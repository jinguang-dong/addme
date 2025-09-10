package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqf extends rqk {
    public rqf(rqh rqhVar, pfl pflVar) {
        new rtl("OnCompleteUpdateCallback");
        super(rqhVar, pflVar);
    }

    @Override // defpackage.rqk
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (rqh.a(bundle) != 0) {
            this.c.e(new rqm(rqh.a(bundle)));
        } else {
            this.c.f(null);
        }
    }
}
