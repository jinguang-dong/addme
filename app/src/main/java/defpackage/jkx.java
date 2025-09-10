package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.manual.panel.ManualPanelItemContainer;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkx extends ki {
    public static final /* synthetic */ int n = 0;
    private static final sbv o;
    public final sbp d;
    public jla g;
    public jjt h;
    public RecyclerView j;
    public final syj k;
    public final rnu l;
    public final rnu m;
    private final out p;
    private final owf q;
    private final owf r;
    private final boolean s;
    private our t;
    private final our u;
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public jjq i = new jjp(null).a();

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(jjt.HIGHLIGHTS, new jkv(0));
        sbrVar.f(jjt.BRIGHTNESS, new hci(13));
        int i = 18;
        sbrVar.f(jjt.SHADOWS, new idv(i));
        sbrVar.f(jjt.BRIGHTNESS_BIAS, new hci(14));
        sbrVar.f(jjt.EVC, new hci(15));
        sbrVar.f(jjt.WHITEBALANCE, new hci(16));
        sbrVar.f(jjt.SHUTTER_SPEED, new hci(17));
        sbrVar.f(jjt.FOCUS, new idv(19));
        sbrVar.f(jjt.DETAIL_NOISE, new idv(20));
        sbrVar.f(jjt.HDR_STRENGTH, new hci(i));
        sbrVar.f(jjt.LENS_SELECTOR, new jkv(2));
        sbrVar.f(jjt.GCAM_AE_BIAS, new jkv(3));
        sbrVar.f(jjt.EXPOSURE, new jkv(4));
        sbrVar.f(jjt.BLUR, new jkv(5));
        sbrVar.f(jjt.VIDEO_SPEED_SLOWMOTION, new jkv(6));
        sbrVar.f(jjt.VIDEO_SPEED_TIMELAPSE, new hci(11));
        sbrVar.f(jjt.NIGHT_SIGHT, new hci(12));
        o = sbrVar.b();
    }

    public jkx(our ourVar, sbp sbpVar, rnu rnuVar, rnu rnuVar2, syj syjVar, out outVar, owf owfVar, owf owfVar2, boolean z) {
        this.u = ourVar;
        Stream streamSorted = Collection.EL.stream(sbpVar).filter(new hsj(5)).sorted(Comparator$CC.comparing(new hci(19), svv.FALSE_FIRST));
        int i = sbp.d;
        this.d = (sbp) streamSorted.collect(ryv.a);
        this.l = rnuVar;
        this.m = rnuVar2;
        this.k = syjVar;
        this.p = outVar;
        this.q = owfVar;
        this.r = owfVar2;
        this.s = z;
    }

    public static Function r(jjt jjtVar) {
        return (Function) Optional.ofNullable((Function) o.get(jjtVar)).orElse(new hci(20));
    }

    @Override // defpackage.ki
    public final int a() {
        return p().size() + 1;
    }

    @Override // defpackage.ki
    public final int b(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // defpackage.ki
    public final lg d(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(true != this.s ? R.layout.manual_control_panel_item : R.layout.manual_control_panel_item_freeway, viewGroup, false);
        return i == 0 ? new jky(viewInflate) : new jkw(viewInflate);
    }

    @Override // defpackage.ki
    public final void h(RecyclerView recyclerView) {
        this.j = recyclerView;
        Resources resources = this.j.getResources();
        owf owfVar = this.q;
        jla jlaVar = new jla(resources, (mxm) owfVar.dL(), this.s);
        this.g = jlaVar;
        this.j.aB(jlaVar);
        our ourVarC = this.u.c();
        this.t = ourVarC;
        owf owfVarA = owb.a(owfVar);
        jbp jbpVar = new jbp(this, 20);
        out outVar = this.p;
        ourVarC.d(owfVarA.dK(jbpVar, outVar));
        this.t.d(owb.a(owl.h(this.r, new jku(0))).dK(new jjl(this, 12), outVar));
    }

    @Override // defpackage.ki
    public final void i(lg lgVar, int i) {
        if (lgVar instanceof jkw) {
            jkw jkwVar = (jkw) lgVar;
            boolean zEquals = ((mxj) this.r.dL()).equals(mxj.TABLET_LAYOUT);
            ipr iprVar = new ipr(this, 20);
            boolean z = this.s;
            View view = jkwVar.a;
            ImageView imageView = (ImageView) view.findViewById(R.id.panel_item_image);
            view.setContentDescription(view.getResources().getString(R.string.reset_all));
            imageView.setBackgroundTintList(zEquals ? jkwVar.t : jkwVar.s);
            imageView.setImageTintList(jkwVar.u);
            view.setOnClickListener(iprVar);
            TextView textView = (TextView) view.findViewById(R.id.panel_item_name);
            textView.setText(R.string.reset_all);
            textView.setTextColor(ojl.aM(view));
            imageView.setImageResource(true != z ? R.drawable.manual_control_panel_reset_all : R.drawable.gs_reset_settings_vd_theme_24);
            return;
        }
        if (!(lgVar instanceof jky) || this.t == null) {
            return;
        }
        jju jjuVar = (jju) p().get(i - 1);
        jky jkyVar = (jky) lgVar;
        jkyVar.B();
        boolean zIsPresent = ((Optional) r(jjuVar.c()).apply(this.i)).isPresent();
        boolean zEquals2 = jjuVar.c().equals(this.h);
        boolean zContains = this.f.contains(jjuVar.c());
        boolean zEquals3 = ((mxj) this.r.dL()).equals(mxj.TABLET_LAYOUT);
        ipd ipdVar = new ipd(this, jjuVar, 6, null);
        our ourVar = this.t;
        ourVar.getClass();
        out outVar = this.p;
        our ourVarC = ourVar.c();
        jkyVar.v = ourVarC;
        TextView textView2 = jkyVar.u;
        textView2.setText(jjuVar.c);
        ImageView imageView2 = jkyVar.t;
        owf owfVar = jjuVar.b;
        imageView2.setImageResource(((Integer) owfVar.dL()).intValue());
        View view2 = jkyVar.s;
        view2.setContentDescription(textView2.getText());
        View view3 = jkyVar.a;
        textView2.setTextColor(ojl.aL(view3));
        view2.setOnClickListener(ipdVar);
        view2.setSelected(zEquals2);
        ourVarC.d(owb.a(owfVar).dK(new jjl(jkyVar, 13), outVar));
        if (zContains) {
            view2.setEnabled(false);
            if (zEquals3) {
                view2.setTag("disabled large screen");
                imageView2.setBackgroundTintList(ColorStateList.valueOf(ojl.aR(view3)));
            } else {
                view2.setTag("disabled");
                imageView2.setBackgroundTintList(ColorStateList.valueOf(ojl.aQ(view3)));
            }
            imageView2.setColorFilter(ojl.aL(view3));
            imageView2.setAlpha(0.35f);
            textView2.setAlpha(0.5f);
            return;
        }
        view2.setEnabled(true);
        imageView2.setAlpha(1.0f);
        textView2.setAlpha(1.0f);
        if (zEquals2) {
            jkyVar.C(true, zEquals3);
            return;
        }
        if (!zIsPresent) {
            view2.setContentDescription(view2.getResources().getString(R.string.panel_item_default_desc, textView2.getText()));
            jkyVar.C(false, zEquals3);
        } else {
            view2.setContentDescription(view2.getResources().getString(R.string.panel_item_adjusted_desc, textView2.getText()));
            view2.setTag("present");
            imageView2.setBackgroundTintList(ColorStateList.valueOf(ojl.aP(view3)));
            imageView2.setColorFilter(ojl.aK(view3));
        }
    }

    @Override // defpackage.ki
    public final void j(lg lgVar) {
        ((ManualPanelItemContainer) lgVar.a).a((mxm) this.q.dL());
    }

    @Override // defpackage.ki
    public final void l() {
        our ourVar = this.t;
        if (ourVar != null) {
            ourVar.close();
            this.t = null;
        }
    }

    public final Pair o(jjs jjsVar) {
        sbv sbvVar = (sbv) new smy(ske.m(), Collection.EL.stream(p())).i(new glx(jjsVar, 7)).e();
        return Pair.create(Integer.valueOf(Collection.EL.stream(sbvVar.keySet()).mapToInt(new hkp(2)).min().orElse(-1)), Integer.valueOf(sbvVar.size()));
    }

    public final sbp p() {
        Stream streamFilter = Collection.EL.stream(this.d).filter(new jjj(this, 3));
        int i = sbp.d;
        return (sbp) streamFilter.collect(ryv.a);
    }

    public final OptionalInt q(final jjt jjtVar) {
        return IntStream.CC.range(0, p().size()).filter(new IntPredicate() { // from class: jkt
            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$and(this, intPredicate);
            }

            public final /* synthetic */ IntPredicate negate() {
                return IntPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return ((jju) this.a.p().get(i)).c().equals(jjtVar);
            }
        }).map(new sna(1)).findFirst();
    }

    public final void s() {
        Collection.EL.stream(p()).filter(new jjj(this, 4)).findFirst().ifPresent(new ird(this, 12));
    }
}
