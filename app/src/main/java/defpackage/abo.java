package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abo {
    public final abb a;
    public final aao b;
    public final boolean c;
    public final Map d;
    private final abm e;
    private final abg f;

    public abo() {
        this(null, false, 0 == true ? 1 : 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abo)) {
            return false;
        }
        abo aboVar = (abo) obj;
        if (!a.ao(this.a, aboVar.a)) {
            return false;
        }
        abm abmVar = aboVar.e;
        if (!a.ao(null, null)) {
            return false;
        }
        aao aaoVar = aboVar.b;
        if (!a.ao(null, null)) {
            return false;
        }
        abg abgVar = aboVar.f;
        return a.ao(null, null) && this.c == aboVar.c && a.ao(this.d, aboVar.d);
    }

    public final int hashCode() {
        abb abbVar = this.a;
        return ((((abbVar == null ? 0 : abbVar.hashCode()) * 923521) + a.o(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=null, scale=null, hold=" + this.c + ", effectsMap=" + this.d + ')';
    }

    public abo(abb abbVar, boolean z, Map map) {
        this.a = abbVar;
        this.e = null;
        this.b = null;
        this.f = null;
        this.c = z;
        this.d = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ abo(abb abbVar, boolean z, Map map, int i) {
        map = (i & 32) != 0 ? ufx.a : map;
        this(1 == (i & 1) ? null : abbVar, z & ((i & 16) == 0), map);
    }
}
