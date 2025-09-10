package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgw extends pkb implements pjo {
    public kgw(pjo pjoVar) {
        super(pjoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a.K(j(), ((kgw) obj).j());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{j()});
    }
}
