package defpackage;

import androidx.wear.ambient.SharedLibraryVersion;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drw {
    public static final cdo a;
    public static final ayp b;
    private static final chb c;

    static {
        chb chbVar = new chb(cha.a);
        c = chbVar;
        a = cdo.w(cdo.a, 0L, null, null, "pnum", 0L, 0L, new cdg(), chbVar, chj.b, 6815679);
        b = new bbp(new drg(4));
    }

    public static final cdo a(cdo cdoVar, cfd cfdVar) {
        return cdoVar.l() != null ? cdoVar : cdo.w(cdoVar, 0L, null, cfdVar, null, 0L, 0L, null, null, null, 16777183);
    }

    public static final djw b(djw djwVar, cfd cfdVar) {
        return djwVar.d != null ? djwVar : djw.b(djwVar, 0L, cfdVar, null, 0L, 0L, 0L, 1015);
    }

    public static final cdo c(int i, ayc aycVar) {
        int i2 = i - 1;
        drv drvVarJ = SharedLibraryVersion.j(aycVar);
        switch (i2) {
            case 8:
                return drvVarJ.i;
            case 9:
                return drvVarJ.j;
            case 10:
                return drvVarJ.o;
            case 11:
            default:
                return drvVarJ.s;
            case 12:
                return drvVarJ.p;
            case 13:
                return drvVarJ.q;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return drvVarJ.r;
            case 15:
                return drvVarJ.e;
            case 16:
                return drvVarJ.f;
        }
    }
}
