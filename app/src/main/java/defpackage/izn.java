package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izn implements hbl {
    final tzx a;
    final tzx b;
    final tzx c;
    final tzx d;
    final tzx e;
    final tzx f;
    final tzx g;
    final tzx h;
    final tzx i;
    final tzx j;
    final tzx k;
    final tzx l;
    final tzx m;
    private final izm n;

    public izn(izm izmVar, hbp hbpVar) {
        this.n = izmVar;
        hbr hbrVar = new hbr(hbpVar);
        this.a = hbrVar;
        jdg jdgVar = new jdg(hbpVar, 1);
        this.b = jdgVar;
        hbq hbqVar = new hbq(hbpVar);
        this.c = hbqVar;
        hqk hqkVar = new hqk(hbqVar);
        this.d = hqkVar;
        tzx tzxVar = izmVar.lZ;
        hqm hqmVar = new hqm(tzxVar);
        this.e = hqmVar;
        hqo hqoVar = new hqo(jdgVar, hbqVar);
        this.f = hqoVar;
        tzx tzxVar2 = izmVar.pA;
        hqh hqhVar = new hqh(tzxVar2, hqkVar, tzxVar, jdgVar);
        this.g = hqhVar;
        hqj hqjVar = new hqj(hqkVar, hqmVar, hqoVar, hqhVar);
        this.h = hqjVar;
        hbm hbmVar = new hbm(jdgVar);
        this.i = hbmVar;
        fjq fjqVar = new fjq(16);
        this.j = fjqVar;
        fjq fjqVar2 = new fjq(15);
        this.k = fjqVar2;
        tzx tzxVar3 = izmVar.k;
        hrc hrcVar = new hrc(tzxVar2, tzxVar3, fjqVar, fjqVar2, izmVar.o);
        this.l = hrcVar;
        this.m = tzs.c(new hbn(hbrVar, jdgVar, hqjVar, hbmVar, hrcVar, hqkVar, tzxVar3, 0));
    }

    @Override // defpackage.hbl
    public final mdz a() {
        return (mdz) this.n.fS.a();
    }

    @Override // defpackage.hbl
    public final ree b() {
        return (ree) this.m.a();
    }
}
