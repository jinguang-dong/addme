package defpackage;

import android.graphics.PointF;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgf implements Iterable {
    public final List a;
    private final List b;

    public rgf() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final int a() {
        return this.a.size();
    }

    public final PointF b(int i) {
        return (PointF) this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rgf)) {
            return false;
        }
        rgf rgfVar = (rgf) obj;
        int iA = a();
        if (rgfVar.a() != iA) {
            return false;
        }
        if (rgfVar.a() == 0 && iA == 0) {
            return true;
        }
        PointF pointF = (PointF) this.a.get(0);
        int i = 0;
        while (true) {
            if (i >= rgfVar.a()) {
                i = -1;
                break;
            }
            if (rkf.d(pointF, rgfVar.b(i))) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        for (int i2 = 0; i2 < iA; i2++) {
            if (!rkf.d(b(i2), rgfVar.b((i + i2) % iA))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a.toArray());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Polygon(");
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                sb.append(")");
                return sb.toString();
            }
            PointF pointF = (PointF) list.get(i);
            sb.append("[");
            sb.append(pointF.x);
            sb.append(",");
            sb.append(pointF.y);
            sb.append("]");
            if (i < list.size() - 1) {
                sb.append(" ");
            }
            i++;
        }
    }

    public rgf(float... fArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = DesugarCollections.unmodifiableList(arrayList);
        rnt.B(true, "must be even number of coordinates");
        while (this.a.size() < 4) {
            this.a.add(new PointF());
        }
        if (this.a.size() > 4) {
            this.a.subList(0, r0.size() - 4).clear();
        }
        for (int i = 0; i < 8; i += 2) {
            ((PointF) this.a.get(i >> 1)).set(fArr[i], fArr[i + 1]);
        }
    }
}
