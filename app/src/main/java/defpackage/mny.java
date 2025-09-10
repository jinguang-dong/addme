package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mny {
    public ValueAnimator a;
    public moa b;
    public moa c;
    public final Object d;

    public mny() {
        moa moaVar = moa.HIDDEN;
        this.b = moaVar;
        this.c = moaVar;
        this.d = new Object();
    }

    public final void a(moa moaVar) {
        synchronized (this.d) {
            this.c = moaVar;
            if (this.b.equals(moaVar)) {
                return;
            }
            this.a.start();
        }
    }
}
