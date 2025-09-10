package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.cuttlefish.CountdownSliderUi;
import com.google.android.apps.camera.ui.views.CountdownSnapSlider;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mtm implements paq, mxl {
    private static final sgv q = sgv.g("mtm");
    public String e;
    public String f;
    public String g;
    public String h;
    public Resources i;
    public CountdownSliderUi j;
    public CountdownSnapSlider k;
    public CountDownTimer l;
    public final mwq o;
    public final ocq p;
    private final owq r;
    private ValueAnimator s;
    private final syj t;
    public final our b = new our();
    public final owq d = new ovx(false);
    public boolean m = false;
    public Duration n = null;
    public final Set a = new HashSet();
    public final nlc c = new nlc();

    public mtm(syj syjVar, owq owqVar, mwq mwqVar, ocq ocqVar) {
        this.t = syjVar;
        this.r = owqVar;
        this.o = mwqVar;
        this.p = ocqVar;
    }

    private static final int B(mtp mtpVar) {
        int iOrdinal = mtpVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? R.drawable.gs_night_sight_auto_vd_theme_24 : R.drawable.gs_astrophotography_mode_fill1_vd_theme_24 : R.drawable.gs_night_sight_max_vd_theme_24 : R.drawable.gs_night_sight_auto_off_vd_theme_24;
    }

    public static final long x(Duration duration) {
        if (duration == null) {
            return -1L;
        }
        return (long) Math.ceil(duration.isZero() ? 0.0f : duration.toMillis() / 1000.0f);
    }

    public static final mtp y(int i) {
        return i != 0 ? i != 2 ? i != 3 ? mtp.AUTO : mtp.ASTRO : mtp.MAX : mtp.OFF;
    }

    public static final int z(mtp mtpVar) {
        int iOrdinal = mtpVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 2;
        if (iOrdinal != 2) {
            i = 3;
            if (iOrdinal != 3) {
                return 1;
            }
        }
        return i;
    }

    public final void A(boolean z) throws Resources.NotFoundException {
        CountdownSliderUi countdownSliderUi = this.j;
        ValueAnimator valueAnimator = countdownSliderUi.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        countdownSliderUi.p();
        countdownSliderUi.i(true);
        if (!z) {
            countdownSliderUi.m(false, false);
        } else {
            CountdownSnapSlider countdownSnapSlider = countdownSliderUi.a;
            countdownSliderUi.n(countdownSnapSlider.a(countdownSnapSlider.c()));
        }
    }

    public final mtp a() {
        return y((int) this.k.c());
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final String d(long j) {
        if (j < 0) {
            return "";
        }
        return this.j.getResources().getQuantityString(R.plurals.capture_time_label_desc, (int) j, Long.valueOf(j));
    }

    public final String e(long j) {
        return j < 0 ? "" : this.j.getResources().getString(R.string.time_remaining, Long.valueOf(j));
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) throws Resources.NotFoundException {
        this.j.j(mxjVar, mxmVar);
    }

    public final void f(boolean z) {
        CountdownSliderUi countdownSliderUi = this.j;
        ValueAnimator valueAnimator = countdownSliderUi.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            countdownSliderUi.i(false);
        } else {
            countdownSliderUi.setAlpha(0.0f);
            countdownSliderUi.setVisibility(8);
        }
    }

    public final void g() {
        for (AmbientMode.AmbientController ambientController : this.a) {
        }
    }

    public final void h(mtp mtpVar) throws Resources.NotFoundException {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ftv ftvVar = (ftv) ((AmbientMode.AmbientController) it.next()).a;
            owq owqVar = ftvVar.b;
            ovx ovxVar = (ovx) owqVar;
            boolean zBooleanValue = ((Boolean) ovxVar.d).booleanValue();
            ftvVar.k.a(Boolean.valueOf(mtpVar.equals(mtp.ASTRO)));
            mtm mtmVar = ftvVar.s;
            mtmVar.r(mtpVar);
            nkw nkwVar = nkw.UNINITIALIZED;
            int iOrdinal = mtpVar.ordinal();
            int i = 3;
            if (iOrdinal != 0) {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    owqVar.a(true);
                    ftvVar.h.a(mtpVar.equals(mtp.AUTO) ? fug.AUTO : fug.MAX);
                    owq owqVar2 = ftvVar.f;
                    if (((Optional) owqVar2.dL()).isPresent()) {
                        ftvVar.l((Duration) ((Optional) owqVar2.dL()).get());
                    }
                } else if (iOrdinal == 3) {
                    String string = ftvVar.l.getResources().getString(R.string.astro_time_estimate);
                    if (mtmVar.k.isEnabled()) {
                        mtmVar.j.k(string, string);
                    }
                }
            } else {
                if (ftvVar.n.equals(nkw.NIGHT_SIGHT)) {
                    throw new IllegalArgumentException("OFF option should never be selected for long exposure.");
                }
                owqVar.a(false);
            }
            mdy mdyVar = ftvVar.t;
            if (mdyVar != null) {
                int iOrdinal2 = mtpVar.ordinal();
                if (iOrdinal2 == 0) {
                    i = 2;
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 == 2) {
                        i = 4;
                    } else {
                        if (iOrdinal2 != 3) {
                            throw new RuntimeException(null, null);
                        }
                        i = 5;
                    }
                }
                float fFloatValue = ((Float) ftvVar.d.dL()).floatValue();
                nkw nkwVar2 = ftvVar.n;
                tpc tpcVarM = sod.a.m();
                soc socVar = soc.CUTTLEFISH_BONE_OPTION_CHANGE_EVENT;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                sod sodVar = (sod) tpcVarM.b;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                tpc tpcVarM2 = spl.a.m();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                spl splVar = (spl) tphVar;
                splVar.c = i - 1;
                splVar.b |= 1;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                tph tphVar2 = tpcVarM2.b;
                spl splVar2 = (spl) tphVar2;
                splVar2.b = 2 | splVar2.b;
                splVar2.d = fFloatValue;
                ssc sscVar = nkwVar2.v;
                if (!tphVar2.C()) {
                    tpcVarM2.o();
                }
                spl splVar3 = (spl) tpcVarM2.b;
                splVar3.e = sscVar.T;
                splVar3.b |= 4;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                sod sodVar2 = (sod) tpcVarM.b;
                spl splVar4 = (spl) tpcVarM2.l();
                splVar4.getClass();
                sodVar2.aq = splVar4;
                sodVar2.d |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                mdyVar.I(tpcVarM);
            }
            if (zBooleanValue != ((Boolean) ovxVar.d).booleanValue()) {
                ftvVar.t(((Boolean) ovxVar.d).booleanValue(), 4);
            }
        }
    }

    public final void i() {
        for (AmbientMode.AmbientController ambientController : this.a) {
        }
    }

    public final void j() {
        this.t.h(VibrationEffect.startComposition().addPrimitive(1, 0.5f).compose());
    }

    public final void k(double d) {
        this.k.e(d);
        this.k.setEnabled(true);
        this.j.n(this.k.a(d));
        this.j.m(true, false);
        this.k.g = 0.0d;
        l(this.n);
    }

    public final void l(Duration duration) {
        long jX = x(duration);
        this.j.k(e(jX), d(jX));
    }

    public final void m(mtp mtpVar, mtq mtqVar) {
        int iOrdinal = mtpVar.ordinal();
        TextView textViewC = iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? this.j.c() : this.j.b() : this.j.e() : this.j.f();
        CountdownSnapSlider countdownSnapSlider = this.k;
        int iZ = z(mtpVar);
        if (iZ >= countdownSnapSlider.c) {
            throw new IllegalArgumentException("Not a valid primary tick.");
        }
        countdownSnapSlider.b.put(Integer.valueOf(iZ), mtqVar);
        double dC = countdownSnapSlider.c();
        countdownSnapSlider.h = dC;
        countdownSnapSlider.setProgress((int) dC);
        int iD = countdownSnapSlider.d();
        Stream streamFilter = Collection.EL.stream(countdownSnapSlider.b.keySet()).filter(new nhh(countdownSnapSlider, 0));
        int i = sbp.d;
        sbp sbpVar = (sbp) streamFilter.collect(ryv.a);
        countdownSnapSlider.e = ((Integer) Collection.EL.stream(sbpVar).min(Comparator$CC.naturalOrder()).orElse(0)).intValue();
        countdownSnapSlider.f = ((Integer) Collection.EL.stream(sbpVar).max(Comparator$CC.naturalOrder()).orElse(Integer.valueOf(iD))).intValue();
        this.j.l(textViewC, mtqVar);
        CountdownSnapSlider countdownSnapSlider2 = this.k;
        double dB = countdownSnapSlider2.b(countdownSnapSlider2.h);
        if (mtqVar == mtq.GONE) {
            this.j.n(this.k.a(dB));
        } else {
            this.j.o(this.k.a(dB), 1.0f);
        }
        r(y((int) dB));
    }

    public final void n(boolean z) {
        this.k.setEnabled(z);
    }

    public final void o(final TextView textView) {
        int i = 3;
        final int i2 = textView.equals(this.j.e()) ? 2 : textView.equals(this.j.f()) ? 0 : textView.equals(this.j.c()) ? 1 : 3;
        textView.setOnClickListener(new View.OnClickListener() { // from class: mtg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextView textView2 = textView;
                if (!textView2.isEnabled() || textView2.getVisibility() == 8) {
                    return;
                }
                mtm mtmVar = this.a;
                double d = mtmVar.k.h;
                Map map = mtmVar.j.d;
                if (map.containsKey(textView2) && ((mto) map.get(textView2)).c == mtq.ENABLED) {
                    double d2 = i2;
                    if (d != d2) {
                        mtmVar.i();
                        mtmVar.k.setEnabled(false);
                        mtmVar.u(d, d2, 200L, new cvn(), new mtk(mtmVar, d2, 2), 0L, 2);
                    }
                }
            }
        });
        textView.setOnHoverListener(new hhw(this, i));
    }

    public final void p(Duration duration) {
        q(duration, false);
    }

    public final void q(Duration duration, boolean z) {
        if (duration != null && duration.isNegative()) {
            throw new IllegalArgumentException("Displayed seconds must be nonnegative");
        }
        if (z || this.k.isEnabled()) {
            this.n = duration;
            if (duration == null && this.m) {
                v(y((int) this.k.c()), 2, false);
            }
            s(true);
            l(duration);
        }
    }

    public final void r(mtp mtpVar) {
        if (this.k.isEnabled()) {
            double dZ = z(mtpVar);
            int i = (int) dZ;
            if (!this.k.g(i)) {
                ((sgt) q.c().M(5048)).v("Cannot update to disabled or inactive option: %s", mtpVar);
                return;
            }
            this.k.e(dZ);
            this.k.setProgress(i);
            CountdownSliderUi countdownSliderUi = this.j;
            CountdownSnapSlider countdownSnapSlider = this.k;
            countdownSliderUi.n(countdownSnapSlider.a(countdownSnapSlider.c()));
            this.j.a().setImageResource(B(mtpVar));
            this.r.a(Integer.valueOf(B(mtpVar)));
        }
    }

    public final void s(boolean z) {
        String string;
        Duration duration;
        int progress = this.k.getProgress();
        if (!z || (duration = this.n) == null) {
            string = progress != 0 ? progress != 2 ? progress != 3 ? this.f : this.h : this.g : this.e;
        } else {
            long jX = x(duration);
            string = progress != 0 ? progress != 2 ? progress != 3 ? this.i.getString(R.string.auto_pos_desc_full, Long.valueOf(jX)) : this.i.getString(R.string.astro_pos_desc_full) : this.i.getString(R.string.max_pos_desc_full, Long.valueOf(jX)) : this.i.getString(R.string.off_pos_desc_full, Long.valueOf(jX));
        }
        if (string.equals(String.valueOf(this.k.getContentDescription()))) {
            return;
        }
        this.k.setContentDescription(string);
    }

    public final boolean t() {
        return this.j.getVisibility() == 0;
    }

    public final void u(double d, double d2, long j, TimeInterpolator timeInterpolator, AnimatorListenerAdapter animatorListenerAdapter, long j2, int i) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) d, (float) d2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new mzh(this, i, 1));
        valueAnimatorOfFloat.addListener(animatorListenerAdapter);
        valueAnimatorOfFloat.start();
        this.s = valueAnimatorOfFloat;
    }

    public final void v(mtp mtpVar, int i, boolean z) {
        CountDownTimer countDownTimer = this.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            double dZ = z(mtpVar);
            if (z) {
                l(Duration.ZERO);
            }
            if (i == 1) {
                u(this.k.h, dZ, 250L, new cvn(), new mtk(this, dZ, 1), 200L, 1);
            } else {
                if (i == 2) {
                    k(dZ);
                }
                this.m = false;
                g();
            }
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
