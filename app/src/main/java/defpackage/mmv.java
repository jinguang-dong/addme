package defpackage;

import android.graphics.drawable.Animatable2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmv implements Animatable2 {
    public final Animatable2 a;
    public final Animatable2 b;
    public boolean c;
    public final List d = new ArrayList();

    public mmv(Animatable2 animatable2, Animatable2 animatable22) {
        this.a = animatable2;
        this.b = animatable22;
        animatable2.registerAnimationCallback(new mmt(this));
        animatable22.registerAnimationCallback(new mmu(this));
    }

    @Override // android.graphics.drawable.Animatable2
    public final void clearAnimationCallbacks() {
        this.d.clear();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Animatable2
    public final void registerAnimationCallback(Animatable2.AnimationCallback animationCallback) {
        animationCallback.getClass();
        this.d.add(animationCallback);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.a.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable2 animatable2 = this.a;
        if (animatable2.isRunning()) {
            this.c = false;
            animatable2.stop();
        } else {
            Animatable2 animatable22 = this.b;
            if (animatable22.isRunning()) {
                animatable22.stop();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable2
    public final boolean unregisterAnimationCallback(Animatable2.AnimationCallback animationCallback) {
        animationCallback.getClass();
        return this.d.remove(animationCallback);
    }
}
