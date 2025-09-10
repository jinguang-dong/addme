package defpackage;

import j$.util.Optional;
import java.io.File;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hia implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ hia(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        int iOrdinal;
        switch (this.a) {
            case 0:
                jjq jjqVar = (jjq) obj;
                if (jjqVar != null && (jjqVar.b.isPresent() || jjqVar.e.isPresent() || jjqVar.i.isPresent())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(!bool.booleanValue());
            case 2:
                Integer num = (Integer) obj;
                return Boolean.valueOf(num == null || num.intValue() != -1);
            case 3:
                List list = (List) obj;
                Boolean bool2 = (Boolean) list.get(0);
                Boolean bool3 = (Boolean) list.get(1);
                Boolean bool4 = (Boolean) list.get(2);
                Boolean bool5 = (Boolean) list.get(3);
                if (!bool3.booleanValue() || bool4.booleanValue() || !bool5.booleanValue()) {
                    ((sgt) ((sgt) ies.a.c().h(shx.a, "FalconModule")).M(1962)).v("Turning off due to %s.", !bool3.booleanValue() ? "thermals" : bool4.booleanValue() ? "long shot" : "resource");
                    return 2;
                }
                bool2.booleanValue();
                shl shlVar = shx.a;
                return 1;
            case 4:
                return ((File) obj).getAbsolutePath();
            case 5:
                List list2 = (List) obj;
                boolean zBooleanValue = ((Boolean) list2.get(0)).booleanValue();
                if (((Boolean) list2.get(1)).booleanValue()) {
                    iOrdinal = idz.ZOOM.ordinal();
                } else {
                    iOrdinal = (zBooleanValue ? idz.DEBLUR : idz.NONE).ordinal();
                }
                return Integer.valueOf(iOrdinal);
            case 6:
                List list3 = (List) obj;
                boolean zBooleanValue2 = ((Boolean) list3.get(0)).booleanValue();
                boolean zBooleanValue3 = ((Boolean) list3.get(1)).booleanValue();
                boolean zBooleanValue4 = ((Boolean) list3.get(2)).booleanValue();
                boolean zBooleanValue5 = ((Boolean) list3.get(3)).booleanValue();
                if ((zBooleanValue2 || zBooleanValue3) && zBooleanValue4 && !zBooleanValue5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return (ids) obj;
            case 8:
                return ((Boolean) obj).booleanValue() ? ksa.IMAX_AUDIO_ON : ksa.IMAX_AUDIO_OFF;
            case 9:
                return Boolean.valueOf(((iqh) obj).equals(iqh.URANUS));
            case 10:
                return true;
            case 11:
                throw new IllegalStateException("ActivityLapReporter throws. This Should never happen.", (Throwable) obj);
            case 12:
                int i = izb.a;
                return fsq.c;
            case 13:
                return Boolean.valueOf(((fuu) obj) == fuu.CAPTURING);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(((Optional) obj).isPresent());
            case 15:
                return ((jjp) obj).a();
            case 16:
                return Boolean.valueOf(((nkw) obj).equals(nkw.AMBER));
            case 17:
                return (Float) ((jjq) obj).j.orElse(Float.valueOf(75.0f));
            case 18:
                return Boolean.valueOf(((jjq) obj).i.isPresent());
            case 19:
                return (Float) ((lax) obj).b.get(0);
            default:
                return Boolean.valueOf(((mxj) obj) != mxj.TABLET_LAYOUT);
        }
    }
}
