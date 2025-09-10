package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oco {
    public static final oco a;
    public static final oco b;
    public static final oco c;
    public final scn d;

    static {
        scn scnVarA;
        EnumSet enumSetAllOf = EnumSet.allOf(ocp.class);
        if (enumSetAllOf instanceof Collection) {
            scnVarA = enumSetAllOf.isEmpty() ? sfd.a : sbj.a(EnumSet.copyOf((Collection) enumSetAllOf));
        } else {
            Iterator it = enumSetAllOf.iterator();
            if (it.hasNext()) {
                EnumSet enumSetOf = EnumSet.of((Enum) it.next());
                ujp.aM(enumSetOf, it);
                scnVarA = sbj.a(enumSetOf);
            } else {
                scnVarA = sfd.a;
            }
        }
        a = new oco(scnVarA);
        b = new oco(sfd.a);
        c = new oco(sbj.a(EnumSet.of(ocp.ZWIEBACK, new ocp[0])));
    }

    public oco(scn scnVar) {
        this.d = scnVar;
    }

    public final boolean a(ocp ocpVar) {
        return this.d.contains(ocpVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oco) && this.d.equals(((oco) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
