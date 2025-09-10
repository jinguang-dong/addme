package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihb implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public ihb(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? b() : b() : b() : b() : b() : b();
    }

    public final owf b() {
        int i = this.c;
        if (i == 0) {
            owf owfVarA = owb.a(owl.c((owf) this.b.a(), (owf) this.a.a()));
            owfVarA.getClass();
            return owfVarA;
        }
        if (i == 1) {
            gzi gziVar = gzq.a;
            return new ovx(0);
        }
        if (i == 2) {
            hbj hbjVar = (hbj) this.a.a();
            luj lujVar = (luj) this.b.a();
            kpa kpaVar = kov.a;
            return hbjVar.p(gzs.an) ? lujVar.a(luf.L) : new owi(false);
        }
        if (i == 3) {
            return ((hbj) this.b.a()).p(hae.i) ? new owi(pjz.EXTENDED) : new owi(((kiu) this.a).a().k());
        }
        if (i == 4) {
            luj lujVar2 = (luj) this.b.a();
            return new koz(lujVar2.a(luf.v), lujVar2.a(luf.x), (kgw) this.a.a(), kox.OFF);
        }
        owf owfVarH = owl.h(owl.a((owf) this.b.a(), (owf) this.a.a()), new leb(16));
        owfVarH.getClass();
        return owfVarH;
    }

    public ihb(tzx tzxVar, tzx tzxVar2, int i, int[] iArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
