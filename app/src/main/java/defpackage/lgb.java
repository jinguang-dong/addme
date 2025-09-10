package defpackage;

import android.content.Context;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitOutputsInterface;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lgb implements lgm {
    public static final sgv a = sgv.g("lgb");
    public static final String b = GcamModuleJNI.kRequestCameraPrimary_get();
    public static final String c = GcamModuleJNI.kRequestCameraSecondaryTele_get();
    public static final String d = GcamModuleJNI.kRequestCameraSecondaryWide_get();
    public final Executor e;
    public final Object f;
    public final Object g;
    public final HashMap h;
    public final lgk i;
    public final mhq j;
    public final PortraitOutputsInterface k;
    public boolean l;
    public final lgo m;
    public final Gcam n;
    public final luj o;
    public final lge p;
    public final hbj q;
    private final kjc r;
    private final hyd s;
    private final boolean t;
    private final uem u;

    public lgb(lge lgeVar, lgo lgoVar, kjc kjcVar, Executor executor, Context context, hbj hbjVar, luj lujVar, hyd hydVar, Gcam gcam, mhq mhqVar, uem uemVar) {
        Object obj = new Object();
        this.f = obj;
        this.g = new Object();
        this.h = new HashMap();
        this.k = new PortraitOutputsInterface();
        this.l = false;
        synchronized (obj) {
            this.p = lgeVar;
            this.m = lgoVar;
        }
        this.r = kjcVar;
        this.e = executor;
        this.q = hbjVar;
        this.o = lujVar;
        this.s = hydVar;
        this.t = hbjVar.p(hak.b);
        this.n = gcam;
        this.u = uemVar;
        this.i = new lgk(context);
        this.j = mhqVar;
    }

    public static lgn a(String str, String str2) {
        rvk rvkVar = rvk.a;
        return new lgn(b(str), b(str2), rvkVar, rvkVar);
    }

    public static rwc b(String str) {
        if (rnt.V(str)) {
            return rvk.a;
        }
        try {
            gga ggaVar = edy.a;
            return rwc.j(eel.a(str));
        } catch (edv unused) {
            ((sgt) a.b().M(4112)).s("String was not a serialized XMPMeta.");
            return rvk.a;
        }
    }

    public static boolean f(obu obuVar) {
        rwc rwcVar = (rwc) obuVar.b;
        boolean z = rwcVar.h() && !((InterleavedImageU8) rwcVar.c()).i();
        rwc rwcVar2 = (rwc) obuVar.a;
        return (z || (rwcVar2.h() && ((HardwareBuffer) rwcVar2.c()).getWidth() > 0 && ((HardwareBuffer) rwcVar2.c()).getHeight() > 0)) ? false : true;
    }

    @Override // defpackage.lgm
    public final void c() {
        this.e.execute(new lgc(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    @Override // defpackage.lgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.syu d(long r16, com.google.googlex.gcam.InterleavedImageU8 r18, com.google.googlex.gcam.InterleavedImageU16 r19, defpackage.kgw r20, com.google.googlex.gcam.PortraitRequest r21, defpackage.tcu r22, com.google.googlex.gcam.ShotMetadata r23, defpackage.tcu r24, com.google.googlex.gcam.ShotMetadata r25, boolean r26, defpackage.iia r27) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgb.d(long, com.google.googlex.gcam.InterleavedImageU8, com.google.googlex.gcam.InterleavedImageU16, kgw, com.google.googlex.gcam.PortraitRequest, tcu, com.google.googlex.gcam.ShotMetadata, tcu, com.google.googlex.gcam.ShotMetadata, boolean, iia):syu");
    }

    @Override // defpackage.lgm
    public final void e() {
    }
}
