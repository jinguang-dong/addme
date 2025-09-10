package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efy {
    public final Object a;
    public final Throwable b;

    public efy(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efy)) {
            return false;
        }
        efy efyVar = (efy) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(efyVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || efyVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public efy(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
