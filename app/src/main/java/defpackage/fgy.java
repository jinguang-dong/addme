package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fgy implements npl {
    private static final sgv a = sgv.g("fgy");
    private mye A;
    private final Context b;
    private final qin c;
    private final Interpolator d;
    private final rwc e;
    private final owq f;
    private final fgz j;
    private final owf k;
    private final owf l;
    private final owf m;
    private HardwareBuffer n;
    private RectF o;
    private boolean p;
    private boolean q;
    private fhb r;
    private kuf s;
    private mxm t;
    private mxj u;
    private int v;
    private final fgn z;
    private long w = 0;
    private long x = 0;
    private long y = 0;
    private final int g = x(R.dimen.boba_pip_foldable_tablet_layout_right_margin_4_3);
    private final int h = x(R.dimen.boba_pip_foldable_tablet_layout_right_margin_16_9);
    private final int i = x(R.dimen.pro_controls_pip_values_bar_bottom_to_notification_chip_top_offset);

    public fgy(qin qinVar, Context context, fgn fgnVar, rwc rwcVar, owq owqVar, fgz fgzVar, owf owfVar, owf owfVar2, owf owfVar3) {
        this.b = context;
        this.c = qinVar;
        this.z = fgnVar;
        this.e = rwcVar;
        this.f = owqVar;
        this.j = fgzVar;
        this.k = owfVar;
        this.l = owfVar2;
        this.m = owfVar3;
        this.d = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_extra_slow_in);
    }

    private final synchronized float t(int i, int i2) {
        int i3;
        i3 = this.t.e;
        return (i3 == 90 || i3 == 270) ? i : i2;
    }

    private final synchronized float u(float f, int i, float f2, pae paeVar, float f3) {
        int i2;
        int i3;
        if (this.u.b()) {
            if (this.t.e == 270) {
                return (f2 - f) - i;
            }
        } else if (this.u.a() && ((i2 = this.t.e) == 90 || i2 == 270)) {
            if (paeVar.equals(pae.b)) {
                i3 = this.h;
            } else if (paeVar.equals(pae.a)) {
                i3 = this.g;
            }
            return f3 * i3;
        }
        return f;
    }

    private final synchronized float v(float f, float f2, int i, float f3, pae paeVar) {
        int i2;
        return !this.u.b() ? (this.u.a() && ((i2 = this.t.e) == 90 || i2 == 270) && (paeVar.equals(pae.b) || paeVar.equals(pae.a))) ? f : f2 : this.t.e == 90 ? (f3 - f2) - i : f2;
    }

    private final synchronized float w(int i, int i2) {
        int i3;
        i3 = this.t.e;
        return (i3 == 90 || i3 == 270) ? i2 : i;
    }

    private final synchronized int x(int i) {
        try {
        } catch (Resources.NotFoundException e) {
            ((sgt) ((sgt) ((sgt) a.c().h(shx.a, "BobaEffect")).i(e)).M(137)).t("Dimension not found: %d", i);
            return 0;
        }
        return (int) this.b.getResources().getDimension(i);
    }

    private final synchronized void y() {
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x03e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[Catch: all -> 0x03fa, SYNTHETIC, TryCatch #11 {, blocks: (B:4:0x0003, B:6:0x001e, B:9:0x0043, B:11:0x0047, B:13:0x004b, B:16:0x0051, B:135:0x0384, B:196:0x03f0, B:195:0x03ed, B:197:0x03f1, B:192:0x03e8), top: B:221:0x0003, inners: #6 }] */
    @Override // defpackage.npl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.npk a(defpackage.poj r28, defpackage.poj r29) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgy.a(poj, poj):npk");
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk b(pdk pdkVar, peo peoVar, pdk pdkVar2) {
        return jsv.z(this, pdkVar, peoVar, pdkVar2);
    }

    @Override // defpackage.npl
    public final npm c() {
        return npm.BOBA;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        shl shlVar = shx.a;
        i();
        this.j.l.a();
    }

    @Override // defpackage.npl
    public final /* synthetic */ qin d() {
        return null;
    }

    @Override // defpackage.npl
    public final /* synthetic */ String e() {
        return jsv.A(this);
    }

    public final synchronized void f() {
        this.q = false;
        HardwareBuffer hardwareBuffer = this.n;
        if (hardwareBuffer != null) {
            hardwareBuffer.close();
        }
        this.n = null;
    }

    public final synchronized void g() {
        this.w = SystemClock.elapsedRealtime();
        this.x = 0L;
    }

    public final synchronized void h() {
        if (this.w == 0) {
            this.x = SystemClock.elapsedRealtime();
        } else {
            this.x = (500 - Math.min(500L, SystemClock.elapsedRealtime() - this.w)) + SystemClock.elapsedRealtime();
            this.w = 0L;
        }
    }

    public final synchronized void i() {
        f();
    }

    public final synchronized void j(poj pojVar, RectF rectF, boolean z) {
        if (!this.q) {
            shl shlVar = shx.a;
            pojVar.close();
            return;
        }
        HardwareBuffer hardwareBuffer = this.n;
        if (hardwareBuffer != null) {
            hardwareBuffer.close();
        }
        this.n = pojVar.f();
        if (rectF != null) {
            y();
            this.o = rectF;
        } else {
            ((sgt) ((sgt) a.c().h(shx.a, "BobaEffect")).M(139)).s("TrackRegion is null, reusing last known good.");
        }
        this.p = z;
    }

    public final synchronized void k() {
        this.y = SystemClock.elapsedRealtime();
    }

    public final synchronized void l(mxj mxjVar) {
        this.u = mxjVar;
    }

    public final synchronized void m(kuf kufVar) {
        this.s = kufVar;
    }

    public final synchronized void n(int i) {
        int i2;
        if (i > 0) {
            try {
                i2 = i + this.i;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            i2 = 0;
        }
        this.v = i2;
    }

    public final synchronized void o(mxm mxmVar) {
        this.t = mxmVar;
    }

    public final synchronized void p(fhd fhdVar) {
        if (!this.q && fhdVar != fhd.HIDDEN) {
            this.q = true;
            if (fhdVar == ((fhb) this.f.dL()).b) {
                this.w = (long) (SystemClock.elapsedRealtime() - 500.0f);
            } else {
                this.w = 0L;
                this.x = 0L;
            }
        }
    }

    @Override // defpackage.npl
    public final /* synthetic */ boolean q() {
        return false;
    }

    public final synchronized void r(mye myeVar) {
        this.A = myeVar;
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk s(qjn qjnVar, qim qimVar) {
        return jsv.B();
    }
}
