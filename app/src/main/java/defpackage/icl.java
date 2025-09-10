package defpackage;

import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class icl implements kiz {
    final /* synthetic */ boolean a;
    final /* synthetic */ ShotMetadata b;
    final /* synthetic */ int c;
    final /* synthetic */ lss d;
    final /* synthetic */ icp e;
    final /* synthetic */ obu f;

    public icl(icp icpVar, obu obuVar, boolean z, ShotMetadata shotMetadata, int i, lss lssVar) {
        this.f = obuVar;
        this.a = z;
        this.b = shotMetadata;
        this.c = i;
        this.d = lssVar;
        this.e = icpVar;
    }

    @Override // defpackage.kiz
    public final syu a() {
        szh szhVar = new szh();
        boolean z = this.a;
        ShotMetadata shotMetadata = this.b;
        icp icpVar = this.e;
        int i = this.c;
        obu obuVar = this.f;
        lss lssVar = this.d;
        icpVar.b.execute(new icn(icpVar, obuVar, szhVar, z, shotMetadata, i, lssVar.f(), lssVar.p(), lssVar.g(), lssVar.ah()));
        return szhVar;
    }

    @Override // defpackage.kiz
    public final syu b() {
        return ske.L(new pco("RGB image couldn't be encoded into jpeg."));
    }
}
