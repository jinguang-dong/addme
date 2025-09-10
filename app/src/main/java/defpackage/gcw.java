package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import com.google.ar.core.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcw extends gcv {
    public static final /* synthetic */ int c = 0;
    private static final long d;
    private static final long e;
    final nan b;
    private final luj f;
    private final imi g;
    private final cxb h;

    static {
        long nanos = TimeUnit.SECONDS.toNanos(1L) / 24;
        d = nanos;
        e = nanos / 10;
    }

    public gcw(Context context, imi imiVar, cxb cxbVar, luj lujVar) {
        this.g = imiVar;
        this.h = cxbVar;
        this.f = lujVar;
        nao naoVar = new nao();
        naoVar.e = context.getResources().getString(R.string.vid_chip_frame_rate_reduced);
        naoVar.h = context;
        naoVar.j = 5;
        naoVar.b = 3000;
        naoVar.d = new nar(lujVar, 1);
        this.b = naoVar.a();
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        if (((Boolean) ((ovx) this.f.a(luf.ae)).d).booleanValue()) {
            return;
        }
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        l.getClass();
        if (Math.abs(l.longValue() - d) <= e) {
            this.h.w(gdo.CAPTURE_SESSION).d(this.g.a(this.b));
        }
    }

    @Override // defpackage.gcv
    public final boolean g(gaw gawVar) {
        return gawVar.c == oxh.FPS_30;
    }
}
