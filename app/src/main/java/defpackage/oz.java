package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oz implements Iterable {
    public ov b;
    public ov c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected ov a(Object obj) {
        ov ovVar = this.b;
        while (ovVar != null && !ovVar.a.equals(obj)) {
            ovVar = ovVar.c;
        }
        return ovVar;
    }

    public Object b(Object obj) {
        ov ovVarA = a(obj);
        if (ovVarA == null) {
            return null;
        }
        this.e--;
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((oy) it.next()).cJ(ovVarA);
            }
        }
        ov ovVar = ovVarA.d;
        ov ovVar2 = ovVarA.c;
        if (ovVar != null) {
            ovVar.c = ovVar2;
        } else {
            this.b = ovVar2;
        }
        ov ovVar3 = ovVarA.c;
        if (ovVar3 != null) {
            ovVar3.d = ovVar;
        } else {
            this.c = ovVar;
        }
        ovVarA.c = null;
        ovVarA.d = null;
        return ovVarA.b;
    }

    public final ov d(Object obj, Object obj2) {
        ov ovVar = new ov(obj, obj2);
        this.e++;
        ov ovVar2 = this.c;
        if (ovVar2 == null) {
            this.b = ovVar;
        } else {
            ovVar2.c = ovVar;
            ovVar.d = ovVar2;
        }
        this.c = ovVar;
        return ovVar;
    }

    public final ow e() {
        ow owVar = new ow(this);
        this.d.put(owVar, false);
        return owVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oz)) {
            return false;
        }
        oz ozVar = (oz) obj;
        if (this.e != ozVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = ozVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((ox) it).next();
            Map.Entry next2 = ((ox) it2).next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final Object f(Object obj, Object obj2) {
        ov ovVarA = a(obj);
        if (ovVarA != null) {
            return ovVarA.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((ox) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ot otVar = new ot(this.b, this.c);
        this.d.put(otVar, false);
        return otVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((ox) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
