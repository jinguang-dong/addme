package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgy {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    @Deprecated
    public dgy() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dgy)) {
            return false;
        }
        dgy dgyVar = (dgy) obj;
        return this.b == dgyVar.b && this.a.equals(dgyVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        Map map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    public dgy(View view) {
        this.b = view;
    }
}
