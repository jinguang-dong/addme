package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onu implements oen {
    public static final onu b = new onu();
    private final boolean c = false;
    private final boolean d = false;
    private final String e = null;
    private final boolean f = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    private onu() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof onu)) {
            return false;
        }
        onu onuVar = (onu) obj;
        boolean z = onuVar.c;
        boolean z2 = onuVar.d;
        String str = onuVar.e;
        if (a.K(null, null)) {
            boolean z3 = onuVar.f;
            boolean z4 = onuVar.i;
            String str2 = onuVar.g;
            if (a.K(null, null)) {
                String str3 = onuVar.h;
                if (a.K(null, null)) {
                    Long l = onuVar.j;
                    if (a.K(null, null)) {
                        Long l2 = onuVar.k;
                        if (a.K(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
