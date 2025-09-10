package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;
import android.os.Looper;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gal extends ojl {
    private static final sgv i = sgv.g("gal");
    public final ConcurrentLinkedQueue a;
    public final fdd b;
    public final boolean c;
    public final hfn d;
    public final Handler e;
    public fbk f;
    public final kfw g;
    public final hbj h;
    private final gau j;
    private final fck k;
    private final rwc l;
    private final gna m;
    private final hdm n;
    private final pit o;

    public gal(gav gavVar, fck fckVar, kfw kfwVar, ffq ffqVar, fdd fddVar, boolean z, hdm hdmVar, hbj hbjVar, hfn hfnVar, pit pitVar, gna gnaVar) {
        super((short[]) null);
        this.a = new ConcurrentLinkedQueue();
        this.j = gavVar.a();
        this.k = fckVar;
        this.g = kfwVar;
        this.l = ffqVar.b.c() ? rwc.j(ffqVar) : rvk.a;
        this.b = fddVar;
        this.c = z;
        this.n = hdmVar;
        this.h = hbjVar;
        this.d = hfnVar;
        ojl ojlVar = hfnVar.c;
        this.e = new Handler(Looper.getMainLooper());
        int i2 = gyt.a;
        this.o = pitVar;
        this.m = gnaVar;
    }

    private final boolean cm() {
        gas gasVar = (gas) ((ovx) this.j.g).d;
        return gasVar == gas.CAPTURE_SESSION_ACTIVE || gasVar == gas.RECORDING_SESSION_ACTIVE;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) throws Resources.NotFoundException {
        if (cm()) {
            this.o.l(poeVar);
            this.k.a(poeVar);
            this.m.a(poeVar);
            if (poeVar.a(CaptureResult.CONTROL_AF_MODE) != null) {
                this.f.a(poeVar);
            }
            rwc rwcVar = this.l;
            if (rwcVar.h()) {
                ((ffq) rwcVar.c()).a(poeVar);
            }
            Rect rect = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
            if (rect != null) {
                this.j.c.a(rect);
            }
            Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
            Long l2 = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
            if (l != null && l2 != null) {
                this.n.b(l.longValue(), l2.longValue());
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ojl) it.next()).a(poeVar);
            }
        }
    }

    public final paq d(ojl ojlVar) {
        this.a.add(ojlVar);
        return new fid(this, ojlVar, 8, null);
    }

    @Override // defpackage.ojl
    public final void dG(peo peoVar, long j) {
        if (cm()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ojl) it.next()).dG(peoVar, j);
            }
        }
    }

    @Override // defpackage.ojl
    public final void dH(piw piwVar) {
        if (cm()) {
            ((sgt) i.b().M(650)).v("onCaptureFailed %s", piwVar);
        }
    }
}
