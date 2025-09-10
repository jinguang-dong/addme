package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nev implements uiu {
    final /* synthetic */ mxm a;
    final /* synthetic */ adt b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;

    public nev(mxm mxmVar, adt adtVar, int i, long j, int i2, long j2, long j3) {
        this.a = mxmVar;
        this.b = adtVar;
        this.c = i;
        this.d = j;
        this.e = i2;
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            qpt.aT(this.a, this.b, this.c, this.d, this.e, this.f, this.g, aycVar, 0);
        }
        return ufg.a;
    }
}
