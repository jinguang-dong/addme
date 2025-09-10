package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzu {
    public static final bzu a = new bzu();

    private bzu() {
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
