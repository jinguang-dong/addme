package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsj {
    public final int a;
    public final int b;

    public nsj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsj)) {
            return false;
        }
        nsj nsjVar = (nsj) obj;
        return this.a == nsjVar.a && this.b == nsjVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SettingItemDisplayInfo(stringId=" + this.a + ", iconId=" + this.b + ")";
    }
}
