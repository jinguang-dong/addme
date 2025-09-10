package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnw implements goj {
    private goj a;
    private final pka b;

    public gnw(Intent intent) {
        this.b = fdo.i(intent) ? pka.FRONT : pka.BACK;
    }

    @Override // defpackage.goj
    public final synchronized pka a() {
        goj gojVar;
        gojVar = this.a;
        return gojVar != null ? gojVar.a() : this.b;
    }

    public final synchronized void b(goj gojVar) {
        this.a = gojVar;
    }
}
