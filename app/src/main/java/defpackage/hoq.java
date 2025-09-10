package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoq {
    public static final sgv a = sgv.g("hoq");
    public final Map b = new ConcurrentHashMap();
    public final pmv c;
    private final qla d;
    private final int e;
    private final AtomicBoolean f;

    public hoq(qla qlaVar, int i, AtomicBoolean atomicBoolean, pmv pmvVar) {
        this.d = qlaVar;
        this.e = i;
        this.f = atomicBoolean;
        this.c = pmvVar;
    }

    public final synchronized void a() {
        qla qlaVar = this.d;
        int i = this.e;
        qkz qkzVarB = qlaVar.b(ByteBuffer.allocate(i), i);
        if (qkzVarB != null) {
            qkzVarB.a.limit(qkzVarB.b).rewind();
            if (this.f.get()) {
                this.c.o(qkzVarB.c, new mpc(qkzVarB, 12));
                for (Map.Entry entry : this.b.entrySet()) {
                    ((Executor) entry.getValue()).execute((Runnable) entry.getKey());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, sed, sfo] */
    public final void b(boolean z) {
        if (this.f.getAndSet(z) == z || z) {
            return;
        }
        pmv pmvVar = this.c;
        synchronized (pmvVar.a) {
            Object obj = pmvVar.b;
            ArrayList arrayList = new ArrayList(((ryb) obj).b);
            ?? r9 = pmvVar.c;
            Iterator itAt = ujp.at(r9);
            long j = -1;
            while (itAt.hasNext()) {
                Long l = (Long) itAt.next();
                long jLongValue = l.longValue();
                if (j != jLongValue) {
                    arrayList.addAll(((ryo) obj).b(l));
                    j = jLongValue;
                }
            }
            ((ryo) obj).l();
            r9.clear();
        }
    }
}
