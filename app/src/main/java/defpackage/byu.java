package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byu implements caa {
    private final ViewConfiguration a;

    public byu(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.caa
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.caa
    public final float b() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.caa
    public final long c() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.caa
    public final long d() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.caa
    public final /* synthetic */ long e() {
        return a.t(48.0f, 48.0f);
    }
}
