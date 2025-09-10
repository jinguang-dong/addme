package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzf extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public rzf() {
        l(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bv(i, "Invalid size: "));
        }
        l(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int s(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objBj = ujp.bj(i2);
        if (i4 != 0) {
            ujp.bl(objBj, i3 & i5, i4 + 1);
        }
        Object objG = g();
        int[] iArrP = p();
        for (int i6 = 0; i6 <= i; i6++) {
            int iBh = ujp.bh(objG, i6);
            while (iBh != 0) {
                int i7 = iBh - 1;
                int i8 = iArrP[i7];
                int iBd = ujp.bd(i8, i) | i6;
                int i9 = iBd & i5;
                int iBh2 = ujp.bh(objBj, i9);
                ujp.bl(objBj, i9, iBh);
                iArrP[i7] = ujp.be(iBd, iBh2, i5);
                iBh = i8 & i;
            }
        }
        this.g = objBj;
        t(i5);
        return i5;
    }

    private final void t(int i) {
        this.e = ujp.be(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itI = i();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (o()) {
            return;
        }
        k();
        Map mapJ = j();
        if (mapJ != null) {
            this.e = ske.Z(size(), 3, 1073741823);
            mapJ.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(q(), 0, this.f, (Object) null);
        Arrays.fill(r(), 0, this.f, (Object) null);
        ujp.bk(g());
        Arrays.fill(p(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapJ = j();
        return mapJ != null ? mapJ.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (a.K(obj, h(i))) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (o()) {
            return -1;
        }
        int iBb = ujp.bb(obj);
        int iC = c();
        int iBh = ujp.bh(g(), iBb & iC);
        if (iBh == 0) {
            return -1;
        }
        int iBd = ujp.bd(iBb, iC);
        do {
            int i = iBh - 1;
            int i2 = p()[i];
            if (ujp.bd(i2, iC) == iBd && a.K(obj, e(i))) {
                return i;
            }
            iBh = i2 & iC;
        } while (iBh != 0);
        return -1;
    }

    public final Object e(int i) {
        return q()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        rza rzaVar = new rza(this);
        this.i = rzaVar;
        return rzaVar;
    }

    public final Object f(Object obj) {
        int iC;
        int iBg;
        if (o() || (iBg = ujp.bg(obj, null, (iC = c()), g(), p(), q(), null)) == -1) {
            return a;
        }
        Object objH = h(iBg);
        m(iBg, iC);
        this.f--;
        k();
        return objH;
    }

    public final Object g() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return h(iD);
    }

    public final Object h(int i) {
        return r()[i];
    }

    final Iterator i() {
        Map mapJ = j();
        return mapJ != null ? mapJ.entrySet().iterator() : new ryy(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final Map j() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void k() {
        this.e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        rzc rzcVar = new rzc(this);
        this.h = rzcVar;
        return rzcVar;
    }

    final void l(int i) {
        rnt.B(i >= 0, "Expected size must be >= 0");
        this.e = ske.Z(i, 1, 1073741823);
    }

    final void m(int i, int i2) {
        Object objG = g();
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrQ[i] = null;
            objArrR[i] = null;
            iArrP[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj = objArrQ[i3];
        objArrQ[i] = obj;
        objArrR[i] = objArrR[i3];
        objArrQ[i3] = null;
        objArrR[i3] = null;
        iArrP[i] = iArrP[i3];
        iArrP[i3] = 0;
        int iBb = ujp.bb(obj) & i2;
        int iBh = ujp.bh(objG, iBb);
        if (iBh == size) {
            ujp.bl(objG, iBb, i4);
            return;
        }
        while (true) {
            int i5 = iBh - 1;
            int i6 = iArrP[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrP[i5] = ujp.be(i6, i4, i2);
                return;
            }
            iBh = i7;
        }
    }

    public final void n(int i, Object obj) {
        r()[i] = obj;
    }

    final boolean o() {
        return this.g == null;
    }

    public final int[] p() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (o()) {
            rnt.M(o(), "Arrays already allocated");
            int i2 = this.e;
            int iBi = ujp.bi(i2);
            this.g = ujp.bj(iBi);
            t(iBi - 1);
            this.b = new int[i2];
            this.c = new Object[i2];
            this.d = new Object[i2];
        }
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.put(obj, obj2);
        }
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int i3 = this.f;
        int i4 = i3 + 1;
        int iBb = ujp.bb(obj);
        int iC = c();
        int i5 = iBb & iC;
        int iBh = ujp.bh(g(), i5);
        if (iBh == 0) {
            if (i4 > iC) {
                iC = s(iC, ujp.bf(iC), iBb, i3);
            } else {
                ujp.bl(g(), i5, i4);
            }
            i = 1;
        } else {
            int iBd = ujp.bd(iBb, iC);
            int i6 = 0;
            while (true) {
                int i7 = iBh - 1;
                int i8 = iArrP[i7];
                i = 1;
                if (ujp.bd(i8, iC) == iBd && a.K(obj, objArrQ[i7])) {
                    Object obj3 = objArrR[i7];
                    objArrR[i7] = obj2;
                    return obj3;
                }
                int i9 = i8 & iC;
                i6++;
                if (i9 != 0) {
                    iBh = i9;
                } else {
                    if (i6 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        int iA = a();
                        while (iA >= 0) {
                            linkedHashMap.put(e(iA), h(iA));
                            iA = b(iA);
                        }
                        this.g = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        k();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > iC) {
                        iC = s(iC, ujp.bf(iC), iBb, i3);
                    } else {
                        iArrP[i7] = ujp.be(i8, i4, iC);
                    }
                }
            }
        }
        int length = p().length;
        if (i4 > length) {
            int i10 = i;
            int iMin = Math.min(1073741823, (Math.max(i10, length >>> 1) + length) | i10);
            if (iMin != length) {
                this.b = Arrays.copyOf(p(), iMin);
                this.c = Arrays.copyOf(q(), iMin);
                this.d = Arrays.copyOf(r(), iMin);
            }
        }
        p()[i3] = ujp.be(iBb, 0, iC);
        q()[i3] = obj;
        n(i3, obj2);
        this.f = i4;
        k();
        return null;
    }

    public final Object[] q() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] r() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.remove(obj);
        }
        Object objF = f(obj);
        if (objF == a) {
            return null;
        }
        return objF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapJ = j();
        return mapJ != null ? mapJ.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        rze rzeVar = new rze(this);
        this.j = rzeVar;
        return rzeVar;
    }

    public rzf(int i) {
        l(i);
    }
}
