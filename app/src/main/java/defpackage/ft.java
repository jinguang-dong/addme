package defpackage;

import android.database.ContentObserver;
import android.provider.Settings;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ft implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ft(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ContentObserver contentObserver;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                View view2 = (View) this.a;
                view2.removeOnAttachStateChangeListener(this);
                int[] iArr = con.a;
                coe.b(view2);
                return;
            }
            if (i != 2) {
                nwt nwtVar = (nwt) this.a;
                if (nwtVar.g || (contentObserver = nwtVar.f) == null) {
                    return;
                }
                view.getContext().getContentResolver().registerContentObserver(Settings.Global.getUriFor("reduce_motion"), true, contentObserver);
                nwtVar.g = true;
                nwtVar.e = nwt.g(view.getContext());
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ContentObserver contentObserver;
        int i = this.b;
        if (i == 0) {
            fv fvVar = (fv) this.a;
            ViewTreeObserver viewTreeObserver = fvVar.e;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    fvVar.e = view.getViewTreeObserver();
                }
                fvVar.e.removeGlobalOnLayoutListener(fvVar.c);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                nwt nwtVar = (nwt) this.a;
                if (!nwtVar.g || (contentObserver = nwtVar.f) == null) {
                    return;
                }
                view.getContext().getContentResolver().unregisterContentObserver(contentObserver);
                nwtVar.g = false;
                return;
            }
            gs gsVar = (gs) this.a;
            ViewTreeObserver viewTreeObserver2 = gsVar.d;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    gsVar.d = view.getViewTreeObserver();
                }
                gsVar.d.removeGlobalOnLayoutListener(gsVar.b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }
}
