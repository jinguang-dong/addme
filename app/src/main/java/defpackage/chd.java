package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chd {
    public static final chd a = new chd(0);
    public static final chd b = new chd(1);
    public static final chd c = new chd(2);
    public final int d;

    public chd(int i) {
        this.d = i;
    }

    public final boolean a(chd chdVar) {
        int i = this.d;
        return (chdVar.d | i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chd) && this.d == ((chd) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        int i = this.d;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((b.d & i) != 0) {
            arrayList.add("Underline");
        }
        if ((i & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String) arrayList.get(0)));
        }
        return "TextDecoration[" + cij.c(arrayList, ", ", null, 62) + ']';
    }
}
