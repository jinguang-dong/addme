package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.libraries.camera.exif.ExifInterface;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lri {
    public final int a;
    public final int b;
    private final UUID c;
    private final int d;
    private final long e;
    private final lgn f;
    private final ltf g;
    private final byte[] h;
    private final ExifInterface i;
    private final hbj j;

    public lri(int i, long j, UUID uuid, int i2, int i3, byte[] bArr, ExifInterface exifInterface, lgn lgnVar, ltf ltfVar, hbj hbjVar) {
        this.d = i;
        this.e = j;
        this.c = uuid;
        this.a = i2;
        this.b = i3;
        this.h = bArr;
        this.i = exifInterface;
        this.f = lgnVar;
        this.g = ltfVar;
        this.j = hbjVar;
    }

    public final mfo a(lsu lsuVar, rwc rwcVar, rwc rwcVar2) throws IOException {
        mfo mfoVar = new mfo(ppo.c);
        try {
            FileOutputStream fileOutputStreamE = lsuVar.b.e();
            try {
                b(rwcVar, rwcVar2, lsuVar.d, lsuVar.c.e(), fileOutputStreamE);
                fileOutputStreamE.close();
                lsuVar.b();
                return mfoVar;
            } finally {
            }
        } catch (IOException e) {
            lsuVar.a();
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [edw, java.lang.Object] */
    public final void b(rwc rwcVar, rwc rwcVar2, boolean z, String str, OutputStream outputStream) {
        edw edwVarA;
        ltf ltfVar;
        ExifInterface exifInterface = this.i;
        OutputStream outputStreamM = exifInterface.m(outputStream);
        try {
            byte[] bArr = this.h;
            rwc rwcVar3 = this.f.c;
            edw edwVarA2 = null;
            if (rwcVar3.h()) {
                byte[] bArrD = DynamicDepthUtils.d(bArr, (DynamicDepthResult) rwcVar3.c(), null);
                ((DynamicDepthResult) rwcVar3.c()).close();
                if (bArrD != null) {
                    bArr = bArrD;
                }
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            rwd rwdVarE = pqw.e(byteArrayInputStream);
            if (rwdVarE != null && rwdVarE.a != null) {
                edwVarA = (edw) rwdVarE.a;
                byteArrayInputStream.reset();
            } else if (rnt.V(exifInterface.bz)) {
                edwVarA = null;
            } else {
                try {
                    byte[] bytes = exifInterface.bz.getBytes();
                    gga ggaVar = edy.a;
                    edwVarA = eel.a(bytes);
                } catch (edv unused) {
                }
            }
            if (rwdVarE == null || rwdVarE.b == null) {
                ExifInterface exifInterface2 = this.i;
                if (!rnt.V(exifInterface2.bA)) {
                    try {
                        byte[] bytes2 = exifInterface2.bA.getBytes();
                        gga ggaVar2 = edy.a;
                        edwVarA2 = eel.a(bytes2);
                    } catch (edv unused2) {
                    }
                }
            } else {
                edwVarA2 = (edw) rwdVarE.b;
                byteArrayInputStream.reset();
            }
            lgn lgnVar = this.f;
            if (lgnVar.c.h()) {
                rwc rwcVar4 = lgnVar.b;
                if (rwcVar4.h()) {
                    edwVarA2 = pqw.b(edwVarA2, (edw) rwcVar4.f());
                }
            } else {
                rwc rwcVar5 = lgnVar.a;
                if (rwcVar5.h()) {
                    edwVarA = pqw.b(edwVarA, rwcVar5.c());
                    edwVarA2 = pqw.b(edwVarA2, (edw) lgnVar.b.f());
                } else {
                    edwVarA2 = pqw.b(edwVarA2, (edw) lgnVar.b.f());
                }
            }
            edw eekVar = edwVarA;
            hbj hbjVar = this.j;
            if (hbjVar != null && hbjVar.p(hak.H) && (ltfVar = this.g) != null && ltfVar == ltf.PORTRAIT) {
                if (eekVar == null) {
                    gga ggaVar3 = edy.a;
                    eekVar = new eek();
                }
                pqw.p(eekVar, str);
            } else if (eekVar == null) {
                gga ggaVar4 = edy.a;
                eek eekVar2 = new eek();
                jea.d(this.c, Optional.empty(), z, str, !z, eekVar2);
                eekVar = eekVar2;
            } else {
                jea.d(this.c, Optional.empty(), z, str, !z, eekVar);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            pqw.q(new pqt(byteArrayInputStream), byteArrayOutputStream, eekVar, edwVarA2);
            outputStreamM.write(byteArrayOutputStream.toByteArray());
            if (rwcVar.h()) {
                if (rwcVar2.h()) {
                    idc.b((byte[]) rwcVar.c(), (String) rwcVar2.c());
                }
                rwcVar.c();
                outputStreamM.write((byte[]) rwcVar.c());
            }
            outputStreamM.close();
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lri) {
            lri lriVar = (lri) obj;
            if (this.e == lriVar.e && this.a == lriVar.a && this.b == lriVar.b && this.d == lriVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return String.format("%d_%dx%d_%d", Long.valueOf(this.e), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.d)).hashCode();
    }

    public final String toString() {
        return "BurstMemoryImage[" + this.e + "]";
    }
}
