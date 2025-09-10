package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icd {
    private final owf a;
    private final owf b;
    private final owf c;
    private final owf d;
    private final owq e;
    private owf f = new ovx(ixq.INACTIVE);

    public icd(owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owq owqVar) {
        this.a = owfVar;
        this.b = owfVar2;
        this.c = owfVar3;
        this.d = owfVar4;
        this.e = owqVar;
    }

    public final synchronized paq a() {
        int i = 2;
        if (d()) {
            return new hye(this, i);
        }
        float fFloatValue = ((Float) this.c.dL()).floatValue();
        ixq ixqVar = (ixq) this.d.dL();
        ixq ixqVar2 = ixq.NIGHT_SIGHT;
        boolean zEquals = ixqVar.equals(ixqVar2);
        boolean zEquals2 = ((ixq) this.f.dL()).equals(ixqVar2);
        owq owqVar = this.e;
        owqVar.a(new ick(true, SystemClock.elapsedRealtimeNanos(), fFloatValue, zEquals, zEquals2));
        this.a.dL();
        this.b.dL();
        long j = ((ick) owqVar.dL()).b;
        return new hye(this, i);
    }

    public final synchronized void b(owf owfVar) {
        this.f = owfVar;
    }

    public final synchronized void c() {
        if (d()) {
            this.e.a(ick.a());
        }
    }

    public final synchronized boolean d() {
        return ((ick) this.e.dL()).a;
    }
}
