package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class add implements uiq {
    private final /* synthetic */ int a;

    public /* synthetic */ add(int i) {
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                break;
            case 2:
                int i = ads.a;
                ((uif) obj).a();
                break;
            case 3:
                break;
            case 4:
                if (!((Context) bay.J((bfk) obj, AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    break;
                } else {
                    break;
                }
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ((Long) obj).longValue();
                break;
            case 9:
                break;
            case 10:
                ((Integer) obj).intValue();
                break;
            case 11:
                break;
            case 12:
                Long l = (Long) obj;
                l.longValue();
                break;
            case 13:
                ccl cclVar = (ccl) obj;
                Object obj2 = cclVar.a;
                if (obj2 instanceof ccu) {
                    obj2.getClass();
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cbz cbzVar = cbu.x;
                ufg ufgVar = ufg.a;
                ((cbn) obj).e(cbzVar, ufgVar);
                break;
            case 15:
                cbw.g((cbn) obj, 0);
                break;
            case 16:
                int i2 = asi.a;
                break;
            case 17:
                cbw.g((cbn) obj, 0);
                break;
            case 18:
                uld[] uldVarArr = cbw.a;
                cbz cbzVar2 = cbu.l;
                uld uldVar = cbw.a[5];
                ((cbn) obj).e(cbzVar2, true);
                break;
            case 19:
                break;
            default:
                cbw.g((cbn) obj, 0);
                break;
        }
        return ufg.a;
    }
}
