package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbh extends bhm implements bgw {
    public final bbi a;
    private bbg b;

    public bbh(Object obj, bbi bbiVar) {
        this.a = bbiVar;
        bgj bgjVarB = bgr.b();
        bbg bbgVar = new bbg(bgjVarB.v(), obj);
        if (!(bgjVarB instanceof bge)) {
            bbgVar.h = new bbg(1L, obj);
        }
        this.b = bbgVar;
    }

    @Override // defpackage.azr, defpackage.bbo
    public final Object a() {
        return ((bbg) bgr.j(this.b, this)).a;
    }

    @Override // defpackage.azr
    public final void b(Object obj) {
        bgj bgjVarB;
        bbg bbgVar = (bbg) bgr.e(this.b);
        if (this.a.a(bbgVar.a, obj)) {
            return;
        }
        bbg bbgVar2 = this.b;
        synchronized (bgr.b) {
            bgjVarB = bgr.b();
            ((bbg) bgr.i(bbgVar2, this, bgjVarB, bbgVar)).a = obj;
        }
        bgr.t(bgjVarB, this);
    }

    @Override // defpackage.bhl
    public final bhn c() {
        return this.b;
    }

    @Override // defpackage.bhl
    public final void d(bhn bhnVar) {
        bhnVar.getClass();
        this.b = (bbg) bhnVar;
    }

    @Override // defpackage.bgw
    public final bbi f() {
        return this.a;
    }

    @Override // defpackage.bhm, defpackage.bhl
    public final bhn g(bhn bhnVar, bhn bhnVar2, bhn bhnVar3) {
        if (this.a.a(((bbg) bhnVar2).a, ((bbg) bhnVar3).a)) {
            return bhnVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableState(value=" + ((bbg) bgr.e(this.b)).a + ")@" + hashCode();
    }
}
