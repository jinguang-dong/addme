package defpackage;

import android.content.res.Resources;
import android.util.Pair;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mcx implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ mcx(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new ftb(new AtomicBoolean(false), (mcw) obj, 4);
            case 1:
                return Double.valueOf(Collection.EL.stream(((pjo) obj).u()).mapToDouble(new kql(3)).min().orElseThrow());
            case 2:
                return (mxk) obj;
            case 3:
                return new ovx(mxm.PORTRAIT);
            case 4:
                return ndw.d((Resources) obj);
            case 5:
                Resources resources = (Resources) obj;
                ndv ndvVarA = ndw.a();
                ndvVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
                ndvVarA.q(255);
                ndvVarA.r(resources.getColor(R.color.night_mode_idle_color, null));
                ndvVarA.E(0);
                ndvVarA.D(resources.getColor(R.color.video_mode_idle_color, null));
                ndvVarA.y(0);
                ndvVarA.w(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA.t(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA.u(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA.x(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA.e(R.drawable.ic_shutter_astro_white);
                ndvVarA.m(resources.getDrawable(R.drawable.ic_shutter_astro_white, null).getIntrinsicWidth() / 2);
                return ndvVarA;
            case 6:
                Pair pair = (Pair) obj;
                return new uen(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue());
            case 7:
                owf owfVar = ((npo) obj).b;
                sgv sgvVar = nph.a;
                return owb.a(owfVar);
            case 8:
                return ((npl) obj).e();
            case 9:
                return new AtomicReference();
            case 10:
                ?? r10 = ((rtl) obj).a;
                sbk sbkVar = new sbk(r10.size());
                seo seoVar = seo.a;
                Collections.sort(r10, sen.a);
                Iterator it = r10.iterator();
                sdh sdhVar = it instanceof sdh ? (sdh) it : new sdh(it);
                while (sdhVar.hasNext()) {
                    seo seoVar2 = (seo) sdhVar.next();
                    while (sdhVar.hasNext()) {
                        if (!sdhVar.b) {
                            sdhVar.c = sdhVar.a.next();
                            sdhVar.b = true;
                        }
                        seo seoVar3 = (seo) sdhVar.c;
                        if (seoVar2.m(seoVar3)) {
                            rnt.I(seoVar2.g(seoVar3).n(), "Overlapping ranges not permitted but found %s overlapping %s", seoVar2, seoVar3);
                            seo seoVar4 = (seo) sdhVar.next();
                            rzr rzrVar = seoVar2.b;
                            rzr rzrVar2 = seoVar4.b;
                            int iCompareTo = rzrVar.compareTo(rzrVar2);
                            rzr rzrVar3 = seoVar2.c;
                            rzr rzrVar4 = seoVar4.c;
                            int iCompareTo2 = rzrVar3.compareTo(rzrVar4);
                            if (iCompareTo > 0 || iCompareTo2 < 0) {
                                if (iCompareTo < 0 || iCompareTo2 > 0) {
                                    if (iCompareTo > 0) {
                                        rzrVar = rzrVar2;
                                    }
                                    if (iCompareTo2 < 0) {
                                        rzrVar3 = rzrVar4;
                                    }
                                    seoVar2 = new seo(rzrVar, rzrVar3);
                                } else {
                                    seoVar2 = seoVar4;
                                }
                            }
                        }
                    }
                    sbkVar.h(seoVar2);
                }
                sbp sbpVarG = sbkVar.g();
                return sbpVarG.isEmpty() ? sck.a : (((sex) sbpVarG).c == 1 && ((seo) ujp.aS(sbpVarG)).equals(seo.a)) ? sck.b : new sck(sbpVarG);
            default:
                return ((Map.Entry) obj).getValue();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
