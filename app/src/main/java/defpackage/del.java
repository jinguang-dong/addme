package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class del {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public del(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof del)) {
            return false;
        }
        del delVar = (del) obj;
        if (a.ao(this.a, delVar.a) && a.ao(this.b, delVar.b) && a.ao(this.c, delVar.c) && a.ao(this.d, delVar.d)) {
            return a.ao(this.e, delVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        cgh.q(ske.bL(this.d));
        ufg ufgVar = ufg.a;
        sb.append(ufgVar);
        sb.append("\n            |   referenceColumnNames = {");
        cgh.p(ske.bL(this.e));
        sb.append(ufgVar);
        sb.append("\n            |}\n        ");
        return ujp.y(ujp.E(sb.toString()));
    }
}
