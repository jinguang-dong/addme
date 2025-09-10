package defpackage;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgg extends dgq {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ FragmentTransitionSupport e;

    public dgg(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = fragmentTransitionSupport;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void b(dgp dgpVar) {
        dgpVar.F(this);
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void e(dgp dgpVar) {
        Object obj = this.a;
        if (obj != null) {
            this.e.g(obj, this.b, (ArrayList) null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.e.g(obj2, this.d, (ArrayList) null);
        }
    }
}
