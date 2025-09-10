package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkx extends cnn {
    final /* synthetic */ CheckableImageButton a;

    public rkx(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.cnn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        CheckableImageButton checkableImageButton = this.a;
        cptVar.k(checkableImageButton.b);
        cptVar.l(checkableImageButton.a);
    }
}
