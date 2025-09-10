package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class usy {
    public static final uwc a = new uwc("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final urk c(usu usuVar, uhf uhfVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? usuVar : new uty(usuVar, uhfVar, i, i2);
    }

    public static final usr d(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.bv(i2, "extraBufferCapacity cannot be negative, but was "));
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            Objects.toString(ujp.N(i3));
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(ujp.N(i3)));
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new usx(i, i4, i3);
    }

    public static /* synthetic */ usr e(int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return d(i & ((i4 & 1) ^ 1), i2, i3);
    }
}
