package defpackage;

import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dtg implements cth {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dtg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cth
    public final void l(float f) {
        cto ctoVar;
        cto ctoVar2;
        int i = this.b;
        if (i == 0) {
            dtj dtjVar = (dtj) this.a;
            if (Math.max(0.0f, dtjVar.b - f) <= 5.0f && (ctoVar = dtjVar.l) != null) {
                ctoVar.n();
            }
            dtjVar.c(f);
            return;
        }
        if (i == 1) {
            Object obj = this.a;
            if (Math.max(0.0f, f + 0.0f) <= 5.0f && (ctoVar2 = ((dtj) obj).m) != null) {
                ctoVar2.n();
            }
            ((dtj) obj).c(f);
            return;
        }
        if (i == 2) {
            ThumbnailView thumbnailView = (ThumbnailView) this.a;
            thumbnailView.e = thumbnailView.a.a;
            thumbnailView.invalidate();
            return;
        }
        nag nagVar = (nag) this.a;
        ModeSwitcher modeSwitcher = nagVar.c;
        modeSwitcher.setScrollX((int) f);
        nkw nkwVarD = modeSwitcher.d();
        if (modeSwitcher.g == nkwVarD) {
            return;
        }
        modeSwitcher.g = nkwVarD;
        syj.i(modeSwitcher);
        modeSwitcher.b.f(nkwVarD);
        nagVar.d = 4;
    }
}
