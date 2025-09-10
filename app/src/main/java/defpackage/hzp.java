package defpackage;

import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzp implements jhc, jhe, jhh {
    private final /* synthetic */ int a;
    private final Object b;

    public hzp(Gcam gcam, int i) {
        this.a = i;
        this.b = gcam;
    }

    @Override // defpackage.jhc
    public final void ea() {
        if (this.a != 0) {
            throw null;
        }
        Gcam gcam = (Gcam) this.b;
        GcamModuleJNI.Gcam_SetThreadPriority(gcam.a, gcam, 0);
    }

    @Override // defpackage.jhe
    public final void eb() {
        if (this.a != 0) {
            gzi gziVar = gzo.a;
        } else {
            Gcam gcam = (Gcam) this.b;
            GcamModuleJNI.Gcam_ResetThreadPriority(gcam.a, gcam);
        }
    }

    public hzp(hbj hbjVar, int i) {
        this.a = i;
        this.b = hbjVar;
        new qsp((int[]) null);
    }
}
