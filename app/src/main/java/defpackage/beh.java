package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beh extends bea implements List, bdu {
    public static final beh a = new beh(new Object[0]);
    private final Object[] b;

    public beh(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.bdw
    public final bdw b(Object obj) {
        if (a() >= 32) {
            return new bec(this.b, bdq.e(obj), a() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + 1);
        objArrCopyOf.getClass();
        objArrCopyOf[a()] = obj;
        return new beh(objArrCopyOf);
    }

    @Override // defpackage.bdw
    public final bdw c(int i, Object obj) {
        a.aj(i, a());
        if (i == a()) {
            return b(obj);
        }
        int i2 = i + 1;
        if (a() >= 32) {
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            rnt.ay(objArr, objArrCopyOf, i2, i, a() - 1);
            objArrCopyOf[i] = obj;
            return new bec(objArrCopyOf, bdq.e(objArr[31]), a() + 1, 0);
        }
        int iA = a() + 1;
        Object[] objArr2 = this.b;
        Object[] objArr3 = new Object[iA];
        rnt.aJ(objArr2, objArr3, 0, i, 6);
        rnt.ay(objArr2, objArr3, i2, i, a());
        objArr3[i] = obj;
        return new beh(objArr3);
    }

    @Override // defpackage.bea, defpackage.bdw
    public final bdw d(Collection collection) {
        if (a() + collection.size() > 32) {
            bed bedVarJ = j();
            bedVarJ.addAll(collection);
            return bedVarJ.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + collection.size());
        objArrCopyOf.getClass();
        int iA = a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[iA] = it.next();
            iA++;
        }
        return new beh(objArrCopyOf);
    }

    @Override // defpackage.bdw
    public final bdw g(uiq uiqVar) {
        Object[] objArr = this.b;
        int iA = a();
        int iA2 = a();
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < iA2; i++) {
            Object obj = objArr[i];
            if (((Boolean) uiqVar.a(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    objArrCopyOf.getClass();
                    z = true;
                    iA = i;
                }
            } else if (z) {
                objArrCopyOf[iA] = obj;
                iA++;
            }
        }
        return iA == a() ? this : iA == 0 ? a : new beh(rnt.ah(objArrCopyOf, 0, iA));
    }

    @Override // defpackage.ufm, java.util.List
    public final Object get(int i) {
        a.ai(i, a());
        return this.b[i];
    }

    @Override // defpackage.bdw
    public final bdw h(int i) {
        a.ai(i, a());
        if (a() == 1) {
            return a;
        }
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, a() - 1);
        objArrCopyOf.getClass();
        rnt.ay(objArr, objArrCopyOf, i, i + 1, a());
        return new beh(objArrCopyOf);
    }

    @Override // defpackage.bdw
    public final bdw i(int i, Object obj) {
        a.ai(i, a());
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = obj;
        return new beh(objArrCopyOf);
    }

    @Override // defpackage.ufm, java.util.List
    public final int indexOf(Object obj) {
        return rnt.ak(this.b, obj);
    }

    @Override // defpackage.bdw
    public final bed j() {
        return new bed(this, null, this.b, 0);
    }

    @Override // defpackage.ufm, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (a.ao(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.ufm, java.util.List
    public final ListIterator listIterator(int i) {
        a.aj(i, a());
        return new beb(this.b, i, a());
    }
}
