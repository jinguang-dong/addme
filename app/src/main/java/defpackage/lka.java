package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.camera.pro.feature.lens.LensFeatureControlsView;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.Map;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lka implements jjv {
    public static final sgv a = sgv.g("lka");
    public final AtomicBoolean b = new AtomicBoolean();
    public final owf c;
    public final owq d;
    public final owq e;
    public final Context f;
    public ViewGroup g;
    public sbv h;
    public our i;
    public final mwq j;
    private final out k;
    private final float l;
    private final sbv m;
    private final owf n;
    private final owq o;
    private our p;
    private final lat q;

    public lka(owq owqVar, owq owqVar2, owf owfVar, Context context, out outVar, hbj hbjVar, lat latVar, sbv sbvVar, owf owfVar2, owq owqVar3, mwq mwqVar) {
        this.e = owqVar;
        this.d = owqVar2;
        this.c = owfVar;
        this.f = context;
        this.k = outVar;
        this.q = latVar;
        this.m = sbvVar;
        this.n = owfVar2;
        this.o = owqVar3;
        this.l = ((Float) hbjVar.e(hba.j).get()).floatValue();
        this.j = mwqVar;
    }

    private final nhz l(Resources resources, ComposeView composeView, lkv lkvVar) {
        nhy nhyVar = new nhy(lkvVar.a, lkvVar.c, resources.getDimensionPixelSize(lkvVar.b), 0.5f, false, 3, lkvVar.d, null, null, new gvx(this, 19));
        composeView.getClass();
        return new nhz(composeView, nhyVar, null, null, null, 124);
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.b.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.g = (ViewGroup) view.findViewById(R.id.lens_controls);
        view.findViewById(R.id.lens_toggle_ultrawide_text).setOnClickListener(new kcm(this, 11));
        view.findViewById(R.id.lens_toggle_wide_text).setOnClickListener(new kcm(this, 12));
        int i = 10;
        view.findViewById(R.id.lens_toggle_tele_text).setOnClickListener(new kcm(this, i));
        LensFeatureControlsView lensFeatureControlsView = (LensFeatureControlsView) view;
        lensFeatureControlsView.a = this.o;
        lensFeatureControlsView.a.a(Boolean.valueOf(lensFeatureControlsView.e));
        this.i = new our();
        return new kxj(this, i);
    }

    @Override // defpackage.jjv
    public final synchronized void d() {
        our ourVar = this.p;
        if (ourVar != null) {
            ourVar.close();
            this.p = null;
        }
    }

    @Override // defpackage.mxl
    public final void eH(mxm mxmVar) {
        sbv sbvVar = this.h;
        if (sbvVar == null) {
            return;
        }
        Collection.EL.stream(sbvVar.values()).map(new kwj(13)).forEach(new lji(mxmVar, 2));
        Collection.EL.stream(this.h.values()).map(new kwj(12)).forEach(new lji(mxmVar, 3));
    }

    @Override // defpackage.jjv
    public final synchronized void g() {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null && this.p == null) {
            if (this.h == null) {
                Resources resources = viewGroup.getResources();
                lkk lkkVar = lkk.ULTRAWIDE;
                View viewFindViewById = this.g.findViewById(R.id.lens_toggle_ultrawide_background);
                TextView textView = (TextView) this.g.findViewById(R.id.lens_toggle_ultrawide_text);
                Context context = this.f;
                String string = context.getString(R.string.lens_toggle_ultrawide_label);
                View viewFindViewById2 = this.g.findViewById(R.id.uw_lens_slider);
                ComposeView composeView = (ComposeView) this.g.findViewById(R.id.uw_lens_slider);
                lat latVar = this.q;
                Object obj = latVar.a;
                int iFloatValue = (int) (((((Float) ((Range) obj).getUpper()).floatValue() - ((Float) ((Range) obj).getLower()).floatValue()) * 10.0f) + 1.0f);
                ljz ljzVar = new ljz(viewFindViewById, textView, string, viewFindViewById2, l(resources, composeView, new lkv((iFloatValue * 5) - 4, R.dimen.lens_uw_tick_spacing, lat.i(iFloatValue, 5), lat.j((Range) obj, iFloatValue))));
                lkk lkkVar2 = lkk.WIDE;
                View viewFindViewById3 = this.g.findViewById(R.id.lens_toggle_wide_background);
                TextView textView2 = (TextView) this.g.findViewById(R.id.lens_toggle_wide_text);
                String string2 = context.getString(R.string.lens_toggle_wide_label);
                View viewFindViewById4 = this.g.findViewById(R.id.w_lens_slider);
                ComposeView composeView2 = (ComposeView) this.g.findViewById(R.id.w_lens_slider);
                Object obj2 = latVar.c;
                int iFloatValue2 = (int) ((((Float) ((Range) obj2).getUpper()).floatValue() - ((Float) ((Range) obj2).getLower()).floatValue()) + 1.0f);
                ljz ljzVar2 = new ljz(viewFindViewById3, textView2, string2, viewFindViewById4, l(resources, composeView2, new lkv((iFloatValue2 * 10) - 9, R.dimen.lens_w_tick_spacing, lat.i(iFloatValue2, 10), lat.j((Range) obj2, iFloatValue2))));
                lkk lkkVar3 = lkk.TELE;
                View viewFindViewById5 = this.g.findViewById(R.id.lens_toggle_tele_background);
                TextView textView3 = (TextView) this.g.findViewById(R.id.lens_toggle_tele_text);
                String string3 = context.getString(R.string.lens_toggle_tele_label);
                View viewFindViewById6 = this.g.findViewById(R.id.tele_lens_slider);
                ComposeView composeView3 = (ComposeView) this.g.findViewById(R.id.tele_lens_slider);
                Object obj3 = latVar.b;
                int iFloatValue3 = (int) (((((Float) ((Range) obj3).getUpper()).floatValue() - ((Float) ((Range) obj3).getLower()).floatValue()) / 5.0f) + 1.0f);
                sbv sbvVarP = sbv.p(lkkVar, ljzVar, lkkVar2, ljzVar2, lkkVar3, new ljz(viewFindViewById5, textView3, string3, viewFindViewById6, l(resources, composeView3, new lkv((iFloatValue3 * 10) - 9, R.dimen.lens_tele_tick_spacing, lat.i(iFloatValue3, 10), lat.j((Range) obj3, iFloatValue3)))));
                this.h = sbvVarP;
                Collection.EL.stream(sbvVarP.values()).map(new kwj(13)).forEach(new lji(this, 4));
            }
            owq owqVar = this.e;
            if (owqVar.dL() == lkk.AUTO) {
                owqVar.a(lkk.WIDE);
            }
            i((lkk) owqVar.dL(), false);
            our ourVarC = this.i.c();
            this.p = ourVarC;
            owq owqVar2 = this.d;
            kso ksoVar = new kso(this, 16);
            out outVar = this.k;
            ourVarC.d(owqVar2.dK(ksoVar, outVar));
            this.p.d(this.c.dK(new kso(this, 17), outVar));
            this.p.d(new kxj(this, 11));
            this.p.d(this.n.dK(new kso(this, 18), outVar));
            this.g.setVisibility(0);
        }
    }

    public final String h(float f) {
        Range range = (Range) this.m.getOrDefault(this.e.dL(), (Range) this.c.dL());
        range.getClass();
        float fAj = ske.aj(((((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue()) * f) + ((Float) range.getLower()).floatValue(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue());
        float fRound = Math.round(fAj * 10.0f) / 10.0f;
        return fRound >= this.l ? String.format(Locale.getDefault(), "%.0fx", Double.valueOf(Math.floor(fAj))) : fRound == ((float) ((int) fRound)) ? String.format(Locale.getDefault(), "%dx", Integer.valueOf(Math.round(fAj))) : String.format(Locale.getDefault(), "%.1fx", Float.valueOf(fAj));
    }

    public final void i(lkk lkkVar, boolean z) {
        if (lkkVar.equals(lkk.AUTO)) {
            return;
        }
        this.e.a(lkkVar);
        sbv sbvVar = this.h;
        sbvVar.getClass();
        Map.EL.forEach(sbvVar, new ljx(this, lkkVar, 0));
        if (z) {
            this.d.a(Float.valueOf(1.0f));
        }
    }

    public final void j() {
        sbv sbvVar = this.h;
        sbvVar.getClass();
        Collection.EL.stream(sbvVar.values()).filter(new hzk(18)).map(new kwj(13)).findFirst().ifPresent(new lji(this, 5));
    }

    public final void k(nhz nhzVar) {
        nhzVar.e(h(nhzVar.a()));
    }

    @Override // defpackage.jjv
    public final void e() {
    }

    @Override // defpackage.jjv
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }
}
