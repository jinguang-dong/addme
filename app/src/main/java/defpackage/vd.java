package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements uiq {
    private final /* synthetic */ int a;

    public /* synthetic */ vd(int i) {
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                ((List) obj).getClass();
                return ufg.a;
            case 1:
                ((ufg) obj).getClass();
                return false;
            case 2:
                return new aca(((Float) obj).floatValue());
            case 3:
                return new aca(((Integer) obj).intValue());
            case 4:
                return Integer.valueOf((int) ((aca) obj).a);
            case 5:
                return new aca(((cht) obj).a);
            case 6:
                return new cht(((aca) obj).a);
            case 7:
                long j = ((chu) obj).a;
                return new acb(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 8:
                float f = ((acb) obj).a;
                return new chu((Float.floatToRawIntBits(r7.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 9:
                long j2 = ((bki) obj).a;
                return new acb(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 10:
                float f2 = ((acb) obj).a;
                return new bki((Float.floatToRawIntBits(r7.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            case 11:
                long j3 = ((bkf) obj).a;
                return new acb(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            case 12:
                float f3 = ((acb) obj).a;
                return new bkf((Float.floatToRawIntBits(r7.b) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
            case 13:
                long j4 = ((chy) obj).a;
                return new acb(chy.a(j4), chy.b(j4));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                acb acbVar = (acb) obj;
                return new chy((Math.round(acbVar.b) & 4294967295L) | (Math.round(acbVar.a) << 32));
            case 15:
                long j5 = ((cia) obj).a;
                return new acb((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 16:
                acb acbVar2 = (acb) obj;
                int iRound = Math.round(acbVar2.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                return new cia((iRound << 32) | (Math.round(acbVar2.b) >= 0 ? r7 : 0));
            case 17:
                bkg bkgVar = (bkg) obj;
                return new acd(bkgVar.b, bkgVar.c, bkgVar.d, bkgVar.e);
            case 18:
                acd acdVar = (acd) obj;
                return new bkg(acdVar.a, acdVar.b, acdVar.c, acdVar.d);
            case 19:
                return Float.valueOf(((aca) obj).a);
            default:
                bfk bfkVar = (bfk) obj;
                int i = aes.a;
                Context context = (Context) bay.J(bfkVar, AndroidCompositionLocals_androidKt.b);
                chq chqVar = (chq) bay.J(bfkVar, bze.c);
                afw afwVar = (afw) bay.J(bfkVar, afx.a);
                if (afwVar == null) {
                    return null;
                }
                return new aer(context, chqVar, afwVar.a, afwVar.b);
        }
    }
}
