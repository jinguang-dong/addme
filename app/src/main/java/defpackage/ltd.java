package defpackage;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ltd implements Comparable, Parcelable {
    private static final AtomicInteger b = new AtomicInteger(0);
    public final int a;

    public ltd() {
        throw null;
    }

    public static ltd a() {
        return new ltc(b.getAndIncrement());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((ltd) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ltd) && this.a == ((ltd) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "ShotId-" + this.a;
    }

    public ltd(int i) {
        this.a = i;
    }
}
