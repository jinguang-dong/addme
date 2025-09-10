package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pcr {
    public byte[] b;
    public final ByteOrder d;
    public final pdc[] a = new pdc[5];
    public final ArrayList c = new ArrayList();

    public pcr(ByteOrder byteOrder) {
        this.d = byteOrder;
    }

    protected final int a() {
        return this.c.size();
    }

    public final pdc b(int i) {
        if (pcz.f(i)) {
            return this.a[i];
        }
        return null;
    }

    protected final List c() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            pdc pdcVar = this.a[i];
            if (pdcVar != null) {
                for (pcz pczVar : pdcVar.d()) {
                    if (pczVar != null) {
                        arrayList.add(pczVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void d(pdc pdcVar) {
        this.a[pdcVar.b] = pdcVar;
    }

    public final void e() {
        this.b = null;
        this.c.clear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof pcr)) {
            pcr pcrVar = (pcr) obj;
            if (pcrVar.d == this.d) {
                ArrayList arrayList = pcrVar.c;
                ArrayList arrayList2 = this.c;
                if (arrayList.size() == arrayList2.size() && Arrays.equals(pcrVar.b, this.b)) {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i), (byte[]) arrayList2.get(i))) {
                            return false;
                        }
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        pdc pdcVarB = pcrVar.b(i2);
                        pdc pdcVarB2 = b(i2);
                        if (pdcVarB != null && !pdcVarB.equals(pdcVarB2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final boolean g() {
        return !this.c.isEmpty();
    }

    public final boolean h(short s, int i) {
        pdc pdcVar = this.a[i];
        if (pdcVar == null) {
            return false;
        }
        pdcVar.c(s);
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    protected final byte[] i(int i) {
        return (byte[]) this.c.get(i);
    }

    public final void j(pcz pczVar) {
        if (pczVar != null) {
            int i = pczVar.e;
            if (pcz.f(i)) {
                pdc[] pdcVarArr = this.a;
                pdc pdcVar = pdcVarArr[i];
                if (pdcVar == null) {
                    pdcVar = new pdc(i);
                    pdcVarArr[i] = pdcVar;
                }
                pdcVar.e(pczVar);
            }
        }
    }
}
