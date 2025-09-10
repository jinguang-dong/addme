package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class am implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ dg a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ an d;

    public am(dg dgVar, ViewGroup viewGroup, View view, an anVar) {
        this.a = dgVar;
        this.b = viewGroup;
        this.c = view;
        this.d = anVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new as((Object) viewGroup, (Object) this.c, (Object) this.d, 1, (byte[]) null));
        if (ch.X(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (ch.X(2)) {
            Objects.toString(this.a);
        }
    }
}
