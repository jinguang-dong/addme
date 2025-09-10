package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scz extends sac {
    final /* synthetic */ Iterable a;
    final /* synthetic */ rvu b;

    public scz(Iterable iterable, rvu rvuVar) {
        this.a = iterable;
        this.b = rvuVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ujp.aK(((sbp) this.a).iterator(), this.b);
    }
}
