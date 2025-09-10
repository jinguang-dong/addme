package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iud {
    public final Map a;

    /* JADX WARN: Illegal instructions before constructor call */
    public iud() {
        byte[] bArr = null;
        this(ske.bc(new uev(iuh.a, new iuf(bArr)), new uev(iuh.b, new iuf(bArr)), new uev(iuh.c, new iuf(bArr)), new uev(iuh.d, new iuf(bArr))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iud) && a.ao(this.a, ((iud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LapReportConfig(scopeConfigs=" + this.a + ")";
    }

    public iud(Map map) {
        this.a = map;
        List list = iuh.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        ufj ufjVar = new ufj((ufm) list);
        while (ufjVar.hasNext()) {
            if (!this.a.containsKey((iuh) ufjVar.next())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }
}
