package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quk extends qpt implements qqs, qov {
    private final qoz a;
    private final uem b;
    private final uem e;
    private final uem f;
    private final AtomicBoolean g;
    private final uem h;
    private final uem i;

    public quk(qoz qozVar, uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, tzj tzjVar) {
        super((char[]) null);
        this.g = new AtomicBoolean();
        this.i = uemVar4;
        this.a = qozVar;
        this.b = uemVar;
        this.e = uemVar2;
        this.f = uemVar3;
        this.h = new iyd(tzjVar, 6);
    }

    private static long f(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static uyp g(que queVar) {
        tpc tpcVarM = uyp.a.m();
        if (queVar.a != null) {
            String str = queVar.a;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uyp uypVar = (uyp) tpcVarM.b;
            str.getClass();
            uypVar.b |= 1;
            uypVar.c = str;
        }
        if (queVar.b != null) {
            long j = queVar.b.a;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uyp uypVar2 = (uyp) tpcVarM.b;
            uypVar2.b |= 2;
            uypVar2.d = j;
        }
        if (queVar.c != null) {
            long j2 = queVar.c.a;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uyp uypVar3 = (uyp) tpcVarM.b;
            uypVar3.b |= 4;
            uypVar3.e = j2;
        }
        if (queVar.d != null) {
            long j3 = queVar.d.a;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uyp uypVar4 = (uyp) tpcVarM.b;
            uypVar4.b |= 8;
            uypVar4.f = j3;
        }
        return (uyp) tpcVarM.l();
    }

    @Override // defpackage.qqs
    public final void cA() {
        this.a.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0347  */
    @Override // defpackage.qov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.qna r23) {
        /*
            Method dump skipped, instructions count: 1817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quk.i(qna):void");
    }

    @Override // defpackage.qov
    public final /* synthetic */ void j(qna qnaVar) {
    }
}
