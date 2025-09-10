package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjc implements png {
    public View a;
    public View b;
    public PopupWindow c;
    public FrameLayout d;
    public final ktx e;
    public final ocq f;
    private final out g;

    public fjc(ocq ocqVar, ktx ktxVar, out outVar) {
        this.e = ktxVar;
        this.g = outVar;
        this.f = ocqVar;
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        c(paoVar, true);
    }

    public final void b() {
        View view = this.a;
        if (view == null || this.c == null) {
            return;
        }
        view.setVisibility(8);
        this.c.dismiss();
        this.e.h(this);
    }

    public final void c(pao paoVar, boolean z) {
        if (this.b == null) {
            return;
        }
        this.g.execute(new fie(this, paoVar, z, 2));
    }
}
