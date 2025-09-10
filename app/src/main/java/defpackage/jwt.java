package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import com.google.ar.core.R;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jwt extends Thread {
    final /* synthetic */ jxa a;

    public jwt(jxa jxaVar) {
        this.a = jxaVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        jxa jxaVar = this.a;
        Bitmap bitmap = ((BitmapDrawable) jxaVar.m.getResources().getDrawable(jxaVar.O == 1 ? R.drawable.ic_photosphere_processing : R.drawable.ic_panorama_processing)).getBitmap();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArrayOutputStream.close();
            lsi lsiVar = jxaVar.k.b;
            lsiVar.Z(new pas(0, 0));
            lsiVar.X(new nfp(R.string.processing_photo_sphere, new Object[0]));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            lsiVar.ae(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, new BitmapFactory.Options()), 0);
            jxaVar.U.c(lsiVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - jxaVar.M;
            lta ltaVar = lsiVar.d;
            if (!ltaVar.b()) {
                throw new IOException("Temporary session file not usable.");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(ltaVar.a());
            try {
                byteArrayOutputStream.writeTo(fileOutputStream);
                fileOutputStream.close();
                jxa jxaVar2 = this.a;
                jxaVar2.k.b.O();
                ssc sscVar = ssc.PHOTO_SPHERE;
                mdy mdyVar = jxaVar2.X;
                int i = jxaVar2.q;
                int i2 = jxaVar2.L;
                float f = jElapsedRealtime;
                tpc tpcVarM = sst.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                sst sstVar = (sst) tphVar;
                sstVar.b |= 2;
                sstVar.c = i;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                sst sstVar2 = (sst) tphVar2;
                sstVar2.b |= 4;
                sstVar2.d = i2;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                sst sstVar3 = (sst) tphVar3;
                sstVar3.b |= 8;
                sstVar3.e = f * 0.001f;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                sst sstVar4 = (sst) tpcVarM.b;
                sstVar4.f = 3;
                sstVar4.b |= 16;
                mdyVar.a(sscVar, (sst) tpcVarM.l(), null, null, null);
            } finally {
            }
        } catch (IOException unused) {
            ((sgt) jxa.a.b().M(3095)).s("Could not write temporary panorama image.");
        }
    }
}
