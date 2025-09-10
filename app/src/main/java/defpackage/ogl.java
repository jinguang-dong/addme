package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogl {
    private final Object a;
    private final String b;

    public ogl(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return this.b + "@" + System.identityHashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogl)) {
            return false;
        }
        ogl oglVar = (ogl) obj;
        return this.a == oglVar.a && this.b.equals(oglVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
