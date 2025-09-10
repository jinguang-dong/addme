package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwc {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public muz e = muz.UNKNOWN;
    public int f = 0;

    public static final boolean b(boolean z, float f) {
        return f >= (true != z ? 25.0f : 22.5f);
    }

    public final void a() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "object angle: type:%s, objId:%d, tiltUp:%b, tiltDown:%b, panLeft:%b, panRight:%b", this.e, Integer.valueOf(this.f), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
