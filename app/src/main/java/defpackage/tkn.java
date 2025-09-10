package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkn extends tiv {
    public static final tiw a = new tkm(1);
    private final int b;

    public tkn(int i) {
        this.b = i;
    }

    private final Object c(tml tmlVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return tmlVar.j();
        }
        if (i2 == 6) {
            return thu.b(this.b, tmlVar);
        }
        if (i2 == 7) {
            return Boolean.valueOf(tmlVar.s());
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(a.L(i)));
        }
        tmlVar.p();
        return null;
    }

    private static final Object d(tml tmlVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            tmlVar.l();
            return new ArrayList();
        }
        if (i2 != 2) {
            return null;
        }
        tmlVar.m();
        return new tjq();
    }

    @Override // defpackage.tiv
    public final Object a(tml tmlVar) throws IOException {
        int iT = tmlVar.t();
        Object objD = d(tmlVar, iT);
        if (objD == null) {
            return c(tmlVar, iT);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (tmlVar.r()) {
                String strH = objD instanceof Map ? tmlVar.h() : null;
                int iT2 = tmlVar.t();
                Object objD2 = d(tmlVar, iT2);
                Object objC = objD2 == null ? c(tmlVar, iT2) : objD2;
                if (objD instanceof List) {
                    ((List) objD).add(objC);
                } else {
                    ((Map) objD).put(strH, objC);
                }
                if (objD2 != null) {
                    arrayDeque.addLast(objD);
                    objD = objC;
                }
            } else {
                if (objD instanceof List) {
                    tmlVar.n();
                } else {
                    tmlVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }
}
