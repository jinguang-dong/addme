package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class pp {
    public final String a;

    public /* synthetic */ pp(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return "CameraId-".concat(String.valueOf(str));
    }

    public static void b(String str) {
        str.getClass();
        if (ujp.r(str)) {
            throw new IllegalArgumentException("CameraId cannot be null or blank!");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pp) && a.ao(this.a, ((pp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
