package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class scl extends sbd {
    Object[] d;
    private int e;

    public scl() {
        super(4);
    }

    public scn g() {
        scn scnVarE;
        int i = this.b;
        if (i == 0) {
            return sfd.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new sfm(obj);
        }
        if (this.d == null || scn.B(i) != this.d.length) {
            scnVarE = scn.E(this.b, this.a);
            this.b = scnVarE.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            if (scn.M(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            scnVarE = new sfd(objArrCopyOf, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return scnVarE;
    }

    @Override // defpackage.sbd
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iB = scn.B(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (iB <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iBa = ujp.ba(iHashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = iBa & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        super.c(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iBa = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.c(obj);
    }

    public final void i(Object... objArr) {
        if (this.d == null) {
            super.e(objArr);
            return;
        }
        for (Object obj : objArr) {
            d(obj);
        }
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.f(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public final void k(scl sclVar) {
        if (this.d == null) {
            b(sclVar.a, sclVar.b);
            return;
        }
        for (int i = 0; i < sclVar.b; i++) {
            Object obj = sclVar.a[i];
            obj.getClass();
            d(obj);
        }
    }

    public scl(int i) {
        super(i);
        this.d = new Object[scn.B(i)];
    }
}
