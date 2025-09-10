package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pre {
    public final Context a;
    public final rwc b;
    private final rwc c;
    private final rwc d;

    public pre() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pre) {
            pre preVar = (pre) obj;
            if (this.a.equals(preVar.a) && this.c.equals(preVar.c) && this.d.equals(preVar.d) && this.b.equals(preVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        rwc rwcVar = this.b;
        rwc rwcVar2 = this.d;
        rwc rwcVar3 = this.c;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(rwcVar3) + ", " + String.valueOf(rwcVar2) + ", false, " + String.valueOf(rwcVar) + "}";
    }

    public pre(Context context, rwc rwcVar, rwc rwcVar2, rwc rwcVar3) {
        this.a = context;
        this.c = rwcVar;
        this.d = rwcVar2;
        this.b = rwcVar3;
    }
}
