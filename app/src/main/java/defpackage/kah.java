package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kah {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;

    public final String toString() {
        return String.format(Locale.US, "Counts: has %d ready, %d in-flight, %d failed. In the frame buffer: %d not connected, %d main shots (ignored), %d not qualified, %d already started and %d waiting to launch", Integer.valueOf(this.f), Integer.valueOf(this.a), Integer.valueOf(this.h), Integer.valueOf(this.d), Integer.valueOf(this.g), Integer.valueOf(this.c), Integer.valueOf(this.e), Integer.valueOf(this.b));
    }
}
