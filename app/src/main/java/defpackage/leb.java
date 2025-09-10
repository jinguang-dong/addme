package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class leb implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ leb(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        int i;
        String strB;
        switch (this.a) {
            case 0:
                return Long.valueOf(((lej) obj).b);
            case 1:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            case 2:
                return Integer.valueOf(((lep) obj).b);
            case 3:
                return ((len) obj).a;
            case 4:
                return ((len) obj).b;
            case 5:
                List list = (List) obj;
                return new float[]{((lem) list.get(0)).d, ((lem) list.get(1)).d};
            case 6:
                return Boolean.valueOf(((nkw) obj).equals(nkw.PORTRAIT));
            case 7:
                return Boolean.valueOf(((nkw) obj) == nkw.PHOTO);
            case 8:
                return Boolean.valueOf(!((lkk) obj).equals(lkk.AUTO));
            case 9:
                lus lusVar = llb.a;
                return lkz.values()[((Integer) obj).intValue()];
            case 10:
                return Boolean.valueOf(((nkw) obj).equals(nkw.SERENGETI));
            case 11:
                return Boolean.valueOf(((kox) obj).equals(kox.ON));
            case 12:
                return Boolean.valueOf(((String) obj).equals("on"));
            case 13:
                return Boolean.valueOf(((ixq) obj) != ixq.INACTIVE);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                List list2 = (List) obj;
                boolean zBooleanValue = ((Boolean) ((Serializable) list2.get(0))).booleanValue();
                int iIntValue = ((Integer) ((Serializable) list2.get(1))).intValue();
                int[] iArrAn = a.an();
                int i2 = 0;
                while (true) {
                    if (i2 < 3) {
                        i = iArrAn[i2];
                        if (qpt.bF(i) != iIntValue) {
                            i2++;
                        }
                    } else {
                        i = 1;
                    }
                }
                z = i == 2;
                if (i != 0) {
                    return zBooleanValue ? !z ? mbl.STATE_ENABLED : mbl.STATE_FEATURE_SOUND_EFFECTS_DISABLED : mbl.STATE_CAMERA_SOUNDS_DISABLED;
                }
                throw null;
            case 15:
                snn snnVar = (snn) obj;
                tpc tpcVarM = sod.a.m();
                soc socVar = soc.APP_PREWARM_EVENT;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                sod sodVar = (sod) tphVar;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                sod sodVar2 = (sod) tpcVarM.b;
                snnVar.getClass();
                sodVar2.aJ = snnVar;
                sodVar2.e |= 32;
                return tpcVarM;
            case 16:
                List list3 = (List) obj;
                mhh mhhVar = (mhh) list3.get(0);
                mhg mhgVar = (mhg) list3.get(1);
                if (mhhVar.equals(mhh.ON) || (mhhVar.equals(mhh.AUTO) && mhgVar.equals(mhg.ACTIVE))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                sgv sgvVar = mhf.a;
                int iOrdinal = ((mhh) obj).ordinal();
                if (iOrdinal == 0) {
                    return mhf.b;
                }
                if (iOrdinal == 1) {
                    return mhf.c;
                }
                if (iOrdinal == 2) {
                    return mhf.d;
                }
                throw new RuntimeException(null, null);
            case 18:
                gur gurVar = (gur) obj;
                sbp sbpVar = mzk.b;
                return Boolean.valueOf(gurVar == gur.e);
            case 19:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        return false;
                    }
                }
                return true;
            default:
                Context context = (Context) obj;
                String str = ubm.b;
                if (str != null) {
                    return str;
                }
                synchronized (ubm.class) {
                    strB = ubm.b;
                    if (strB == null) {
                        strB = qxc.b(context, "google_camera_app");
                        ubm.b = strB;
                    }
                }
                return strB;
        }
    }
}
