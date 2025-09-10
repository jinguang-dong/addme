package defpackage;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjt implements Runnable {
    final /* synthetic */ kju a;
    private final lmg b;
    private final szh c;

    public kjt(kju kjuVar, lmg lmgVar, szh szhVar) {
        this.a = kjuVar;
        this.b = lmgVar;
        this.c = szhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsDone;
        kju kjuVar;
        lmg lmgVar;
        pbn pbnVar;
        int iWidth;
        int i;
        pmi pmiVar;
        pmk pmkVarC;
        ByteBuffer byteBuffer;
        try {
            try {
                kjuVar = this.a;
                lmgVar = this.b;
                pbnVar = kjuVar.d;
                pbnVar.f("allocateAndCompressJpeg");
                Rect rect = lmgVar.e;
                iWidth = ((rect.width() * 3) * rect.height()) / 2;
                i = iWidth / 2;
                pmiVar = kjuVar.b;
                pmkVarC = pmiVar.c(Integer.valueOf(i));
                try {
                    byteBuffer = (ByteBuffer) pmkVarC.a();
                } catch (Throwable th) {
                    pmkVarC.close();
                    throw th;
                }
            } catch (Exception e) {
                this.c.a(e);
            }
            if (byteBuffer == null) {
                throw new RuntimeException(a.bE(i, "Failed to allocate buffer for JPEG: ", " bytes"));
            }
            lpr lprVar = kjuVar.c;
            int iB = lprVar.b(lmgVar, byteBuffer.duplicate());
            if (iB > i) {
                pmkVarC.close();
                pmkVarC = pmiVar.c(Integer.valueOf(iWidth));
                byteBuffer = (ByteBuffer) pmkVarC.a();
                if (byteBuffer == null) {
                    throw new RuntimeException(a.bE(iWidth, "Failed to allocate buffer for JPEG: ", " bytes"));
                }
                iB = lprVar.b(lmgVar, byteBuffer.duplicate());
            }
            if (iB <= 0) {
                throw new RuntimeException(a.bv(iB, "Error compressing jpeg: num bytes written was "));
            }
            byteBuffer.position(0);
            byteBuffer.limit(iB);
            byteBuffer.order(ByteOrder.nativeOrder());
            byte[] bArr = new byte[iB];
            byteBuffer.get(bArr);
            pbnVar.g();
            pmkVarC.close();
            pdb pdbVarB = pdb.b();
            lmg lmgVar2 = this.b;
            syu syuVar = lmgVar2.c;
            syuVar.getClass();
            poe poeVar = (poe) syuVar.get();
            pas pasVarF = pas.f(lmgVar2.e);
            kju kjuVar2 = this.a;
            pdbVarB.f(pasVarF.a, pasVarF.b, kjuVar2.c.a(lmgVar2), rwc.j(poeVar));
            pdbVarB.g(lmgVar2.k);
            this.c.e(kjd.a(lmgVar2.a.d(), bArr, pasVarF, pdbVarB.a, kjuVar2.e));
            if (zIsDone) {
                return;
            }
        } finally {
            szh szhVar = this.c;
            if (!szhVar.isDone() && !szhVar.isCancelled()) {
                szhVar.a(new RuntimeException("Unknown error while encoding imageToProcess"));
            }
        }
    }
}
