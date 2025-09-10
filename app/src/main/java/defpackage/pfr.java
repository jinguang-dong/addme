package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfr {
    private final long a;

    public pfr() {
        int i;
        synchronized (phh.class) {
            i = phh.c;
            phh.c = i + 1;
        }
        this.a = i;
    }

    public final String toString() {
        return "FrameServer-" + this.a;
    }
}
