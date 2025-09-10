package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class biq {
    public final int a = 1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof biq)) {
            return false;
        }
        int i = ((biq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=1)";
    }
}
