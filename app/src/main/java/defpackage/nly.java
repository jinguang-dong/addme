package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nly implements nlt {
    public final syu b;
    private final Animator c;

    public nly(Animator animator, syu syuVar) {
        this.c = animator;
        this.b = syuVar;
    }

    @Override // defpackage.nlt
    public final syu a() {
        return this.b;
    }

    @Override // defpackage.nlt
    public final void b(nls nlsVar) {
        ske.W(this.b, new fxw(nlsVar, 12), sxo.a);
    }

    @Override // defpackage.nlt
    public final void c() {
        this.c.cancel();
    }
}
