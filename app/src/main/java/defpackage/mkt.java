package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mkt implements pdm {
    public static final sgv a = sgv.g("mkt");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicLong c = new AtomicLong(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicLong e = new AtomicLong();
    public final ovx f;
    public final long g;
    public final out h;
    public final mik i;
    public final izs j;
    public mjj k;

    public mkt(oxh oxhVar, ovx ovxVar, out outVar, izs izsVar, mik mikVar, mjj mjjVar) {
        this.f = ovxVar;
        this.h = outVar;
        this.j = izsVar;
        this.i = mikVar;
        this.k = mjjVar;
        this.g = 1000000000 / oxhVar.k;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    public final void b() {
        this.c.set(0L);
        this.d.set(0L);
        this.e.set(0L);
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        ojl.bB(phcVar, new fuh(this, 5));
    }
}
