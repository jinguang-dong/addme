package defpackage;

import com.google.android.play.core.install.InstallState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rql extends InstallState {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    private final String e;

    public rql(int i, long j, long j2, int i2, String str) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        str.getClass();
        this.e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long c() {
        return this.b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long d() {
        return this.c;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.a == installState.b() && this.b == installState.c() && this.c == installState.d() && this.d == installState.a() && this.e.equals(installState.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        int i = this.a;
        String str = this.e;
        long j2 = this.b;
        int i2 = (int) (j ^ (j >>> 32));
        return ((this.d ^ ((i2 ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003)) * 1000003)) * 1000003) ^ str.hashCode();
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }
}
