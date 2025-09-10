package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ard {
    public String a;
    public boolean b = false;
    public aqu c = null;
    private final String d;

    public ard(String str, String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ard)) {
            return false;
        }
        ard ardVar = (ard) obj;
        return a.ao(this.d, ardVar.d) && a.ao(this.a, ardVar.a) && this.b == ardVar.b && a.ao(this.c, ardVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        int iO = a.o(this.b);
        aqu aquVar = this.c;
        return (((iHashCode * 31) + iO) * 31) + (aquVar == null ? 0 : aquVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ')';
    }
}
