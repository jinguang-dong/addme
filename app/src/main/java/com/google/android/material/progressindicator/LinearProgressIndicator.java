package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.rlw;
import defpackage.rlx;
import defpackage.rml;
import defpackage.rmt;
import defpackage.rmu;
import defpackage.rmv;
import defpackage.rmy;
import defpackage.rnc;
import defpackage.rnd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LinearProgressIndicator extends rlw {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.rlw
    public final /* synthetic */ rlx a(Context context, AttributeSet attributeSet) {
        return new rnd(context, attributeSet);
    }

    @Override // defpackage.rlw
    public final void g(int i) {
        rlx rlxVar = this.a;
        if (rlxVar != null && ((rnd) rlxVar).o == 0 && isIndeterminate()) {
            return;
        }
        super.g(i);
    }

    @Override // defpackage.rlw, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        rnd rndVar = (rnd) this.a;
        int i5 = rndVar.p;
        boolean z2 = true;
        if (i5 != 1 && ((getLayoutDirection() != 1 || i5 != 2) && (getLayoutDirection() != 0 || i5 != 3))) {
            z2 = false;
        }
        rndVar.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        rmu indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        rml progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        rmt rncVar;
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        rmv rmvVar = new rmv((rnd) this.a);
        Context context2 = getContext();
        rnd rndVar = (rnd) this.a;
        if (rndVar.o == 0) {
            rncVar = new rmy(rndVar);
        } else {
            rncVar = new rnc(context2, rndVar);
        }
        setIndeterminateDrawable(new rmu(context2, rndVar, rmvVar, rncVar));
        setProgressDrawable(new rml(getContext(), (rnd) this.a, rmvVar));
    }
}
