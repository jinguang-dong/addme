package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class den {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public den(String str, Map map, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    @ueo
    public static final den a(dfa dfaVar, String str) {
        return cgh.t(new ddo(dfaVar), str);
    }

    public final boolean equals(Object obj) {
        return cgh.s(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return cgh.o(this);
    }
}
