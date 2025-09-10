package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcs {
    public final boolean a;
    private final Object b;
    private final Object c;

    public qcs(boolean z, Object obj, Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static boolean d(qcs qcsVar, qcs qcsVar2, Comparator comparator) {
        Object obj;
        Object obj2;
        if (qcsVar == null || !qcsVar.a || (obj = qcsVar.b) == null || qcsVar2 == null || !qcsVar2.a || (obj2 = qcsVar2.b) == null) {
            return a.K(qcsVar, qcsVar2);
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) obj2);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }

    public final Object a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object b() {
        if (c()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean c() {
        return !this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qcs)) {
            return false;
        }
        qcs qcsVar = (qcs) obj;
        return this.a ? qcsVar.a && a.K(a(), qcsVar.a()) : qcsVar.c() && a.K(b(), qcsVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }
}
