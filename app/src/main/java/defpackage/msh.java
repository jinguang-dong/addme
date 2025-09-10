package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.util.HashSet;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msh {
    public static final sgv a = sgv.g(yoGAhrpjU.jqjLHuRLeyhwd);
    public final AccessibilityManager b;
    public final gnt c;
    public final hjb d;
    public final owf e;
    public final owq f;
    public final rwc g;
    public final rwc h;
    public final mhp i;
    public final mhq j;
    public final owf k;
    public final owq l;
    public mso m;
    public rwc n = rvk.a;
    public msk o;
    public Runnable p;
    public pfz q;
    public final hbj r;
    private final Handler s;
    private final owf t;
    private final Context u;
    private final iyu v;
    private final hie w;
    private final mwq x;

    public msh(iyu iyuVar, gnt gntVar, hie hieVar, hbj hbjVar, View view, mwq mwqVar, luj lujVar, out outVar, Handler handler, owq owqVar, owf owfVar, hjb hjbVar, Context context, rwc rwcVar, rwc rwcVar2, mhp mhpVar, mhq mhqVar, owf owfVar2, owq owqVar2, mwq mwqVar2) {
        this.v = iyuVar;
        this.c = gntVar;
        this.h = rwcVar2;
        this.r = hbjVar;
        this.s = handler;
        this.x = mwqVar;
        this.t = lujVar.a(luf.v);
        this.w = hieVar;
        this.f = owqVar;
        this.e = owfVar;
        this.d = hjbVar;
        this.u = context;
        this.g = rwcVar;
        this.i = mhpVar;
        this.j = mhqVar;
        this.k = owfVar2;
        this.l = owqVar2;
        Object systemService = view.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.b = (AccessibilityManager) systemService;
        outVar.c(new gts(this, view, mwqVar2, 12, null));
    }

    public final void a() {
        rwc rwcVar = this.g;
        if (rwcVar.h()) {
            ftv ftvVar = (ftv) rwcVar.c();
            if (ftvVar.r()) {
                ftvVar.d();
            }
        }
        mso msoVar = this.m;
        if (msoVar.f > 0) {
            msoVar.f = 0;
            msoVar.b.removeMessages(1);
            msoVar.c.removeView(msoVar);
        }
        this.d.h();
        Runnable runnable = this.p;
        if (runnable != null) {
            this.s.removeCallbacks(runnable);
            this.p = null;
        }
        e(false, this.q, true, true);
        this.l.a(Boolean.valueOf(d()));
    }

    public final void b(boolean z, int i, boolean z2, boolean z3) {
        msg msgVar = new msg(this, z, z2, z3, 0);
        this.p = msgVar;
        this.s.postDelayed(msgVar, i);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    public final void c(int i) throws Settings.SettingNotFoundException {
        float f;
        fqf fqfVar = this.v.l;
        if (fqfVar.A() && fqfVar.a().h()) {
            this.n = rwc.i(((kfg) fqfVar.a().c()).h());
        } else {
            this.n = rvk.a;
        }
        try {
            f = Settings.Global.getFloat(this.u.getContentResolver(), "animator_duration_scale");
        } catch (Settings.SettingNotFoundException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5037)).s("The ANIMATOR_DURATION_SCALE setting is not found");
            f = 1.0f;
        }
        mso msoVar = this.m;
        boolean z = f != 0.0f;
        if (i <= 0) {
            ((sgt) mso.a.c().M(5047)).t("Invalid input for countdown timer: %d seconds", i);
        } else {
            msoVar.b(msoVar.h ? msoVar.e : msoVar.d);
            msoVar.i = z;
            msoVar.c.addView(msoVar, -1);
            msoVar.g = i;
            msoVar.a(true, i);
        }
        this.l.a(Boolean.valueOf(d()));
    }

    public final boolean d() {
        return this.m.f > 0;
    }

    public final void e(boolean z, pfz pfzVar, boolean z2, boolean z3) {
        mwq mwqVar = this.x;
        if (mwq.z() && !this.c.j() && this.n.h() && this.q != null && this.r.p(gzo.bm) && ((Boolean) this.f.dL()).booleanValue() && !((Boolean) this.e.dL()).booleanValue()) {
            if (!this.j.a().a(this.i)) {
                try {
                    pfg pfgVarE = pfzVar.e();
                    HashSet hashSet = new HashSet();
                    CaptureRequest.Key key = nvl.d;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    hashSet.add(new pej(key, boolValueOf));
                    CaptureRequest.Key key2 = nvl.b;
                    Object obj = mwqVar.a;
                    byte b = 0;
                    int i = 1;
                    hashSet.add(new pej(key2, Integer.valueOf((((pnq) obj).j || ((pnq) obj).k || ((pnq) obj).l) ? 1 : 0)));
                    CaptureRequest.Key key3 = CaptureRequest.FLASH_MODE;
                    if (true == z) {
                        b = 2;
                    }
                    hashSet.add(new pej(key3, Integer.valueOf(b)));
                    hashSet.add(new pej(nvl.s, Byte.valueOf(b)));
                    hie hieVar = this.w;
                    if (!((Boolean) ((ovx) hieVar.c).d).booleanValue()) {
                        hashSet.add(new pej(CaptureRequest.CONTROL_AE_LOCK, boolValueOf));
                    }
                    hashSet.add(new pej(CaptureRequest.CONTROL_AWB_LOCK, boolValueOf));
                    if (kox.a((String) ((ovx) this.t).d, kox.OFF).equals(kox.ON) && ((Boolean) ((ovx) hieVar.d).d).booleanValue()) {
                        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_MODE;
                        if (true == z3) {
                            i = 3;
                        }
                        hashSet.add(new pej(key4, Integer.valueOf(i)));
                    }
                    pfgVarE.f(hashSet);
                    pfzVar.h(pfgVarE.b());
                    if (z2) {
                        pfzVar.close();
                        this.q = null;
                        return;
                    }
                    return;
                } catch (CancellationException | pco e) {
                    ((sgt) ((sgt) a.b().i(e)).M(5035)).v("Countdown set torch failed: %s", e);
                    return;
                }
            }
        }
        ((sgt) a.b().M(5034)).s("Unsupported to set torch on for countdown request");
    }
}
