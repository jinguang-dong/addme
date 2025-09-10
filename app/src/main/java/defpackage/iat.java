package defpackage;

import android.hardware.HardwareBuffer;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.JpgEncoderMetadata;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.imageio.JpgHelper;
import com.google.googlex.gcam.imageproc.Resample;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iat {
    private static final sgv a = sgv.g("iat");
    private static final sbc b;
    private static final sbv c;
    private final jlz d;
    private final pbn e;
    private final hqw f;
    private final hbj g;
    private final ocq h;

    static {
        sba sbaVar = new sba();
        sbaVar.c(tcd.b, pcu.TOP_LEFT);
        sbaVar.c(tcd.c, pcu.TOP_RIGHT);
        sbaVar.c(tcd.d, pcu.BOTTOM_RIGHT);
        sbaVar.c(tcd.e, pcu.BOTTOM_LEFT);
        sbaVar.c(tcd.f, pcu.LEFT_TOP);
        sbaVar.c(tcd.g, pcu.RIGHT_TOP);
        sbaVar.c(tcd.h, pcu.RIGHT_BOTTOM);
        sbaVar.c(tcd.i, pcu.LEFT_BOTTOM);
        b = sbaVar.b();
        sbr sbrVar = new sbr();
        sbrVar.f(pcu.TOP_LEFT, pcu.TOP_RIGHT);
        sbrVar.f(pcu.TOP_RIGHT, pcu.TOP_LEFT);
        sbrVar.f(pcu.BOTTOM_RIGHT, pcu.BOTTOM_LEFT);
        sbrVar.f(pcu.BOTTOM_LEFT, pcu.BOTTOM_RIGHT);
        sbrVar.f(pcu.RIGHT_TOP, pcu.LEFT_TOP);
        sbrVar.f(pcu.LEFT_TOP, pcu.RIGHT_TOP);
        sbrVar.f(pcu.LEFT_BOTTOM, pcu.RIGHT_BOTTOM);
        sbrVar.f(pcu.RIGHT_BOTTOM, pcu.LEFT_BOTTOM);
        c = sbrVar.b();
    }

    public iat(hbj hbjVar, ocq ocqVar, hqw hqwVar, pbn pbnVar, jlz jlzVar) {
        this.g = hbjVar;
        this.h = ocqVar;
        this.f = hqwVar;
        this.e = pbnVar;
        this.d = jlzVar;
    }

    private static final pas b(pas pasVar, tcd tcdVar) {
        int[] iArrA = Resample.a(pasVar.a, pasVar.b, tcdVar);
        return new pas(iArrA[0], iArrA[1]);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lss] */
    private static final boolean c(icj icjVar) {
        return icjVar.r.b.ah();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v8, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r24v0, types: [icj] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [pbm] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r7v4, types: [pbm] */
    /* JADX WARN: Type inference failed for: r7v5, types: [pbm] */
    /* JADX WARN: Type inference failed for: r7v6, types: [pbn] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, lss] */
    public final void a(icj icjVar, iar iarVar) {
        tcd tcdVarE;
        InterleavedImageU8 interleavedImageU8;
        pbm pbmVar;
        byte[] bArr;
        pcu pcuVar;
        icj icjVarA = icjVar;
        ?? r3 = icjVarA.r.b;
        StringBuilder sb = new StringBuilder("Save Image, isSecondary: ");
        boolean z = iarVar.e;
        sb.append(z);
        r3.J(sb.toString());
        if (z) {
            ShotMetadata shotMetadata = new ShotMetadata(icjVarA.d);
            ici iciVar = new ici(icjVarA);
            iciVar.f(shotMetadata);
            icjVarA = iciVar.a();
        }
        icj icjVar2 = icjVarA;
        String str = (String) icjVar2.r.b.p().b(new fhy(19)).e("");
        if (!str.isEmpty()) {
            icjVar2.d.j(str);
        }
        ShotMetadata shotMetadata2 = icjVar2.d;
        hbj hbjVar = this.g;
        tcd tcdVar = tcd.b;
        if (hbjVar.p(gzo.bg)) {
            pbn pbnVar = this.e;
            pbnVar.f("rotationCalculation");
            tcdVarE = shotMetadata2.e();
            ske.w(shotMetadata2, 60);
            pbnVar.g();
            if (c(icjVar2)) {
                sbc sbcVar = b;
                pcu pcuVar2 = (pcu) sbcVar.get(tcdVarE);
                tcdVarE = (pcuVar2 == null || (pcuVar = (pcu) c.get(pcuVar2)) == null) ? tcd.a : (tcd) ((sew) sbcVar).c.getOrDefault(pcuVar, tcd.a);
            }
        } else {
            tcdVarE = tcdVar;
        }
        if (c(icjVar2)) {
            ske.v(shotMetadata2);
        }
        YuvImage yuvImage = icjVar2.b;
        if (yuvImage != null && tcdVarE != tcdVar && tcdVarE != tcd.a) {
            pas pasVarB = b(new pas(yuvImage.b(), yuvImage.a()), tcdVarE);
            YuvImage yuvImage2 = new YuvImage(pasVarB.a, pasVarB.b, tdd.a(GcamModuleJNI.YuvImage_yuv_format(yuvImage.a, yuvImage)));
            Resample.c(rup.r(yuvImage), tcdVarE, rup.t(yuvImage2));
            yuvImage.c();
            yuvImage = yuvImage2;
        }
        InterleavedImageU8 interleavedImageU82 = icjVar2.a;
        if (interleavedImageU82 != null && tcdVarE != tcdVar) {
            pas pasVarB2 = b(new pas(interleavedImageU82.d(), interleavedImageU82.b()), tcdVarE);
            InterleavedImageU8 interleavedImageU83 = new InterleavedImageU8(pasVarB2.a, pasVarB2.b, interleavedImageU82.a());
            Resample.b(interleavedImageU82.f(), tcdVarE, interleavedImageU83.g());
            interleavedImageU82.h();
            interleavedImageU82 = interleavedImageU83;
        }
        ias iasVar = new ias(yuvImage, interleavedImageU82);
        JpgEncoderMetadata jpgEncoderMetadata = icjVar2.e;
        float f = iarVar.f;
        float f2 = iarVar.g;
        float f3 = iarVar.h;
        int i = iarVar.i;
        JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
        jpgEncodeOptions.b(shotMetadata2);
        if (jpgEncoderMetadata != null) {
            GcamModuleJNI.JpgEncodeOptions_jpg_encoder_metadata_set(jpgEncodeOptions.a, jpgEncodeOptions, jpgEncoderMetadata.a, jpgEncoderMetadata);
        }
        pbn pbnVar2 = this.e;
        pbm pbmVar2 = new pbm(pbnVar2, "compressJpeg");
        try {
            interleavedImageU8 = iasVar.b;
        } catch (Throwable th) {
            th = th;
            icjVar = pbmVar2;
        }
        try {
            if (interleavedImageU8 != null) {
                pbmVar = pbmVar2;
                bArr = (byte[]) rwc.i(JpgHelper.encodeRgbToJpegAsByteArrayImpl(interleavedImageU8.f().a, jpgEncodeOptions.a, tcdVar.j, f, f2, f3, i)).c();
            } else {
                pbmVar = pbmVar2;
                YuvImage yuvImage3 = iasVar.a;
                if (yuvImage3 == null) {
                    throw new IllegalArgumentException("Only YUV and RGB are supported for JPEG compression.");
                }
                bArr = (byte[]) rwc.i(JpgHelper.encodeYuvToJpegAsByteArrayImpl(rup.r(yuvImage3).a, jpgEncodeOptions.a, tcdVar.j, f, f2, f3, i)).c();
            }
            pbmVar.close();
            jpgEncodeOptions.a();
            ExifInterface exifInterface = new ExifInterface();
            ?? pbmVar3 = new pbm(pbnVar2, "getExif");
            try {
                try {
                    exifInterface.r(bArr, true);
                } catch (IOException e) {
                    ((sgt) ((sgt) a.b().i(e)).M(1777)).s("Unable to parse exif from jpeg data.");
                }
                pbmVar3.close();
                String str2 = iarVar.a;
                pbmVar3 = this.e;
                pbm pbmVar4 = new pbm(pbmVar3, "populateExif");
                if (str2 != null) {
                    try {
                        String tagStringValue = exifInterface.getTagStringValue(ExifInterface.TAG_SOFTWARE);
                        tagStringValue.getClass();
                        exifInterface.y(exifInterface.i(ExifInterface.TAG_SOFTWARE, tagStringValue + str2));
                    } finally {
                    }
                }
                gga ggaVar = icjVar2.r;
                ggaVar.b.o();
                new pdb(exifInterface).g(nnp.a(icjVar2.g));
                pdb pdbVar = new pdb(exifInterface);
                Object obj = ggaVar.d;
                pdbVar.h(((kfl) obj).c, exifInterface.a(ExifInterface.Z), exifInterface.a(ExifInterface.G));
                int i2 = ((kfl) obj).b;
                if (i2 >= 0) {
                    int i3 = ExifInterface.aR;
                    if (exifInterface.k(i3) == null) {
                        exifInterface.y(exifInterface.i(i3, new byte[]{2, 2, 0, 0}));
                    }
                    pcz pczVarI = exifInterface.i(ExifInterface.bh, MyBPCgKwEjJI.OEGzTooRRrveKt);
                    pcz pczVarI2 = exifInterface.i(ExifInterface.bi, new pap(i2, 1L));
                    exifInterface.y(pczVarI);
                    exifInterface.y(pczVarI2);
                }
                byte[] bArr2 = ((kfl) obj).d;
                if (bArr2.length > 0) {
                    exifInterface.y(exifInterface.i(ExifInterface.f, new String(bArr2)));
                }
                if (!this.g.p(gzo.bg) && c(icjVar2)) {
                    exifInterface.y(exifInterface.i(ExifInterface.j, Short.valueOf(((pcu) Optional.ofNullable((pcu) c.get(pcu.c(exifInterface))).orElse(pcu.TOP_LEFT)).i)));
                }
                pbmVar4.close();
                this.h.q(exifInterface);
                gga ggaVar2 = icjVar2.r;
                YuvImage yuvImage4 = iasVar.a;
                if (yuvImage4 != null) {
                    yuvImage4.b();
                    yuvImage4.a();
                } else {
                    InterleavedImageU8 interleavedImageU84 = iasVar.b;
                    if (interleavedImageU84 != null) {
                        interleavedImageU84.d();
                        interleavedImageU84.b();
                    }
                }
                mfo mfoVar = new mfo(ppo.c);
                mfoVar.a(exifInterface);
                Optional optional = iarVar.c;
                mfoVar.f = optional;
                Optional optional2 = iarVar.j;
                mfoVar.g = optional2;
                if (iarVar.e) {
                    if (iarVar.d.isPresent()) {
                        Optional optional3 = iarVar.d;
                        String str3 = iarVar.b;
                        Object obj2 = optional3.get();
                        if (str3 != null) {
                            ((lsu) obj2).b.h(str3);
                        }
                        ggaVar2.b.U(bArr, mfoVar, (lsu) obj2);
                    } else {
                        ?? r10 = ggaVar2.b;
                        lsu lsuVarB = r10.k().b("jpg");
                        String str4 = iarVar.b;
                        if (str4 != null) {
                            lsuVarB.b.h(str4);
                        }
                        try {
                            if (optional.isPresent()) {
                                this.f.c(lsuVarB.b, (hqp) optional.get());
                            }
                            long jF = r10.f();
                            jlq jlqVarA = jly.a();
                            jlqVarA.e(optional);
                            jlqVarA.c(optional2);
                            prh.F(jlz.a(bArr, jF, jlqVarA.a()), exifInterface, lsuVarB.b);
                            lsuVarB.b();
                        } catch (IOException e2) {
                            ((sgt) ((sgt) a.b().i(e2)).M((char) 1781)).s("Error writing secondary image to disk");
                            lsuVarB.a();
                        }
                    }
                }
                if (!iarVar.e) {
                    Optional optional4 = iarVar.d;
                    if (optional4.isPresent()) {
                        ggaVar2.b.v(bArr, mfoVar, (lsu) optional4.get());
                    } else {
                        ggaVar2.b.u(bArr, mfoVar);
                    }
                    ((kfl) ggaVar2.d).e.close();
                }
                InterleavedImageU8 interleavedImageU85 = icjVar2.a;
                if (interleavedImageU85 != null) {
                    interleavedImageU85.h();
                }
                YuvImage yuvImage5 = icjVar2.b;
                if (yuvImage5 != null) {
                    yuvImage5.c();
                }
                HardwareBuffer hardwareBuffer = icjVar2.c;
                if (hardwareBuffer != null) {
                    hardwareBuffer.close();
                }
                InterleavedImageU8 interleavedImageU86 = icjVar2.k;
                if (interleavedImageU86 != null) {
                    interleavedImageU86.h();
                }
                YuvImage yuvImage6 = iasVar.a;
                if (yuvImage6 != null) {
                    yuvImage6.c();
                }
                InterleavedImageU8 interleavedImageU87 = iasVar.b;
                if (interleavedImageU87 != null) {
                    interleavedImageU87.h();
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                icjVar.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
