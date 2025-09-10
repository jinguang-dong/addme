package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements cwf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        Window window;
        View viewPeekDecorView;
        int i = this.b;
        if (i == 0) {
            if (cwaVar == cwa.ON_DESTROY) {
                nh nhVar = (nh) this.a;
                nhVar.g.b = null;
                if (!nhVar.isChangingConfigurations()) {
                    nhVar.getViewModelStore$ar$class_merging().d();
                }
                nf nfVar = nhVar.m;
                nh nhVar2 = nfVar.b;
                nhVar2.getWindow().getDecorView().removeCallbacks(nfVar);
                nhVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nfVar);
                return;
            }
            return;
        }
        if (i == 1) {
            if (cwaVar != cwa.ON_STOP || (window = ((nh) this.a).getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
                return;
            }
            viewPeekDecorView.cancelPendingInputEvents();
            return;
        }
        if (i == 2) {
            Object obj = this.a;
            ((nh) obj).m();
            ((dj) obj).f.c(this);
            return;
        }
        Object obj2 = this.a;
        if (cwaVar == cwa.ON_START) {
            ((dex) obj2).f = true;
        } else if (cwaVar == cwa.ON_STOP) {
            ((dex) obj2).f = false;
        }
    }

    public nd(nh nhVar, int i, char[] cArr) {
        this.b = i;
        this.a = nhVar;
    }
}
