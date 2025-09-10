package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwo implements qwp {
    private final /* synthetic */ int a;

    public qwo(int i) {
        this.a = i;
    }

    @Override // defpackage.qwp
    public final /* synthetic */ String a(tqq tqqVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((uyo) ((tpe) tqqVar).b).c : ((uzu) ((tpc) tqqVar).b).e : ((uxo) ((tpc) tqqVar).b).f;
    }

    @Override // defpackage.qwp
    public final /* synthetic */ String b(tqq tqqVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((uyo) ((tpe) tqqVar).b).e : ((uzu) ((tpc) tqqVar).b).d : ((uxo) ((tpc) tqqVar).b).e;
    }

    @Override // defpackage.qwp
    public final /* synthetic */ void c(tqq tqqVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                tpc tpcVar = (tpc) tqqVar;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                uxo uxoVar = (uxo) tpcVar.b;
                uxo uxoVar2 = uxo.a;
                uxoVar.b &= -3;
                uxoVar.d = 0L;
                return;
            }
            long jLongValue = l.longValue();
            tpc tpcVar2 = (tpc) tqqVar;
            if (!tpcVar2.b.C()) {
                tpcVar2.o();
            }
            uxo uxoVar3 = (uxo) tpcVar2.b;
            uxo uxoVar4 = uxo.a;
            uxoVar3.b |= 2;
            uxoVar3.d = jLongValue;
            return;
        }
        if (i != 1) {
            tpe tpeVar = (tpe) tqqVar;
            if (l == null) {
                if (!tpeVar.b.C()) {
                    tpeVar.o();
                }
                uyo uyoVar = (uyo) tpeVar.b;
                uyo uyoVar2 = uyo.a;
                uyoVar.b &= -3;
                uyoVar.d = 0L;
                return;
            }
            long jLongValue2 = l.longValue();
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            uyo uyoVar3 = (uyo) tpeVar.b;
            uyo uyoVar4 = uyo.a;
            uyoVar3.b |= 2;
            uyoVar3.d = jLongValue2;
            return;
        }
        if (l == null) {
            tpc tpcVar3 = (tpc) tqqVar;
            if (!tpcVar3.b.C()) {
                tpcVar3.o();
            }
            uzu uzuVar = (uzu) tpcVar3.b;
            uzu uzuVar2 = uzu.a;
            uzuVar.b &= -2;
            uzuVar.c = 0L;
            return;
        }
        long jLongValue3 = l.longValue();
        tpc tpcVar4 = (tpc) tqqVar;
        if (!tpcVar4.b.C()) {
            tpcVar4.o();
        }
        uzu uzuVar3 = (uzu) tpcVar4.b;
        uzu uzuVar4 = uzu.a;
        uzuVar3.b |= 1;
        uzuVar3.c = jLongValue3;
    }

    @Override // defpackage.qwp
    public final /* synthetic */ void d(tqq tqqVar) {
        int i = this.a;
        if (i == 0) {
            tpc tpcVar = (tpc) tqqVar;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            uxo uxoVar = (uxo) tpcVar.b;
            uxo uxoVar2 = uxo.a;
            uxoVar.b &= -5;
            uxoVar.e = uxo.a.e;
            return;
        }
        if (i != 1) {
            tpe tpeVar = (tpe) tqqVar;
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            uyo uyoVar = (uyo) tpeVar.b;
            uyo uyoVar2 = uyo.a;
            uyoVar.b &= -5;
            uyoVar.e = uyo.a.e;
            return;
        }
        tpc tpcVar2 = (tpc) tqqVar;
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        uzu uzuVar = (uzu) tpcVar2.b;
        uzu uzuVar2 = uzu.a;
        uzuVar.b &= -3;
        uzuVar.d = uzu.a.d;
    }
}
