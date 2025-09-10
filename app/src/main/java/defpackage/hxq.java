package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.googlex.gcam.InterleavedImageU16;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hxq implements iah {
    final /* synthetic */ szh a;
    final /* synthetic */ hxs b;

    public hxq(hxs hxsVar, szh szhVar) {
        this.a = szhVar;
        this.b = hxsVar;
    }

    @Override // defpackage.iah
    public final void j(iag iagVar) {
        this.a.a(new pco("Error merging PD data", iagVar));
    }

    @Override // defpackage.iah
    public final void g(iby ibyVar, InterleavedImageU16 interleavedImageU16) {
        pbn pbnVar = this.b.b;
        pbnVar.f(oUZhwRhE.PBIsRHF);
        this.a.e(interleavedImageU16);
        pbnVar.g();
    }
}
