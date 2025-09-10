package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qna {
    public final String a;

    public qna(String str) {
        this.a = str;
    }

    public static qna a(Class cls) {
        return !rnt.V(null) ? new qna("null".concat(String.valueOf(cls.getSimpleName()))) : new qna(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qna) {
            return this.a.equals(((qna) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
