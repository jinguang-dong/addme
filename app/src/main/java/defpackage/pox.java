package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pox implements Comparable {
    public static final AtomicInteger a = new AtomicInteger(0);
    private final int b;

    public pox() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.b, ((pox) obj).b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pox) && this.b == ((pox) obj).b;
    }

    public final int hashCode() {
        return this.b ^ 1000003;
    }

    public pox(int i) {
        this.b = i;
    }

    public final String toString() {
        return TOnSyMaYeslEl.Buq + this.b;
    }
}
