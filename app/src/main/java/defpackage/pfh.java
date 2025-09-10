package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfh {
    public final Set a;
    public final Set b;
    public final Set c;
    public final rwc d;
    private final int e;

    public pfh(Set set, Set set2, Set set3, rwc rwcVar) {
        int i;
        this.a = set;
        this.b = set2;
        this.c = set3;
        synchronized (phh.class) {
            i = phh.d;
            phh.d = i + 1;
        }
        this.e = i;
        this.d = rwcVar;
    }

    public final Set a() {
        return scn.F(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pfh)) {
            return false;
        }
        pfh pfhVar = (pfh) obj;
        return a.K(this.a, pfhVar.a) && a.K(this.c, pfhVar.c) && a.K(this.b, pfhVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "FrameRequest-" + this.e;
    }
}
