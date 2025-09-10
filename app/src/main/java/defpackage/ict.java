package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ict implements ida {
    private static final sgv a = sgv.g("ict");
    private final boolean b;
    private final hbj c;

    public ict(hbj hbjVar) throws NumberFormatException {
        this.c = hbjVar;
        Optional optionalA = hbjVar.a(gzs.a);
        boolean z = false;
        if (optionalA.isPresent()) {
            if (((Integer) optionalA.get()).equals(Integer.valueOf(gzr.SHUTTER_ASAP.ordinal())) && nvj.g != null) {
                z = true;
            }
        }
        this.b = z;
    }

    private static void c(ByteArrayOutputStream byteArrayOutputStream, String str, byte[] bArr) {
        byteArrayOutputStream.write(str.getBytes());
        byteArrayOutputStream.write(bArr);
    }

    @Override // defpackage.ida
    public final rwc a(poe poeVar) {
        rwc rwcVarJ;
        if (poeVar == null) {
            ((sgt) a.c().M(1853)).s("3A_DEBUG captureResult is null");
            rwcVarJ = rvk.a;
        } else {
            gzi gziVar = gzs.a;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                CaptureResult.Key key = nvj.h;
                rwc rwcVarI = key != null ? rwc.i((byte[]) poeVar.a(key)) : rvk.a;
                if (rwcVarI.h()) {
                    c(byteArrayOutputStream, "aecDebug", (byte[]) rwcVarI.c());
                }
                CaptureResult.Key key2 = nvj.i;
                rwc rwcVarI2 = key2 != null ? rwc.i((byte[]) poeVar.a(key2)) : rvk.a;
                if (rwcVarI2.h()) {
                    c(byteArrayOutputStream, "afDebug", (byte[]) rwcVarI2.c());
                }
                CaptureResult.Key key3 = nvj.j;
                rwc rwcVarI3 = key3 != null ? rwc.i((byte[]) poeVar.a(key3)) : rvk.a;
                if (rwcVarI3.h()) {
                    c(byteArrayOutputStream, "awbDebug", (byte[]) rwcVarI3.c());
                }
                rwcVarJ = rwc.j(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                ((sgt) ((sgt) a.c().i(e)).M(1843)).v("Ignoring unexpected exception %s", e);
                rwcVarJ = rvk.a;
            }
        }
        if (this.b && !rwcVarJ.h()) {
            ((sgt) a.c().M(1852)).s("3A_DEBUG 3A debug metadata is expected but missing!");
            gzi gziVar2 = gzo.a;
        }
        return rwcVarJ;
    }

    @Override // defpackage.ida
    public final InputStream b(poe poeVar, InputStream inputStream, rwc rwcVar, ltd ltdVar) throws IOException {
        rwc rwcVarA = a(poeVar);
        if (!rwcVarA.h()) {
            int i = ltdVar.a;
            return inputStream;
        }
        idc.a((byte[]) rwcVarA.c(), rwcVar);
        int i2 = ltdVar.a;
        rwcVarA.c();
        return new SequenceInputStream(inputStream, new ByteArrayInputStream((byte[]) rwcVarA.c()));
    }
}
