package defpackage;

import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naf implements nlb {
    final /* synthetic */ nlb a;
    final /* synthetic */ ModeSwitcher b;

    public naf(ModeSwitcher modeSwitcher, nlb nlbVar) {
        this.a = nlbVar;
        this.b = modeSwitcher;
    }

    @Override // defpackage.nlb
    public final void a(int i) {
        this.a.a(i);
        this.b.invalidate();
    }
}
