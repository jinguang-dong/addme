package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gr implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        if (i == 0) {
            gs gsVar = (gs) this.a;
            if (gsVar.u()) {
                kc kcVar = gsVar.a;
                if (kcVar.p) {
                    return;
                }
                View view = gsVar.c;
                if (view == null || !view.isShown()) {
                    gsVar.k();
                    return;
                } else {
                    kcVar.s();
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            fv fvVar = (fv) this.a;
            if (fvVar.u()) {
                List list = fvVar.b;
                if (list.size() <= 0 || ((jz) ((tym) list.get(0)).c).p) {
                    return;
                }
                View view2 = fvVar.d;
                if (view2 == null || !view2.isShown()) {
                    fvVar.k();
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((jz) ((tym) it.next()).c).s();
                }
                return;
            }
            return;
        }
        if (i == 2) {
            ii iiVar = (ii) this.a;
            if (!iiVar.b.u()) {
                iiVar.b();
            }
            ViewTreeObserver viewTreeObserver = iiVar.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        Object obj = this.a;
        C0001if c0001if = (C0001if) obj;
        ii iiVar2 = c0001if.d;
        if (!iiVar2.isAttachedToWindow() || !iiVar2.getGlobalVisibleRect(c0001if.c)) {
            ((jz) obj).k();
        } else {
            c0001if.n();
            super/*jz*/.s();
        }
    }
}
