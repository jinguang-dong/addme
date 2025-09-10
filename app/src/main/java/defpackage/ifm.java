package defpackage;

import com.google.googlex.gcam.CyclopsParameters;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifm implements ial {
    public final poe a;
    public final CyclopsParameters b;
    public int c = -1;
    final /* synthetic */ ifn d;
    private final iea e;
    private final gga f;

    public ifm(ifn ifnVar, gga ggaVar, poe poeVar, CyclopsParameters cyclopsParameters, iea ieaVar) {
        this.d = ifnVar;
        this.f = ggaVar;
        this.a = poeVar;
        this.b = cyclopsParameters;
        this.e = ieaVar;
    }

    @Override // defpackage.ial
    public final void h(iby ibyVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        if (ibyVar.a() != this.c) {
            return;
        }
        this.d.b(new glw(this, interleavedImageU8, shotMetadata, 3, (byte[]) null), new fij(12), this.f, this.e);
    }
}
