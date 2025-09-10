package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwu extends uht implements uiu {
    final /* synthetic */ gwv a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ uif d;
    final /* synthetic */ ValueAnimator.AnimatorUpdateListener e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwu(gwv gwvVar, float f, float f2, int i, uif uifVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, uhb uhbVar) {
        super(2, uhbVar);
        this.a = gwvVar;
        this.b = f;
        this.c = f2;
        this.f = i;
        this.d = uifVar;
        this.e = animatorUpdateListener;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gwu) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) throws Resources.NotFoundException {
        rnt.aN(obj);
        gwv gwvVar = this.a;
        Float f = gwvVar.q;
        final float f2 = this.b;
        if (!ujp.d(f, f2)) {
            gwvVar.q = new Float(f2);
            gwv.D(gwvVar, f2);
            ValueAnimator valueAnimator = gwvVar.p;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            if (valueAnimator == null || this.c != f2 || this.f == 3) {
                if (this.f == 1) {
                    gwvVar.g.a(new Float(f2));
                    gwvVar.q = null;
                    gwvVar.x(f2);
                    return ufg.a;
                }
                final float f3 = this.c;
                uif uifVar = this.d;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.e;
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.addUpdateListener(new cot(gwvVar, 6, null));
                valueAnimator2.setInterpolator(gwvVar.H);
                valueAnimator2.setFloatValues(f3, f2);
                ((Integer) gwvVar.Q.a(hba.c).orElseGet(new Supplier() { // from class: gwk
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i = gwv.Y;
                        float f4 = f2;
                        float f5 = f3;
                        return Integer.valueOf(Math.min(500, (int) Math.rint(((Math.max(f4, f5) / Math.min(f4, f5)) * 500.0f) / 3.0f)));
                    }
                })).getClass();
                valueAnimator2.setDuration(r9.intValue());
                valueAnimator2.addListener(new gwt(gwvVar, f2, 0));
                if (animatorUpdateListener != null) {
                    valueAnimator2.addUpdateListener(animatorUpdateListener);
                }
                ujw ujwVar = new ujw();
                valueAnimator2.addListener(new gwr(ujwVar));
                valueAnimator2.addListener(new gws(ujwVar, gwvVar, f2, uifVar, valueAnimator2));
                valueAnimator2.start();
                gwvVar.p = valueAnimator2;
                return ufg.a;
            }
            gwvVar.q = null;
            gwvVar.x(f2);
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new gwu(this.a, this.b, this.c, this.f, this.d, this.e, uhbVar);
    }
}
