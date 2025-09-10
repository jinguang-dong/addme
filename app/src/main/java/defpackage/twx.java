package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twx {
    public final String a;
    private final String b;

    public twx(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof twx) {
            twx twxVar = (twx) obj;
            if (Objects.equals(this.a, twxVar.a) && Objects.equals(this.b, twxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 37) + Objects.hashCode(this.b);
    }

    public final String toString() {
        return "[packageName=" + this.a + ",libraryName=" + this.b + "]";
    }
}
