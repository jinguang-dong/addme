package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldp implements ial {
    final /* synthetic */ ldr a;
    final /* synthetic */ gga b;

    public ldp(ldr ldrVar, gga ggaVar) {
        this.b = ggaVar;
        this.a = ldrVar;
    }

    public final void a(InterleavedImageU8 interleavedImageU8, iby ibyVar, ShotMetadata shotMetadata) {
        ldr ldrVar = this.a;
        ibi ibiVar = (ibi) ldrVar.b.c();
        glw glwVar = new glw((Object) interleavedImageU8, shotMetadata, (Object) ibyVar, 7);
        iwh iwhVar = new iwh(7);
        iea ieaVarB = ibyVar != null ? ibyVar.p : iea.b(idz.ZOOM, 1, sfc.a);
        ldrVar.e.a(ibiVar, glwVar, iwhVar, this.b, ieaVarB);
    }

    @Override // defpackage.ial
    public final void h(iby ibyVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        sgv sgvVar = ldr.a;
        ibyVar.a();
        a(interleavedImageU8, ibyVar, shotMetadata);
    }
}
