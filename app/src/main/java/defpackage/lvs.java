package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvs extends lvu {
    private final int a;
    private final long b;
    private final String c;
    private final int d;

    public lvs(int i, long j, String str, int i2) {
        this.a = i;
        this.b = j;
        str.getClass();
        this.c = str;
        this.d = i2;
    }

    @Override // defpackage.lvu
    @tiy(a = "hal_version")
    public int a() {
        return this.a;
    }

    @Override // defpackage.lvu
    @tiy(a = "min_os_version")
    public int b() {
        return this.d;
    }

    @Override // defpackage.lvu
    @tiy(a = "apex_size")
    public long c() {
        return this.b;
    }

    @Override // defpackage.lvu
    @tiy(a = "target_os_prefix")
    public String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lvu) {
            lvu lvuVar = (lvu) obj;
            if (this.a == lvuVar.a() && this.b == lvuVar.c() && this.c.equals(lvuVar.d()) && this.d == lvuVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        return this.d ^ ((((i ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "}";
    }
}
