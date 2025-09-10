package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muj {
    public final rwc a;
    public final int b;

    public muj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muj) {
            muj mujVar = (muj) obj;
            if (this.b == mujVar.b && this.a.equals(mujVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aQ(i);
        return this.a.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public muj(int i, rwc rwcVar) {
        this.b = i;
        this.a = rwcVar;
    }

    public final String toString() {
        int i = this.b;
        return ibINv.REkvVXm + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "JARVIS" : "FLAT" : "BOOK" : "CLOSED" : "UNKNOWN") + ", " + this.a.toString() + "}";
    }
}
