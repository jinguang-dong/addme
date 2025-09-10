package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lbk implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lbk(kuj kujVar, hbj hbjVar, owq owqVar, int i) {
        this.d = i;
        this.a = kujVar;
        this.c = hbjVar;
        this.b = owqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            AtomicInteger atomicInteger = new AtomicInteger(0);
            ?? r1 = this.b;
            Object obj = this.c;
            kuj kujVar = (kuj) this.a;
            kujVar.o(new lbl((hbj) obj, atomicInteger, r1, kujVar));
            return;
        }
        if (i != 1) {
            if (i != 2) {
                Object obj2 = this.c;
                ((ldh) this.a).h((ldi) this.b, (iby) obj2);
                return;
            } else {
                ?? r0 = this.a;
                pfu pfuVar = (pfu) this.b;
                ((our) this.c).d(pfuVar.a(pfuVar.d(r0)));
                return;
            }
        }
        Object obj3 = this.c;
        lpd lpdVar = (lpd) obj3;
        if (!lpdVar.a || nvm.h == null) {
            return;
        }
        Object obj4 = this.a;
        fcj fcjVar = new fcj(lpdVar, (pfu) this.b);
        lpdVar.a(fcjVar);
        ((our) obj4).d(new ktu(obj3, fcjVar, 2, (byte[]) null));
    }

    public /* synthetic */ lbk(ldh ldhVar, ldi ldiVar, iby ibyVar, int i) {
        this.d = i;
        this.a = ldhVar;
        this.b = ldiVar;
        this.c = ibyVar;
    }

    public /* synthetic */ lbk(lpd lpdVar, pfu pfuVar, our ourVar, int i) {
        this.d = i;
        this.c = lpdVar;
        this.b = pfuVar;
        this.a = ourVar;
    }

    public /* synthetic */ lbk(pfu pfuVar, peo peoVar, our ourVar, int i) {
        this.d = i;
        this.b = pfuVar;
        this.a = peoVar;
        this.c = ourVar;
    }
}
