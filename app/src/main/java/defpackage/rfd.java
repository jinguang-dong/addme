package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfd {
    public final String a;
    public final String b;
    public final List c;
    private final boolean d;

    public /* synthetic */ rfd(String str, String str2) {
        ufw ufwVar = ufw.a;
        this.a = str;
        this.b = str2;
        this.c = ufwVar;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfd)) {
            return false;
        }
        rfd rfdVar = (rfd) obj;
        if (!a.ao(this.a, rfdVar.a) || !a.ao(this.b, rfdVar.b) || !a.ao(this.c, rfdVar.c)) {
            return false;
        }
        boolean z = rfdVar.d;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 1) * 31) + 1237;
    }

    public final String toString() {
        return "Attribute(name=" + this.a + ", value=" + this.b + ", attributes=" + this.c + ", initiallyCollapsed=false)";
    }
}
