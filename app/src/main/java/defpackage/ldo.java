package defpackage;

import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldo implements iak {
    final /* synthetic */ ldr a;
    final /* synthetic */ gga b;

    public ldo(ldr ldrVar, gga ggaVar) {
        this.b = ggaVar;
        this.a = ldrVar;
    }

    private final void c(tcu tcuVar, iby ibyVar, ShotMetadata shotMetadata) {
        ldr ldrVar = this.a;
        ibi ibiVar = (ibi) ldrVar.b.c();
        glw glwVar = new glw((Object) tcuVar, shotMetadata, (Object) ibyVar, 6);
        iwh iwhVar = new iwh(6);
        iea ieaVarB = ibyVar != null ? ibyVar.p : iea.b(idz.DEBLUR, 1, sfc.a);
        ldrVar.e.a(ibiVar, glwVar, iwhVar, this.b, ieaVarB);
    }

    @Override // defpackage.iak
    public final void a(iby ibyVar, tcu tcuVar, ShotMetadata shotMetadata) {
        sgv sgvVar = ldr.a;
        ibyVar.a();
        c(tcuVar, ibyVar, shotMetadata);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.iak
    public final void b(iag iagVar) {
        ((sgt) ((sgt) ldr.a.c().i(iagVar)).M((char) 4017)).v("Error getting RAW image from secondary shot: %s", iagVar.getMessage());
        c(null, null, null);
    }
}
