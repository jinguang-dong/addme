package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aja extends uht implements uiu {
    int a;
    final /* synthetic */ ajc b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aja(ajc ajcVar, float f, float f2, uhb uhbVar) {
        super(2, uhbVar);
        this.b = ajcVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aja) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            ajc ajcVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.a = 1;
            if (aiu.a(ajcVar.i, (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new aja(this.b, this.c, this.d, uhbVar);
    }
}
