package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hop implements nnn {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ long c;

    public hop(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j) {
        this.a = atomicBoolean;
        this.b = atomicBoolean2;
        this.c = j;
    }

    @Override // defpackage.nnn
    public final boolean a(sfo sfoVar) {
        if (!this.a.get()) {
            return true;
        }
        sec secVarK = sfoVar.k();
        secVarK.getClass();
        sec secVarJ = sfoVar.j();
        secVarJ.getClass();
        return this.b.get() && ((Long) secVarK.b()).longValue() - ((Long) secVarJ.b()).longValue() > this.c;
    }
}
