package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lmm extends lmp {
    private static final sgv a = sgv.g("lmm");
    private final pmi b;

    public lmm(lmg lmgVar, Executor executor, lly llyVar, lss lssVar, pmi pmiVar) {
        super(lmgVar, executor, llyVar, 4, lssVar);
        this.b = pmiVar;
    }

    public static final int a(poj pojVar, ByteBuffer byteBuffer, Rect rect) {
        return JpegUtilNative.a(pojVar, byteBuffer, rect, pao.CLOCKWISE_0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw nwVar;
        pmk pmkVarC;
        ByteBuffer byteBufferWrap;
        int iA;
        ExifInterface exifInterfaceA;
        mdm mdmVarO;
        mdm mdmVarO2 = this.f.o();
        mdmVarO2.getClass();
        ((mdo) mdmVarO2).b = SystemClock.elapsedRealtime();
        lmg lmgVar = this.e;
        poj pojVar = lmgVar.a;
        int iA2 = pojVar.a();
        if (iA2 == 35) {
            poj pojVar2 = lmgVar.a;
            Rect rect = lmgVar.e;
            Rect rectI = i(pojVar2, rect);
            try {
                pao paoVar = lmgVar.b;
                pojVar2.c();
                pojVar2.b();
                pas pasVar = new pas(rectI.width(), rectI.height());
                nwVar = new nw(paoVar, pasVar.a, pasVar.b);
                j(this.d, nwVar, 3);
                int i = ((nwVar.a * 3) * nwVar.b) / 2;
                int i2 = i / 2;
                pmi pmiVar = this.b;
                pmk pmkVarC2 = pmiVar.c(Integer.valueOf(i2));
                ByteBuffer byteBuffer = (ByteBuffer) pmkVarC2.a();
                if (byteBuffer == null) {
                    this.f.F(nfo.a, new hht("Failed to allocate jpeg buffer for encoding."));
                    pmkVarC2.close();
                } else {
                    int iA3 = a(pojVar2, byteBuffer, rect);
                    if (iA3 > i2) {
                        pmkVarC2.close();
                        pmkVarC = pmiVar.c(Integer.valueOf(i));
                        ByteBuffer byteBuffer2 = (ByteBuffer) pmkVarC.a();
                        if (byteBuffer2 == null) {
                            this.f.F(nfo.a, new hht("Failed to allocate jpeg buffer for encoding."));
                            pmkVarC.close();
                        } else {
                            iA = a(pojVar2, byteBuffer2, rect);
                            byteBufferWrap = byteBuffer2;
                        }
                    } else {
                        pmkVarC = pmkVarC2;
                        byteBufferWrap = byteBuffer;
                        iA = iA3;
                    }
                    if (iA < 0) {
                        pmkVarC.close();
                        throw new RuntimeException("Error compressing jpeg.");
                    }
                    byteBufferWrap.limit(iA);
                    this.h.b(lmgVar.a, this.c);
                    exifInterfaceA = pdb.b().a;
                    exifInterfaceA.x(ExifInterface.s, this.e.k, TimeZone.getDefault());
                }
                this.h.b(pojVar2, this.c);
                return;
            } finally {
            }
        }
        if (iA2 != 256) {
            this.h.b(lmgVar.a, this.c);
            throw new IllegalArgumentException("Unsupported input image format for TaskCompressImageToJpeg");
        }
        try {
            ByteBuffer buffer = ((poi) pojVar.g().get(0)).getBuffer();
            int iLimit = buffer.limit();
            byte[] bArr = new byte[iLimit];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            buffer.rewind();
            byteBufferWrap.put(buffer);
            buffer.rewind();
            byteBufferWrap.rewind();
            exifInterfaceA = pdb.a(bArr);
            pcu pcuVarC = pcu.c(exifInterfaceA);
            Integer numB = exifInterfaceA.b(ExifInterface.ai);
            numB.getClass();
            numB.intValue();
            Integer numB2 = exifInterfaceA.b(ExifInterface.aj);
            numB2.getClass();
            numB2.intValue();
            pao paoVarA = pcu.a(pcuVarC);
            pao paoVarB = pao.b(lmgVar.b.e + paoVarA.e);
            int iIntValue = numB.intValue();
            int iIntValue2 = numB2.intValue();
            Rect rect2 = lmgVar.e;
            Rect rectH = h(iIntValue, iIntValue2, (paoVarB == pao.CLOCKWISE_0 || paoVarB == pao.c) ? new Rect(rect2) : new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right));
            nwVar = new nw(paoVarA, iIntValue, iIntValue2);
            poj pojVar3 = lmgVar.a;
            if (!rectH.equals(new Rect(0, 0, pojVar3.c(), pojVar3.b()))) {
                nwVar = new nw(paoVarA, rectH.width(), rectH.height());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(BitmapFactory.decodeByteArray(bArr, 0, iLimit), rectH.left, rectH.top, rectH.width(), rectH.height());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteBufferWrap = ByteBuffer.allocate(byteArray.length);
                byteBufferWrap.put(ByteBuffer.wrap(byteArray));
                byteBufferWrap.rewind();
            }
            this.h.b(lmgVar.a, this.c);
            j(this.d, nwVar, 3);
            byteBufferWrap.getClass();
            iA = byteBufferWrap.limit();
            pmkVarC = null;
        } catch (OutOfMemoryError unused) {
            this.f.F(nfo.a, new hht("Failed to allocate jpeg buffer for encoding."));
            return;
        } finally {
        }
        byte[] bArr2 = new byte[iA];
        byteBufferWrap.getClass();
        byteBufferWrap.get(bArr2);
        byteBufferWrap.rewind();
        if (pmkVarC != null) {
            pmkVarC.close();
        }
        this.h.k.c(new lmo(this.d, nwVar, 3), new lpa());
        rwc rwcVarI = rwc.i(exifInterfaceA);
        syu syuVar = lmgVar.c;
        pdb pdbVar = rwcVarI.h() ? new pdb((ExifInterface) rwcVarI.c()) : pdb.b();
        pdbVar.f(nwVar.a, nwVar.b, (pao) nwVar.c, rwc.i((pnx) ojl.ci(syuVar)));
        lss lssVar = this.f;
        mdm mdmVarO3 = lssVar.o();
        mdmVarO3.getClass();
        ExifInterface exifInterface = pdbVar.a;
        ((mdo) mdmVarO3).l = exifInterface;
        mfo mfoVar = new mfo(ppo.c);
        mfoVar.a(exifInterface);
        ojl.cj(lssVar.u(bArr2, mfoVar), new fct(this, nwVar, 9));
        try {
            if (!syuVar.isDone()) {
                ((sgt) a.c().M(4236)).s("CaptureResults unavailable to photoCaptureDoneEvent event.");
                return;
            }
            mdm mdmVarO4 = lssVar.o();
            mdmVarO4.getClass();
            mdmVarO4.c((pnx) syuVar.get(), false);
        } catch (InterruptedException unused2) {
            ((sgt) a.b().M(4237)).s("CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
        } catch (ExecutionException unused3) {
            ((sgt) a.c().M(4238)).s(mPfBwqXsnpXI.dsSGI);
        } finally {
            mdmVarO = this.f.o();
            mdmVarO.getClass();
            mdmVarO.e(SystemClock.elapsedRealtime());
        }
    }
}
