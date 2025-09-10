package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tph extends tnr {
    public static final Map aU = new ConcurrentHashMap();
    public int aV = -1;
    protected trq aW = trq.a;

    protected static void A(Class cls, tph tphVar) {
        tphVar.z();
        aU.put(cls, tphVar);
    }

    public static final boolean B(tph tphVar, boolean z) {
        byte bByteValue = ((Byte) tphVar.a(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zK = tra.a.b(tphVar).k(tphVar);
        if (z) {
            tphVar.a(2, true == zK ? tphVar : null);
        }
        return zK;
    }

    public static void D(tph tphVar) {
        if (tphVar != null && !tphVar.p()) {
            throw new tro().a();
        }
    }

    public static tql E(tqr tqrVar, Object obj, tqr tqrVar2, int i, Ctry ctry) {
        return new tql(tqrVar, obj, tqrVar2, new tpg(i, ctry));
    }

    public static tph q(tph tphVar, byte[] bArr, int i, int i2, tow towVar) {
        if (i2 == 0) {
            return tphVar;
        }
        tph tphVarO = tphVar.o();
        try {
            trg trgVarB = tra.a.b(tphVarO);
            trgVarB.i(tphVarO, bArr, i, i + i2, new tnx(towVar));
            trgVarB.g(tphVarO);
            return tphVarO;
        } catch (tpz e) {
            if (e.a) {
                throw new tpz(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof tpz) {
                throw ((tpz) e2.getCause());
            }
            throw new tpz(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (tro e3) {
            throw e3.a();
        }
    }

    public static tpj r(tpj tpjVar) {
        int size = tpjVar.size();
        return tpjVar.d(size + size);
    }

    public static tpm s(tpm tpmVar) {
        int size = tpmVar.size();
        return tpmVar.e(size + size);
    }

    public static tpn t(tpn tpnVar) {
        int size = tpnVar.size();
        return tpnVar.e(size + size);
    }

    public static tpq u(tpq tpqVar) {
        int size = tpqVar.size();
        return tpqVar.d(size + size);
    }

    public static tpw v(tpw tpwVar) {
        int size = tpwVar.size();
        return tpwVar.e(size + size);
    }

    static Object x(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean C() {
        return (this.aV & Integer.MIN_VALUE) != 0;
    }

    public abstract Object a(int i, Object obj);

    @Override // defpackage.tnr
    public final int e(trg trgVar) {
        if (C()) {
            int iK = k(trgVar);
            if (iK >= 0) {
                return iK;
            }
            throw new IllegalStateException(a.bv(iK, "serialized size must be non-negative, was "));
        }
        int i = this.aV & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iK2 = k(trgVar);
        if (iK2 < 0) {
            throw new IllegalStateException(a.bv(iK2, "serialized size must be non-negative, was "));
        }
        this.aV = (this.aV & Integer.MIN_VALUE) | iK2;
        return iK2;
    }

    @Override // defpackage.tqr
    public final /* synthetic */ tqq ee() {
        return (tpc) a(5, null);
    }

    @Override // defpackage.tqr
    public final /* synthetic */ tqq ef() {
        tpc tpcVar = (tpc) a(5, null);
        tpcVar.r(this);
        return tpcVar;
    }

    @Override // defpackage.tqr
    public final void eg(tos tosVar) {
        trg trgVarB = tra.a.b(this);
        ocq ocqVar = tosVar.f;
        if (ocqVar == null) {
            ocqVar = new ocq(tosVar);
        }
        trgVarB.m(this, ocqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return tra.a.b(this).j(this, (tph) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (C()) {
            return j();
        }
        int i = this.aT;
        if (i != 0) {
            return i;
        }
        int iJ = j();
        this.aT = iJ;
        return iJ;
    }

    public final int j() {
        return tra.a.b(this).b(this);
    }

    public final int k(trg trgVar) {
        return trgVar == null ? tra.a.b(this).a(this) : trgVar.a(this);
    }

    @Override // defpackage.tqr
    public final int l() {
        if (C()) {
            int iK = k(null);
            if (iK >= 0) {
                return iK;
            }
            throw new IllegalStateException(a.bv(iK, "serialized size must be non-negative, was "));
        }
        int i = this.aV & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iK2 = k(null);
        if (iK2 < 0) {
            throw new IllegalStateException(a.bv(iK2, "serialized size must be non-negative, was "));
        }
        this.aV = (this.aV & Integer.MIN_VALUE) | iK2;
        return iK2;
    }

    public final tpc m() {
        return (tpc) a(5, null);
    }

    @Override // defpackage.tqs
    public final /* synthetic */ tqr n() {
        return (tph) a(6, null);
    }

    public final tph o() {
        return (tph) a(4, null);
    }

    @Override // defpackage.tqs
    public final boolean p() {
        return B(this, true);
    }

    public final String toString() {
        String string = super.toString();
        int i = tqt.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        tqt.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.tqr
    public final tqy w() {
        return (tqy) a(7, null);
    }

    protected final void y() {
        tra.a.b(this).g(this);
        z();
    }

    final void z() {
        this.aV &= Integer.MAX_VALUE;
    }
}
