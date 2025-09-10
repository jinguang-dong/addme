package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hxm implements ian {
    final /* synthetic */ ici a;
    final /* synthetic */ hxs b;
    final /* synthetic */ hxu c;

    public hxm(hxs hxsVar, ici iciVar, hxu hxuVar) {
        this.a = iciVar;
        this.c = hxuVar;
        this.b = hxsVar;
    }

    @Override // defpackage.ian
    public final void a(iby ibyVar, YuvImage yuvImage, ShotMetadata shotMetadata) {
        hxs hxsVar = this.b;
        pbn pbnVar = hxsVar.b;
        pbnVar.f("YuvCallback");
        ici iciVar = this.a;
        iciVar.b = yuvImage;
        iciVar.f(shotMetadata);
        iciVar.d = ibyVar.t;
        iciVar.i = ibyVar.b();
        hxsVar.a(this.c, iciVar.a());
        pbnVar.g();
    }
}
