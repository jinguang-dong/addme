package defpackage;

import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxn implements iak {
    public final boolean a;
    final /* synthetic */ iea b;
    public final /* synthetic */ hxs c;
    final /* synthetic */ gga d;

    public hxn(hxs hxsVar, iea ieaVar, gga ggaVar) {
        this.b = ieaVar;
        this.d = ggaVar;
        this.c = hxsVar;
        this.a = ieaVar.a() != idz.CENTAUR;
    }

    private final void c(tcu tcuVar, iby ibyVar, ShotMetadata shotMetadata) {
        hxs hxsVar = this.c;
        ibi ibiVar = (ibi) hxsVar.i.B();
        flb flbVar = new flb(this, tcuVar, shotMetadata, ibyVar, 2);
        fij fijVar = new fij(9);
        iea ieaVarB = ibyVar != null ? ibyVar.p : iea.b(idz.DEBLUR, 1, sfc.a);
        hxsVar.d.a(ibiVar, flbVar, fijVar, this.d, ieaVarB);
    }

    @Override // defpackage.iak
    public final void a(iby ibyVar, tcu tcuVar, ShotMetadata shotMetadata) {
        this.c.c.b("Got RAW image from primary shot.");
        c(tcuVar, ibyVar, shotMetadata);
    }

    @Override // defpackage.iak
    public final void b(iag iagVar) {
        this.c.c.e("Error getting RAW image from primary shot.", iagVar);
        c(null, null, null);
    }
}
