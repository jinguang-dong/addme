package j$.util;

import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class OptionalLong {
    public static final OptionalLong c = new OptionalLong();
    public final boolean a;
    public final long b;

    public OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalLong)) {
            return false;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        boolean z = this.a;
        return (z && optionalLong.a) ? this.b == optionalLong.b : z == optionalLong.a;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> long orElseThrow(Supplier<? extends X> supplier) throws X {
        if (this.a) {
            return this.b;
        }
        throw supplier.get();
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    public OptionalLong(long j) {
        this.a = true;
        this.b = j;
    }
}
