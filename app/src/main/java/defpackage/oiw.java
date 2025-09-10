package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oiw implements oen {
    public static final oiw b = new oiw(null);
    public final String c;

    public oiw(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oiw) {
            return a.K(this.c, ((oiw) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }
}
