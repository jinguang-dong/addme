package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class skl {
    public static final Comparator a = new wp(12);
    public static final skl b = new skl(new skj(Collections.EMPTY_LIST));
    public final skj c;

    public skl(skj skjVar) {
        this.c = skjVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof skl) && ((skl) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
