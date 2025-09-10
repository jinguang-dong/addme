package defpackage;

import com.google.ar.core.PointCloud;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tdv implements paq {
    public static final sgv a = sgv.g("tdv");
    public final txk b;
    public final fnp c;
    public final int d;
    public final foi e;
    public final foi f;
    public final fov g;
    public final fok h;

    public tdv(fon fonVar, foi foiVar, foi foiVar2, int i) {
        this.f = foiVar;
        this.e = foiVar2;
        this.c = foiVar2.dN();
        this.g = fonVar.d();
        fok fokVarF = fonVar.f();
        txk txkVar = new txk(txk.a);
        this.b = txkVar;
        fokVarF.q(txkVar.b);
        this.h = (fok) ezh.k(new fog(fokVarF, 5));
        this.d = i;
    }

    public final Optional a() {
        foi foiVar = this.e;
        return foiVar.dO() != fnt.TRACKING ? Optional.empty() : Optional.of(foiVar.dN());
    }

    public final tpc b() {
        foi foiVar = this.f;
        return (tpc) (foiVar.dO() != fnt.TRACKING ? Optional.empty() : Optional.of(foiVar.dN())).map(new qoi(14)).map(new Function() { // from class: tdu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo30andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txk txkVar = (txk) obj;
                tpc tpcVarM = szr.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tdv tdvVar = this.a;
                szr szrVar = (szr) tpcVarM.b;
                szrVar.b |= 1;
                szrVar.c = true;
                tpcVarM.W(rup.p(txkVar));
                tpc tpcVarM2 = szu.a.m();
                fok fokVar = tdvVar.h;
                float[] fArr = (float[]) ezh.k(new fog(fokVar, 10));
                float f = fArr[0];
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                szu szuVar = (szu) tphVar;
                szuVar.b |= 1;
                szuVar.c = f;
                float f2 = fArr[1];
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                szu szuVar2 = (szu) tpcVarM2.b;
                szuVar2.b |= 2;
                szuVar2.d = f2;
                float[] fArr2 = (float[]) ezh.k(new fog(fokVar, 9));
                float f3 = fArr2[0];
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar2 = tpcVarM2.b;
                szu szuVar3 = (szu) tphVar2;
                szuVar3.b |= 4;
                szuVar3.e = f3;
                float f4 = fArr2[1];
                if (!tphVar2.C()) {
                    tpcVarM2.o();
                }
                szu szuVar4 = (szu) tpcVarM2.b;
                szuVar4.b |= 8;
                szuVar4.f = f4;
                int[] iArr = (int[]) ezh.k(new fog(fokVar, 11));
                float f5 = iArr[0];
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar3 = tpcVarM2.b;
                szu szuVar5 = (szu) tphVar3;
                szuVar5.b |= 16;
                szuVar5.g = f5;
                float f6 = iArr[1];
                if (!tphVar3.C()) {
                    tpcVarM2.o();
                }
                szu szuVar6 = (szu) tpcVarM2.b;
                szuVar6.b |= 32;
                szuVar6.h = f6;
                szu szuVar7 = (szu) tpcVarM2.l();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                szr szrVar2 = (szr) tpcVarM.b;
                szuVar7.getClass();
                szrVar2.e = szuVar7;
                szrVar2.b |= 2;
                fov fovVar = tdvVar.g;
                FloatBuffer floatBufferC = fovVar.c();
                FloatBuffer floatBufferAllocate = FloatBuffer.allocate(floatBufferC.capacity());
                floatBufferAllocate.put(floatBufferC);
                floatBufferAllocate.rewind();
                float[] fArrArray = floatBufferAllocate.array();
                Stream streamMapToObj = IntStream.CC.range(0, fArrArray.length).mapToObj(new tdt(fArrArray, 0));
                int i = sbp.d;
                Collector collector = ryv.a;
                sbp sbpVar = (sbp) streamMapToObj.collect(collector);
                PointCloud pointCloud = (PointCloud) fovVar.a;
                pointCloud.getClass();
                IntBuffer intBuffer = (IntBuffer) ezh.k(new foq(pointCloud, 5));
                IntBuffer intBufferAllocate = IntBuffer.allocate(intBuffer.capacity());
                intBufferAllocate.put(intBuffer);
                intBufferAllocate.rewind();
                sbp sbpVar2 = (sbp) DesugarArrays.stream(intBufferAllocate.array()).boxed().collect(collector);
                tpc tpcVarM3 = szs.a.m();
                for (int i2 = 0; i2 < sbpVar2.size(); i2++) {
                    tpc tpcVarM4 = szt.a.m();
                    int iIntValue = ((Integer) sbpVar2.get(i2)).intValue();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    szt sztVar = (szt) tpcVarM4.b;
                    sztVar.b |= 16;
                    sztVar.g = iIntValue;
                    int i3 = i2 * 4;
                    float fFloatValue = ((Float) sbpVar.get(i3)).floatValue();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    szt sztVar2 = (szt) tpcVarM4.b;
                    sztVar2.b |= 1;
                    sztVar2.c = fFloatValue;
                    float fFloatValue2 = ((Float) sbpVar.get(i3 + 1)).floatValue();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    szt sztVar3 = (szt) tpcVarM4.b;
                    sztVar3.b |= 2;
                    sztVar3.d = fFloatValue2;
                    float fFloatValue3 = ((Float) sbpVar.get(i3 + 2)).floatValue();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    szt sztVar4 = (szt) tpcVarM4.b;
                    sztVar4.b |= 4;
                    sztVar4.e = fFloatValue3;
                    float fFloatValue4 = ((Float) sbpVar.get(i3 + 3)).floatValue();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    szt sztVar5 = (szt) tpcVarM4.b;
                    sztVar5.b |= 8;
                    sztVar5.f = fFloatValue4;
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    szs szsVar = (szs) tpcVarM3.b;
                    szt sztVar6 = (szt) tpcVarM4.l();
                    sztVar6.getClass();
                    tpw tpwVar = szsVar.c;
                    if (!tpwVar.c()) {
                        szsVar.c = tph.v(tpwVar);
                    }
                    szsVar.c.add(sztVar6);
                }
                fnp fnpVar = tdvVar.c;
                tpc tpcVarM5 = szy.a.m();
                List listAl = ske.al(fnpVar.j());
                if (!tpcVarM5.b.C()) {
                    tpcVarM5.o();
                }
                szy szyVar = (szy) tpcVarM5.b;
                tpm tpmVar = szyVar.b;
                if (!tpmVar.c()) {
                    szyVar.b = tph.s(tpmVar);
                }
                tnq.e(listAl, szyVar.b);
                List listAl2 = ske.al(fnpVar.i());
                if (!tpcVarM5.b.C()) {
                    tpcVarM5.o();
                }
                szy szyVar2 = (szy) tpcVarM5.b;
                tpm tpmVar2 = szyVar2.c;
                if (!tpmVar2.c()) {
                    szyVar2.c = tph.s(tpmVar2);
                }
                tnq.e(listAl2, szyVar2.c);
                szy szyVar3 = (szy) tpcVarM5.l();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                szs szsVar2 = (szs) tpcVarM3.b;
                szyVar3.getClass();
                szsVar2.d = szyVar3;
                szsVar2.b |= 1;
                szs szsVar3 = (szs) tpcVarM3.l();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar4 = tpcVarM.b;
                szr szrVar3 = (szr) tphVar4;
                szsVar3.getClass();
                szrVar3.f = szsVar3;
                szrVar3.b |= 4;
                int i4 = tdvVar.d;
                if (!tphVar4.C()) {
                    tpcVarM.o();
                }
                szr szrVar4 = (szr) tpcVarM.b;
                szrVar4.b |= 8;
                szrVar4.g = i4;
                return tpcVarM;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new mae(10));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.e.b();
        this.f.b();
        this.g.close();
    }
}
