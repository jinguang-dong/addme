package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cxy {
    public final Map b = new LinkedHashMap();

    public abstract Object a(cxx cxxVar);

    public final boolean equals(Object obj) {
        return (obj instanceof cxy) && a.ao(this.b, ((cxy) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
