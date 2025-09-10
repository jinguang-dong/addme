package defpackage;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ghh {
    private static final sgv a = sgv.g("ghh");
    private final jid b;
    private final gno c;
    private final ocq d;
    private final gtm e;

    public ghh(gtm gtmVar, jid jidVar, ocq ocqVar, gno gnoVar) {
        this.e = gtmVar;
        this.b = jidVar;
        this.d = ocqVar;
        this.c = gnoVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [sgt, shi] */
    public final gbu a(byte[] bArr, pao paoVar, pka pkaVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.q(bArr);
        } catch (IOException unused) {
            ((sgt) a.b().M(899)).s("fail to read EXIF from JPEG byte array.");
        }
        Integer numB = exifInterface.b(ExifInterface.ai);
        int iIntValue = numB != null ? numB.intValue() : 0;
        Integer numB2 = exifInterface.b(ExifInterface.aj);
        int iIntValue2 = numB2 != null ? numB2.intValue() : 0;
        int i = ExifInterface.b;
        if (exifInterface.k(i) == null || exifInterface.k(ExifInterface.a) == null) {
            exifInterface.y(exifInterface.i(ExifInterface.a, Integer.valueOf(iIntValue)));
            exifInterface.y(exifInterface.i(i, Integer.valueOf(iIntValue2)));
        }
        int i2 = ExifInterface.j;
        if (exifInterface.k(i2) == null) {
            exifInterface.y(exifInterface.i(i2, Short.valueOf(pcu.b(paoVar).i)));
        }
        pdb pdbVar = new pdb(exifInterface);
        pdbVar.g(jCurrentTimeMillis);
        Object obj = this.e.a;
        rwc rwcVarD = rvk.a;
        if (((Boolean) ((luj) obj).b(luf.b)).booleanValue()) {
            rwcVarD = this.b.d();
            if (rwcVarD.h()) {
                pdbVar.d((Location) rwcVarD.c());
            }
        }
        pdbVar.h(pkaVar, exifInterface.a(ExifInterface.Z), exifInterface.a(ExifInterface.G));
        this.d.q(exifInterface);
        gno gnoVar = this.c;
        Object obj2 = gnoVar.b;
        Object obj3 = gnoVar.a;
        lsw lswVarU = ((qqq) obj2).u(System.currentTimeMillis(), false);
        lsu lsuVarA = lswVarU.a("jpg");
        try {
            pos posVar = lsuVarA.b;
            long jE = prh.E(bArr, exifInterface, posVar);
            rnt.Q(jE > 0, "Expected to write a positive number of bytes to %s, instead wrote %s from byteArray of size %s", posVar, Long.valueOf(jE), Integer.valueOf(bArr.length));
            pao paoVarA = pcu.a(pcu.c(exifInterface));
            gbu gbuVar = new gbu(null);
            gbuVar.b = new File("");
            gbuVar.a = exifInterface;
            gbuVar.c = lsuVarA;
            gbuVar.d = lswVarU;
            gbuVar.e = rwcVarD;
            ppo ppoVar = ppo.c;
            ppoVar.getClass();
            gbuVar.f = ppoVar;
            gbuVar.g = new pas(iIntValue, iIntValue2);
            gbuVar.h = paoVarA.e;
            byte b = gbuVar.k;
            gbuVar.i = jCurrentTimeMillis;
            gbuVar.k = (byte) (b | 3);
            return gbuVar;
        } catch (IOException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 898)).s("Failed to create file: ");
            throw e;
        }
    }
}
