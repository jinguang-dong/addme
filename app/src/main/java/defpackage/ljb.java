package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.google.ar.core.R;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ljb implements npl {
    private static final sgv g = sgv.g("ljb");
    private final qin h;
    private final qkp i;
    private final lje j;
    private final Resources m;
    private final PointF n;
    private final PointF o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final String t;
    private kuf u;
    private final PointF k = new PointF(-1.0f, -1.0f);
    private final PointF l = new PointF(-1.0f, -1.0f);
    public pae a = pae.a;
    public float b = 1.0f;
    public float c = 0.5f;
    public int d = 0;
    public volatile boolean e = true;
    public volatile float f = 3.0f;
    private volatile qko v = null;
    private volatile qim w = null;

    public ljb(hbj hbjVar, Context context, qin qinVar, lje ljeVar, qkp qkpVar) {
        this.h = qinVar;
        this.j = ljeVar;
        this.m = context.getResources();
        this.i = qkpVar;
        String strF = hbjVar.f(hal.k);
        strF.getClass();
        this.t = strF;
        this.n = new PointF(h(R.dimen.pip_medium_height_4_3), h(R.dimen.pip_medium_width_4_3));
        this.o = new PointF(h(R.dimen.pip_medium_height_16_9), h(R.dimen.pip_medium_width_16_9));
        this.r = h(R.dimen.pip_outside_radius);
        this.s = h(R.dimen.pip_outside_stroke);
        this.p = h(R.dimen.pro_controls_pip_right_boarder_viewfinder_offset);
        this.q = h(R.dimen.pro_controls_pip_values_bar_bottom_to_notification_chip_top_offset);
    }

    private final synchronized int h(int i) {
        try {
        } catch (Resources.NotFoundException e) {
            ((sgt) ((sgt) g.c().i(e)).M(4170)).t("Dimension not found: %d", i);
            return 0;
        }
        return (int) this.m.getDimension(i);
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk a(poj pojVar, poj pojVar2) {
        return jsv.y(this, pojVar, pojVar2);
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk b(pdk pdkVar, peo peoVar, pdk pdkVar2) {
        return jsv.z(this, pdkVar, peoVar, pdkVar2);
    }

    @Override // defpackage.npl
    public final npm c() {
        return npm.ARK_PEAK;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.v != null) {
            this.v.a();
            this.v = null;
        }
        if (this.w != null) {
            this.w.a();
            this.w = null;
        }
        Map map = this.i.c;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((qkl) it.next()).a();
        }
        map.clear();
    }

    @Override // defpackage.npl
    public final qin d() {
        return this.h;
    }

    @Override // defpackage.npl
    public final /* synthetic */ String e() {
        return jsv.A(this);
    }

    public final void f(PointF pointF) {
        this.k.set(pointF);
    }

    public final synchronized void g(kuf kufVar) {
        this.u = kufVar;
    }

    @Override // defpackage.npl
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.npl
    public final synchronized npk s(qjn qjnVar, qim qimVar) {
        Color colorValueOf;
        qfq qfqVar = ((qhx) qjnVar.c()).a;
        try {
            colorValueOf = Color.valueOf(Color.parseColor(this.t));
        } catch (IllegalArgumentException unused) {
            colorValueOf = Color.valueOf(Color.parseColor("#FF00FF"));
        }
        qhx qhxVar = (qhx) qjnVar.c();
        if (this.v == null) {
            this.v = qko.c(this.h, qhxVar);
            this.w = qim.d(new qmq(this.v));
        }
        qko qkoVar = this.v;
        qim qimVar2 = this.w;
        if (qkoVar != null && qimVar2 != null) {
            if (this.e) {
                PointF pointF = this.k;
                if (pointF.x >= 0.0f && pointF.x <= 1.0f && pointF.y >= 0.0f && pointF.y <= 1.0f) {
                    PointF pointF2 = this.l;
                    pointF2.set(qfqVar.b() * pointF.x, qfqVar.a() * pointF.y);
                    PointF pointF3 = this.n;
                    float f = (pointF3.x / 2.0f) / this.f;
                    float f2 = (pointF3.y / 2.0f) / this.f;
                    float f3 = f + 0.0f;
                    pointF2.x = ske.aj(pointF2.x, f3, qfqVar.b() - f3);
                    float f4 = f2 + 0.0f;
                    pointF2.y = ske.aj(pointF2.y, f4, qfqVar.a() - f4);
                }
            } else {
                this.l.set(qfqVar.b() * 0.5f, qfqVar.a() * 0.5f);
            }
            PointF pointF4 = pae.b.l(this.a) ? this.o : this.n;
            int i = this.d + this.q;
            float f5 = this.p;
            PointF pointF5 = new PointF(i, f5);
            kuf kufVar = this.u;
            if (kufVar != null) {
                pointF5 = new PointF(kufVar.b(r9 + this.d, qfqVar, pointF4.x, this.a), this.u.a(f5, qfqVar, pointF4.y, this.a));
            }
            lje ljeVar = this.j;
            ljeVar.c = this.b;
            ljeVar.d = this.c;
            ljeVar.b = colorValueOf;
            ljeVar.h = this.e ? this.f : 1.0f;
            PointF pointF6 = this.l;
            PointF pointF7 = ljeVar.i;
            pointF7.set(pointF6);
            if (!this.e) {
                pointF5 = new PointF(0.0f, 0.0f);
            }
            PointF pointF8 = ljeVar.j;
            pointF8.set(pointF5);
            if (!this.e) {
                pointF4 = new PointF(qfqVar.b(), qfqVar.a());
            }
            PointF pointF9 = ljeVar.k;
            pointF9.set(pointF4);
            ljeVar.f = this.r;
            ljeVar.g = this.s;
            ljeVar.e = true != this.e ? 0.0f : 1.0f;
            PointF pointF10 = new PointF(qfqVar.b(), qfqVar.a());
            PointF pointF11 = ljeVar.l;
            pointF11.set(pointF10);
            Rect rect = new Rect(0, 0, qfqVar.b(), qfqVar.a());
            Rect rect2 = ljeVar.m;
            rect2.set(rect);
            qin qinVar = ljeVar.a;
            qji qjiVarA = qji.l(qjw.a(qinVar)).a(ljeVar.n);
            qjiVarA.i("uEdgeColor", ljeVar.b.red(), ljeVar.b.green(), ljeVar.b.blue());
            qjiVarA.f("uStrongThreshold", ljeVar.c);
            qjiVarA.f("uWeakThreshold", ljeVar.d);
            qjiVarA.f("uZoomFactor", ljeVar.h);
            qjiVarA.h("uRoiCenter", pointF7.x, pointF7.y);
            qjiVarA.h("uPipOffset", pointF8.x, pointF8.y);
            qjiVarA.h("uPipSize", pointF9.x, pointF9.y);
            qjiVarA.h("uExternalTexSize", pointF11.x, pointF11.y);
            qjiVarA.f("uPipRadius", ljeVar.f);
            qjiVarA.f("uPipStroke", ljeVar.g);
            qjiVarA.f("uIsPipVisible", ljeVar.e);
            qjiVarA.d("uExternalTex", qjnVar);
            qjiVarA.k(rect2.left, rect2.top, rect2.width(), rect2.height());
            qjiVarA.c("aPosition", 0);
            qjiVarA.b();
            qjiVarA.a(qimVar2);
            qpt.C(qinVar);
            qkp qkpVar = this.i;
            qin qinVar2 = qkoVar.b;
            float[] fArr = qkp.a;
            qkpVar.a(qinVar2);
            qin qinVar3 = qimVar.b;
            qkpVar.a(qinVar3);
            tym tymVarL = qji.l(qjw.a(qinVar3));
            a.I(qkpVar.b.f().b(qkq.a));
            qji qjiVarA2 = tymVarL.a(qkpVar.c("#version 300 es\nin vec2 aPosition;\nin vec2 aTexCoord;\nuniform mat4 uTransform;\nout vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}", "#version 300 es\n#extension GL_EXT_YUV_target : enable\nprecision highp float;\nuniform highp sampler2D uImgTex;\nin vec2 texCoord;\nlayout (yuv) out vec3 outColor;\nvoid main() {\n    outColor = rgb_2_yuv(texture(uImgTex, texCoord).rgb, itu_601_full_range);\n}"));
            qjiVarA2.e("uImgTex", qkoVar);
            qjiVarA2.g("uTransform", fArr);
            qjiVarA2.c("aPosition", 0);
            qjiVarA2.c("aTexCoord", 1);
            qjiVarA2.a(qimVar);
            return npk.APPLIED;
        }
        return npk.SKIPPED;
    }
}
