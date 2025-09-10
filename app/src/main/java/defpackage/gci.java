package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gci implements pdm {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ szh b;
    final /* synthetic */ pdn c;
    final /* synthetic */ gcm d;

    public gci(gcm gcmVar, AtomicInteger atomicInteger, szh szhVar, pdn pdnVar) {
        this.a = atomicInteger;
        this.b = szhVar;
        this.c = pdnVar;
        this.d = gcmVar;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        if (this.a.incrementAndGet() == this.d.h) {
            this.b.e(gcm.b);
            this.c.m(this);
        }
    }
}
