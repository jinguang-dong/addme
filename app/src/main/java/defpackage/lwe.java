package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwe implements syf {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public lwe(Object obj, long j, int i) {
        this.c = i;
        this.a = j;
        this.b = obj;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (this.c != 0) {
            sgt sgtVar = (sgt) ((sgt) iid.b.c().i(th)).M(2028);
            long j = this.a;
            sgtVar.u("Portrait effect failed for shot %d", j);
            iic iicVar = (iic) this.b;
            iicVar.u = true;
            iicVar.g(j, th);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.a;
        lwf lwfVar = (lwf) this.b;
        pbp pbpVar = lwfVar.w;
        if (pbpVar != null) {
            pbpVar.a();
        }
        ((sgt) ((sgt) lwf.a.b().i(th)).M(4466)).u("HAL failed to restart after %dms due to an exception.", jUptimeMillis);
        if (lwfVar.e.b(hbc.DOGFOOD)) {
            lwfVar.z.C();
        }
        lwfVar.a();
        lwfVar.o.b(pbw.CAMERA_ERROR_CODE_UNKNOWN.t, 4);
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        if (this.c != 0) {
            Boolean bool = (Boolean) obj;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            hgc.h(((iic) this.b).a);
            return;
        }
        hfv hfvVar = (hfv) obj;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.a;
        lwf lwfVar = (lwf) this.b;
        pbp pbpVar = lwfVar.w;
        if (pbpVar != null) {
            pbpVar.a();
        }
        if (hfvVar.a) {
            lwfVar.o.a(true, 0, 0);
        } else {
            Exception exc = hfvVar.c;
            pbw pbwVar = hfvVar.b;
            int i = pbwVar != null ? pbwVar.t : 0;
            ((sgt) ((sgt) lwf.a.c().i(exc)).M(4467)).G("HAL failed to restart after %dms due to error (%d): %s", Long.valueOf(jUptimeMillis), Integer.valueOf(i), pbwVar != null ? pbwVar.c() : "");
            if (lwfVar.e.b(hbc.DOGFOOD)) {
                lwfVar.z.C();
            }
            lwfVar.o.b(i, exc instanceof TimeoutException ? 7 : exc instanceof InterruptedException ? 8 : exc instanceof CameraAccessException ? 4 : 3);
        }
        lwfVar.a();
    }
}
