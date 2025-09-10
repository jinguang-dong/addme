package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nac implements nlb {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public nac(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // defpackage.nlb
    public final void a(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            nae naeVar = (nae) this.a;
            Animator animator = naeVar.o;
            if (animator != null) {
                animator.end();
            }
            naeVar.h = i;
            if (naeVar.k) {
                nai naiVar = naeVar.p;
                naiVar.getClass();
                naiVar.b = i;
                return;
            } else {
                View view = naeVar.g;
                if (view != null) {
                    nae.b(view).setTextColor(naeVar.h);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw null;
            }
            nae naeVar2 = (nae) this.a;
            Animator animator2 = naeVar2.o;
            if (animator2 != null) {
                animator2.end();
            }
            naeVar2.i = i;
            naeVar2.h();
            return;
        }
        nae naeVar3 = (nae) this.a;
        naeVar3.j = i;
        if (!naeVar3.k) {
            naeVar3.n.setTint(i);
        }
        nai naiVar2 = naeVar3.p;
        if (naiVar2 != null) {
            naiVar2.a = naeVar3.j;
        }
        naeVar3.invalidate();
    }
}
