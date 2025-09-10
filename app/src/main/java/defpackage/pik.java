package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pik {
    public final pom a;
    public final pnp b;
    public final pbc c;
    public final pjp d;
    public final pdt e;
    public final boolean f;
    public final our g;
    public final qrh h;
    public final mwq i;

    public pik(pom pomVar, qrh qrhVar, our ourVar, pnp pnpVar, pbc pbcVar, pjp pjpVar, pdt pdtVar, mwq mwqVar) {
        this.a = pomVar;
        this.h = qrhVar;
        this.g = ourVar;
        this.b = pnpVar;
        this.c = pbcVar.a("OutputDistributorFac");
        this.d = pjpVar;
        this.e = pdtVar;
        this.i = mwqVar;
        boolean z = pnpVar.d;
        this.f = CameraCharacteristics.SCALER_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP != null;
    }
}
