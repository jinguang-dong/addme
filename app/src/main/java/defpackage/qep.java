package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qep {
    public final rwc a;

    static {
        sjd.d("Mp4BoxFileSlicer");
    }

    public qep(rwc rwcVar) {
        this.a = rwcVar;
    }

    public static qep b(FileInputStream fileInputStream) throws IOException {
        long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
        return size < 0 ? new qep(rvk.a) : new qep(rwc.j(new qer(fileInputStream, 0L, size)));
    }

    public static qep c(qer qerVar) {
        return new qep(rwc.j(qerVar));
    }

    public final qep a() throws IOException, qeo {
        rwc rwcVarJ;
        rwc rwcVar = this.a;
        if (!rwcVar.h()) {
            return new qep(rvk.a);
        }
        qer qerVar = (qer) rwcVar.c();
        qeq qeqVarL = qsp.l(qerVar);
        long j = qeqVarL.a;
        if (j != qerVar.a()) {
            throw new qeo(String.format(Locale.US, "contents failed - argument has length %s but claims length of %s", Long.valueOf(qerVar.a()), Long.valueOf(j)));
        }
        int i = true != qeqVarL.b ? 8 : 16;
        qer qerVarB = qerVar.b();
        long j2 = qerVar.d + i;
        if (j2 <= qerVarB.e) {
            qerVarB.e(j2);
            rwcVarJ = rwc.j(qerVarB.c());
        } else {
            rwcVarJ = rvk.a;
        }
        return new qep(rwcVarJ);
    }

    public final qep d(String str) {
        return a().e(str);
    }

    public final qep e(String str) throws qes {
        rwc rwcVar = this.a;
        if (rwcVar.h()) {
            qer qerVarB = ((qer) rwcVar.c()).b();
            byte[] bArrA = qet.a(str);
            qer qerVar = null;
            while (true) {
                qer qerVarM = qsp.m(qerVarB);
                if (qerVarM != null) {
                    if (Arrays.equals(qsp.n(qerVarM), bArrA)) {
                        if (qerVar != null) {
                            break;
                        }
                        qerVar = qerVarM;
                    }
                } else if (qerVar != null) {
                    return new qep(rwc.j(qerVar));
                }
            }
        }
        return new qep(rvk.a);
    }

    public final qer f() {
        return (qer) this.a.c();
    }
}
