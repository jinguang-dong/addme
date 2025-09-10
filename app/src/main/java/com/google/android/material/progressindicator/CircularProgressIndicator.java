package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.dhx;
import defpackage.rlw;
import defpackage.rlx;
import defpackage.rly;
import defpackage.rmd;
import defpackage.rmi;
import defpackage.rmj;
import defpackage.rml;
import defpackage.rmt;
import defpackage.rmu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CircularProgressIndicator extends rlw {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.rlw
    public final /* synthetic */ rlx a(Context context, AttributeSet attributeSet) {
        return new rmj(context, attributeSet);
    }

    public final void h(int i) {
        rlx rlxVar = this.a;
        if (rlxVar.a != i) {
            rlxVar.a = i;
            requestLayout();
        }
        ((rmj) this.a).b();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        rmt rmdVar;
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        rly rlyVar = new rly((rmj) this.a);
        Context context2 = getContext();
        rmj rmjVar = (rmj) this.a;
        if (rmjVar.o == 1) {
            rmdVar = new rmi(context2, rmjVar);
        } else {
            rmdVar = new rmd(rmjVar);
        }
        rmu rmuVar = new rmu(context2, rmjVar, rlyVar, rmdVar);
        rmuVar.c = dhx.b(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(rmuVar);
        setProgressDrawable(new rml(getContext(), (rmj) this.a, rlyVar));
    }
}
