package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbf extends bhm implements bgw, azr, bbo {
    private bbe a;

    public bbf(long j) {
        bgj bgjVarB = bgr.b();
        bbe bbeVar = new bbe(bgjVarB.v(), j);
        if (!(bgjVarB instanceof bge)) {
            bbeVar.h = new bbe(1L, j);
        }
        this.a = bbeVar;
    }

    @Override // defpackage.azr, defpackage.bbo
    public final /* bridge */ /* synthetic */ Object a() {
        return Long.valueOf(e());
    }

    @Override // defpackage.azr
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).longValue());
    }

    @Override // defpackage.bhl
    public final bhn c() {
        return this.a;
    }

    @Override // defpackage.bhl
    public final void d(bhn bhnVar) {
        bhnVar.getClass();
        this.a = (bbe) bhnVar;
    }

    public final long e() {
        return ((bbe) bgr.j(this.a, this)).a;
    }

    @Override // defpackage.bgw
    public final bbi f() {
        return bap.c;
    }

    @Override // defpackage.bhm, defpackage.bhl
    public final bhn g(bhn bhnVar, bhn bhnVar2, bhn bhnVar3) {
        if (((bbe) bhnVar2).a == ((bbe) bhnVar3).a) {
            return bhnVar2;
        }
        return null;
    }

    public final void h(long j) {
        bgj bgjVarB;
        bbe bbeVar = (bbe) bgr.e(this.a);
        if (bbeVar.a != j) {
            bbe bbeVar2 = this.a;
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                ((bbe) bgr.i(bbeVar2, this, bgjVarB, bbeVar)).a = j;
            }
            bgr.t(bgjVarB, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((bbe) bgr.e(this.a)).a + ")@" + hashCode();
    }
}
