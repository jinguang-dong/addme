package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kpx implements kpt {
    private static final sgv e = sgv.g("kpx");
    public final hzs a;
    public final owq b;
    public final pau c;
    public final qrh d;
    private final Executor f;
    private final rww g;
    private long h = -2147483648L;

    public kpx(hzs hzsVar, Executor executor, owq owqVar, qrh qrhVar, pau pauVar, rww rwwVar) {
        this.a = hzsVar;
        this.f = executor;
        this.b = owqVar;
        this.d = qrhVar;
        this.c = pauVar;
        this.g = rwwVar;
    }

    @Override // defpackage.kpt
    public final void a(poe poeVar) {
        rww rwwVar = this.g;
        long jD = poeVar.d();
        if (jD >= this.h + ((Integer) rwwVar.fr()).intValue()) {
            this.h = jD;
            String str = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            if (str == null) {
                ((sgt) e.c().M(3379)).s("Missing activePhysicalCameraId so cannot run GCam side viewfinder processing");
            } else {
                this.f.execute(new gdq((Object) this, (Object) pjr.b(str), (Object) poeVar, 20, (byte[]) null));
            }
        }
    }
}
