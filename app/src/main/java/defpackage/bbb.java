package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbb extends bhm implements bgw, azr, bbo {
    private bba a;

    public bbb(float f) {
        bgj bgjVarB = bgr.b();
        bba bbaVar = new bba(bgjVarB.v(), f);
        if (!(bgjVarB instanceof bge)) {
            bbaVar.h = new bba(1L, f);
        }
        this.a = bbaVar;
    }

    @Override // defpackage.azr
    public final /* synthetic */ void b(Object obj) {
        i(((Number) obj).floatValue());
    }

    @Override // defpackage.bhl
    public final bhn c() {
        return this.a;
    }

    @Override // defpackage.bhl
    public final void d(bhn bhnVar) {
        bhnVar.getClass();
        this.a = (bba) bhnVar;
    }

    public final float e() {
        return ((bba) bgr.j(this.a, this)).a;
    }

    @Override // defpackage.bgw
    public final bbi f() {
        return bap.c;
    }

    @Override // defpackage.bhm, defpackage.bhl
    public final bhn g(bhn bhnVar, bhn bhnVar2, bhn bhnVar3) {
        if (((bba) bhnVar2).a == ((bba) bhnVar3).a) {
            return bhnVar2;
        }
        return null;
    }

    @Override // defpackage.azr, defpackage.bbo
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ Float a() {
        return Float.valueOf(e());
    }

    public final void i(float f) {
        bgj bgjVarB;
        bba bbaVar = (bba) bgr.e(this.a);
        if (bbaVar.a == f) {
            return;
        }
        bba bbaVar2 = this.a;
        synchronized (bgr.b) {
            bgjVarB = bgr.b();
            ((bba) bgr.i(bbaVar2, this, bgjVarB, bbaVar)).a = f;
        }
        bgr.t(bgjVarB, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((bba) bgr.e(this.a)).a + ")@" + hashCode();
    }
}
