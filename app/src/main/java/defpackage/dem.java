package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dem {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public dem(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dem)) {
            return false;
        }
        dem demVar = (dem) obj;
        if (this.b != demVar.b || !a.ao(this.c, demVar.c) || !a.ao(this.d, demVar.d)) {
            return false;
        }
        String str = this.a;
        return ujp.B(str, "index_") ? ujp.B(demVar.a, "index_") : a.ao(str, demVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((ujp.B(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        cgh.q(this.c);
        ufg ufgVar = ufg.a;
        sb.append(ufgVar);
        sb.append("\n            |   orders = {");
        cgh.p(this.d);
        sb.append(ufgVar);
        sb.append("\n            |}\n        ");
        return ujp.y(ujp.E(sb.toString()));
    }
}
