package defpackage;

import android.hardware.Camera;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwp {
    public final Object a;
    public Object b;

    public kwp() {
        this.a = new float[16];
    }

    static /* synthetic */ void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pdk) it.next()).close();
        }
    }

    public final sod b() {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.CAPTURE_DONE;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        Object obj = this.a;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        som somVar = (som) ((tpc) obj).l();
        somVar.getClass();
        sodVar2.i = somVar;
        sodVar2.b |= 16;
        Object obj2 = this.b;
        if (obj2 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar3 = (sod) tpcVarM.b;
            sodVar3.aE = (srg) obj2;
            sodVar3.e |= 1;
        }
        return (sod) tpcVarM.l();
    }

    public final void c(snw snwVar) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        snwVar.getClass();
        somVar.af = snwVar;
        somVar.d |= 4;
    }

    public final void d(spo spoVar) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        spoVar.getClass();
        somVar.X = spoVar;
        somVar.c |= 16777216;
    }

    public final void e(pcs pcsVar) {
        if (pcsVar == null) {
            return;
        }
        Object obj = this.a;
        tpc tpcVarM = spv.a.m();
        String tagStringValue = pcsVar.getTagStringValue(ExifInterface.g);
        if (tagStringValue != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar = (spv) tpcVarM.b;
            spvVar.b |= 4;
            spvVar.d = tagStringValue;
        }
        String tagStringValue2 = pcsVar.getTagStringValue(ExifInterface.h);
        if (tagStringValue2 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar2 = (spv) tpcVarM.b;
            spvVar2.b |= 4;
            spvVar2.d = tagStringValue2;
        }
        String tagStringValue3 = pcsVar.getTagStringValue(ExifInterface.TAG_SOFTWARE);
        if (tagStringValue3 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar3 = (spv) tpcVarM.b;
            spvVar3.b |= 1;
            spvVar3.c = tagStringValue3;
        }
        if (pcsVar.a(ExifInterface.F) != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar4 = (spv) tpcVarM.b;
            spvVar4.b |= 8;
            spvVar4.e = r1.a / r1.b;
        }
        Integer numB = pcsVar.b(ExifInterface.J);
        if (numB != null) {
            int iIntValue = numB.intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar5 = (spv) tpcVarM.b;
            spvVar5.b |= 16;
            spvVar5.f = iIntValue;
        }
        if (pcsVar.a(ExifInterface.Z) != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar6 = (spv) tpcVarM.b;
            spvVar6.b |= 32;
            spvVar6.g = r1.a / r1.b;
        }
        if (pcsVar.a(ExifInterface.R) != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar7 = (spv) tpcVarM.b;
            spvVar7.b |= 64;
            spvVar7.h = r1.a / r1.b;
        }
        boolean z = (pcsVar.a(ExifInterface.aT) == null || pcsVar.a(ExifInterface.aV) == null) ? false : true;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spv spvVar8 = (spv) tpcVarM.b;
        spvVar8.b |= 256;
        spvVar8.i = z;
        Integer numB2 = pcsVar.b(ExifInterface.j);
        if (numB2 != null) {
            int iIntValue2 = numB2.intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar9 = (spv) tpcVarM.b;
            spvVar9.b |= 512;
            spvVar9.j = iIntValue2;
        }
        Integer numB3 = pcsVar.b(ExifInterface.aj);
        if (numB3 != null) {
            int iIntValue3 = numB3.intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar10 = (spv) tpcVarM.b;
            spvVar10.b |= 1024;
            spvVar10.k = iIntValue3;
        }
        Integer numB4 = pcsVar.b(ExifInterface.ai);
        if (numB4 != null) {
            int iIntValue4 = numB4.intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar11 = (spv) tpcVarM.b;
            spvVar11.b |= 2048;
            spvVar11.l = iIntValue4;
        }
        Integer numB5 = pcsVar.b(ExifInterface.Y);
        if (numB5 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar12 = (spv) tpcVarM.b;
            spvVar12.b |= 4096;
            spvVar12.m = true;
            int iIntValue5 = numB5.intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar13 = (spv) tpcVarM.b;
            spvVar13.b |= 8192;
            spvVar13.n = iIntValue5;
        } else {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar14 = (spv) tpcVarM.b;
            spvVar14.b |= 4096;
            spvVar14.m = false;
        }
        if (pcsVar.a(ExifInterface.T) != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar15 = (spv) tpcVarM.b;
            spvVar15.b |= 16384;
            spvVar15.o = r1.a / r1.b;
        }
        if (pcsVar.a(ExifInterface.V) != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spv spvVar16 = (spv) tpcVarM.b;
            spvVar16.b |= 32768;
            spvVar16.p = r9.a / r9.b;
        }
        spv spvVar17 = (spv) tpcVarM.l();
        tpc tpcVar = (tpc) obj;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        spvVar17.getClass();
        somVar.i = spvVar17;
        somVar.b |= 32;
    }

    public final void f(boolean z) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        somVar.b |= 64;
        somVar.j = z;
    }

    public final void g(boolean z) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        somVar.c |= 131072;
        somVar.R = z;
    }

    public final void h(sru sruVar) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        somVar.W = sruVar;
        somVar.c |= 8388608;
    }

    public final void i(float f) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        somVar.b |= 16;
        somVar.h = f;
    }

    public final void j(sti stiVar) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        somVar.ai = stiVar;
        somVar.d |= 32;
    }

    public final void k(float f) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        somVar.b |= 8;
        somVar.g = f;
    }

    public final void l(int i) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        somVar.C = i2;
        somVar.c |= 2;
    }

    public final void m(int i) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        somVar.l = i - 1;
        somVar.b |= 256;
    }

    public final void n(int i) {
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        somVar.N = i2;
        somVar.c |= 4096;
    }

    public final synchronized Camera.Parameters o() {
        Object parameters;
        parameters = this.b;
        if (parameters == null) {
            parameters = ((Camera) this.a).getParameters();
            this.b = parameters;
            if (parameters == null) {
                enz.a(emr.a, "Camera object returned null parameters!");
                throw new IllegalStateException("camera.getParameters returned null");
            }
        }
        return (Camera.Parameters) parameters;
    }

    public final synchronized void p() {
        this.b = null;
    }

    public kwp(Camera camera) {
        this.a = camera;
    }

    public kwp(ssc sscVar, boolean z) {
        a.I(sscVar != ssc.UNKNOWN_MODE);
        tpc tpcVarM = som.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        som somVar = (som) tphVar;
        somVar.e = sscVar.T;
        somVar.b |= 2;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        som somVar2 = (som) tpcVarM.b;
        somVar2.b |= 4;
        somVar2.f = z;
        this.a = tpcVarM;
    }

    public kwp(uiu uiuVar) {
        this.a = new tdy(uiuVar);
        this.b = new azv(1.0f);
    }

    public /* synthetic */ kwp(byte[] bArr, byte[] bArr2) {
        this((uiu) null);
    }

    public kwp(owf owfVar) {
        this.b = null;
        this.a = owfVar;
        this.b = sno.a.m();
    }
}
