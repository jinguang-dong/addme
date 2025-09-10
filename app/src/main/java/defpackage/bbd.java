package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbd extends bhm implements bgw, azr, bbo {
    private bbc a;

    public bbd(int i) {
        bgj bgjVarB = bgr.b();
        bbc bbcVar = new bbc(bgjVarB.v(), i);
        if (!(bgjVarB instanceof bge)) {
            bbcVar.h = new bbc(1L, i);
        }
        this.a = bbcVar;
    }

    @Override // defpackage.azr, defpackage.bbo
    public final /* bridge */ /* synthetic */ Object a() {
        return Integer.valueOf(e());
    }

    @Override // defpackage.azr
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).intValue());
    }

    @Override // defpackage.bhl
    public final bhn c() {
        return this.a;
    }

    @Override // defpackage.bhl
    public final void d(bhn bhnVar) {
        bhnVar.getClass();
        this.a = (bbc) bhnVar;
    }

    public final int e() {
        return ((bbc) bgr.j(this.a, this)).a;
    }

    @Override // defpackage.bgw
    public final bbi f() {
        return bap.c;
    }

    @Override // defpackage.bhm, defpackage.bhl
    public final bhn g(bhn bhnVar, bhn bhnVar2, bhn bhnVar3) {
        if (((bbc) bhnVar2).a == ((bbc) bhnVar3).a) {
            return bhnVar2;
        }
        return null;
    }

    public final void h(int i) {
        bgj bgjVarB;
        bbc bbcVar = (bbc) bgr.e(this.a);
        if (bbcVar.a != i) {
            bbc bbcVar2 = this.a;
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                ((bbc) bgr.i(bbcVar2, this, bgjVarB, bbcVar)).a = i;
            }
            bgr.t(bgjVarB, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((bbc) bgr.e(this.a)).a + ")@" + hashCode();
    }
}
