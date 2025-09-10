package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gcp {
    public static final sgv a = sgv.g("gcp");
    public final gav b;
    public final AtomicReference c;
    public final lpd d;
    public final syu e;
    public gho f = gho.OFF;
    public final hfn g;
    public final jwe h;
    public final jwh i;
    public final jvb j;
    public final pkc k;
    public final hbj l;
    public final ngw m;
    public final cxb n;
    private final luj o;
    private final luj p;

    public gcp(gav gavVar, cxb cxbVar, AtomicReference atomicReference, luj lujVar, luj lujVar2, hbj hbjVar, lpd lpdVar, hfn hfnVar, jid jidVar, jwe jweVar, jwh jwhVar, ScheduledExecutorService scheduledExecutorService, pkc pkcVar, ngw ngwVar, jvb jvbVar) {
        this.b = gavVar;
        this.n = cxbVar;
        this.c = atomicReference;
        this.o = lujVar;
        this.p = lujVar2;
        this.l = hbjVar;
        this.d = lpdVar;
        this.g = hfnVar;
        this.h = jweVar;
        this.i = jwhVar;
        this.e = jidVar.f().c(scheduledExecutorService);
        this.k = pkcVar;
        this.m = ngwVar;
        this.j = jvbVar;
    }

    public static final void c(pfu pfuVar, gau gauVar, gaw gawVar) {
        int i = ((ovx) gauVar.g).d == gas.RECORDING_SESSION_ACTIVE ? gawVar.q ? 3 : 1 : 4;
        pey peyVar = (pey) pfu.v();
        peyVar.d = Integer.valueOf(i);
        pfuVar.s(new pex(peyVar));
    }

    public static final void d(gau gauVar) {
        gauVar.l.a(mhh.OFF);
        gauVar.m.a(mhg.INACTIVE);
    }

    public static final void e(CaptureRequest.Key key, Object obj, pfu pfuVar) {
        if (key != null) {
            key.getName();
            pfuVar.l(new pej(key, obj));
        }
    }

    public final void a(gau gauVar) {
        hbj hbjVar = this.l;
        if (((Integer) hbjVar.a(gzy.c).get()).intValue() != -1) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.p.b(luf.r)).booleanValue();
        if (hbjVar.p(gzy.o)) {
            this.o.d(luf.aF, Integer.valueOf(mhh.a(zBooleanValue).d));
        }
        gauVar.l.a(mhh.a(zBooleanValue));
    }

    public final void b(pfu pfuVar, boolean z) {
        int i;
        CaptureRequest.Key key = nvn.f;
        if (key == null) {
            e(nvl.n, Boolean.valueOf(z), pfuVar);
            return;
        }
        if (z) {
            gzi gziVar = gym.a;
            i = 1;
        } else {
            i = 0;
        }
        e(key, Integer.valueOf(i), pfuVar);
        gzi gziVar2 = gym.a;
    }
}
