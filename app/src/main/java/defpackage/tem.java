package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.ar.core.R;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tem implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ tem(fks fksVar, View view, View view2, int i) {
        this.d = i;
        this.a = fksVar;
        this.c = view;
        this.b = view2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        return this.d != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.d != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ tem(teo teoVar, ten tenVar, sbp sbpVar, int i) {
        this.d = i;
        this.a = teoVar;
        this.b = tenVar;
        this.c = sbpVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, tzx] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) throws Resources.NotFoundException {
        if (this.d == 0) {
            tek tekVar = (tek) obj;
            int i = tekVar.c;
            foi foiVar = tekVar.b;
            txn txnVarN = rup.n(foiVar.dN());
            teu teuVar = ((teo) this.a).c;
            ten tenVar = (ten) this.b;
            txm txmVarB = teuVar.b(txnVarN, tenVar.b);
            if (txmVarB == null) {
                return null;
            }
            return new tel(foiVar, tenVar.a, txmVarB.a, txmVarB.b, (sbp) this.c);
        }
        tfc tfcVar = (tfc) obj;
        tfc tfcVar2 = tfc.LEFT;
        String str = (tfcVar == tfcVar2 || tfcVar == tfc.RIGHT) ? TOnSyMaYeslEl.OMVOUhykdwG : "translationY";
        Object obj2 = this.b;
        float dimension = ((View) obj2).getResources().getDimension(R.dimen.arrow_bounce_distance);
        float f = -1.0f;
        if (tfcVar != tfcVar2 && tfcVar != tfc.UP && tfcVar != tfc.FORWARD) {
            f = 1.0f;
        }
        Object obj3 = this.a;
        Object obj4 = this.c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj2, str, dimension * f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.509f, 0.0f, 0.268f, 1.169f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj2, str, 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.167f, 0.0f, 0.83f, 0.83f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
        animatorSet.setStartDelay(930L);
        got gotVar = (got) ((fks) obj3).f.a;
        return new fkq((View) obj4, tfcVar, animatorSet, (ktx) gotVar.b.a(), (owf) gotVar.c.a(), (mwq) gotVar.a.a());
    }
}
