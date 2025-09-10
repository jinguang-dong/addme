package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import j$.util.Map;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doa implements blp {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;
    private final Object d;
    private final Object e;

    public doa(apz apzVar, apz apzVar2, uif uifVar, int i) {
        this.c = i;
        this.d = new dny(apzVar.a, apzVar2.a, uifVar);
        this.e = new dny(apzVar.b, apzVar2.b, uifVar);
        this.a = new dny(apzVar.c, apzVar2.c, uifVar);
        this.b = new dny(apzVar.d, apzVar2.d, uifVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, uif] */
    @Override // defpackage.blp
    public final blh a(final long j, final cib cibVar, final chq chqVar) {
        if (this.c == 0) {
            bkg bkgVarR = bko.r(j);
            cib cibVar2 = cib.a;
            float fA = ((dny) (cibVar == cibVar2 ? this.d : this.e)).a(j, chqVar);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
            float fA2 = ((dny) (cibVar == cibVar2 ? this.e : this.d)).a(j, chqVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA2) << 32;
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA2) & 4294967295L;
            float fA3 = ((dny) (cibVar == cibVar2 ? this.a : this.b)).a(j, chqVar);
            long jFloatToRawIntBits5 = Float.floatToRawIntBits(fA3) << 32;
            long jFloatToRawIntBits6 = Float.floatToRawIntBits(fA3) & 4294967295L;
            long j2 = jFloatToRawIntBits3 | jFloatToRawIntBits4;
            float fA4 = ((dny) (cibVar == cibVar2 ? this.b : this.a)).a(j, chqVar);
            return new blg(bdq.r(bkgVarR, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), j2, jFloatToRawIntBits5 | jFloatToRawIntBits6, (Float.floatToRawIntBits(fA4) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L)));
        }
        boolean z = true;
        tdy tdyVar = (tdy) Map.EL.computeIfAbsent(this.e, new bki(j), new fiy(new uiq() { // from class: dnz
            @Override // defpackage.uiq
            public final Object a(Object obj) {
                cvj cvjVarK;
                doa doaVar = this.d;
                apu apuVar = (apu) doaVar.b;
                long j3 = j;
                chq chqVar2 = chqVar;
                cib cibVar3 = cibVar;
                cvj cvjVarK2 = AmbientLifecycleObserverKt.k(apuVar, j3, chqVar2, cibVar3);
                if (cvjVarK2 == null || (cvjVarK = AmbientLifecycleObserverKt.k((apu) doaVar.a, j3, chqVar2, cibVar3)) == null) {
                    return null;
                }
                return new tdy(cvjVarK2, cvjVarK);
            }
        }, 1));
        if (tdyVar == null) {
            return ((apu) this.b).a(j, cibVar, chqVar);
        }
        float fFloatValue = ((Number) this.d.a()).floatValue();
        Path path = new Path();
        cux cuxVar = null;
        ugl uglVar = new ugl((byte[]) null);
        ?? r0 = tdyVar.b;
        int size = r0.size();
        cux cuxVar2 = null;
        int i = 0;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = cvk.b(((cux) ((uev) r0.get(i)).a).a[i2], ((cux) ((uev) r0.get(i)).b).a[i2], fFloatValue);
            }
            cux cuxVar3 = new cux(fArr);
            if (cuxVar2 == null) {
                cuxVar2 = cuxVar3;
            }
            if (cuxVar != null) {
                uglVar.add(cuxVar);
            }
            i++;
            cuxVar = cuxVar3;
        }
        if (cuxVar != null && cuxVar2 != null) {
            uglVar.add(cpn.c(cuxVar.a(), cuxVar.b(), cuxVar.e(), cuxVar.f(), cuxVar.g(), cuxVar.h(), cuxVar2.a(), cuxVar2.b()));
        }
        List listBi = ske.bi(uglVar);
        path.rewind();
        int i3 = ((ugl) listBi).c;
        int i4 = 0;
        while (i4 < i3) {
            cux cuxVar4 = (cux) listBi.get(i4);
            if (z) {
                path.moveTo(cuxVar4.a(), cuxVar4.b());
            }
            path.cubicTo(cuxVar4.e(), cuxVar4.f(), cuxVar4.g(), cuxVar4.h(), cuxVar4.c(), cuxVar4.d());
            i4++;
            z = false;
        }
        path.close();
        bkn bknVar = new bkn(path);
        float[] fArrD = bld.d();
        bld.e(fArrD, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        if (bknVar.d == null) {
            bknVar.d = new Matrix();
        }
        Matrix matrix = bknVar.d;
        matrix.getClass();
        bko.n(matrix, fArrD);
        Path path2 = bknVar.a;
        Matrix matrix2 = bknVar.d;
        matrix2.getClass();
        path2.transform(matrix2);
        return new ble(bknVar);
    }

    public doa(apu apuVar, apu apuVar2, uif uifVar, int i) {
        this.c = i;
        this.b = apuVar;
        this.a = apuVar2;
        this.d = uifVar;
        this.e = new bhc();
    }
}
