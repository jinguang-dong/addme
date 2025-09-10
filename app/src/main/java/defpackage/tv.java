package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tv {
    public final List a;
    public final Map b;
    public final sa c = null;

    public tv(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv)) {
            return false;
        }
        tv tvVar = (tv) obj;
        if (!a.ao(this.a, tvVar.a) || !a.ao(this.b, tvVar.b)) {
            return false;
        }
        sa saVar = tvVar.c;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.a + ", deferred=" + this.b + ", postviewOutput=null)";
    }
}
