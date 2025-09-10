package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxo implements ial {
    final /* synthetic */ iea a;
    final /* synthetic */ ici b;
    final /* synthetic */ hxs c;
    final /* synthetic */ hxu d;
    final /* synthetic */ gga e;

    public hxo(hxs hxsVar, iea ieaVar, ici iciVar, gga ggaVar, hxu hxuVar) {
        this.a = ieaVar;
        this.b = iciVar;
        this.e = ggaVar;
        this.d = hxuVar;
        this.c = hxsVar;
    }

    public final void a(iby ibyVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        ici iciVar = this.b;
        iciVar.a = interleavedImageU8;
        iciVar.f(shotMetadata);
        iciVar.d = ibyVar.t;
        iciVar.c(this.a);
        this.c.a(this.d, iciVar.a());
    }

    @Override // defpackage.ial
    public final void h(iby ibyVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        hxs hxsVar = this.c;
        pbm pbmVar = new pbm(hxsVar.b, "RgbCallback");
        try {
            cxb cxbVar = hxsVar.i;
            if (cxbVar.C() && hxs.a.contains(this.a.a())) {
                hxsVar.c.b("Sending primary RGB for fusion processing.");
                ici iciVar = this.b;
                iciVar.f(shotMetadata);
                iciVar.a = interleavedImageU8;
                hxsVar.d.a((ibi) cxbVar.B(), new glw((Object) interleavedImageU8, shotMetadata, (Object) iciVar, 2), new dwq(this, ibyVar, interleavedImageU8, shotMetadata, 7), this.e, ibyVar.p);
            } else {
                boolean z = hxsVar.f.a;
                a(ibyVar, interleavedImageU8, shotMetadata);
            }
            pbmVar.close();
        } catch (Throwable th) {
            try {
                pbmVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
