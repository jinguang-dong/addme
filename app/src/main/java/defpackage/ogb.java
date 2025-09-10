package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ogb {
    public final ofl a;
    public final odl b;

    public ogb(ofl oflVar, odl odlVar) {
        this.a = oflVar;
        this.b = odlVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ogb)) {
            ogb ogbVar = (ogb) obj;
            if (a.K(this.a, ogbVar.a) && a.K(this.b, ogbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ojl.aC("key", this.a, arrayList);
        ojl.aC("feature", this.b, arrayList);
        return ojl.aB(arrayList, this);
    }
}
