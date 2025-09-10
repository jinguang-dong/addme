package wireless.android.learning.acmi.p11.metadata;

import android.content.pm.PackageInfo;
import android.hardware.camera2.CameraCharacteristics;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.StaticMetadataVector;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;
import defpackage.gzi;
import defpackage.gzs;
import defpackage.npd;
import defpackage.paw;
import defpackage.pjn;
import defpackage.pjo;
import defpackage.pjp;
import defpackage.pjr;
import defpackage.pka;
import defpackage.sbr;
import defpackage.sbv;
import defpackage.scn;
import defpackage.sfd;
import defpackage.sfm;
import defpackage.sgj;
import defpackage.tcy;
import defpackage.vds;
import j$.util.Map;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class P11MetadataSerializer implements vds {
    private static final sbv f;
    public final StaticMetadataVector a;
    public final NativeMetadataConverter b;
    public final pjo c;
    public final pjp d;
    private final Map g = new HashMap();
    public final AtomicInteger e = new AtomicInteger(0);

    static {
        paw.a(P11MetadataSerializer.class, "p11metaserializer");
        sbr sbrVar = new sbr();
        sbrVar.f(tcy.b, new sfm(tcy.f));
        f = sbrVar.b();
    }

    public P11MetadataSerializer(pjp pjpVar, pjr pjrVar, PackageInfo packageInfo) {
        this.d = pjpVar;
        StaticMetadataVector staticMetadataVector = new StaticMetadataVector();
        pka[] pkaVarArr = {pka.BACK, pka.FRONT};
        for (int i = 0; i < 2; i++) {
            for (pjr pjrVar2 : pjpVar.h(pkaVarArr[i])) {
                if (pjrVar2 != null && pjrVar2.a != null) {
                    pjo pjoVarA = pjpVar.a(pjrVar2);
                    int[] iArr = (int[]) pjoVarA.n(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, new int[0]);
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (iArr[i2] == 3) {
                            Iterator it = ((pjn) pjoVarA).b.iterator();
                            while (it.hasNext()) {
                                StaticMetadata staticMetadataZ = NativeMetadataConverter.z(pjpVar.a((pjr) it.next()));
                                staticMetadataZ.n(packageInfo.packageName);
                                staticMetadataZ.o(packageInfo.versionName);
                                staticMetadataVector.c(staticMetadataZ);
                                sgj sgjVarListIterator = ((scn) f.getOrDefault(staticMetadataZ.g(), sfd.a)).listIterator();
                                while (sgjVarListIterator.hasNext()) {
                                    tcy tcyVar = (tcy) sgjVarListIterator.next();
                                    StaticMetadata staticMetadata = new StaticMetadata(staticMetadataZ);
                                    staticMetadata.r(tcyVar);
                                    staticMetadataVector.c(staticMetadata);
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        this.a = staticMetadataVector;
        pjo pjoVarA2 = pjpVar.a(pjrVar);
        this.c = pjoVarA2;
        this.b = new NativeMetadataConverter(pjoVarA2, pjpVar);
        gzi gziVar = gzs.a;
    }

    public static native ByteBuffer nativeSerializeGlobalMetadata(int i, int i2, int i3, int i4, boolean z, int i5, byte[] bArr, float[] fArr, long j);

    public static native ByteBuffer nativeSerializeImageMetadata(long j, float f2, int i, int i2, int i3, int i4, int i5, float[] fArr, float[] fArr2, float[] fArr3, int i6, int i7, int i8, int i9, float f3, float f4, float[] fArr4, int i10, float[] fArr5, float[] fArr6, float f5, float[] fArr7, float[] fArr8, int[] iArr, long[][] jArr, float[][] fArr9, float[][] fArr10, float f6, float f7, int i11, float f8, float f9, float f10, float f11, boolean z, long j2, long j3);

    public final synchronized tcy a(String str) {
        return (tcy) Map.EL.computeIfAbsent(this.g, str, new npd(this, 13));
    }
}
