package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmk {
    public final UUID a;
    public final String b;

    public fmk() {
        throw null;
    }

    static fmk a(String str, String str2) {
        return new fmk(UUID.fromString(str), str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fmk) {
            fmk fmkVar = (fmk) obj;
            if (this.a.equals(fmkVar.a) && this.b.equals(fmkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a.toString() + ", " + this.b + "}";
    }

    public fmk(UUID uuid, String str) {
        uuid.getClass();
        this.a = uuid;
        this.b = str;
    }
}
