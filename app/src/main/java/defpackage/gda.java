package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gda {
    public final plc a;
    public plb b;
    public final AtomicLong c;
    public final long d;
    public final cxb e;

    public gda(plc plcVar, cxb cxbVar) {
        plcVar.getClass();
        cxbVar.getClass();
        this.a = plcVar;
        this.e = cxbVar;
        this.c = new AtomicLong(-1L);
        this.d = TimeUnit.SECONDS.toNanos(1L) / 200;
    }
}
