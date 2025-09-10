package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.window.sidecar.SidecarDisplayFeature;
import com.google.ar.core.R;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axa implements uiq {
    private final /* synthetic */ int a;

    public /* synthetic */ axa(int i) {
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                bxd bxdVar = (bxd) obj;
                bxdVar.getClass();
                throw null;
            case 1:
                return ufg.a;
            case 2:
                bxd bxdVar2 = (bxd) obj;
                bxdVar2.getClass();
                throw null;
            case 3:
                int i = cco.a;
                return Boolean.valueOf(!(((cci) obj) instanceof cdb));
            case 4:
                ccy ccyVar = (ccy) obj;
                return "[" + ccyVar.a + ", " + ccyVar.b + ')';
            case 5:
                cfl cflVar = (cfl) obj;
                ThreadLocal threadLocal = cfu.a;
                return "'" + cflVar.a() + "' " + cflVar.c();
            case 6:
                cux cuxVar = (cux) obj;
                cuxVar.getClass();
                return "[" + cuxVar + ']';
            case 7:
                dey deyVar = (dey) obj;
                deyVar.getClass();
                return Boolean.valueOf(deyVar.j());
            case 8:
                bfk bfkVar = (bfk) obj;
                View view = (View) bay.J(bfkVar, AndroidCompositionLocals_androidKt.f);
                azr azrVar = (azr) view.getTag(R.id.reduce_motion_tag);
                if (azrVar == null) {
                    ContentResolver contentResolver = ((Context) bay.J(bfkVar, AndroidCompositionLocals_androidKt.b)).getContentResolver();
                    azz azzVar = new azz(Boolean.valueOf(djh.a(contentResolver)), bap.c);
                    view.setTag(R.id.reduce_motion_tag, azzVar);
                    djg djgVar = new djg(azzVar, contentResolver, Handler.createAsync(Looper.getMainLooper()));
                    Uri uriFor = Settings.Global.getUriFor("reduce_motion");
                    contentResolver.registerContentObserver(uriFor, false, djgVar);
                    view.addOnAttachStateChangeListener(new djf(contentResolver, uriFor, djgVar));
                    azrVar = azzVar;
                }
                Boolean bool = (Boolean) azrVar.a();
                bool.booleanValue();
                return bool;
            case 9:
                return Integer.valueOf((int) (cho.a(((cho) obj).a) / 20.0f));
            case 10:
                List list = (List) obj;
                return new dlh(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 11:
                return ufg.a;
            case 12:
                List list2 = (List) obj;
                return new dme(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 13:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Long l2 = (Long) obj;
                l2.longValue();
                return l2;
            case 15:
                ((blm) obj).q(1);
                return ufg.a;
            case 16:
                uld[] uldVarArr = cbw.a;
                cbz cbzVar = cbu.h;
                ufg ufgVar = ufg.a;
                ((cbn) obj).e(cbzVar, ufgVar);
                return ufgVar;
            case 17:
                cbw.g((cbn) obj, 0);
                return ufg.a;
            case 18:
                return ufg.a;
            case 19:
                return ufg.a;
            default:
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
                int i2 = dvk.a;
                sidecarDisplayFeature.getClass();
                return Boolean.valueOf(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2);
        }
    }
}
