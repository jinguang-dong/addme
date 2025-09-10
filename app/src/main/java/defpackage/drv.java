package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drv {
    public final djw a;
    public final cdo b;
    public final cdo c;
    public final cdo d;
    public final cdo e;
    public final cdo f;
    public final cdo g;
    public final cdo h;
    public final cdo i;
    public final cdo j;
    public final cdo k;
    public final cdo l;
    public final cdo m;
    public final cdo n;
    public final cdo o;
    public final cdo p;
    public final cdo q;
    public final cdo r;
    public final cdo s;
    private final djw t;
    private final djw u;

    public /* synthetic */ drv(djw djwVar, djw djwVar2, djw djwVar3, cdo cdoVar, cdo cdoVar2, cdo cdoVar3, cdo cdoVar4, cdo cdoVar5, cdo cdoVar6, cdo cdoVar7, cdo cdoVar8, cdo cdoVar9, cdo cdoVar10, cdo cdoVar11, cdo cdoVar12, cdo cdoVar13, cdo cdoVar14, cdo cdoVar15, cdo cdoVar16, cdo cdoVar17, cdo cdoVar18, int i) {
        djw djwVar4;
        djw djwVar5;
        djw djwVar6;
        cdo cdoVar19;
        cdo cdoVar20;
        cdo cdoVar21;
        cdo cdoVar22;
        cdo cdoVar23;
        cdo cdoVar24;
        cdo cdoVar25;
        cdo cdoVar26;
        cdo cdoVar27;
        cdo cdoVar28;
        cdo cdoVar29;
        cdo cdoVar30;
        cdo cdoVar31;
        cdo cdoVar32;
        cdo cdoVar33;
        cdo cdoVar34;
        cdo cdoVar35;
        cdo cdoVar36;
        cfd cfdVar = (i & 1) != 0 ? cfd.e : null;
        if ((i & 2) != 0) {
            djw djwVar7 = dsn.a;
            djwVar4 = dsn.a;
        } else {
            djwVar4 = djwVar;
        }
        if ((i & 4) != 0) {
            djw djwVar8 = dsn.a;
            djwVar5 = dsn.b;
        } else {
            djwVar5 = djwVar2;
        }
        if ((i & 8) != 0) {
            djw djwVar9 = dsn.a;
            djwVar6 = dsn.c;
        } else {
            djwVar6 = djwVar3;
        }
        if ((i & 16) != 0) {
            djw djwVar10 = dsn.a;
            cdoVar19 = dsn.h;
        } else {
            cdoVar19 = cdoVar;
        }
        if ((i & 32) != 0) {
            djw djwVar11 = dsn.a;
            cdoVar20 = dsn.i;
        } else {
            cdoVar20 = cdoVar2;
        }
        if ((i & 64) != 0) {
            djw djwVar12 = dsn.a;
            cdoVar21 = dsn.j;
        } else {
            cdoVar21 = cdoVar3;
        }
        if ((i & 128) != 0) {
            djw djwVar13 = dsn.a;
            cdoVar22 = dsn.s;
        } else {
            cdoVar22 = cdoVar4;
        }
        if ((i & 256) != 0) {
            djw djwVar14 = dsn.a;
            cdoVar23 = dsn.t;
        } else {
            cdoVar23 = cdoVar5;
        }
        if ((i & 512) != 0) {
            djw djwVar15 = dsn.a;
            cdoVar24 = dsn.u;
        } else {
            cdoVar24 = cdoVar6;
        }
        if ((i & 1024) != 0) {
            djw djwVar16 = dsn.a;
            cdoVar25 = dsn.k;
        } else {
            cdoVar25 = cdoVar7;
        }
        if ((i & 2048) != 0) {
            djw djwVar17 = dsn.a;
            cdoVar26 = dsn.l;
        } else {
            cdoVar26 = cdoVar8;
        }
        if ((i & 4096) != 0) {
            djw djwVar18 = dsn.a;
            cdoVar27 = dsn.m;
        } else {
            cdoVar27 = cdoVar9;
        }
        if ((i & 8192) != 0) {
            djw djwVar19 = dsn.a;
            cdoVar28 = dsn.e;
        } else {
            cdoVar28 = cdoVar10;
        }
        if ((i & 16384) != 0) {
            djw djwVar20 = dsn.a;
            cdoVar29 = dsn.f;
        } else {
            cdoVar29 = cdoVar11;
        }
        if ((i & 32768) != 0) {
            djw djwVar21 = dsn.a;
            cdoVar30 = dsn.g;
        } else {
            cdoVar30 = cdoVar12;
        }
        if ((i & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            djw djwVar22 = dsn.a;
            cdoVar31 = dsn.d;
        } else {
            cdoVar31 = cdoVar13;
        }
        if ((i & 131072) != 0) {
            djw djwVar23 = dsn.a;
            cdoVar32 = dsn.n;
        } else {
            cdoVar32 = cdoVar14;
        }
        if ((i & 262144) != 0) {
            djw djwVar24 = dsn.a;
            cdoVar33 = dsn.p;
        } else {
            cdoVar33 = cdoVar15;
        }
        if ((i & ImageMetadata.LENS_APERTURE) != 0) {
            djw djwVar25 = dsn.a;
            cdoVar34 = dsn.q;
        } else {
            cdoVar34 = cdoVar16;
        }
        if ((i & ImageMetadata.SHADING_MODE) != 0) {
            djw djwVar26 = dsn.a;
            cdoVar35 = dsn.r;
        } else {
            cdoVar35 = cdoVar17;
        }
        if ((i & 2097152) != 0) {
            djw djwVar27 = dsn.a;
            cdoVar36 = dsn.o;
        } else {
            cdoVar36 = cdoVar18;
        }
        djw djwVarB = drw.b(djwVar4, cfdVar);
        djw djwVarB2 = drw.b(djwVar5, cfdVar);
        djw djwVarB3 = drw.b(djwVar6, cfdVar);
        cdo cdoVarA = drw.a(cdoVar19, cfdVar);
        cdo cdoVarA2 = drw.a(cdoVar20, cfdVar);
        cdo cdoVarA3 = drw.a(cdoVar21, cfdVar);
        cdo cdoVarA4 = drw.a(cdoVar22, cfdVar);
        cdo cdoVarA5 = drw.a(cdoVar23, cfdVar);
        cdo cdoVarA6 = drw.a(cdoVar24, cfdVar);
        cdo cdoVarA7 = drw.a(cdoVar25, cfdVar);
        cdo cdoVarA8 = drw.a(cdoVar26, cfdVar);
        cdo cdoVarA9 = drw.a(cdoVar27, cfdVar);
        cdo cdoVarA10 = drw.a(cdoVar28, cfdVar);
        cdo cdoVarA11 = drw.a(cdoVar29, cfdVar);
        cdo cdoVarA12 = drw.a(cdoVar30, cfdVar);
        cdo cdoVarA13 = drw.a(cdoVar31, cfdVar);
        cdo cdoVarA14 = drw.a(cdoVar32, cfdVar);
        cdo cdoVarA15 = drw.a(cdoVar33, cfdVar);
        cdo cdoVarA16 = drw.a(cdoVar34, cfdVar);
        cdo cdoVarA17 = drw.a(cdoVar35, cfdVar);
        cdo cdoVarA18 = drw.a(cdoVar36, cfdVar);
        this.t = djwVarB;
        this.a = djwVarB2;
        this.u = djwVarB3;
        this.b = cdoVarA;
        this.c = cdoVarA2;
        this.d = cdoVarA3;
        this.e = cdoVarA4;
        this.f = cdoVarA5;
        this.g = cdoVarA6;
        this.h = cdoVarA7;
        this.i = cdoVarA8;
        this.j = cdoVarA9;
        this.k = cdoVarA10;
        this.l = cdoVarA11;
        this.m = cdoVarA12;
        this.n = cdoVarA13;
        this.o = cdoVarA14;
        this.p = cdoVarA15;
        this.q = cdoVarA16;
        this.r = cdoVarA17;
        this.s = cdoVarA18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drv)) {
            return false;
        }
        drv drvVar = (drv) obj;
        return a.ao(this.t, drvVar.t) && a.ao(this.a, drvVar.a) && a.ao(this.u, drvVar.u) && a.ao(this.b, drvVar.b) && a.ao(this.c, drvVar.c) && a.ao(this.d, drvVar.d) && a.ao(this.e, drvVar.e) && a.ao(this.f, drvVar.f) && a.ao(this.g, drvVar.g) && a.ao(this.h, drvVar.h) && a.ao(this.i, drvVar.i) && a.ao(this.j, drvVar.j) && a.ao(this.k, drvVar.k) && a.ao(this.l, drvVar.l) && a.ao(this.m, drvVar.m) && a.ao(this.n, drvVar.n) && a.ao(this.o, drvVar.o) && a.ao(this.p, drvVar.p) && a.ao(this.q, drvVar.q) && a.ao(this.r, drvVar.r) && a.ao(this.s, drvVar.s);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.t.hashCode() * 31) + this.a.hashCode()) * 31) + this.u.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode();
    }

    public final String toString() {
        return "Typography(arcLarge=" + this.t + ", arcMedium=" + this.a + ", arcSmall=" + this.u + ", displayLarge=" + this.b + HHdu.fxrwRu + this.c + ", displaySmall=" + this.d + ", titleLarge=" + this.e + ", titleMedium=" + this.f + ", titleSmall=" + this.g + ", labelLarge=" + this.h + ", labelMedium=" + this.i + ", labelSmall=" + this.j + ", bodyLarge=" + this.k + ", bodyMedium=" + this.l + ", bodySmall=" + this.m + ", bodyExtraSmall=" + this.n + ")numeralExtraLarge=" + this.o + ", numeralLarge=" + this.p + ", numeralMedium=" + this.q + ", numeralSmall=" + this.r + ", numeralExtraSmall=" + this.s + ')';
    }
}
