package defpackage;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Range;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lit extends jjx implements mmg {
    private final owf B;
    private final owf C;
    private final out D;
    private final kuf E;
    private final owf H;
    private final owf I;
    private our K;
    private final fdq L;
    public final ljd g;
    public final owq h;
    public final owq i;
    public final owf j;
    public final owf k;
    public final owf l;
    public final owf m;
    public final rwc n;
    public View r;
    public our v;
    public final mdy w;
    public final mwq x;
    public final mwq y;
    public final pfl z;
    public static final sgv c = sgv.g("lit");
    private static final PointF A = new PointF(-1.0f, -1.0f);
    public static final PointF d = new PointF(0.5f, 0.5f);
    public static final scn e = scn.I(nmr.WIDEST, nmr.MIDDLE, nmr.NARROWEST);
    public static final sbv f = sbv.p(nmr.MIDDLE_RM, nmr.MIDDLE, nmr.NARROWEST_RM, nmr.NARROWEST, nmr.WIDEST_RM, nmr.WIDEST);
    private final cwq F = new cwq(false);
    public final cwq o = new cwq(true);
    public final cwq p = new cwq(false);
    public final AtomicBoolean q = new AtomicBoolean();
    private final lky G = new lky();
    private boolean J = true;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;

    public lit(pfl pflVar, ljd ljdVar, owq owqVar, owq owqVar2, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, owf owfVar6, rwc rwcVar, mwq mwqVar, fdq fdqVar, out outVar, mdy mdyVar, kuf kufVar, mwq mwqVar2, owf owfVar7, owf owfVar8) {
        this.z = pflVar;
        this.g = ljdVar;
        this.h = owqVar;
        this.i = owqVar2;
        this.j = owfVar;
        this.k = owfVar2;
        this.B = owfVar3;
        this.l = owfVar4;
        this.C = owfVar5;
        this.m = owfVar6;
        this.n = rwcVar;
        this.y = mwqVar;
        this.L = fdqVar;
        this.D = outVar;
        this.w = mdyVar;
        this.E = kufVar;
        this.x = mwqVar2;
        this.H = owfVar7;
        this.I = owfVar8;
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.q.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.r = view;
        this.v = new our();
        this.i.a(false);
        this.s = false;
        this.t = false;
        our ourVar = this.v;
        owf owfVarA = owb.a(owl.h(this.C, new idb(17)));
        kso ksoVar = new kso(this, 11);
        out outVar = this.D;
        ourVar.d(owfVarA.dK(ksoVar, outVar));
        this.v.d(this.l.dK(new kso(this, 12), outVar));
        this.v.d(this.I.dK(new kso(this, 9), outVar));
        this.L.k().d(new kxj(this, 4));
        return new kxj(this, 5);
    }

    @Override // defpackage.mmg
    public final void c(RectF rectF, float f2, mly mlyVar) {
        this.g.b(new PointF(rectF.centerX(), rectF.centerY()));
    }

    @Override // defpackage.jjv
    public final synchronized void d() {
        our ourVar = this.K;
        if (ourVar != null) {
            ourVar.close();
            this.K = null;
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        this.z.j(true);
        owq owqVar = this.h;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.a = Optional.empty();
        owqVar.a(jjpVar);
        this.F.h(false);
    }

    @Override // defpackage.mmg
    public final void eV() {
        this.g.b(A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [imj, java.lang.Object] */
    @Override // defpackage.jjx, defpackage.jjv
    public final synchronized void g() {
        super.g();
        if (this.K != null) {
            return;
        }
        ljd ljdVar = this.g;
        PointF pointF = ljdVar.i;
        if (pointF.x > 1.0f || pointF.x < 0.0f || pointF.y > 1.0f || pointF.y < 0.0f) {
            ljdVar.b(d);
        }
        this.r.setVisibility(0);
        ljdVar.c(this.E);
        ljdVar.c.a(true);
        ljdVar.a.a(Boolean.valueOf(ljdVar.e));
        this.i.a(true);
        fdq fdqVar = this.L;
        mwq mwqVar = this.y;
        fdqVar.j().d(((imi) mwqVar.b).a(mwqVar.a));
        rwc rwcVar = this.n;
        if (rwcVar.h()) {
            ((mlw) rwcVar.c()).e(this);
        }
        our ourVarC = this.v.c();
        this.K = ourVarC;
        owf owfVar = this.j;
        ksq ksqVar = new ksq(this, 16);
        out outVar = this.D;
        ourVarC.d(owfVar.dK(ksqVar, outVar));
        this.K.d(this.k.dK(new ksq(this, 17), outVar));
        this.K.d(this.B.dK(new ksq(this, 18), outVar));
        our ourVar = this.K;
        owf owfVar2 = this.H;
        ljdVar.getClass();
        ourVar.d(owfVar2.dK(new kso(ljdVar, 10), outVar));
        this.K.d(new kxj(this, 6));
        this.K.d(new kxj(this, 7));
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        ComposeView composeView = (ComposeView) this.r.findViewById(R.id.focus_controls_slider);
        Resources resources = composeView.getContext().getResources();
        scn scnVarK = scn.K(0, 10, 20, 30, 40);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pro_slider_tick_spacing);
        int i = sbp.d;
        sbp sbpVar = sex.a;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.decrease_focus_icon_size);
        nhx nhxVar = new nhx(R.drawable.gs_filter_vintage_vd_theme_48, resources.getString(R.string.decrease_focus_desc), new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.r));
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.increase_focus_icon_size);
        nhy nhyVar = new nhy(46, scnVarK, dimensionPixelSize, 0.5f, false, 1, sbpVar, nhxVar, new nhx(R.drawable.gs_landscape_vd_theme_48, resources.getString(R.string.increase_focus_desc), new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.r)), new gvx(this, 18));
        nhw nhwVar = new nhw(R.drawable.icon_reset_focus, resources.getString(R.string.auto_focus_button_desc), new dus(this, 8), this.F);
        mxm mxmVar = this.b;
        nhw nhwVar2 = new nhw(R.drawable.picture_in_picture, resources.getString(R.string.pip_toggle_label_off), new dus(this, 7), this.o, this.p, resources.getString(R.string.pip_toggle_label_on));
        composeView.getClass();
        mxmVar.getClass();
        nhz nhzVar = new nhz(composeView, nhyVar, nhwVar, mxmVar, nhwVar2, 96);
        nhzVar.c(new nja() { // from class: lis
            @Override // defpackage.nja
            public final void a(float f2, boolean z, niz nizVar) {
                float fFloatValue;
                lit litVar = this.a;
                Range range = (Range) litVar.k.dL();
                if (f2 <= 0.8888889f) {
                    fFloatValue = (((((Float) range.getUpper()).floatValue() + 0.0f) * (0.8888889f - f2)) / 0.8888889f) + 0.0f;
                } else {
                    fFloatValue = (((-((Float) range.getLower()).floatValue()) * (1.0f - f2)) / 0.111111104f) + ((Float) range.getLower()).floatValue();
                }
                float fAj = ske.aj(fFloatValue, ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue());
                if (z) {
                    litVar.u = ((Boolean) litVar.m.dL()).booleanValue();
                    pfl pflVar = litVar.z;
                    pflVar.j(false);
                    pflVar.k(fAj);
                    owq owqVar = litVar.h;
                    jjp jjpVar = (jjp) owqVar.dL();
                    jjpVar.a = Optional.of(Float.valueOf(fAj));
                    owqVar.a(jjpVar);
                    litVar.w.C(nizVar, 6, fAj);
                }
            }
        });
        return nhzVar;
    }

    public final void i(lja ljaVar) {
        float fFloatValue;
        float f2 = ljaVar.a;
        lky lkyVar = this.G;
        lkyVar.b(f2);
        owf owfVar = this.k;
        Range range = (Range) owfVar.dL();
        float fAj = 1.0f - ske.aj((f2 - ((Float) range.getLower()).floatValue()) / (((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue()), 0.0f, 1.0f);
        ljd ljdVar = this.g;
        float f3 = fAj + 1.25f;
        ljdVar.f = f3;
        AtomicReference atomicReference = ljdVar.b;
        ljb ljbVar = (ljb) atomicReference.get();
        if (ljbVar != null) {
            ljbVar.b = f3;
        }
        float f4 = f3 * 0.8f;
        ljdVar.g = f4;
        ljb ljbVar2 = (ljb) atomicReference.get();
        if (ljbVar2 != null) {
            ljbVar2.c = f4;
        }
        boolean z = ljaVar.c;
        if (z && ((jjp) this.h.dL()).a().a.isEmpty()) {
            nhz nhzVar = this.a;
            nhzVar.getClass();
            float fA = (float) lkyVar.a();
            Range range2 = (Range) owfVar.dL();
            if (fA >= 0.0f) {
                fFloatValue = 0.8888889f - (((fA + 0.0f) * 0.8888889f) / (((Float) range2.getUpper()).floatValue() + 0.0f));
            } else {
                fFloatValue = 1.0f - (((fA - ((Float) range2.getLower()).floatValue()) * 0.111111104f) / (-((Float) range2.getLower()).floatValue()));
            }
            nhzVar.g(ske.aj(fFloatValue, 0.0f, 1.0f), false, niz.a);
        }
        if (this.J != z) {
            this.J = z;
            this.F.h(Boolean.valueOf(!((lja) this.j.dL()).c));
        }
    }

    @Override // defpackage.mmg
    public final void eQ() {
    }
}
