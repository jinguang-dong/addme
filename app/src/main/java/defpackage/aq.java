package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aq extends de {
    public final ao a;
    private AnimatorSet b;

    public aq(ao aoVar) {
        aoVar.getClass();
        this.a = aoVar;
    }

    @Override // defpackage.de
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            this.a.a.f(this);
            return;
        }
        dg dgVar = this.a.a;
        if (dgVar.d) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (ch.X(2)) {
            Objects.toString(dgVar);
            boolean z = dgVar.d;
        }
    }

    @Override // defpackage.de
    public final void b(ViewGroup viewGroup) {
        dg dgVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            dgVar.f(this);
            return;
        }
        animatorSet.start();
        if (ch.X(2)) {
            Objects.toString(dgVar);
        }
    }

    @Override // defpackage.de
    public final void c(ViewGroup viewGroup) throws Resources.NotFoundException {
        aq aqVar;
        ao aoVar = this.a;
        if (aoVar.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        ebn ebnVarA = aoVar.a(context);
        this.b = (AnimatorSet) (ebnVarA != null ? ebnVarA.b : null);
        dg dgVar = aoVar.a;
        boolean z = dgVar.h == 3;
        View view = dgVar.a.P;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            aqVar = this;
            animatorSet.addListener(new ap(viewGroup, view, z, dgVar, aqVar));
        } else {
            aqVar = this;
        }
        AnimatorSet animatorSet2 = aqVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.de
    public final boolean d() {
        return true;
    }

    @Override // defpackage.de
    public final void e(na naVar) {
        dg dgVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            dgVar.f(this);
            return;
        }
        if (dgVar.a.s) {
            if (ch.X(2)) {
                Objects.toString(dgVar);
            }
            long totalDuration = animatorSet.getTotalDuration();
            long j = (long) (naVar.a * totalDuration);
            if (j == 0) {
                j = 1;
            }
            if (j == totalDuration) {
                j = (-1) + totalDuration;
            }
            if (ch.X(2)) {
                Objects.toString(animatorSet);
                Objects.toString(dgVar);
            }
            animatorSet.setCurrentPlayTime(j);
        }
    }
}
