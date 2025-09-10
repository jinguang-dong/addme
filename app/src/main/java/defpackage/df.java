package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class df extends dg {
    private final cn j;

    /* JADX WARN: Illegal instructions before constructor call */
    public df(int i, int i2, cn cnVar) {
        bm bmVar = cnVar.a;
        bmVar.getClass();
        super(i, i2, bmVar);
        this.j = cnVar;
    }

    @Override // defpackage.dg
    public final void a() {
        super.a();
        this.a.s = false;
        this.j.d();
    }

    @Override // defpackage.dg
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                bm bmVar = this.j.a;
                bmVar.getClass();
                View viewRequireView = bmVar.requireView();
                if (ch.X(2)) {
                    Objects.toString(viewRequireView.findFocus());
                    Objects.toString(viewRequireView);
                    Objects.toString(bmVar);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        cn cnVar = this.j;
        bm bmVar2 = cnVar.a;
        bmVar2.getClass();
        View viewFindFocus = bmVar2.P.findFocus();
        if (viewFindFocus != null) {
            bmVar2.t(viewFindFocus);
            if (ch.X(2)) {
                Objects.toString(viewFindFocus);
                Objects.toString(bmVar2);
            }
        }
        View viewRequireView2 = this.a.requireView();
        if (viewRequireView2.getParent() == null) {
            cnVar.a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        bi biVar = bmVar2.S;
        viewRequireView2.setAlpha(biVar == null ? 1.0f : biVar.q);
    }
}
