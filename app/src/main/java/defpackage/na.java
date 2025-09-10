package defpackage;

import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class na {
    public final float a;
    private final float b;
    private final float c;
    private final int d;
    private final long e;

    public na(BackEvent backEvent) {
        backEvent.getClass();
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        int swipeEdge = backEvent.getSwipeEdge();
        long frameTimeMillis = backEvent.getFrameTimeMillis();
        this.b = touchX;
        this.c = touchY;
        this.a = progress;
        this.d = swipeEdge;
        this.e = frameTimeMillis;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.b + ", touchY=" + this.c + ", progress=" + this.a + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + '}';
    }
}
