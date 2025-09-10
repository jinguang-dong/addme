package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbt {
    public static final Duration a = Duration.ofSeconds(5);
    private final Duration b;
    private final int c;

    public pbt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pbt) {
            pbt pbtVar = (pbt) obj;
            if (this.b.equals(pbtVar.b) && this.c == pbtVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((this.b.hashCode() ^ 385623362) * 1000003);
    }

    public final String toString() {
        return "{false, " + String.valueOf(this.b) + ", " + this.c + "}";
    }

    public pbt(Duration duration, int i) {
        this.b = duration;
        this.c = i;
    }
}
