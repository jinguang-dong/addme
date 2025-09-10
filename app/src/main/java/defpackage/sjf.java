package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sjf {
    public final skt a;
    public final String b;

    public sjf(skt sktVar, String str) {
        sktVar.getClass();
        this.a = sktVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sjf) {
            sjf sjfVar = (sjf) obj;
            if (this.a.equals(sjfVar.a) && this.b.equals(sjfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
