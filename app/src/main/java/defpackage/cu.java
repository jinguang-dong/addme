package defpackage;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cu implements Transition.TransitionListener {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ cx e;

    public cu(cx cxVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = cxVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.a;
        if (obj != null) {
            this.e.g(obj, this.b, (ArrayList) null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.e.g(obj2, this.d, (ArrayList) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
