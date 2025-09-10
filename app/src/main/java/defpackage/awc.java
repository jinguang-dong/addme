package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awc implements uiu {
    final /* synthetic */ avp a;
    final /* synthetic */ awh b;
    final /* synthetic */ awo c;
    final /* synthetic */ awu d;
    final /* synthetic */ uiu e;

    public awc(avp avpVar, awh awhVar, awo awoVar, awu awuVar, uiu uiuVar) {
        this.a = avpVar;
        this.b = awhVar;
        this.c = awoVar;
        this.d = awuVar;
        this.e = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            avp avpVar = this.a;
            awh awgVar = this.b;
            if (awgVar == null) {
                awgVar = new awg(1);
            }
            awh awhVar = awgVar;
            awo awoVar = this.c;
            if (awoVar == null) {
                awoVar = new awo(null);
            }
            awo awoVar2 = awoVar;
            awu awuVar = this.d;
            if (awuVar == null) {
                awuVar = new awu(null);
            }
            awd.b(avpVar, awhVar, awoVar2, awuVar, this.e, aycVar, 0);
        }
        return ufg.a;
    }
}
