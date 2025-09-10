package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class how {
    private static final sgv a = sgv.g("how");
    private final Deque b = new ArrayDeque();

    public final synchronized void a(hpd hpdVar) {
        this.b.addLast(hpdVar);
        hgc.m(hpdVar);
    }

    public final synchronized void b(hpd hpdVar) {
        if (hpdVar == null) {
            ((sgt) a.c().M(1415)).s("Invalid frame store resource.");
        } else if (this.b.removeFirstOccurrence(hpdVar)) {
            hgc.m(hpdVar);
        } else {
            ((sgt) a.c().M(1413)).s("Resource not found in queue");
        }
    }
}
