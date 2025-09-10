package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kyx implements pdm {
    final /* synthetic */ kyy c;
    private final long f;
    public final List a = new ArrayList();
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicInteger e = new AtomicInteger(0);
    public boolean b = true;

    public kyx(kyy kyyVar, long j) {
        this.c = kyyVar;
        this.f = j;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        synchronized (this) {
            if (this.b) {
                pdo pdoVarB = phcVar.b();
                if (pdoVarB != null) {
                    if (pdoVarB.c <= this.f) {
                        return;
                    }
                    AtomicInteger atomicInteger = this.d;
                    kyy kyyVar = this.c;
                    if (atomicInteger.get() >= kyyVar.b) {
                        synchronized (kyyVar.c) {
                            kyyVar.e.m(kyyVar.d);
                        }
                        synchronized (this) {
                            this.b = false;
                            notifyAll();
                        }
                        return;
                    }
                    pdk pdkVarA = phcVar.a();
                    AtomicInteger atomicInteger2 = this.d;
                    atomicInteger2.incrementAndGet();
                    if (pdkVarA == null) {
                        ((sgt) kyy.a.c().M(3791)).H("Image not available %d (done: %s, metadata done: %s, images done: %s", Integer.valueOf(atomicInteger2.get()), Boolean.valueOf(phcVar.e()), Boolean.valueOf(phcVar.b.n()), Boolean.valueOf(phcVar.f()));
                        this.c.f.a(null);
                        return;
                    }
                    this.a.add(pdkVarA);
                    this.c.f.a(null);
                    AtomicInteger atomicInteger3 = this.e;
                    atomicInteger3.incrementAndGet();
                    pdkVarA.c();
                    atomicInteger3.get();
                }
            }
        }
    }
}
