package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ck extends cxm {
    public static final cxp a = new cj();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public ck(boolean z) {
        this.e = z;
    }

    final void a(bm bmVar) {
        if (this.g) {
            return;
        }
        HashMap map = this.b;
        if (map.containsKey(bmVar.k)) {
            return;
        }
        map.put(bmVar.k, bmVar);
        if (ch.X(2)) {
            Objects.toString(bmVar);
        }
    }

    final void b(bm bmVar, boolean z) {
        if (ch.X(3)) {
            Objects.toString(bmVar);
        }
        c(bmVar.k, z);
    }

    public final void c(String str, boolean z) {
        HashMap map = this.c;
        ck ckVar = (ck) map.get(str);
        if (ckVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ckVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ckVar.c((String) arrayList.get(i), true);
                }
            }
            ckVar.ff();
            map.remove(str);
        }
        HashMap map2 = this.d;
        cxb cxbVar = (cxb) map2.get(str);
        if (cxbVar != null) {
            cxbVar.d();
            map2.remove(str);
        }
    }

    final void e(bm bmVar) {
        if (this.g || this.b.remove(bmVar.k) == null || !ch.X(2)) {
            return;
        }
        Objects.toString(bmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ck ckVar = (ck) obj;
            if (this.b.equals(ckVar.b) && this.c.equals(ckVar.c) && this.d.equals(ckVar.d)) {
                return true;
            }
        }
        return false;
    }

    final boolean f(bm bmVar) {
        if (this.b.containsKey(bmVar.k) && this.e) {
            return this.f;
        }
        return true;
    }

    @Override // defpackage.cxm
    protected final void ff() {
        if (ch.X(3)) {
            toString();
        }
        this.f = true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
