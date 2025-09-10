package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class li extends cnn {
    final RecyclerView a;
    public final lh b;

    public li(RecyclerView recyclerView) {
        this.a = recyclerView;
        cnn cnnVarJ = j();
        if (cnnVarJ == null || !(cnnVarJ instanceof lh)) {
            this.b = new lh(this);
        } else {
            this.b = (lh) cnnVarJ;
        }
    }

    @Override // defpackage.cnn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        kq kqVar;
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k() || (kqVar = ((RecyclerView) view).m) == null) {
            return;
        }
        kqVar.S(accessibilityEvent);
    }

    @Override // defpackage.cnn
    public void c(View view, cpt cptVar) {
        kq kqVar;
        super.c(view, cptVar);
        if (k() || (kqVar = this.a.m) == null) {
            return;
        }
        RecyclerView recyclerView = kqVar.s;
        kqVar.m(recyclerView.e, recyclerView.O, cptVar);
    }

    @Override // defpackage.cnn
    public boolean i(View view, int i, Bundle bundle) {
        kq kqVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (k() || (kqVar = this.a.m) == null) {
            return false;
        }
        return kqVar.t(i, bundle);
    }

    public cnn j() {
        return this.b;
    }

    final boolean k() {
        return this.a.ao();
    }
}
