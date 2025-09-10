package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nwa extends cnn {
    final /* synthetic */ nwb a;

    public nwa(nwb nwbVar) {
        this.a = nwbVar;
    }

    @Override // defpackage.cnn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        nwb nwbVar = this.a;
        accessibilityEvent.setClassName(nwbVar.h());
        accessibilityEvent.setChecked(nwbVar.p);
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        nwb nwbVar = this.a;
        cptVar.m(nwbVar.h());
        cptVar.k(nwbVar.q);
        cptVar.l(nwbVar.p);
    }
}
