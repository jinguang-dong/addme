package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avn implements uiu {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public avn(long j, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = j;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d == 0) {
            ayc aycVar = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
                aycVar.r();
            } else {
                amo.e(this.a, bay.R(aycVar).b, bdq.k(-2115100680, new ars(this.b, this.c, 10), aycVar), aycVar, 384);
            }
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar2.G()) {
            aycVar2.r();
        } else {
            float f = arr.a;
            long j = this.a;
            long j2 = bkv.e;
            long jG = e.l(aycVar2).g();
            asb asbVar = new asb(j2, j, j2, bko.k(bkv.d(jG), bkv.c(jG), bkv.b(jG), e.r(aycVar2), bkv.f(jG)));
            Object obj3 = this.b;
            boolean zD = aycVar2.D(obj3);
            Object objF = aycVar2.f();
            if (zD || objF == ayb.a) {
                objF = new ats(obj3, 2);
                aycVar2.w(objF);
            }
            acv.h((uif) objF, bik.c, e.m(aycVar2).a, asbVar, arr.c, bdq.k(-929149933, new amj(this.c, 2), aycVar2), aycVar2, 805306368);
        }
        return ufg.a;
    }
}
