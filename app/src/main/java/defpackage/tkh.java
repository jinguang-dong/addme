package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkh extends tiv {
    static final tkh a = new tkh();

    private tkh() {
    }

    public static final til d(tml tmlVar) throws IOException {
        int iT = tmlVar.t();
        til tilVarF = f(tmlVar, iT);
        if (tilVarF == null) {
            return e(tmlVar, iT);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (tmlVar.r()) {
                String strH = tilVarF instanceof tio ? tmlVar.h() : null;
                int iT2 = tmlVar.t();
                til tilVarF2 = f(tmlVar, iT2);
                til tilVarE = tilVarF2 == null ? e(tmlVar, iT2) : tilVarF2;
                if (tilVarF instanceof tij) {
                    ((tij) tilVarF).a.add(tilVarE);
                } else {
                    ((tio) tilVarF).a.put(strH, tilVarE);
                }
                if (tilVarF2 != null) {
                    arrayDeque.addLast(tilVarF);
                    tilVarF = tilVarE;
                }
            } else {
                if (tilVarF instanceof tij) {
                    tmlVar.n();
                } else {
                    tmlVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return tilVarF;
                }
                tilVarF = (til) arrayDeque.removeLast();
            }
        }
    }

    private static final til e(tml tmlVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return new tiq(tmlVar.j());
        }
        if (i2 == 6) {
            return new tiq(new tjj(tmlVar.j()));
        }
        if (i2 == 7) {
            return new tiq(Boolean.valueOf(tmlVar.s()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(a.L(i)));
        }
        tmlVar.p();
        return tin.a;
    }

    private static final til f(tml tmlVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            tmlVar.l();
            return new tij();
        }
        if (i2 != 2) {
            return null;
        }
        tmlVar.m();
        return new tio();
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        return d(tmlVar);
    }

    public final void c(tmm tmmVar, til tilVar) throws IOException {
        if (tilVar == null || (tilVar instanceof tin)) {
            tmmVar.f();
            return;
        }
        if (!(tilVar instanceof tiq)) {
            if (tilVar instanceof tij) {
                tmmVar.d();
                tmmVar.g(1, '[');
                Iterator it = ((tij) tilVar).iterator();
                while (it.hasNext()) {
                    c(tmmVar, (til) it.next());
                }
                tmmVar.e(1, 2, ']');
                return;
            }
            if (!(tilVar instanceof tio)) {
                throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(String.valueOf(tilVar.getClass()))));
            }
            tmmVar.d();
            tmmVar.g(3, '{');
            tjk tjkVar = new tjk((tjl) ((tio) tilVar).a.entrySet());
            while (tjkVar.hasNext()) {
                tjp tjpVarA = tjkVar.a();
                String str = (String) tjpVarA.f;
                str.getClass();
                if (tmmVar.c != null) {
                    throw new IllegalStateException("Already wrote a name, expecting a value.");
                }
                int iA = tmmVar.a();
                if (iA != 3 && iA != 5) {
                    throw new IllegalStateException("Please begin an object before writing a name.");
                }
                tmmVar.c = str;
                c(tmmVar, (til) tjpVarA.h);
            }
            tmmVar.e(3, 5, '}');
            return;
        }
        tiq tiqVar = (tiq) tilVar;
        if (!tiqVar.g()) {
            if (tiqVar.f()) {
                boolean zBooleanValue = tiqVar.f() ? ((Boolean) tiqVar.a).booleanValue() : Boolean.parseBoolean(tiqVar.c());
                tmmVar.d();
                tmmVar.b();
                tmmVar.b.write(true != zBooleanValue ? "false" : "true");
                return;
            }
            String strC = tiqVar.c();
            if (strC == null) {
                tmmVar.f();
                return;
            }
            tmmVar.d();
            tmmVar.b();
            tmmVar.c(strC);
            return;
        }
        Number numberB = tiqVar.b();
        tmmVar.d();
        Class<?> cls = numberB.getClass();
        String string = numberB.toString();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (tmmVar.d != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(string)));
                }
            } else if (cls != Float.class && cls != Double.class && !tmm.a.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        tmmVar.b();
        tmmVar.b.append((CharSequence) string);
    }
}
