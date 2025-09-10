package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfc implements hfa {
    public final dco a;
    public final dcb b = new hfb();

    public hfc(dco dcoVar) {
        this.a = dcoVar;
    }

    @Override // defpackage.hfa
    public final List a(long j) {
        return (List) dei.a(this.a, true, false, new hes(j, 3));
    }

    @Override // defpackage.hfa
    public final void b(hfd hfdVar) {
        dei.a(this.a, false, true, new dql(this, hfdVar, 15, null));
    }
}
