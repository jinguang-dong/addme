package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.util.Pair;
import android.util.Size;
import com.google.ar.core.Frame;
import com.google.ar.core.exceptions.NotYetAvailableException;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.creativecamera.allin.jni.ImageConversionJniImpl;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Supplier;
import wireless.android.learning.acmi.p11.metadata.P11MetadataSerializer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class npd implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ npd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, npj] */
    /* JADX WARN: Type inference failed for: r1v16, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r3v23, types: [sgt, shi] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) throws fny {
        foi foiVarH;
        Optional optionalEmpty;
        int i = 5;
        int i2 = 4;
        byte b = 0;
        switch (this.b) {
            case 0:
                HardwareBuffer hardwareBuffer = (HardwareBuffer) obj;
                nph nphVar = (nph) this.a;
                Size size = nphVar.i;
                if (size != null) {
                    return rwc.j(nphVar.e(hardwareBuffer, size.getWidth(), nphVar.i.getHeight(), nphVar.g.a() || ((iqk) nphVar.b.dL()).a));
                }
                ((sgt) nph.a.c().M(5482)).v("[%s] can't update screenshot. Bitmap size is null", nphVar.c);
                return rvk.a;
            case 1:
                npf npfVar = (npf) obj;
                if (npfVar.b == null) {
                    ?? r11 = this.a;
                    npl nplVarA = npfVar.a.a.a(r11);
                    ((nph) r11).f.d(nplVarA);
                    npfVar.b = nplVarA;
                }
                return npfVar.b;
            case 2:
                pva pvaVar = (pva) obj;
                int iAx = a.ax(((pvc) this.a).j);
                return qsp.at(pvaVar, iAx != 0 ? iAx : 1);
            case 3:
                pva pvaVar2 = (pva) obj;
                for (puc pucVar : ((pud) this.a).f) {
                    if (pucVar.c.equals(pvaVar2.c)) {
                        if (pvaVar2.e < 2147483647L && pvaVar2.j < 2147483647L) {
                            return pucVar;
                        }
                        tpc tpcVarM = puj.a.m();
                        long j = pvaVar2.e;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar = tpcVarM.b;
                        puj pujVar = (puj) tphVar;
                        pujVar.b = 1 | pujVar.b;
                        pujVar.c = j;
                        long j2 = pvaVar2.j;
                        if (!tphVar.C()) {
                            tpcVarM.o();
                        }
                        puj pujVar2 = (puj) tpcVarM.b;
                        pujVar2.b = 2 | pujVar2.b;
                        pujVar2.d = j2;
                        tpc tpcVar = (tpc) pucVar.a(5, null);
                        tpcVar.r(pucVar);
                        tpe tpeVar = (tpe) tpcVar;
                        tpeVar.aI(puj.e, (puj) tpcVarM.l());
                        return (puc) tpeVar.l();
                    }
                }
                throw new IllegalArgumentException("DataFileGroup does not contain DataFile with fileId: ".concat(String.valueOf(pvaVar2.c)));
            case 4:
                puc pucVar2 = (puc) obj;
                for (pva pvaVar3 : ((pvc) this.a).o) {
                    if (pvaVar3.c.equals(pucVar2.c)) {
                        tql tqlVar = puj.e;
                        pucVar2.i(tqlVar);
                        toy toyVar = pucVar2.r;
                        tpg tpgVar = (tpg) tqlVar.c;
                        if (!toyVar.m(tpgVar)) {
                            return pvaVar3;
                        }
                        pucVar2.i(tqlVar);
                        Object objK = pucVar2.r.k(tpgVar);
                        if (objK == null) {
                            objK = tqlVar.b;
                        } else {
                            tqlVar.b(objK);
                        }
                        puj pujVar3 = (puj) objK;
                        tpc tpcVar2 = (tpc) pvaVar3.a(5, null);
                        tpcVar2.r(pvaVar3);
                        long j3 = pujVar3.c;
                        if (!tpcVar2.b.C()) {
                            tpcVar2.o();
                        }
                        tph tphVar2 = tpcVar2.b;
                        pva pvaVar4 = (pva) tphVar2;
                        pvaVar4.b = 4 | pvaVar4.b;
                        pvaVar4.e = j3;
                        long j4 = pujVar3.d;
                        if (!tphVar2.C()) {
                            tpcVar2.o();
                        }
                        pva pvaVar5 = (pva) tpcVar2.b;
                        pvaVar5.b |= 128;
                        pvaVar5.j = j4;
                        return (pva) tpcVar2.l();
                    }
                }
                throw new IllegalArgumentException("DataFileGroupInternal does not contain DataFile with fileId: ".concat(String.valueOf(pucVar2.c)));
            case 5:
                qin qinVar = ((qkp) this.a).b;
                Pair pair = (Pair) obj;
                qjv qjvVar = new qjv(qinVar);
                qjvVar.a(new qml(qkl.d(qinVar, (String) pair.first)));
                qjvVar.a(new qml(qkl.b(qinVar, (String) pair.second)));
                return qjvVar.b();
            case 6:
                return this.a.apply(obj);
            case 7:
                tfu tfuVar = (tfu) obj;
                InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(tfuVar.b);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interleavedImageU8.d(), interleavedImageU8.b(), Bitmap.Config.ARGB_8888, false);
                ImageConversionJniImpl.interleavedImageToBitmapImpl(InterleavedImageU8.e(interleavedImageU8), bitmapCreateBitmap);
                tth tthVar = tfuVar.c;
                if (tthVar == null) {
                    tthVar = tth.a;
                }
                Size size2 = (Size) this.a;
                float width = tthVar.b * size2.getWidth();
                tth tthVar2 = tfuVar.c;
                if (tthVar2 == null) {
                    tthVar2 = tth.a;
                }
                float height = tthVar2.d * size2.getHeight();
                tth tthVar3 = tfuVar.c;
                if (tthVar3 == null) {
                    tthVar3 = tth.a;
                }
                float width2 = tthVar3.c * size2.getWidth();
                tth tthVar4 = tfuVar.c;
                if (tthVar4 == null) {
                    tthVar4 = tth.a;
                }
                return new ten(bitmapCreateBitmap, new RectF(width, height, width2, tthVar4.e * size2.getHeight()), tfuVar.d);
            case 8:
                return teg.c((szr) this.a, (foi) obj);
            case 9:
                return teg.c((szr) this.a, (foi) obj);
            case 10:
                tfw tfwVar = (tfw) obj;
                InterleavedImageU8 interleavedImageU82 = new InterleavedImageU8(tfwVar.b);
                ((tdx) this.a).b.f();
                szx szxVar = tfwVar.c;
                if (szxVar == null) {
                    szxVar = szx.a;
                }
                return new tee(interleavedImageU82, szxVar);
            case 11:
                Object obj2 = this.a;
                fon fonVar = (fon) obj;
                try {
                    foiVarH = fonVar.c().h(new fow(fonVar.b().j(), ((teo) obj2).b.i()));
                } catch (fnx | fnz | foa e) {
                    ((sgt) ((sgt) teo.a.c().i(e)).M((char) 5858)).s("Unable to create anchor.");
                    foiVarH = null;
                }
                if (foiVarH == null) {
                    return null;
                }
                fnr fnrVarC = fonVar.c();
                if (fnrVarC instanceof fnm) {
                    i = 4;
                } else if (fnrVarC instanceof fno) {
                    i = 3;
                } else if (!(fnrVarC instanceof fnk)) {
                    i = 1;
                }
                fnp fnpVar = ((teo) obj2).b;
                return new tek(i, foiVarH, Math.abs(txn.a(rup.o(fnpVar.m()).f(-1.0f).e(), txn.g(rup.o(fonVar.b().j()), rup.o(fnpVar.j())))));
            case 12:
                ten tenVar = (ten) obj;
                int i3 = sbp.d;
                sbk sbkVar = new sbk();
                RectF rectF = tenVar.b;
                float f = rectF.left;
                final float f2 = rectF.bottom;
                float[] fArr = {f, f2};
                Object obj3 = this.a;
                teo teoVar = (teo) obj3;
                int i4 = 6;
                if (teoVar.d) {
                    final fon fonVar2 = teoVar.e;
                    final float f3 = fArr[0];
                    sbkVar.j((sbp) Collection.EL.stream((sbp) ezh.k(new Supplier() { // from class: fom
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            fon fonVar3 = fonVar2;
                            Stream map = Collection.EL.stream(((Frame) fonVar3.a).hitTest(f3, f2)).map(new fiy(fonVar3, 5));
                            int i5 = sbp.d;
                            return (sbp) map.collect(ryv.a);
                        }
                    })).filter(new nhh(obj3, i2)).map(new npd(obj3, 11)).filter(new mdn(12)).collect(ryv.a));
                    try {
                        try {
                            Image imageAcquireDepthImage16Bits = ((Frame) fonVar2.a).acquireDepthImage16Bits();
                            if (((teo) obj3).a(imageAcquireDepthImage16Bits, imageAcquireDepthImage16Bits.getWidth() * 0.5f, imageAcquireDepthImage16Bits.getHeight() * 0.5f) == 0.0f) {
                                imageAcquireDepthImage16Bits.close();
                                optionalEmpty = Optional.empty();
                            } else {
                                optionalEmpty = Optional.of(imageAcquireDepthImage16Bits);
                            }
                        } catch (NotYetAvailableException e2) {
                            throw new fny(e2);
                        } catch (RuntimeException e3) {
                            throw ezh.l(e3);
                        }
                    } catch (fnx | fny | fnz | IllegalStateException e4) {
                        ((sgt) ((sgt) teo.a.c().i(e4)).M((char) 5860)).s("Failed to get depth image.");
                        optionalEmpty = Optional.empty();
                    }
                    optionalEmpty.map(new fmu(obj3, fArr, i4)).ifPresent(new mdw(sbkVar, 19));
                }
                float f4 = tenVar.c;
                sbkVar.h(new tek(6, teoVar.b(fArr, f4), f4));
                sbp sbpVarG = sbkVar.g();
                return (tel) Collection.EL.stream(sbpVarG).filter(new mdn(13)).min(Comparator$CC.comparing(new qoi(17))).or(new jko(sbpVarG, i4)).map(new tem(teoVar, tenVar, sbpVarG, b == true ? 1 : 0)).orElse(null);
            default:
                return NativeMetadataConverter.s(((P11MetadataSerializer) this.a).d.a(pjr.b((String) obj)));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
