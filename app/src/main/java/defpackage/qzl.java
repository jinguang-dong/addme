package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzl {
    public syu a = null;
    public final ConcurrentMap b = new ConcurrentHashMap();

    public final qzm[] a(String str) {
        AtomicReference atomicReference = (AtomicReference) this.b.get(str);
        if (atomicReference == null) {
            return null;
        }
        return (qzm[]) atomicReference.get();
    }

    public final synchronized void b(qxf qxfVar) {
        if (this.a == null) {
            this.a = prt.d(qxfVar.c, new qly(this, 10), qxfVar.b());
        }
    }
}
