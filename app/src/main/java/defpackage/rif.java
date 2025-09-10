package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rif extends clc {
    private rig a;
    private int b;

    public rif() {
        this.b = 0;
    }

    public final int at() {
        rig rigVar = this.a;
        if (rigVar != null) {
            return rigVar.b;
        }
        return 0;
    }

    public final boolean au(int i) {
        rig rigVar = this.a;
        if (rigVar != null) {
            return rigVar.c(i);
        }
        this.b = i;
        return false;
    }

    protected void fu(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.clc
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        fu(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new rig(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }

    public rif(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
