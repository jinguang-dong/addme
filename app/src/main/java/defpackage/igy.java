package defpackage;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.GrayImageS16;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class igy implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ FusionProgressCallback b;
    public final /* synthetic */ long c;
    public final /* synthetic */ idx d;

    public /* synthetic */ igy(boolean z, FusionProgressCallback fusionProgressCallback, long j, idx idxVar) {
        this.a = z;
        this.b = fusionProgressCallback;
        this.c = j;
        this.d = idxVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        GrayImageS16 grayImageS16 = (GrayImageS16) obj;
        if (!this.a) {
            grayImageS16.b();
            return;
        }
        idx idxVar = this.d;
        long j = this.c;
        ((idp) this.b).c(j, rvk.a, rwc.j(grayImageS16), idxVar.e, "reference_luma_image");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
