package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.HardwareBuffer;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageio.JpgHelper;
import com.google.googlex.gcam.imageproc.Resample;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class icn implements Runnable {
    final /* synthetic */ icp a;
    private final szh b;
    private final boolean c;
    private final ShotMetadata d;
    private final int e;
    private final long f;
    private final rwc g;
    private final fse h;
    private final boolean i;
    private final obu j;

    public icn(icp icpVar, obu obuVar, szh szhVar, boolean z, ShotMetadata shotMetadata, int i, long j, rwc rwcVar, fse fseVar, boolean z2) {
        this.a = icpVar;
        this.j = obuVar;
        this.b = szhVar;
        this.c = z;
        this.d = shotMetadata;
        this.e = i;
        this.f = j;
        this.g = rwcVar;
        this.h = fseVar;
        this.i = z2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [sgt, shi] */
    @Override // java.lang.Runnable
    public final void run() {
        InterleavedReadViewU8 interleavedReadViewU8A;
        pas pasVar;
        obu obuVar = this.j;
        rwc rwcVar = (rwc) obuVar.b;
        if (rwcVar.h()) {
            interleavedReadViewU8A = ((InterleavedImageU8) rwcVar.c()).f();
        } else {
            rwc rwcVar2 = (rwc) obuVar.a;
            if (!rwcVar2.h()) {
                return;
            } else {
                interleavedReadViewU8A = new LockedHardwareBuffer((HardwareBuffer) rwcVar2.c(), 3L).a();
            }
        }
        pas pasVar2 = new pas(interleavedReadViewU8A.d(), interleavedReadViewU8A.c());
        boolean z = this.c;
        tcd tcdVar = tcd.b;
        if (z) {
            ShotMetadata shotMetadata = this.d;
            int i = pasVar2.a;
            int i2 = pasVar2.b;
            tcd tcdVarE = shotMetadata.e();
            int[] iArrA = Resample.a(i, i2, tcdVarE);
            pas pasVar3 = new pas(iArrA[0], iArrA[1]);
            ske.w(shotMetadata, 60);
            tcdVar = tcdVarE;
            pasVar = pasVar3;
        } else {
            pasVar = pasVar2;
        }
        icp icpVar = this.a;
        boolean z2 = this.i;
        pka pkaVarL = icpVar.d.l();
        if (z2) {
            ske.v(this.d);
        }
        JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
        String str = (String) this.g.b(new idb(1)).e("");
        if (!str.isEmpty()) {
            this.d.j(str);
        }
        jpgEncodeOptions.b(this.d);
        rwc rwcVarA = JpgHelper.a(interleavedReadViewU8A, jpgEncodeOptions, tcdVar);
        if (!rwcVarA.h()) {
            ((sgt) icp.a.b().M(1835)).s("Error encoding burst image");
            this.b.a(new RuntimeException("Image couldn't be encoded."));
            return;
        }
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.r((byte[]) rwcVarA.c(), true);
        } catch (IOException e) {
            ((sgt) ((sgt) icp.a.b().i(e)).M((char) 1837)).s("Unable to parse exif from jpeg data.");
        }
        if (this.i) {
            Bitmap bitmapDecodeByteArray = null;
            if (exifInterface.bB.f()) {
                byte[] bArr = exifInterface.bB.b;
                if (bArr != null) {
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
            } else {
                exifInterface.bB.g();
            }
            if (bitmapDecodeByteArray != null) {
                Bitmap bitmapAp = ocq.ap(bitmapDecodeByteArray, pcu.a(pcu.c(exifInterface)).e, false);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmapAp.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream)) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    exifInterface.bB.e();
                    exifInterface.bB.b = byteArray;
                }
            }
        }
        pdb pdbVar = new pdb(exifInterface);
        pdbVar.g(this.f);
        pdbVar.h(pkaVarL, exifInterface.a(ExifInterface.Z), exifInterface.a(ExifInterface.G));
        fse fseVar = this.h;
        if (fseVar.b().h()) {
            pdbVar.d((Location) fseVar.b().c());
        }
        this.a.f.q(exifInterface);
        this.b.e(kjd.a((this.d.b() / 1000) + this.e, (byte[]) rwcVarA.c(), pasVar, exifInterface, null));
    }
}
