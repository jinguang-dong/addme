package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbl extends ojl {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ owq b;
    final /* synthetic */ kuj c;
    final /* synthetic */ hbj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbl(hbj hbjVar, AtomicInteger atomicInteger, owq owqVar, kuj kujVar) {
        super((short[]) null);
        this.d = hbjVar;
        this.a = atomicInteger;
        this.b = owqVar;
        this.c = kujVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        hbj hbjVar = this.d;
        if (this.a.incrementAndGet() == ((Number) hbjVar.a(gzo.b).get()).intValue() + ((Number) hbjVar.a(gzo.c).get()).intValue()) {
            this.b.a(juk.b);
            this.c.p(this);
        }
    }
}
