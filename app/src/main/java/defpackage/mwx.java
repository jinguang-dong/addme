package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwx {
    public final int a;
    private final int b;
    private final String c;
    private final mwv d;

    public mwx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mwx)) {
            return false;
        }
        mwx mwxVar = (mwx) obj;
        int i = this.a;
        int i2 = mwxVar.a;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = mwxVar.b;
            if (this.c.equals(mwxVar.c) && this.d.equals(mwxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iAH = ((a.aH(this.a) ^ 1000003) * (-721379959)) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iAH * 1000003);
    }

    public final String toString() {
        String str;
        switch (this.a) {
            case 1:
                str = "STATE_STARTING";
                break;
            case 2:
                str = "STATE_STARTED";
                break;
            case 3:
                str = "STATE_PROCESSING";
                break;
            case 4:
                str = "STATE_PROCESSED";
                break;
            case 5:
                str = "STATE_ABORTING";
                break;
            case 6:
                str = "STATE_ABORTED";
                break;
            case 7:
                str = "STATE_STOPPING";
                break;
            case 8:
                str = "STATE_STOPPED";
                break;
            default:
                str = "null";
                break;
        }
        return "{" + str + ", 0, " + this.c + ", " + String.valueOf(this.d) + "}";
    }

    public mwx(int i, int i2, String str, mwv mwvVar) {
        this.a = i;
        this.b = 0;
        this.c = str;
        this.d = mwvVar;
    }
}
