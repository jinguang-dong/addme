package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CaptureRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kou implements rvu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kou(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, uem] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                kpa kpaVar = kov.a;
                return Boolean.valueOf(Boolean.TRUE.equals((Boolean) obj) && !((Boolean) ((luj) this.a).b(luf.aN)).booleanValue());
            case 1:
                return new pej((CaptureRequest.Key) this.a, obj);
            case 2:
                ?? r5 = this.a;
                ((owf) r5.a()).dL();
                return qpt.ck(new pej(nvn.j, Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0)), new pej(nvn.k, (Float) ((owf) r5.a()).dL()));
            case 3:
                lcy lcyVar = (lcy) ((sbv) this.a).get((String) obj);
                return lcyVar == null ? lcy.WIDE : lcyVar;
            case 4:
                return ((pfu) this.a).e(new sfm((peo) obj));
            case 5:
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue) {
                    z = zBooleanValue2;
                } else if (zBooleanValue2) {
                    return ((juw) obj2).c.get();
                }
                return zBooleanValue ? ((juw) obj2).e.get() : z ? ((juw) obj2).d.get() : ((juw) obj2).f.get();
            case 6:
                nkw nkwVar = (nkw) obj;
                if (nkwVar != nkw.PHOTO) {
                    if (nkwVar == nkw.SERENGETI) {
                        gzi gziVar = gzp.a;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(((Enum) this.a).equals((pka) obj));
            case 8:
                return Boolean.valueOf(((Enum) this.a).equals((lkz) obj));
            case 9:
                List list2 = (List) obj;
                mhh mhhVar = (mhh) list2.get(0);
                mhg mhgVar = (mhg) list2.get(1);
                if ((!mhhVar.equals(mhh.ON) || !mhgVar.equals(mhg.ACTIVE)) && ((!mhhVar.equals(mhh.AUTO) || !mhgVar.equals(mhg.ACTIVE)) && (!mhhVar.equals(mhh.OFF) || !mhgVar.equals(mhg.TRANSITION_TO_ACTIVE) || ((hbj) this.a).p(gzy.q)))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((mod) this.a).k(bitmap, 0);
                }
                return true;
            case 11:
                List list3 = (List) obj;
                boolean z2 = ((hbj) this.a).p(gzs.aa) && list3 != null && list3.get(0) != kpa.c && ((Integer) list3.get(2)).intValue() == 1;
                nkw nkwVar2 = (nkw) list3.get(1);
                if (!nkwVar2.equals(nkw.PHOTO) && !nkwVar2.equals(nkw.PORTRAIT) && !nkwVar2.equals(nkw.LANDSCAPE) && !nkwVar2.equals(nkw.ACTION_PAN) && !nkwVar2.equals(nkw.NIGHT_SIGHT)) {
                    if (nkwVar2.equals(nkw.SERENGETI)) {
                        gzi gziVar2 = gzp.a;
                    }
                    z = false;
                }
                mev mevVar = new mev();
                mevVar.e(z2);
                mevVar.f(z);
                return mevVar.d();
            case 12:
                obj.getClass();
                Object obj3 = this.a;
                Object objB = ((owx) obj3).b(obj);
                if (objB != null) {
                    return objB;
                }
                throw new NullPointerException("Transforming input value: " + obj.toString() + " resulted in a null output value for: " + obj3.getClass().getName());
            default:
                return Long.valueOf(Math.min(((Long) obj).longValue(), ((pmb) this.a).b));
        }
    }
}
