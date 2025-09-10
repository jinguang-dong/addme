package defpackage;

import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hnu implements nls {
    public final /* synthetic */ FocusIndicatorView a;
    public final /* synthetic */ scn b;
    private final /* synthetic */ int c;

    public /* synthetic */ hnu(FocusIndicatorView focusIndicatorView, scn scnVar, int i) {
        this.c = i;
        this.a = focusIndicatorView;
        this.b = scnVar;
    }

    @Override // defpackage.nls
    public final void a(rwc rwcVar) {
        int i = this.c;
        if (i == 0) {
            FocusIndicatorView focusIndicatorView = this.a;
            focusIndicatorView.m.d();
            focusIndicatorView.q.d(this.b);
            return;
        }
        int i2 = 0;
        if (i == 1) {
            FocusIndicatorView focusIndicatorView2 = this.a;
            focusIndicatorView2.q.d(this.b);
            focusIndicatorView2.k.a(false);
            focusIndicatorView2.l.set(false);
            return;
        }
        if (i != 2) {
            FocusIndicatorView focusIndicatorView3 = this.a;
            if (rwcVar.h() && ((Boolean) rwcVar.c()).booleanValue()) {
                FocusIndicatorAccessoryView focusIndicatorAccessoryView = focusIndicatorView3.o;
                focusIndicatorAccessoryView.e();
                focusIndicatorAccessoryView.b();
            }
            scn scnVar = this.b;
            focusIndicatorView3.m.d();
            focusIndicatorView3.q.d(scnVar);
            return;
        }
        if (rwcVar.h() && ((Boolean) rwcVar.c()).booleanValue()) {
            scn scnVar2 = this.b;
            FocusIndicatorView focusIndicatorView4 = this.a;
            FocusIndicatorRingView focusIndicatorRingView = focusIndicatorView4.m;
            nlt nltVarA = focusIndicatorView4.K.a();
            focusIndicatorRingView.c();
            focusIndicatorView4.q.c(scnVar2);
            FocusIndicatorAccessoryView focusIndicatorAccessoryView2 = focusIndicatorView4.o;
            focusIndicatorAccessoryView2.e();
            focusIndicatorAccessoryView2.b();
            nltVarA.b(new hnu(focusIndicatorView4, scnVar2, i2));
        }
    }
}
