package defpackage;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fce implements fcc, pau {
    private boolean A;
    private final oun B;
    private int C;
    private final hbj D;
    public final gnt a;
    public final kgg b;
    public final boolean c;
    public nlt d;
    public nlt e;
    final fdb f;
    public szh g;
    public boolean h;
    public final nnw i;
    public final nmu j;
    public final nmv k;
    public final AtomicBoolean l;
    public final FocusIndicatorView m;
    private final out n;
    private final our o;
    private final rwc p;
    private final owf q;
    private paq r;
    private boolean s;
    private PointF t;
    private RectF u;
    private int v;
    private int w;
    private int x;
    private final owf y;
    private final rwc z;

    public fce(out outVar, FocusIndicatorView focusIndicatorView, gnt gntVar, hbj hbjVar, kgg kggVar, rwc rwcVar, owf owfVar, owf owfVar2, owq owqVar, ScheduledExecutorService scheduledExecutorService, rwc rwcVar2, owf owfVar3, pjo pjoVar, owq owqVar2) {
        our ourVar = new our();
        this.o = ourVar;
        this.d = null;
        this.e = null;
        this.f = new fdb();
        this.l = new AtomicBoolean(false);
        this.A = false;
        this.B = new fcu(this, 1);
        this.n = outVar;
        this.m = focusIndicatorView;
        this.a = gntVar;
        this.D = hbjVar;
        this.p = rwcVar;
        this.y = owfVar;
        this.i = new nnw(pjoVar.g());
        pjoVar.F();
        this.j = new nmu(2);
        this.k = new nmv(2);
        this.r = new pan(0);
        this.h = false;
        this.s = false;
        this.t = new PointF(0.0f, 0.0f);
        this.u = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.b = kggVar;
        ourVar.d(owfVar3.dK(this, outVar));
        this.v = 0;
        this.w = 0;
        this.C = 2;
        this.x = -1;
        this.q = owfVar2;
        this.c = hbjVar.p(gzj.f);
        this.z = rwcVar2;
        fcd fcdVar = new fcd(this, rwcVar2, scheduledExecutorService, 1);
        sxo sxoVar = sxo.a;
        ourVar.d(owqVar.dK(fcdVar, sxoVar));
        ourVar.d(owqVar2.dK(new fcd(this, rwcVar2, scheduledExecutorService, 0), sxoVar));
        kggVar.b(true);
    }

    private final void j() {
        nlt nltVar = this.d;
        if (nltVar != null) {
            nltVar.c();
        }
        nlt nltVar2 = this.e;
        if (nltVar2 != null) {
            nltVar2.c();
        }
    }

    private final synchronized void k(kfu kfuVar, int i) {
        rwc rwcVar = this.p;
        if (rwcVar.h()) {
            int i2 = kfuVar.d;
            if (i2 == 0) {
                throw null;
            }
            int i3 = 4;
            if (i2 == 4) {
                if (!this.s) {
                    mlw mlwVar = (mlw) rwcVar.c();
                    mlv mlvVar = mlv.FACE_TRACKING;
                    if (mlwVar.n(mlvVar)) {
                        nmu nmuVar = this.j;
                        nmuVar.b();
                        nmuVar.a(i);
                        this.s = true;
                        PointF pointF = kfuVar.a;
                        this.t = new PointF(pointF);
                        this.u = new RectF(kfuVar.b);
                        owf owfVarH = ((mlw) rwcVar.c()).h(this.i.a(pointF), mlvVar);
                        this.r.close();
                        this.r = owfVarH.dK(new fbt(this, 3), out.a);
                    }
                }
            } else if (i2 == 8 && !this.s) {
                mlw mlwVar2 = (mlw) rwcVar.c();
                mlv mlvVar2 = mlv.FACE_TRACKING;
                if (mlwVar2.n(mlvVar2)) {
                    nmv nmvVar = this.k;
                    nmvVar.c();
                    RectF rectF = kfuVar.b;
                    nmvVar.b(rectF);
                    this.s = true;
                    PointF pointF2 = kfuVar.a;
                    this.t = new PointF(pointF2);
                    this.u = new RectF(rectF);
                    owf owfVarH2 = ((mlw) rwcVar.c()).h(this.i.a(pointF2), mlvVar2);
                    this.r.close();
                    this.r = owfVarH2.dK(new fbt(this, i3), out.a);
                }
            }
        }
    }

    private final synchronized boolean l(lnn lnnVar) {
        if (lnnVar.b()) {
            int i = this.v + 1;
            this.v = i;
            if (i > 17) {
                return true;
            }
        } else {
            this.v = 0;
        }
        return false;
    }

    private final synchronized boolean m(PointF pointF) {
        if (!this.s) {
            return false;
        }
        if (e()) {
            return true;
        }
        float fAbs = Math.abs(this.t.x - pointF.x);
        float fAbs2 = Math.abs(this.t.y - pointF.y);
        if (fAbs > Math.abs(this.u.width()) * 0.12f || fAbs2 > Math.abs(this.u.height()) * 0.12f) {
            ((mlw) this.p.c()).m(mlv.FACE_TRACKING);
            this.s = false;
            this.w = 0;
        } else {
            this.w++;
        }
        return e();
    }

    public final void b() {
        boolean z = this.c;
        if (!z || this.m.u()) {
            nlt nltVar = this.d;
            if (nltVar != null) {
                nltVar.c();
            }
            if (this.e == null) {
                nlt nltVarI = z ? this.m.i() : this.m.j();
                this.e = nltVarI;
                nltVarI.b(new fbu(this, 2));
            }
        }
    }

    @Override // defpackage.mlu
    public final synchronized void c() {
        this.b.b(true);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.b(false);
        synchronized (this) {
            this.r.close();
        }
        this.o.close();
    }

    @Override // defpackage.mlu
    public final synchronized void d(mlv mlvVar) {
        this.b.b(false);
        if (mlvVar == mlv.QR_GLEAMING) {
            out outVar = this.n;
            FocusIndicatorView focusIndicatorView = this.m;
            focusIndicatorView.getClass();
            outVar.execute(new dzd(focusIndicatorView, 15));
        }
    }

    public final synchronized boolean e() {
        if (this.s) {
            if (this.w > 5) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return ((Boolean) this.y.dL()).booleanValue() || ((Boolean) ((ovx) this.m.j).d).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.rwc r11, android.graphics.RectF r12) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fce.g(rwc, android.graphics.RectF):boolean");
    }

    public final boolean h(rwc rwcVar, int i) throws Resources.NotFoundException {
        if (this.e != null) {
            return false;
        }
        if (this.c) {
            FocusIndicatorView focusIndicatorView = this.m;
            focusIndicatorView.m();
            focusIndicatorView.q(rwcVar, 360);
            if (focusIndicatorView.N != null || focusIndicatorView.u()) {
                float dimension = focusIndicatorView.getContext().getResources().getDimension(R.dimen.nairobi_active_focus_outer_ring_thickness);
                hnq hnqVar = focusIndicatorView.q;
                hnqVar.o(1);
                hnqVar.j(-1);
                hnqVar.n(dimension);
                hnqVar.m(1.0f);
                hnqVar.g(0.0f, 0.0f);
                focusIndicatorView.m.invalidate();
            } else {
                focusIndicatorView.o();
                focusIndicatorView.u.a();
            }
            focusIndicatorView.k.a(false);
        } else {
            FocusIndicatorView focusIndicatorView2 = this.m;
            focusIndicatorView2.m();
            focusIndicatorView2.q(rwcVar, i);
            float dimension2 = focusIndicatorView2.getContext().getResources().getDimension(R.dimen.active_focus_outer_ring_thickness);
            hnq hnqVar2 = focusIndicatorView2.q;
            hnqVar2.o(1);
            hnqVar2.j(-1);
            hnqVar2.n(dimension2);
            hnqVar2.m(1.0f);
            hnqVar2.g(0.0f, 0.0f);
            focusIndicatorView2.m.invalidate();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02e7 A[Catch: all -> 0x044a, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001b, B:11:0x0026, B:13:0x0036, B:15:0x003e, B:18:0x0049, B:20:0x0057, B:22:0x005f, B:25:0x006a, B:27:0x0072, B:29:0x007c, B:31:0x0088, B:33:0x009b, B:34:0x00a0, B:36:0x00d0, B:43:0x00f0, B:45:0x00f4, B:47:0x00fe, B:49:0x010c, B:37:0x00d3, B:39:0x00db, B:41:0x00e5, B:52:0x0117, B:54:0x0121, B:56:0x0137, B:58:0x0149, B:59:0x014c, B:62:0x0158, B:64:0x015c, B:66:0x0161, B:68:0x0174, B:70:0x0183, B:67:0x016c, B:72:0x019b, B:75:0x01a1, B:78:0x01e7, B:80:0x01eb, B:82:0x01f8, B:85:0x0203, B:87:0x020d, B:92:0x0234, B:94:0x023a, B:98:0x0254, B:120:0x02c6, B:121:0x02d0, B:126:0x02da, B:129:0x02e6, B:130:0x02e7, B:139:0x02f9, B:140:0x02fa, B:142:0x0306, B:144:0x0318, B:147:0x0326, B:173:0x03d3, B:150:0x0339, B:154:0x0340, B:156:0x034a, B:157:0x038d, B:162:0x0399, B:164:0x039f, B:166:0x03a5, B:169:0x03c3, B:176:0x03df, B:143:0x0311, B:177:0x03e0, B:101:0x025a, B:103:0x026e, B:106:0x0287, B:108:0x029f, B:112:0x02ae, B:115:0x02b7, B:105:0x0274, B:178:0x03e1, B:90:0x022e, B:180:0x03e4, B:211:0x0443, B:212:0x0444, B:181:0x03e5, B:183:0x03e9, B:186:0x03ec, B:187:0x03fe, B:202:0x0426, B:203:0x043b, B:208:0x0440, B:188:0x03ff, B:190:0x0403, B:197:0x040f, B:199:0x041a, B:200:0x0424, B:201:0x0425), top: B:221:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fa A[Catch: all -> 0x044a, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001b, B:11:0x0026, B:13:0x0036, B:15:0x003e, B:18:0x0049, B:20:0x0057, B:22:0x005f, B:25:0x006a, B:27:0x0072, B:29:0x007c, B:31:0x0088, B:33:0x009b, B:34:0x00a0, B:36:0x00d0, B:43:0x00f0, B:45:0x00f4, B:47:0x00fe, B:49:0x010c, B:37:0x00d3, B:39:0x00db, B:41:0x00e5, B:52:0x0117, B:54:0x0121, B:56:0x0137, B:58:0x0149, B:59:0x014c, B:62:0x0158, B:64:0x015c, B:66:0x0161, B:68:0x0174, B:70:0x0183, B:67:0x016c, B:72:0x019b, B:75:0x01a1, B:78:0x01e7, B:80:0x01eb, B:82:0x01f8, B:85:0x0203, B:87:0x020d, B:92:0x0234, B:94:0x023a, B:98:0x0254, B:120:0x02c6, B:121:0x02d0, B:126:0x02da, B:129:0x02e6, B:130:0x02e7, B:139:0x02f9, B:140:0x02fa, B:142:0x0306, B:144:0x0318, B:147:0x0326, B:173:0x03d3, B:150:0x0339, B:154:0x0340, B:156:0x034a, B:157:0x038d, B:162:0x0399, B:164:0x039f, B:166:0x03a5, B:169:0x03c3, B:176:0x03df, B:143:0x0311, B:177:0x03e0, B:101:0x025a, B:103:0x026e, B:106:0x0287, B:108:0x029f, B:112:0x02ae, B:115:0x02b7, B:105:0x0274, B:178:0x03e1, B:90:0x022e, B:180:0x03e4, B:211:0x0443, B:212:0x0444, B:181:0x03e5, B:183:0x03e9, B:186:0x03ec, B:187:0x03fe, B:202:0x0426, B:203:0x043b, B:208:0x0440, B:188:0x03ff, B:190:0x0403, B:197:0x040f, B:199:0x041a, B:200:0x0424, B:201:0x0425), top: B:221:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c3 A[Catch: all -> 0x044a, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001b, B:11:0x0026, B:13:0x0036, B:15:0x003e, B:18:0x0049, B:20:0x0057, B:22:0x005f, B:25:0x006a, B:27:0x0072, B:29:0x007c, B:31:0x0088, B:33:0x009b, B:34:0x00a0, B:36:0x00d0, B:43:0x00f0, B:45:0x00f4, B:47:0x00fe, B:49:0x010c, B:37:0x00d3, B:39:0x00db, B:41:0x00e5, B:52:0x0117, B:54:0x0121, B:56:0x0137, B:58:0x0149, B:59:0x014c, B:62:0x0158, B:64:0x015c, B:66:0x0161, B:68:0x0174, B:70:0x0183, B:67:0x016c, B:72:0x019b, B:75:0x01a1, B:78:0x01e7, B:80:0x01eb, B:82:0x01f8, B:85:0x0203, B:87:0x020d, B:92:0x0234, B:94:0x023a, B:98:0x0254, B:120:0x02c6, B:121:0x02d0, B:126:0x02da, B:129:0x02e6, B:130:0x02e7, B:139:0x02f9, B:140:0x02fa, B:142:0x0306, B:144:0x0318, B:147:0x0326, B:173:0x03d3, B:150:0x0339, B:154:0x0340, B:156:0x034a, B:157:0x038d, B:162:0x0399, B:164:0x039f, B:166:0x03a5, B:169:0x03c3, B:176:0x03df, B:143:0x0311, B:177:0x03e0, B:101:0x025a, B:103:0x026e, B:106:0x0287, B:108:0x029f, B:112:0x02ae, B:115:0x02b7, B:105:0x0274, B:178:0x03e1, B:90:0x022e, B:180:0x03e4, B:211:0x0443, B:212:0x0444, B:181:0x03e5, B:183:0x03e9, B:186:0x03ec, B:187:0x03fe, B:202:0x0426, B:203:0x043b, B:208:0x0440, B:188:0x03ff, B:190:0x0403, B:197:0x040f, B:199:0x041a, B:200:0x0424, B:201:0x0425), top: B:221:0x0005, inners: #0 }] */
    @Override // defpackage.pau
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(defpackage.mwq r18) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fce.a(mwq):void");
    }
}
