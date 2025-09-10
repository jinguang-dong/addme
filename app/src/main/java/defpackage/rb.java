package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rb {
    public final List a;
    public final Map b;
    public final List c;
    public final rd d;
    public final qk e;

    public /* synthetic */ rb(List list, Map map, List list2, rd rdVar, qk qkVar, int i) {
        map = (i & 2) != 0 ? ufx.a : map;
        ufx ufxVar = (i & 4) != 0 ? ufx.a : null;
        list2 = (i & 8) != 0 ? ufw.a : list2;
        rdVar = (i & 16) != 0 ? null : rdVar;
        qkVar = (i & 32) != 0 ? null : qkVar;
        map.getClass();
        ufxVar.getClass();
        list2.getClass();
        this.a = list;
        this.b = map;
        this.c = list2;
        this.d = rdVar;
        this.e = qkVar;
    }

    public final String toString() {
        String strConcat;
        rd rdVar = this.d;
        if (rdVar == null) {
            strConcat = "";
        } else {
            Objects.toString(rdVar);
            strConcat = ", template=".concat(rdVar.toString());
        }
        return "Request(streams=" + this.a + strConcat + ")@" + Integer.toHexString(hashCode());
    }
}
