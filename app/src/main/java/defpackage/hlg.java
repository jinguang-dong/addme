package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlg {
    private final String a;
    private final hlg[] b;

    public hlg(String str, hlg[] hlgVarArr) {
        this.a = str;
        this.b = hlgVarArr;
    }

    public static hlg b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", str)) {
            return hgc.f(str, arrayList, arrayList2);
        }
        throw new IllegalArgumentException(a.bw(str, "Feature with bad type name '", "'!"));
    }

    public final int a() {
        int iA = -1;
        for (hlg hlgVar : this.b) {
            if (hlgVar.a() > iA) {
                iA = hlgVar.a();
            }
        }
        return iA + 1;
    }

    public final Set c() {
        HashSet hashSet = new HashSet();
        for (hlg hlgVar : this.b) {
            hashSet.add(hlgVar);
            hashSet.addAll(hlgVar.c());
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hlg) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return this.a;
    }
}
