package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cs extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public cs(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
