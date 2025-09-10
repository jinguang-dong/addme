package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxs {
    public final Context a;
    public final rww b;

    public qxs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        rww rwwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qxs) {
            qxs qxsVar = (qxs) obj;
            if (this.a.equals(qxsVar.a) && ((rwwVar = this.b) != null ? rwwVar.equals(qxsVar.b) : qxsVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        rww rwwVar = this.b;
        return (rwwVar == null ? 0 : rwwVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        rww rwwVar = this.b;
        return "{" + this.a.toString() + ", " + String.valueOf(rwwVar) + "}";
    }

    public qxs(Context context, rww rwwVar) {
        this.a = context;
        this.b = rwwVar;
    }
}
