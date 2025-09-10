package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.azr;
import defpackage.azz;
import defpackage.bai;
import defpackage.bap;
import defpackage.bxg;
import defpackage.bzb;
import defpackage.uiu;
import defpackage.ujk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComposeView extends bxg {
    private final azr a;
    private boolean b;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(420213850);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (aycVarC.H((i2 & 3) != 2, i2 & 1)) {
            uiu uiuVar = (uiu) this.a.a();
            if (uiuVar == null) {
                aycVarC.u(-1238798753);
            } else {
                aycVarC.u(98586082);
                uiuVar.a(aycVarC, 0);
            }
            ((ayg) aycVarC).Y();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new bzb(this, i);
        }
    }

    @Override // defpackage.bxg
    protected final boolean d() {
        return this.b;
    }

    public final void e(uiu uiuVar) {
        this.b = true;
        this.a.b(uiuVar);
        if (isAttachedToWindow()) {
            if (!isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            super.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new azz(null, bap.c);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
