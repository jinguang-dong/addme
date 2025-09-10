package defpackage;

import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwj {
    private static final zm a;

    static {
        int i = zn.a;
        a = new zm((byte[]) null);
    }

    public static final int a(bii biiVar) {
        int i = true == (biiVar instanceof bsa) ? 3 : 1;
        if (biiVar instanceof bjj) {
            i |= 4;
        }
        if (biiVar instanceof cbo) {
            i |= 8;
        }
        if (biiVar instanceof bqa) {
            i |= 16;
        }
        if ((biiVar instanceof ald) || (biiVar instanceof buc)) {
            i |= 32;
        }
        if (biiVar instanceof bjn) {
            i |= 4096;
        }
        if (biiVar instanceof bjr) {
            i |= 2048;
        }
        if (biiVar instanceof bsw) {
            i |= 256;
        }
        if (biiVar instanceof btb) {
            i |= 64;
        }
        if ((biiVar instanceof bsy) || (biiVar instanceof bsz)) {
            i |= 128;
        }
        return biiVar instanceof cap ? 524288 | i : i;
    }

    public static final int b(bij bijVar) {
        int i = bijVar.n;
        if (i != 0) {
            return i;
        }
        zm zmVar = a;
        Class<?> cls = bijVar.getClass();
        int iA = zmVar.a(cls);
        if (iA >= 0) {
            return zmVar.c[iA];
        }
        int i2 = true == (bijVar instanceof bve) ? 3 : 1;
        if (bijVar instanceof buu) {
            i2 |= 4;
        }
        if (bijVar instanceof bwx) {
            i2 |= 8;
        }
        if (bijVar instanceof bww) {
            i2 |= 16;
        }
        if (bijVar instanceof bub) {
            i2 |= 32;
        }
        if (bijVar instanceof bwv) {
            i2 |= 64;
        }
        if (bijVar instanceof bvd) {
            i2 |= 128;
        }
        if (bijVar instanceof buv) {
            i2 |= 256;
        }
        if (bijVar instanceof bqz) {
            i2 |= 512;
        }
        if (bijVar instanceof bkb) {
            i2 |= 1024;
        }
        boolean z = bijVar instanceof bui;
        if (z) {
            i2 |= 2048;
        }
        if (z) {
            i2 |= 4096;
        }
        if (bijVar instanceof bov) {
            i2 |= 8192;
        }
        if (bijVar instanceof bqp) {
            i2 |= 16384;
        }
        if (bijVar instanceof bun) {
            i2 |= 32768;
        }
        if (bijVar instanceof box) {
            i2 |= 131072;
        }
        if (bijVar instanceof bxd) {
            i2 |= 262144;
        }
        if (bijVar instanceof cap) {
            i2 |= ImageMetadata.LENS_APERTURE;
        }
        if (bijVar instanceof bwo) {
            i2 |= ImageMetadata.SHADING_MODE;
        }
        if (bijVar instanceof bos) {
            i2 |= 2097152;
        }
        zmVar.g(cls, i2);
        return i2;
    }

    public static final int c(bij bijVar) {
        if (!(bijVar instanceof bup)) {
            return b(bijVar);
        }
        bup bupVar = (bup) bijVar;
        int iC = bupVar.x;
        for (bij bijVar2 = bupVar.y; bijVar2 != null; bijVar2 = bijVar2.q) {
            iC |= c(bijVar2);
        }
        return iC;
    }

    public static final void d(bij bijVar) {
        if (!bijVar.w) {
            bqs.c("autoInvalidateInsertedNode called on unattached node");
        }
        e(bijVar, -1, 1);
    }

    public static final void e(bij bijVar, int i, int i2) {
        if (!(bijVar instanceof bup)) {
            i(bijVar, i & bijVar.n, i2);
            return;
        }
        bup bupVar = (bup) bijVar;
        int i3 = bupVar.x;
        i(bijVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (bij bijVar2 = bupVar.y; bijVar2 != null; bijVar2 = bijVar2.q) {
            e(bijVar2, i4, i2);
        }
    }

    public static final void f(bij bijVar) {
        if (!bijVar.w) {
            bqs.c("autoInvalidateRemovedNode called on unattached node");
        }
        e(bijVar, -1, 2);
    }

    public static final void g(bij bijVar) {
        if (!bijVar.w) {
            bqs.c("autoInvalidateUpdatedNode called on unattached node");
        }
        e(bijVar, -1, 0);
    }

    public static final boolean h(int i) {
        return (i & 128) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void i(bij bijVar, int i, int i2) {
        if (i2 != 0 || bijVar.db()) {
            if ((i & 2) != 0 && (bijVar instanceof bve)) {
                bko.u((bve) bijVar);
                if (i2 == 2) {
                    bko.C(bijVar, 2).aj();
                }
            }
            if ((i & 128) != 0 && (bijVar instanceof bvd) && i2 != 2) {
                bko.B(bijVar).G();
            }
            if ((i & 256) != 0 && (bijVar instanceof buv) && i2 != 2) {
                bvm bvmVarB = bko.B(bijVar);
                if (!bvmVarB.ac() && !bvmVarB.af() && !bvmVarB.v) {
                    bvp.a(bvmVarB).n(bvmVarB);
                }
            }
            if ((i & 4) != 0 && (bijVar instanceof buu)) {
                bko.x((buu) bijVar);
            }
            if ((i & 8) != 0 && (bijVar instanceof bwx)) {
                bko.B(bijVar).l = true;
            }
            if ((i & 64) != 0 && (bijVar instanceof bwv)) {
                bvq bvqVar = bko.B((bwv) bijVar).t;
                bvqVar.o.p = true;
                bvx bvxVar = bvqVar.p;
                if (bvxVar != null) {
                    bvxVar.t = true;
                }
            }
            if ((i & 2048) != 0 && (bijVar instanceof bui)) {
                ((bui) bijVar).x();
            }
            if ((i & 4096) == 0 || !(bijVar instanceof bui)) {
                return;
            }
            bui buiVar = (bui) bijVar;
            bjq bjqVar = ((bxv) bko.D(buiVar)).D.d;
            if (((zw) bjqVar.e).j(buiVar)) {
                bjqVar.a();
            }
        }
    }
}
