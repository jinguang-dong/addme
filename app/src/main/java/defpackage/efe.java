package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efe implements efu {
    final /* synthetic */ LottieAnimationView a;

    public efe(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    @Override // defpackage.efu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView = this.a;
        int i = lottieAnimationView.b;
        if (i != 0) {
            lottieAnimationView.setImageResource(i);
        }
        LottieAnimationView.a.a(th);
    }
}
