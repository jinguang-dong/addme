package defpackage;

import android.view.View;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fvy implements ctg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ctg
    public final void a(boolean z, float f) {
        int i = this.b;
        if (i == 0) {
            ThumbnailView thumbnailView = (ThumbnailView) this.a;
            fwb fwbVar = thumbnailView.q;
            if (fwbVar != null) {
                fwbVar.b();
                thumbnailView.q.a();
                thumbnailView.a();
                return;
            }
            return;
        }
        if (i == 1) {
            if (z) {
                return;
            }
            Object obj = this.a;
            if (f >= 1.0f) {
                dgp dgpVar = ((dgl) obj).g;
                dgpVar.t(dgpVar, dgo.b, false);
                return;
            }
            dgl dglVar = (dgl) obj;
            long jH = dglVar.h();
            dgp dgpVar2 = dglVar.g;
            dgp dgpVarG = ((dgx) dgpVar2).g(0);
            dgp dgpVar3 = dgpVarG.n;
            dgpVarG.n = null;
            dgpVar2.y(-1L, dglVar.a);
            dgpVar2.y(jH, -1L);
            dglVar.a = jH;
            Runnable runnable = dglVar.f;
            if (runnable != null) {
                runnable.run();
            }
            dgpVar2.o.clear();
            if (dgpVar3 != null) {
                dgpVar3.t(dgpVar3, dgo.b, true);
                return;
            }
            return;
        }
        if (i == 2) {
            ((pez) this.a).g();
            return;
        }
        if (i == 3) {
            nag nagVar = (nag) this.a;
            ModeSwitcher modeSwitcher = nagVar.c;
            nkw nkwVarD = modeSwitcher.d();
            nkw nkwVar = nagVar.a;
            nagVar.a = nkw.UNINITIALIZED;
            nagVar.b = 0L;
            modeSwitcher.j(nagVar.d, nkwVar, nkwVarD);
            return;
        }
        if (i != 4) {
            if (z) {
                return;
            }
            ((nlp) this.a).a.b();
        } else {
            if (z) {
                return;
            }
            nlr nlrVar = (nlr) this.a;
            View view = nlrVar.b;
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            nlrVar.b();
        }
    }
}
