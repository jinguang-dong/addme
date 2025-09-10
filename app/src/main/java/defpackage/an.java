package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class an extends de {
    public final ao a;

    public an(ao aoVar) {
        aoVar.getClass();
        this.a = aoVar;
    }

    @Override // defpackage.de
    public final void a(ViewGroup viewGroup) {
        dg dgVar = this.a.a;
        View view = dgVar.a.P;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        dgVar.f(this);
        if (ch.X(2)) {
            Objects.toString(dgVar);
        }
    }

    @Override // defpackage.de
    public final void b(ViewGroup viewGroup) throws Resources.NotFoundException {
        Object obj;
        ao aoVar = this.a;
        if (aoVar.b()) {
            aoVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        dg dgVar = aoVar.a;
        View view = dgVar.a.P;
        context.getClass();
        ebn ebnVarA = aoVar.a(context);
        if (ebnVarA == null || (obj = ebnVarA.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (dgVar.h != 1) {
            view.startAnimation((Animation) obj);
            dgVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        bq bqVar = new bq((Animation) obj, viewGroup, view);
        bqVar.setAnimationListener(new am(dgVar, viewGroup, view, this));
        view.startAnimation(bqVar);
        if (ch.X(2)) {
            Objects.toString(dgVar);
        }
    }
}
