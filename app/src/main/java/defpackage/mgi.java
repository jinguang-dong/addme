package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgi {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public mgi(pfu pfuVar, pdv pdvVar, peo peoVar, klf klfVar, kuw kuwVar, pbn pbnVar, uh uhVar, kwr kwrVar, kwb kwbVar) {
        this.g = pfuVar;
        this.e = pdvVar;
        this.a = peoVar;
        this.b = klfVar;
        this.f = kuwVar;
        this.c = pbnVar;
        this.i = uhVar;
        this.h = kwrVar;
        this.d = kwbVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, owq] */
    public final void a() {
        Object obj = this.f;
        lur lurVar = luf.an;
        luj lujVar = (luj) obj;
        if (((Boolean) lujVar.b(lurVar)).booleanValue()) {
            ((luj) this.g).d(lurVar, false);
        }
        this.a.a((Boolean) lujVar.b(luf.ap));
        this.b.a((String) lujVar.b(luf.aq));
        luj lujVar2 = (luj) this.g;
        lujVar2.d(luf.aO, (Integer) lujVar.b(luf.ar));
        lujVar2.d(luf.Q, (Boolean) lujVar.b(luf.as));
        this.c.a((Boolean) lujVar.b(luf.at));
        ((owx) this.d).a(lty.a((String) lujVar.b(luf.au)));
        Object obj2 = this.i;
        ((pmv) obj2).b.a(ltt.a((String) lujVar.b(luf.av)));
    }

    public final void b(mgn mgnVar) {
        long j = mgnVar.b;
        if (j >= 1000000000) {
            luj lujVar = (luj) this.f;
            if (((Boolean) lujVar.b(luf.an)).booleanValue() && ((Boolean) lujVar.b(luf.ao)).booleanValue()) {
                a();
            }
        }
        ((luj) this.g).d(luf.ao, Boolean.valueOf(j < 1000000000));
    }

    public mgi(owq owqVar, owq owqVar2, owq owqVar3, luw luwVar, owq owqVar4, pmv pmvVar, luj lujVar, luj lujVar2, hbj hbjVar) {
        this.a = owqVar;
        this.b = owqVar2;
        this.c = owqVar3;
        this.d = luwVar;
        this.e = owqVar4;
        this.i = pmvVar;
        this.f = lujVar;
        this.g = lujVar2;
        this.h = hbjVar;
        gzi gziVar = gzq.a;
    }

    public mgi(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8, uem uemVar9) {
        uemVar.getClass();
        this.f = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
        uemVar3.getClass();
        this.g = uemVar3;
        uemVar4.getClass();
        this.e = uemVar4;
        uemVar5.getClass();
        this.c = uemVar5;
        uemVar6.getClass();
        this.a = uemVar6;
        uemVar7.getClass();
        this.i = uemVar7;
        this.d = uemVar8;
        uemVar9.getClass();
        this.h = uemVar9;
    }
}
